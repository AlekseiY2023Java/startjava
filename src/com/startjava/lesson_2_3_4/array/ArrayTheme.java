package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {6, 5, 2, 3, 4, 1, 7};
        printIntArray( intArr );
        int len = intArr.length;
        for (int i = 0; i < len / 2; i++) {
            int copyInt = intArr[i];
            intArr[i] = intArr[len - 1 - i];
            intArr[len - 1 - i] = copyInt;
        }
        printIntArray( intArr );

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++)
            intArr[i] = i;
        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= intArr[i];
            System.out.print(intArr[i] + " " + (i < len - 2 ? "*" : "=") + " ");
        }
        System.out.println(product);
        System.out.println("МассивЧисел[0] = " + intArr[0]);
        System.out.println("МассивЧисел[9] = " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArr = new float[15];
        len = floatArr.length;
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        System.out.println("исходный массив");
        printFloatArray(floatArr, 8);
        float copyFloat = floatArr[len / 2];
        int numberZeroedCells = 0;
        for (int i = 0; i < len; i++) {
            if (copyFloat < floatArr[i]) {
                floatArr[i] = 0;
                numberZeroedCells++;
            }
        }
        System.out.println("измененный массив");
        printFloatArray(floatArr, 8);
        System.out.println("количество обнуленных ячеек " + numberZeroedCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] englishLetters = new char['Z' - 'A' + 1];
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            englishLetters[letter - 'A'] = letter;
        }
        len = englishLetters.length;
        for (int row = 0; row < len; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print(englishLetters[len - 1 - column]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] intArray = new int[30];
        int amountNumbers = 0;
        len = intArray.length;
        while (amountNumbers < len) {
            boolean unique = true;
            int randomNumber = (int) (Math.random() * 40 + 60);
            for (int i = 0; i < amountNumbers; i++) {
                if (randomNumber == intArray[i]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                intArray[amountNumbers] = randomNumber;
                amountNumbers++;
            }
        }
        int copyLen = len;
        while(copyLen>0){
            for (int i = 0; i < copyLen - 1; i++) {
                if (intArray[i] > intArray[i+1]) {
                    int copyInt = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = copyInt;
                }
            }
            copyLen--;
        }
        for (int i = 0; i < len; i++) {
            System.out.printf("%3d", intArray[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] stringArray1 = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("Первый массив");
        printStringArray(stringArray1);
        len = 0;
        for (String string : stringArray1) {
            if (!string.isBlank()) {
                len++;
            }
        }
        String[] stringArray2 = new String[len];
        int cell = 0;
        int numberCells = 0;
        len = stringArray1.length;
        for (int i = 0; i < len; i++) {
            if (stringArray1[i].isBlank() ) {
                if (numberCells > 0) {
                    System.arraycopy(stringArray1, i - numberCells, stringArray2, cell, numberCells);
                    cell += numberCells;
                    numberCells = 0;
                }
            } else {
                numberCells++;
            }
        }
        System.out.println("Второй массив");
        printStringArray(stringArray2);
    }
    private static void printIntArray(int[] array) {
        for (int number: array)
            System.out.print(number + " ");
        System.out.println();
    }
    private static void printFloatArray(float[] array, int numberColumns) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.printf("%6.3f", array[i]);
            if ((i + 1) % numberColumns == 0)
                System.out.println();
        }
        System.out.println();
    }
    private static void printStringArray(String[] array) {
        for (String string: array)
            System.out.print(string + ";");
        System.out.println();
    }
}