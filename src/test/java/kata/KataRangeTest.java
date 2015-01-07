package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class KataRangeTest {
    @Test
    public void resultShouldBeInclusiveWhenInputIsBeginWithInclusive(){
        String input = "[0,5]";
        KataRange kataRange = new KataRange(input);
        assertTrue(kataRange.isStartWithInclusive());
    }

    @Test
    public void resultShouldBeExclusiveWhenInputIsBeginWithExclusive(){
        String input = "(0,5]";
        KataRange kataRange = new KataRange(input);
        assertFalse(kataRange.isStartWithInclusive());
    }

    @Test
    public void resultShouldBeZeroWhenFirstNumberInput0(){
        String input = "(0,5]";
        KataRange kataRange = new KataRange(input);
        assertEquals(0, kataRange.getFirstNumber());
    }

    @Test
    public void resultShouldBeOneWhenFirstNumberInput1(){
        String input = "(1,5]";
        KataRange kataRange = new KataRange(input);
        assertEquals(1, kataRange.getFirstNumber());
    }

    @Test
    public void resultShouldBeOneWhenSecondNumberInput5(){
        String input = "(1,5]";
        KataRange kataRange = new KataRange(input);
        assertEquals(5, kataRange.getSecondNumber());
    }

    @Test
    public void resultShouldBeInclusiveWhenIsEndWithInclusive(){
        String input = "(1,5]";
        KataRange kataRange = new KataRange(input);
        assertTrue(kataRange.isEndWithInclusive());
    }
}
