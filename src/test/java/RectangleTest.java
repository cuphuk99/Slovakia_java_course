import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RectangleTest {

    Rectangle rectangle = new Rectangle(3,4);

    @Test
    public void getArea() {
        assertEquals(12, rectangle.getArea());
    }

    @Test
    public void getPerimeter() {
        assertEquals(14, rectangle.getPerimeter());
    }
}