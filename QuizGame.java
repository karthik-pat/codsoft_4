import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "What is the capital of France?",
            "What is the largest ocean?",
            "Which planet is nearest to the Sun?"
        };
        String[] options = {
            "a) Paris, b) London, c) Madrid",
            "a) Pacific, b) Atlantic, c) Indian",
            "a) Mercury, b) Venus, c) Earth"
        };
        String[] correctAnswers = {"c", "c", "a"};

        int correctCount = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            String userAnswer = scanner.nextLine().toLowerCase();
            if (userAnswer.equals(correctAnswers[i])) {
                correctCount++;
            }
        }

        System.out.println("\nQuiz Summary:");
        System.out.println("Correct answers: " + correctCount);
        System.out.println("Incorrect answers: " + (questions.length - correctCount));
        System.out.println("Final score: " + (correctCount * 10) + "/" + (questions.length * 10));
    }
}