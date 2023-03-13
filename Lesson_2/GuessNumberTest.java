import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String playerResponse;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nВведите имя первого игрока ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("\nВведите имя второго игрока ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.play();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no] ");
                playerResponse = scanner.nextLine();
            } while (!playerResponse.equals("yes") && !playerResponse.equals("no"));
        } while (playerResponse.equals("yes"));
    }
}