package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static public double calculate(String expression) {
        String[] elementsExpression = fillElementsExpression(expression);
        int operand1 = fillOperand(elementsExpression[0]);
        char sign = fillSign(elementsExpression[1]);
        int operand2 = fillOperand(elementsExpression[2]);

        return switch(sign) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> ((double) operand1) / ((double) operand2);
            case '%' -> operand1 % operand2;
            case '^' -> Math.pow(operand1, operand2);
            default  -> throw new RuntimeException("Некорректная операция, допустимые операции +,-,*,/,%,^");
        };
    }

    static private String[] fillElementsExpression(String expression) {
        String[] elementsExpression = expression.split(" ", 3);
        if (elementsExpression.length != 3) {
            throw new RuntimeException("Выражение должно быть формата:\n<целое число>пробел<операция>пробел<целое число>");
        }
        return elementsExpression;
    }

    static private char fillSign(String lexeme) {
        if (lexeme.length() != 1) {
            throw new RuntimeException("Операция должна обозначаться одним символом");
        }
        return lexeme.charAt(0);
    }

    static private int fillOperand(String lexeme) {
        int operand;
        try {
            operand = Integer.parseInt(lexeme);
        } catch (NumberFormatException e) {
            throw new RuntimeException("В выражении должны быть только положительные числа");
        }
        if (operand < 1) {
            throw new RuntimeException("В выражении должны быть только положительные числа");
        }
        return operand;
    }
}