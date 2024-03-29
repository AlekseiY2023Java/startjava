package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userResponse = "yes";
        do {
            if (userResponse.equals("yes")) {
                System.out.print("Введите математическое выражение в формате <целое число>пробел<операция>"
                        + "пробел<целое число>: ");
                try {
                    double result = Calculator.calculate(scanner.nextLine());
                    System.out.printf("Результат " + (result % 1 == 0 ? "%.0f " : "%.3f "), result);
                } catch (RuntimeException e) {
                    System.out.print(e.getMessage());
                }
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no] ");
            userResponse = scanner.nextLine();
        } while (!userResponse.equals("no"));
    }
}