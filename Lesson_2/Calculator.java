public class Calculator {

    private int operand1;
    private int operand2;
    private char sign;

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }
    
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    
    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        int result = 0;
        switch(sign) {
            case '+' :
                result = operand1 + operand2;
                break;
            case '-' :
                result = operand1 - operand2;
                break;
            case '*' :
                result = operand1 * operand2;
                break;
            case '/' :
                result = operand1 / operand2;
                break;
            case '%' :
                result = operand1 % operand2;
                break;
            case '^' :
                result = 1;
                for(int i = 0; i < operand2; i++) {
                    result *= operand1;
                }
                break;
        }
        return result;
    }
}

