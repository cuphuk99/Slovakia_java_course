import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ParallelogramTest {

    Parallelogram parallelogram = new Parallelogram(3,4,45);

    @Test
    public void getArea() {
        assertEquals(8.48528137423857, parallelogram.getArea(), 0.1d);

    }

    @Test
    public void getHeight() {
        assertEquals(2.1213203435596424, parallelogram.getHeight(), 0.1d);
    }

    @Test
    public void getSecondAngle() {
        assertEquals(135.0, parallelogram.getSecondAngle(), 0.1d);
    }

    @Test
    public void getDiagonal() {
        assertEquals(6.478469167054602, parallelogram.getDiagonal(), 0.1d);
    }

    @Test
    public void getPerimeter() {
        assertEquals(14.0, parallelogram.getPerimeter(), 0.1d);
    }
}