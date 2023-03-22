package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {6, 5, 2, 3, 4, 1, 7};
        printIntArr(intArr);
        int len = intArr.length;

        for (int i = 0; i < len; i++) {
            len--;
            int copyInt = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = copyInt;
        }
        printIntArr(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= intArr[i];
            System.out.print(intArr[i] + (i < len - 2 ? " * " : " = " + product ) );
        }
        System.out.println("\nв [0] хранится " + intArr[0]);
        System.out.println("в [9] хранится " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArr = new float[15];
        len = floatArr.length;
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        System.out.println("исходный массив");
        printFloatArr(floatArr);
        float middleCellValue = floatArr[len / 2];
        int numberZeroedCells = 0;
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > middleCellValue) {
                floatArr[i] = 0;
                numberZeroedCells++;
            }
        }
        System.out.println("измененный массив");
        printFloatArr(floatArr);
        System.out.println("количество обнуленных ячеек " + numberZeroedCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] engAlphabet = new char['Z' - 'A' + 1];
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            engAlphabet[letter - 'A'] = letter;
        }
        len = engAlphabet.length;
        for (int row = 0; row < len; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print(engAlphabet[len - 1 - column]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int uniqueNumbers[] = new int[30];
        int amountNumbers = 0;
        len = uniqueNumbers.length;
        while (amountNumbers < len) {
            boolean unique = true;
            int randomNumber = (int) (Math.random() * 40 + 60);
            for (int i = 0; i < amountNumbers; i++) {
                if (randomNumber == uniqueNumbers[i]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqueNumbers[amountNumbers] = randomNumber;
                amountNumbers++;
            }
        }
        int copyLen = len;
        while (copyLen > 0) {
            for (int i = 0; i < copyLen - 1; i++) {
                if (uniqueNumbers[i] > uniqueNumbers[i + 1]) {
                    int copyNumber = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[i + 1];
                    uniqueNumbers[i + 1] = copyNumber;
                }
            }
            copyLen--;
        }
        for (int i = 0; i < len; i++) {
            System.out.printf("%3d", uniqueNumbers[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("Первый массив");
        printStringArr(srcArr);
        len = 0;
        for (String string : srcArr) {
            if (!string.isBlank()) {
                len++;
            }
        }
        String[] destArr = new String[len];
        int cell = 0;
        int amountCells = 0;
        len = srcArr.length;
        for (int i = 0; i < len; i++) {
            if (srcArr[i].isBlank() ) {
                if (amountCells > 0) {
                    System.arraycopy(srcArr, i - amountCells, destArr, cell, amountCells);
                    cell += amountCells;
                    amountCells = 0;
                }
            } else {
                amountCells++;
            }
        }
        System.out.println("Второй массив");
        printStringArr(destArr);
    }
    
    private static void printIntArr(int[] arr) {
        for (int number: arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printFloatArr(float[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.printf("%6.3f", arr[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printStringArr(String[] arr) {
        for (String string : arr) {
            System.out.print(string + ";");
        }
        System.out.println();
    }
}