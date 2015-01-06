package model;

import java.util.Random;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class Randomizer {

    public int getPattern() {
        Random random = new Random();
        int pattern = random.nextInt();
        return (Math.abs(pattern) % 2)+1;
    }

    public int getOperator() {
        Random random = new Random();
        int operator = random.nextInt();
        return (Math.abs(operator) % 3)+1;
    }

    public int getOperand() {
        Random random = new Random();
        int operand = random.nextInt();
        return (Math.abs(operand) % 9)+1;
    }
}
