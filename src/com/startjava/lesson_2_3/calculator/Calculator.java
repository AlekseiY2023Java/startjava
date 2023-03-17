package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int operand1;
    private int operand2;
    private char sign;

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }
    
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch(sign) {
            case '+' :
                return operand1 + operand2;
            case '-' :
                return operand1 - operand2;
            case '*' :
                return operand1 * operand2;
            case '/' :
                return operand1 / operand2;
            case '%' :
                return operand1 % operand2;
            case '^' :
                return (int) Math.pow(operand1, operand2);
            default:
                System.out.println("Операция не поддерживается");
                return 0;
        }
    }
}

