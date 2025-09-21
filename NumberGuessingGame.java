import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int round = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            round++;
            int numberToGuess = random.nextInt(100) + 1; 
            int attemptsLeft = 7; 
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + round + " begins!");
            System.out.println("Please chosen a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess it.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attemptsLeft--;

                if (guess == numberToGuess) {
                    System.out.println(" Congratulation You guessed the Correct number.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println("Number is High! Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("Number is Low! Attempts left: " + attemptsLeft);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\nGame Over! You played " + round + " rounds and your final score is: " + score);
        scanner.close();
    }
}
