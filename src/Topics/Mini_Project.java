package Topics;

import java.util.Random;
import java.util.Scanner;

public class Mini_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int maxQuestions = 5;
        int timeLimitPerQuestion = 20; // Time limit per question (in seconds)
        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "How many continents are there in the world?",
                "What is the largest mammal on Earth?",
                "What is the chemical symbol for gold?"
        };
        String[] answers = {"Paris", "Mars", "7", "Blue Whale", "Au"};
        boolean[] questionUsed = new boolean[questions.length];

        System.out.println("Welcome to the Extended Quiz Game!");
        System.out.println("Answer the following questions within " + timeLimitPerQuestion + " seconds:");

        for (int i = 0; i < maxQuestions; i++) {
            int randomIndex;
            do {
                randomIndex = new Random().nextInt(questions.length);
            } while (questionUsed[randomIndex]);

            System.out.println("\nQuestion " + (i + 1) + ": " + questions[randomIndex]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[randomIndex])) {
                System.out.println("Correct! You earned a point.");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[randomIndex]);
            }

            questionUsed[randomIndex] = true;
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your final score is: " + score + " out of " + maxQuestions);

        if (score == maxQuestions) {
            System.out.println("Congratulations! You got all the questions right.");
        } else {
            System.out.println("Good effort. Try again to improve your score.");
        }

        scanner.close();
    }
}
