public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public boolean setNumber(int number) {
        if (number > 0 && number < 101) {
            this.number = number;
            return true;
        } else {
            System.out.println("Число должно быть в интервале (0,100]");
            return false;
        }
        
    }

    public String toString() {
        return name;
    }
}