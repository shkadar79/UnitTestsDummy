import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddCheckerTest {
    @Test
    public void evenCheckTest(){
        assertTrue(EvenOddChecker.check(4));
    }
    @Test
    public void oddCheckTest(){
        assertFalse(EvenOddChecker.check(5));
    }
}
