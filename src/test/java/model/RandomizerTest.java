package model;

import model.Randomizer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class RandomizerTest {
    Randomizer ran = new Randomizer();
    @Test
    public void patternShouldBebetween1to2(){
        int result = ran.getPattern();
        Assert.assertTrue(result == 1 || result == 2);
    }

    @Test
    public void operandShouldBebetween1to9(){
        int result = ran.getOperand();
        Assert.assertTrue(result >= 1 && result <= 9);
    }

    @Test
    public void operatorShouldBebetween1to3(){
        int result = ran.getOperator();
        Assert.assertTrue(result >= 1 && result <= 3);
    }

}
