package com.startjava.lesson_1.base;

public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль"); 
        byte numberOfCores = 4;
        short voltagePc = 220;
        int ramClockSpeed = 700000;
        long cpuСlockSpeed = 123456789001234L;
        float lengthPc = 44.55F;
        double widthPc = 21.456D;
        char seriesPc = 'A';
        boolean newPc = true;
        System.out.println("Количество ядер " + numberOfCores);
        System.out.println("Напряжение ПК " + voltagePc);
        System.out.println("Тактовая частота видеокарты " + ramClockSpeed);
        System.out.println("Тактовая частота процессора " + cpuСlockSpeed);
        System.out.println("Длина ПК " + lengthPc);
        System.out.println("Ширина ПК " + widthPc);
        System.out.println("Серия ПК " + seriesPc);
        System.out.println("Новый ПК " + newPc);

        System.out.println("\n2. Расчет стоимости товара со скидкой"); 
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int sumGoods = penPrice + bookPrice;
        int discountSum = (sumGoods * 11) / 100;
        int discountPrice = sumGoods - discountSum;
        System.out.println("Общая стоимость товаров без скидки " + sumGoods);
        System.out.println("Сумма скидки " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA"); 
        System.out.println("   J    a  v     v  a"); 
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println(maxByte + "\n" + (++maxByte) + "\n" + (--maxByte));
        System.out.println(maxShort + "\n" + (++maxShort) + "\n" + (--maxShort));
        System.out.println(maxInt + "\n" + (++maxInt) + "\n" + (--maxInt));
        System.out.println(maxLong + "\n" + (++maxLong) + "\n" + (--maxLong));

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c ;
        System.out.println("с помощью третьей переменной");
        System.out.println("a = " + a +" b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a +" b = " + b);
        System.out.println("с помощью арифметических операций");
        System.out.println("a = " + a +" b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a +" b = " + b);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("a = " + a +" b = " + b);
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.println("a = " + a +" b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char octothorp = '#';
        char ampersand = '&';
        char at = '@';
        char circumflex = '^';
        char underscore = '_';
        System.out.println(octothorp + " " + (int) octothorp);
        System.out.println(ampersand + " " + (int) ampersand);
        System.out.println(at + " " + (int) at);
        System.out.println(circumflex + " " + (int) circumflex);
        System.out.println(underscore + " " + (int) underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underline = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("     " + slash + backSlash);
        System.out.println("    " + slash + "  " + backSlash);
        System.out.println("   " + slash + underline + openParenthesis + " " + 
                closeParenthesis + backSlash);
        System.out.println("  " + slash + "      " + backSlash);
        System.out.println(" " + slash + underline + underline + underline + underline + 
                slash + backSlash + underline + underline + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        System.out.println("Число " + num + " содержит");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        int sumDigit = hundreds + tens + ones;
        int productDigit = hundreds * tens * ones;
        System.out.println("Сумма его цифр = " + sumDigit);
        System.out.println("Произведение = " + num + productDigit);

        System.out.println("\n9.Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        seconds = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}