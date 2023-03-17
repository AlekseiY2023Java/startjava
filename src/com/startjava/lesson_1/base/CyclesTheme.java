package com.startjava.lesson_1.base;

public class CyclesTheme {   
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int beginInterval = -10;
        int endInterval = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int counter = beginInterval;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= endInterval);
        System.out.println("в промежутке [" + beginInterval + ", " + endInterval
                + "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        if(num2 < min) {
            min = num2;
        }
        if(num3 < min) {
            min = num3;
        }
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        System.out.println("Минимальное = " + min + ", Максимальное = " + max);
        System.out.println("Все числа интервала (" + min + "," + max + ") в порядке убывания: ");
        for(int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sum = 0;
        System.out.print("исходное число " + num + " в обратном порядке: ");
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nсумма цифр исходного числа: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            counter++;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        while (counter > 0 && counter < 5) {
            System.out.printf("%3d", 0);
            counter++;
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        num = 3242592;
        int countTwos = 0;
        int copyNum = num;
        while (copyNum > 0) {
            if (copyNum % 10 == 2) {
                countTwos++;
            }
            copyNum /= 10;
        }
        if(countTwos % 2 == 0) {
            System.out.println("число " + num + " содержит " + countTwos + 
                    " (четное) количество двоек");
        } else { 
            System.out.println("число " + num + " содержит " + countTwos + 
                    " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for(int row = 0; row < 5; row++) {
            for(int column = 0; column < 10; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row = 5;
        int column = 0;
        while (row > 0) {
            column = row;
            while (column > 0) {
                System.out.print("#");
                column--;
            }
            System.out.println();
            row--;
        }
        System.out.println();

        row = 1;
        int copyColumn = 0;
        do {
            if(row < 4) {
                column = row;
                copyColumn = column;
            } else {
                copyColumn--;
                column = copyColumn;
            }
            do {
                System.out.print("$");
                column--;
            } while (column > 0);
            System.out.println();
            row++;
        } while (row < 6);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.println("Dec Char");
        for (char charAscii = 1; charAscii < '0'; charAscii++) {
            if (charAscii % 2 == 1) {
                System.out.printf("\n%3d%5c", (int) charAscii, charAscii);
            }
        }
        for (char charAscii = 'a'; charAscii <= 'z'; charAscii++) {
            if (charAscii % 2 == 0) {
                System.out.printf("\n%3d%5c", (int) charAscii, charAscii);
            }
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");
        num = 1234321;
        int invertedNum = 0;
        copyNum = num;
        while (copyNum > 0) {
            invertedNum = invertedNum * 10 + (copyNum % 10);
            copyNum /= 10;
        }
        if (num == invertedNum) {
            System.out.println("число " + num + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        num = 456852;
        int rightPartNum = num % 1000;
        int leftPartNum = num / 1000;
        int copyRightPartNum = rightPartNum;
        int copyLeftPartNum = leftPartNum;
        int sumDigitsRightPartNum = 0;
        int sumDigitsLeftPartNum = 0;
        for (int i = 0; i < 3; i++) {
            sumDigitsLeftPartNum += copyLeftPartNum % 10;
            sumDigitsRightPartNum += copyRightPartNum % 10;
            copyRightPartNum /= 10;
            copyLeftPartNum /= 10;
        }
        System.out.println("Сумма цифр " + leftPartNum + " = " + sumDigitsLeftPartNum);
        System.out.println("Сумма цифр " + rightPartNum + " = " + sumDigitsRightPartNum);
        if (sumDigitsLeftPartNum == sumDigitsRightPartNum) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.println("      ТАБЛИЦА ПИФАГОРА\n");
        for (row = 1; row < 10; row++) {
            if(row == 2) {
                System.out.println("────┼────────────────────────");
            }
            for (column = 1; column < 10; column++) {
                if(column == 2) {
                    System.out.print(" │");
                }
                if(column == 1 && row == 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%3d", (row * column));
                }
            }
            System.out.println();
        }
    }
}