import java.util.*;

public class Program_104{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== Quiz Application =====");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. New Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. HTML");
        System.out.println("3. SQL");
        System.out.println("4. CSS");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Venus");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. object");
        System.out.println("3. new");
        System.out.println("4. create");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        // Question 5
        System.out.println("\n5. How many days are there in a week?");
        System.out.println("1. 5");
        System.out.println("2. 6");
        System.out.println("3. 7");
        System.out.println("4. 8");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        System.out.println("\n===== Result =====");
        System.out.println("Your Score: " + score + "/5");

        if (score >= 3) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("Better luck next time.");
        }

        sc.close();
    }
}