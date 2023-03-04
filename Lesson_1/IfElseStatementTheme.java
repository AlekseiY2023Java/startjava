public class IfElseStatementTheme {   
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java"); 
        int age = 30;
        if (age > 20){
            System.out.println("Старше 20 ");
        } else {
            System.out.println("Младше 21 ");
        }

        boolean isMale = true;
        if (!isMale) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        float height = 1.7f;
        if (height < 1.8 ) {
            System.out.println("Невысокий рост");
        } else {
            System.out.println("Высокий рост");
        }

        char firstCharName = "ALEKSEI".charAt(0);
        if (firstCharName == 'M') {
            System.out.println("Участник команды M");
        } else if(firstCharName == 'I' ) {
            System.out.println("Участник команды I");
        } else {
            System.out.println("Участник команды OTHERS");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 5;
        int num2 = 7;
        if (num1 > num2) {
            System.out.println("max " + num1);
            System.out.println("min " + num2);
        } else if (num1 < num2) {
            System.out.println("max " + num2);
            System.out.println("min " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Проверка числа");
        int num = 5;
        if (num == 0) {
            System.out.println(num + "Ноль");            
        } else {
            boolean isEvenNum = num % 2 == 0;
            if (isEvenNum) {
                System.out.println(num + " четное");
            } else {
                System.out.println(num + " нечетное");
            }
            if (num > 0) {
                System.out.println(num + " положительное");
            } else {
                System.out.println(num + " отрицательное");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int numA = 456;
        int numB = 856;
        System.out.println("Число A " + numA);
        System.out.println("Число B " + numB);
        int digitA1 = numA % 10;
        int digitB1 = numB % 10;
        int digitA2 = numA % 100 / 10;
        int digitB2 = numB % 100 / 10;
        int digitA3 = numA / 100;
        int digitB3 = numB / 100;
        if (digitA1 == digitB1) {
            System.out.println("Одинаковая цифра " + digitA1);
            System.out.println("В разряде 1");
        }
        if (digitA2 == digitB2) {
            System.out.println("Одинаковая цифра " + digitA2);
            System.out.println("В разряде 2");
        }
        if (digitA3 == digitB3) {
            System.out.println("Одинаковая цифра " + digitA3);
            System.out.println("В разряде 3");
        }

        System.out.println("\n5.Определение символа по его коду");
        char char57 = '\u0057';
        if ('a' <= char57 && char57 <= 'z') {
            System.out.println("Маленькая буква");
        } else if ('A' <= char57 && char57 <= 'Z') {
            System.out.println("Большая буква");
        } else if ('0' <= char57 && char57 <= '9') {
            System.out.println("Число");
        } else {
            System.out.println("не буква не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int rate = 10;
        if (deposit < 100000) {
            rate = 5;
        } else if (100000 <= deposit && deposit <= 300000) {
            rate = 7;
        }
        int precent = deposit * rate / 100;
        int sum = deposit + precent;
        System.out.println("Сумма вклада " + deposit);
        System.out.println("Начисленный % " + precent);
        System.out.println("Итоговая сумма " + sum);

        System.out.println("\n7.Определение оценки по предметам");
        int rateHistory = 59;
        int rateProgramming = 91;
        int gradeHistory = 2;
        int gradeProgramming = 2;
        if (rateHistory > 91) {
            gradeHistory = 5;
        } else if (rateHistory > 73) {
            gradeHistory = 4;
        } else if (rateHistory > 60) {
            gradeHistory = 3;
        }
        if (rateProgramming > 91) {
            gradeProgramming = 5;
        } else if (rateProgramming > 73) {
            gradeProgramming = 4;
        } else if (rateProgramming > 60) {
            gradeProgramming = 3;
        }
        System.out.println(gradeHistory + " История");
        System.out.println(gradeProgramming + " Программирование");
        float averageGrade = ( gradeHistory + gradeProgramming ) / 2;
        System.out.println("средний балл оценок по предметам " + averageGrade);
        float averageRate = ( rateHistory + rateProgramming ) / 2;
        System.out.println("средний % по предметам " + averageRate);

        System.out.println("\n8.Расчет прибыли за год");
        int rent = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int profit = ( sales - costPrice - rent ) * 12;
        if (profit > 0) {
            System.out.println("прибыль за год +" + profit);
        } else {
            System.out.println("прибыль за год " + profit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int sumReq = 567;
        int banknote1 = 1;
        int banknote10 = 10;
        int banknote100 = 100;
        int amountBanknote1 = 50; 
        int amountBanknote10 = 5; 
        int amountBanknote100 = 10; 
        int calcAmountBanknote100 = sumReq / banknote100;
        if (calcAmountBanknote100 > amountBanknote100) {
            calcAmountBanknote100 = amountBanknote100;
        }
        int sumTmp = sumReq - ( calcAmountBanknote100 * banknote100 );
        int calcAmountBanknote10 = sumTmp / banknote10;
        if (calcAmountBanknote10 > amountBanknote10) {
            calcAmountBanknote10 = amountBanknote10;
        }
        sumTmp -= calcAmountBanknote10 * banknote10 ;
        int calcAmountBanknote1 = sumTmp / banknote1;
        if (calcAmountBanknote1 > amountBanknote1) {
            calcAmountBanknote1 = amountBanknote1;
        }
        int sumCalc = calcAmountBanknote1 * banknote1 + calcAmountBanknote10 * banknote10 + 
            calcAmountBanknote100 * banknote100;
        if (sumCalc != sumReq) {
            System.out.println("банкнот не хватает для выдачи суммы " + sumReq);
        } else {
            System.out.println("Выдана сумма " + sumCalc + "банкнотами :");
            System.out.println("номинал " + banknote100 + " - " + calcAmountBanknote100 + "шт.");
            System.out.println("номинал " + banknote10 + " - " + calcAmountBanknote10 + "шт.");
            System.out.println("номинал " + banknote1 + " - " + calcAmountBanknote1 + "шт.");
        }
    }
}