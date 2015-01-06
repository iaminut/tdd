package model;

/**
 * Created by cadet on 1/6/15 AD.
 */
public abstract class Operand {
    public int operand;

    public abstract String toString();

    public static Operand createOperand(int pattern, int oprandValue, int leftRight) {

        boolean isIntegerPattern = isIntegerPattern(pattern, leftRight);

        if (isIntegerPattern)
            return new IntegerOperand(oprandValue);
        else
            return new StringOperand(oprandValue);
    }

    private static boolean isIntegerPattern(int pattern, int leftRight) {

        return (pattern == 1 && leftRight == 1) || (pattern == 2 && leftRight == 2);
    }
}
