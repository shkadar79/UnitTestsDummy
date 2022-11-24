import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void additionTest() {
        assertEquals(12, calc.add(10, 2));
    }

    @Test
    public void subtractionTest() {
        assertEquals(8, calc.subtract(10, 2));
    }

    @Test
    public void multiplicationTest() {
        assertEquals(20, calc.multiply(10, 2));
    }

    @Test
    public void divisionTest() {
        assertEquals(5, calc.divide(10, 2));
    }
}
