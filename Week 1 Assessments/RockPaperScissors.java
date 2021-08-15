import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {

    public static void main(String[] args) {
        // Scanner and random number generator
        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        // Variables for keeping track of game score
        int roundsToPlay;
        int roundsPlayed;
        int roundsWon;
        int roundsLost;

        // Variables for keeping track of individual match
        int userMove;
        int computerMove;

        // Boolean to keep track of when the game should terminate
        boolean gameOver = false;

        while (!gameOver) {
            // Reset count of rounds played/won/lost
            roundsPlayed = 0;
            roundsWon = 0;
            roundsLost = 0;

            System.out.println("How many rounds would you like to play?");
            roundsToPlay = input.nextInt();
            if (roundsToPlay < 0 || roundsToPlay > 10) {
                System.out.println("Error: Rounds played must be between 0 and 10. Program terminating...");
                gameOver = true;
            } else {
                while (roundsToPlay > 0) {
                    // Getting user's move
                    System.out.println("");
                    System.out.println("Would you like to pick rock, paper, or scissors?");
                    System.out.println("1 - Rock");
                    System.out.println("2 - Paper");
                    System.out.println("3 - Scissors");
                    System.out.println("");
                    userMove = input.nextInt();

                    // Generate computer's move
                    computerMove = rng.nextInt(3) + 1;

                    switch (userMove) {
                        case 1:
                            if (computerMove == 1) {
                                System.out.println("You tied!");
                            } else if (computerMove == 2) {
                                System.out.println("Computer picked Paper - You Lose!");
                                roundsLost++;
                            } else {
                                System.out.println("Computer picked Scissors - You Win!");
                                roundsWon++;
                            }
                            break;

                        case 2:
                            if (computerMove == 1) {
                                System.out.println("Computer picked Rock - You Win!");
                                roundsWon++;
                            } else if (computerMove == 2) {
                                System.out.println("You Tied!");
                            } else {
                                System.out.println("Computer picked Scissors - You Lose!");
                                roundsLost++;
                            }
                            break;

                        case 3:
                            if (computerMove == 1) {
                                System.out.println("Computer picked Rock - You Lose!");
                                roundsLost++;
                            } else if (computerMove == 2) {
                                System.out.println("Computer picked Paper - You Win!");
                                roundsWon++;
                            } else {
                                System.out.println("You tied!");
                            }
                            break;
                    }

                    roundsPlayed++;
                    roundsToPlay--;
                    System.out.println("After round " + roundsPlayed + ", the current score is: ");
                    System.out.println("You: " + roundsWon);
                    System.out.println("Computer: " + roundsLost);

                }

                System.out.println("========= Final Score =========");
                System.out.println("You: " + roundsWon);
                System.out.println("Computer: " + roundsLost);
                if (roundsWon > roundsLost) {
                    System.out.println("Overall winner: You!");
                } else if (roundsWon == roundsLost) {
                    System.out.printf("Overall winner: It's a tie!");
                } else {
                    System.out.println("Overall winner: Computer :-(");
                }
                System.out.println("");

                System.out.println("Would you like to play again? (Enter yes/no)");

                String playAgain = input.next();

                if (playAgain.equals("yes")) {
                    // Game continues
                } else if (playAgain.equals("no")) {
                    System.out.println("Thanks for playing!");
                    gameOver = true;
                } else {
                    System.out.println("Invalid input - game terminating");
                    System.out.printf("Thanks for playing!");
                    gameOver = true;
                }
            }
        }
    }
}
