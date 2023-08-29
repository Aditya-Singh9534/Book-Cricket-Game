import java.util.Random;

public class BookTest {
    public static void main(String[] args) {
        System.out.println("Welcome to Book Cricket Game!");
        playGame();
    }

    public static void playGame() {
        int numberOfPages = 300;
        Random random = new Random();

        int player1Score = 0;
        int player2Score = 0;

        int player1Page = 0;
        int player2Page = 0;

        int player1Turns = 0;
        int player2Turns = 0;

        System.out.println("Player 1's turn:");
        while (true) {
            player1Page = random.nextInt(numberOfPages) + 1;
            int player1Run = player1Page % 7;
            player1Turns++;

            System.out.println("Page Number: " + player1Page);
            System.out.println("Runs Scored: " + player1Run);

            if (player1Run == 0) {
                System.out.println("Player 1 is out!");
                break;
            }

            player1Score += player1Run;
        }

        System.out.println("Player 1's total score: " + player1Score);
        System.out.println("Player 1's total turns: " + player1Turns);
        System.out.println();

        System.out.println("Player 2's turn:");
        while (true) {
            player2Page = random.nextInt(numberOfPages) + 1;
            int player2Run = player2Page % 7;
            player2Turns++;

            System.out.println("Page Number: " + player2Page);
            System.out.println("Runs Scored: " + player2Run);

            if (player2Run == 0 || player2Score > player1Score) {
                break;
            }

            player2Score += player2Run;
        }

        System.out.println("Player 2's total score: " + player2Score);
        System.out.println("Player 2's total turns: " + player2Turns);
        System.out.println();

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
