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

  public int getSide1() {
    return mSide1;
  }

  public int getSide2() {
    return mSide2;
  }

  public int getSide3() {
    return mSide3;
  }

  public boolean isTriangle() {
    return !(mSide1+mSide2 < mSide3 || mSide1+mSide3 < mSide2 || mSide3+mSide2 < mSide1);
  }

  public boolean isEquilateral() {
    return mSide1 == mSide2 && mSide1 == mSide3;
  }

  public boolean isIsosceles () {
    return mSide1 == mSide2 || mSide1 == mSide3 || mSide2 == mSide3;
  }

  public boolean isScalene () {
    return mSide1 != mSide2 && mSide2 != mSide3 && mSide1 != mSide3;
  }

}
