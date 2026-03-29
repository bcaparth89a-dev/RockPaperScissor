import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println("🎮 Welcome to Rock Paper Scissors Game!");
        System.out.println("--------------------------------------");

        while (true) {

            // Take user input
            System.out.print("\nEnter your choice (rock, paper, scissors) or 'exit' to quit: ");
            String userChoice = sc.nextLine().toLowerCase();

            // Exit condition
            if (userChoice.equals("exit")) {
                System.out.println("👋 Thanks for playing!");
                break;
            }

            // Input validation
            if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.println("❌ Invalid input! Please try again.");
                continue;
            }

            // Computer choice
            int choice = rand.nextInt(3);
            String computerChoice;

            if (choice == 0) {
                computerChoice = "rock";
            } else if (choice == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            System.out.println("💻 Computer chose: " + computerChoice);

            // Game logic
            if (userChoice.equals(computerChoice)) {
                System.out.println("🤝 It's a Draw!");
            }
            else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("🎉 You Win!");
                userScore++;
            }
            else {
                System.out.println("😢 You Lose!");
                computerScore++;
            }

            // Display score
            System.out.println("📊 Score → You: " + userScore + " | Computer: " + computerScore);
        }

        sc.close();
    }
}