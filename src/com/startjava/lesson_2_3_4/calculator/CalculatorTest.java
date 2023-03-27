package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userResponse = "yes";
        do {
            if (userResponse.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                double result = calculator.calculate(scanner.nextLine());
                if ( result % 1 == 0) {
                    System.out.printf("Результат %.0f", result);
                } else {
                    System.out.printf("Результат %.3f", result);
                }
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no] ");
            userResponse = scanner.nextLine();
        } while (!userResponse.equals("no"));
    }
}