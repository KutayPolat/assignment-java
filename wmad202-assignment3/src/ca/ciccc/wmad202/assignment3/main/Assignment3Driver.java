package ca.ciccc.wmad202.assignment3.main;

import ca.ciccc.wmad202.assignment3.question1.Question1;
import ca.ciccc.wmad202.assignment3.question10.Question10;
import ca.ciccc.wmad202.assignment3.question2.Question2;
import ca.ciccc.wmad202.assignment3.question3.Question3;
import ca.ciccc.wmad202.assignment3.question4.Question4;
import ca.ciccc.wmad202.assignment3.question5.Question5;
import ca.ciccc.wmad202.assignment3.question6.Question6;
import ca.ciccc.wmad202.assignment3.question7.Question7;
import ca.ciccc.wmad202.assignment3.question8.Question8;
import ca.ciccc.wmad202.assignment3.question9.Question9;

import java.util.Scanner;

public class Assignment3Driver {
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
                case 3:
                    Question3 question3 = new Question3();
                    question3.invoke();
                    stop = false;
                    break;
                case 4:
                    Question4 question4 = new Question4();
                    question4.invoke();
                    stop = false;
                    break;
                case 5:
                    Question5 question5 = new Question5();
                    question5.invoke();
                    stop = false;
                    break;
                case 6:
                    Question6 question6 = new Question6();
                    question6.invoke();
                    stop = false;
                    break;
                case 7:
                    Question7 question7 = new Question7();
                    question7.invoke();
                    stop = false;
                    break;
                case 8:
                    Question8 question8 = new Question8();
                    question8.invoke();
                    stop = false;
                    break;
                case 9:
                    Question9 question9 = new Question9();
                    question9.invoke();
                    stop = false;
                    break;
                case 10:
                    Question10 question10 = new Question10();
                    question10.invoke();
                    stop = false;
                    break;
                default:
                    System.out.println("Enter number between 1 to 10");
            }
        }
    }
}
