public class Calculator {   
    public static void main(String[] args) {
        int operand1 = 2;
        int operand2 = 4;
        char sign = '^';
        int result = 0;
        if(sign == '+') {
            result = operand1 + operand2;
        } else if(sign == '-') {
            result = operand1 - operand2;
        } else if(sign == '*') {
            result = operand1 * operand2;
        } else if(sign == '/') {
                result = operand1 / operand2;
        } else if(sign == '%') {
            result = operand1 % operand2;
        } else if(sign == '^') {
                result = 1;
                for(int i = 0; i < operand2; i++) {
                    result *= operand1;
            }
        }
        System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);
    }
}