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
        } 
        return false;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}