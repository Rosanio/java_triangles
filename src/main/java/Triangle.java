import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class Triangle {
  public static void main(String[] args) {}

  private int mSide1;
  private int mSide2;
  private int mSide3;

  public Triangle(int side1, int side2, int side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }
}
