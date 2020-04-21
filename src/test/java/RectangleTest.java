import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void area_returnsTheAreaOfTheRectangle_450() {
        Rectangle testRectangle = new Rectangle(15,30);
        assertEquals(450, testRectangle.area());
    }
}