import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int hiddenNumber = (int) (Math.random() * 100 + 1);
        int numberActivePlayer = (int) (Math.random() * 2 + 1);
        Player activePlayer;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            activePlayer = identifyActivePlayer(numberActivePlayer);
            System.out.print("Игрок " + activePlayer + " вводит число: ");
            while (!activePlayer.setNumber(scanner.nextInt())) {}
            if (activePlayer.getNumber() == hiddenNumber) {
                System.out.println("Победил игрок " + activePlayer);
                break;
            } else if (activePlayer.getNumber() < hiddenNumber) {
                System.out.println("Число " + activePlayer.getNumber() + " меньше того, что загадал компьютер");
            } else if (activePlayer.getNumber() > hiddenNumber) {
                System.out.println("Число " + activePlayer.getNumber() + " больше того, что загадал компьютер");
            }
            numberActivePlayer = numberActivePlayer % 2 + 1;
        }
    }

    private Player identifyActivePlayer(int numberActivePlayer) {
        if (numberActivePlayer == 1) {
            return player1;
        } else {
            return player2;
        }
    }
}