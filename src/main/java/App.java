import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/",(request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results",(request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Integer side1 = Integer.parseInt(request.queryParams("side1"));
      Integer side2 = Integer.parseInt(request.queryParams("side2"));
      Integer side3 = Integer.parseInt(request.queryParams("side3"));
      Triangle triangle = new Triangle(side1, side2, side3);
      String triangleType = "";
      if(!triangle.isTriangle()) {
        triangleType = "I don't know what you just made, but it's not a triangle...";
      } else if(triangle.isEquilateral()) {
        triangleType = "You've just made an Equilateral Triangle!";
      } else if(triangle.isIsosceles()) {
        triangleType = "You've just made an Isosceles Triangle!";
      } else {
        triangleType = "You've just made an Scalene Triangle!";
      }
      model.put("triangleType", triangleType);

      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
