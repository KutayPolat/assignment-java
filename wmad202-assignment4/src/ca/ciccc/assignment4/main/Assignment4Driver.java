package ca.ciccc.assignment4.main;

import ca.ciccc.assignment4.question1.Question1;
import ca.ciccc.assignment4.question2.Question2;

import java.util.Scanner;

public class Assignment4Driver {
    public static void run() {
        boolean stop = true;

        while (stop){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter question number 1-10 to show solve of question");
            int questions = scanner.nextInt();

            switch (questions) {
                case 1:
                    Question1 question = new Question1();
                    question.invoke();
                    stop = false;
                    break;
                case 2:
                    Question2 question2 = new Question2();
                    question2.invoke();
                    stop = false;
                    break;
                default:
                    System.out.println("Enter number between 1 to 10");
            }
        }
    }
}
