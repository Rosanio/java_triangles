import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(3,3,3);
    assertEquals(true, testTriangle instanceof Triangle);
  }
}
