import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(3,3,3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_setsSide1() {
    Triangle testTriangle = new Triangle(3,3,3);
    assertEquals(3, testTriangle.getSide1());
  }

  @Test
  public void getSide2_returnSideLength_mSide2() {
    Triangle testTriangle = new Triangle(3,3,3);
    assertEquals(3, testTriangle.getSide2());
  }

  @Test
  public void getSide3_returnSideLength_mSide3() {
    Triangle testTriangle = new Triangle(3,3,3);
    assertEquals(3, testTriangle.getSide3());
  }

  @Test
  public void isEqualateral_allSidesEqual_true() {
    Triangle testTriangle = new Triangle(3,3,3);
    assertEquals(true, testTriangle.isEqualateral());
  }
}
