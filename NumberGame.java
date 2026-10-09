import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain;

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nI have generated a number between 1 to 100. Guess it in " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Correct! You guessed in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if (!guessed) {
                System.out.println("Out of attempts! The number was: " + numberToGuess);
            }
            System.out.print("Want to play again? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your final score (rounds won): " + score);
        sc.close();
    }
}