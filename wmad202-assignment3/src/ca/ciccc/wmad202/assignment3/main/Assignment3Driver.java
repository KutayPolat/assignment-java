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
            if (questions == 1){
                Question1 question = new Question1();
                question.invoke();
                stop = false;
            }else if(questions == 2){
                Question2 question = new Question2();
                question.invoke();
                stop = false;
            }else if(questions == 3){
                Question3 question = new Question3();
                question.invoke();
                stop = false;
            }else if(questions == 4){
                Question4 question = new Question4();
                question.invoke();
                stop = false;
            }else if(questions == 5){
                Question5 question = new Question5();
                question.invoke();
                stop = false;
            }else if(questions == 6){
                Question6 question = new Question6();
                question.invoke();
                stop = false;
            }else if(questions == 7){
                Question7 question = new Question7();
                question.invoke();
                stop = false;
            } else if(questions == 8){
                Question8 question = new Question8();
                question.invoke();
                stop = false;
            }else if(questions == 9){
                Question9 question = new Question9();
                question.invoke();
                stop = false;
            }else if(questions == 10){
                Question10 question = new Question10();
                question.invoke();
                stop = false;
            }else {
                System.out.println("Please enter btw 1-10");
            }
        }
    }
}
