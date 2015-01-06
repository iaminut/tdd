package model;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class Captcha {
    private Operand leftOperand;
    private Operand rightOperand;
    private Operator operator;

    private final int LEFT = 1;
    private final int RIGHT = 2;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.leftOperand = Operand.createOperand(pattern, leftOperand, LEFT);
        this.rightOperand = Operand.createOperand(pattern, rightOperand, RIGHT);
        this.operator = new Operator(operator);
    }


    public Operand getLeftOperand() {
        return leftOperand;
    }

    public Operand getRightOperand() {
        return rightOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    public String toString(){
        return this.leftOperand.toString() + " " + this.operator.toString() + " " + this.rightOperand.toString();
    }
}
