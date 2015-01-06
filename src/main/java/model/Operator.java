package model;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class Operator {
    private int operator;
    public Operator(int operator){
        this.operator = operator;

    }

    public String toString(){
        String[] stringOperands = {"+", "*", "-"};
        return stringOperands[operator-1];
    }
}
