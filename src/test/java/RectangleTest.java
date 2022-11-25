import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle = new Rectangle(10.5d, 5.5d);
    @Test
    public void getLengthTest(){
        assertEquals(10.5d, rectangle.getLength(),0);
    }
    @Test
    public void setLengthTest(){
        rectangle.setLength(11.5d);
        assertEquals(11.5d, rectangle.getLength(), 0);
    }
    @Test
    public void getWidthTest(){
      assertEquals(5.5d, rectangle.getWidth(),0);
    }
    @Test
    public void setWidthTest(){
        rectangle.setWidth(6.5d);
        assertEquals(6.5d, rectangle.getWidth(),0);
    }
    @Test
    public void getAreaTest(){
        assertEquals(57.75d, rectangle.getArea(),0);
    }
}
