public class CyclesTheme {   
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int beginInterval = -10;
        int endInterval = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int num = beginInterval;
        do {
            if(num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            num++;
        } while(num <= endInterval);
        System.out.println("\nв промежутке [" + beginInterval + ", " + endInterval
            + "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
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
        System.out.println("\nМинимальное = " + min + ", Максимальное = " + max);
        System.out.print("\nВсе числа интервала (" + min + "," + max + ") в порядке убывания: ");
        for(int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        num = 1234;
        int sum = 0;
        System.out.print("\nисходное число " + num + " в обратном порядке: ");
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nсумма цифр исходного числа: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        System.out.println();
        int cntNum = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            cntNum++;
            if (cntNum == 5) {
                System.out.print("\n");
                cntNum = 0;
            }
        }
        while (cntNum < 5 && cntNum > 0) {
            System.out.printf("%3d", 0);
            cntNum++;
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int cntDigitTwo = 0;
        int tmpNum = num;
        while (tmpNum > 0) {
            int digit = tmpNum % 10;
            if (digit == 2) {
                cntDigitTwo++;
            }
            tmpNum /= 10;
        }
        if(cntDigitTwo % 2 == 0) {
            System.out.println("\nчисло " + num + " содержит " + cntDigitTwo + 
                " (четное) количество двоек");
        } else { 
            System.out.println("\nчисло " + num + " содержит " + cntDigitTwo + 
                " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row = 5;
        int col = 0;
        while (row > 0) {
            col = row;
            while (col > 0) {
                System.out.print("#");
                col--;
            }
            System.out.println();
            row--;
        }
        System.out.println();

        row = 5;
        int col2 = 0;
        do {
            if(row < 4 ) {
                col = row;
                col2 = col;
            } else {
                col2--;
                col = col2;
            }
            do {
                System.out.print("$");
                col--;
            } while (col > 0);
            System.out.println();
            row--;
        } while (row > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("\nDec Char");
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

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int invertedNum = 0;
        tmpNum = num;
        while (tmpNum > 0) {
            int digit = tmpNum % 10;
            invertedNum = invertedNum * 10 + digit;
            tmpNum /= 10;
        }

        if (num == invertedNum) {
            System.out.println("\nчисло " + num + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 456852;
        int digits1 = 0;
        int sumDigits1 = 0;
        int digits2 = 0;
        int sumDigits2 = 0;
        int coef = 1;
        for (int i = 1; i < 7; i++) {
            if (i == 4) {
                digits2 = digits1;
                sumDigits2 = sumDigits1;
                digits1 = 0;
                sumDigits1 = 0;
                coef = 1;
            }
            int digit = num % 10;
            sumDigits1 += digit;
            digits1 = digit * coef + digits1;
            coef *= 10;
            num /= 10;
        }
        System.out.println("\nСумма цифр " + digits1 + " = " + sumDigits1);
        System.out.println("\nСумма цифр " + digits2 + " = " + sumDigits2);
        if (sumDigits1 == sumDigits2) {
            System.out.println("\nЧисло является счастливым");
        } else {
            System.out.println("\nЧисло не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\n      ТАБЛИЦА ПИФАГОРА\n");
        for (row = 1; row < 10; row++) {
            if(row == 2) {
                System.out.println("────┼────────────────────────");
            }
            for (col = 1; col < 10; col++) {
                if(col == 2) {
                    System.out.print(" │");
                }
                if(col == 1 && row == 1) {
                    System.out.print("   ");
                } else {
                    sum = row * col;
                    System.out.printf("%3d", sum);
                }
            }
            System.out.println();
        }
    }
}