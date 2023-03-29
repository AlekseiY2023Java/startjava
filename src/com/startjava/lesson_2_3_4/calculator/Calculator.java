package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static public double calculate(String expression) {
        int operand1;
        int operand2;
        char sign;

        String[] elementsExpression = expression.split(" ", 3);
        try {
            operand1 = Integer.parseInt(elementsExpression[0]);
            operand2 = Integer.parseInt(elementsExpression[2]);
            sign = elementsExpression[1].charAt(0);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Неверный формат выражения");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Неверный формат выражения");
        }

        if (operand1 < 1 || operand2 < 1) {
            throw new RuntimeException("В выражении должны быть только положительные числа");
        }

        return switch(sign) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> ((double) operand1) / ((double) operand2);
            case '%' -> operand1 % operand2;
            case '^' -> Math.pow(operand1, operand2);
            default  -> throw new RuntimeException("Операция не поддерживается");
        };
    }
}