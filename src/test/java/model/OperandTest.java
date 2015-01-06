package model;

import model.Operand;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class OperandTest {
    @Test
    public void crateIntegerOperandWhenPatternIs1AndLeftRightIs1(){
        Operand operand = Operand.createOperand(1,1,1);
        Assert.assertEquals("1",operand.toString());
    }

    @Test
    public void crateStringOperandWhenPatternIs1AndLeftRightIs1(){
        Operand operand = Operand.createOperand(2,1,1);
        Assert.assertEquals("One",operand.toString());
    }

    @Test
    public void crateStringOperandWhenPatternIs2AndLeftRightIs1(){
        Operand operand = Operand.createOperand(2,1,1);
        Assert.assertEquals("One",operand.toString());
    }

    @Test
    public void crateIntegerOperandWhenPatternIs2AndLeftRightIs2(){
        Operand operand = Operand.createOperand(2,1,2);
        Assert.assertEquals("1",operand.toString());
    }
}
