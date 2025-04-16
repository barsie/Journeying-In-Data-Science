import java.util.Scanner;

public class MultipleChoiceQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array of correct answers
        char[] correctAnswers = {'B', 'C', 'A', 'D', 'B'};
        
        // Variable to keep track of correct responses
        int correctCount = 0;
        
        // Displaying and processing each question
        for (int i = 0; i < 5; i++) {
            char userAnswer = ' ';
            
            // Display question and options using a switch statement
            switch (i) {
                case 0:
                    System.out.println("Question 1: What is the capital of France?");
                    System.out.println("A. Berlin");
                    System.out.println("B. Paris");
                    System.out.println("C. Madrid");
                    System.out.println("D. Rome");
                    break;  
                case 1:
                    System.out.println("Question 2: Which planet is known as the Red Planet?");
                    System.out.println("A. Earth");
                    System.out.println("B. Venus");
                    System.out.println("C. Mars");
                    System.out.println("D. Jupiter");
                    break;
                case 2:
                    System.out.println("Question 3: What is the result of 3 * 4?");
                    System.out.println("A. 12");
                    System.out.println("B. 14");
                    System.out.println("C. 10");
                    System.out.println("D. 16");
                    break;
                case 3:
                    System.out.println("Question 4: Which language is primarily used for Android development?");
                    System.out.println("A. Python");
                    System.out.println("B. Swift");
                    System.out.println("C. C++");
                    System.out.println("D. Java");
                    break;
                case 4:
                    System.out.println("Question 5: Who wrote 'Romeo and Juliet'?");
                    System.out.println("A. Charles Dickens");
                    System.out.println("B. William Shakespeare");
                    System.out.println("C. Mark Twain");
                    System.out.println("D. Jane Austen");
                    break;
            }

            // Prompting user for input
            System.out.print("Enter your answer (A, B, C, or D): ");
            String input = scanner.nextLine().toUpperCase();

            // Input validation and capturing only A/B/C/D
            if (input.length() == 1) {
                userAnswer = input.charAt(0);
            }

            // Check if the answer is valid
            if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D') {
                // Compare user's answer to correct answer
                if (userAnswer == correctAnswers[i]) {
                    correctCount++; // Increment correct count
                }
            } else {
                System.out.println("Invalid answer. Moving to next question.");
            }

            System.out.println(); // Space between questions
        }

        // Calculate and display final score
        double percentage = (correctCount / 5.0) * 100;
        System.out.println("You answered " + correctCount + " out of 5 questions correctly.");
        System.out.println("Your final score: " + percentage + "%");

        scanner.close(); // Close the scanner
    }
}