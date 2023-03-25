package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        String[] elementsExpression = expression.split(" ", 3);
        int operand1 = Integer.parseInt(elementsExpression[0]);
        int operand2 = Integer.parseInt(elementsExpression[2]);
        char sign = elementsExpression[1].charAt(0);
        switch(sign) {
            case '+' :
                return operand1 + operand2;
            case '-' :
                return operand1 - operand2;
            case '*' :
                return operand1 * operand2;
            case '/' :
                return ((double) operand1) / ((double) operand2);
            case '%' :
                return operand1 % operand2;
            case '^' :
                return Math.pow(operand1, operand2);
            default:
                System.out.println("Операция не поддерживается");
                return 0f;
        }
    }
}