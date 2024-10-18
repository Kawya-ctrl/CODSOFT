import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int roundsPlayed = 0;
        int roundsWon = 0;

        while (true) {
            int numGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean correctGuess = false;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 to 100,and you have " + maxAttempts + " attempts to guess it.Give it a");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;
                if (guess < numGuess) {
                    System.out.println("Too low!");
                } 
                else if (guess > numGuess) {
                    System.out.println("Too high!");
                } 
                else {
                    System.out.println("Congratulations! You've guessed the number " + numGuess + " in " + attempts + " attempts.");
                    roundsWon++; // Increment rounds won
                    correctGuess = true;
                    break;
                }
            }
            if (!correctGuess) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + correctGuess + ".");
            }
            roundsPlayed++;
            System.out.print("Would you like to play again? (yes/no): ");
            String playAgain = sc.next().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        System.out.println("Thanks for playing! You played " + roundsPlayed + " rounds.");
        System.out.println("You won " + roundsWon + " rounds!");
        sc.close();
    }
}

