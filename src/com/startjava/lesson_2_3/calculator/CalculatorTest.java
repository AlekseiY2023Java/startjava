package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userResponse;
        do {
            System.out.print("\nВведите первое число: ");
            calculator.setOperand1(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setOperand2(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Результат " + calculator.calculate());
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no] ");
                userResponse = scanner.nextLine();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));
        } while (userResponse.equals("yes"));
    }
}