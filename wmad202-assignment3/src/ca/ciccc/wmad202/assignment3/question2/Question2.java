package ca.ciccc.wmad202.assignment3.question2;

import ca.ciccc.wmad202.assignment3.question1.Question1;

import java.util.Scanner;

public class Question2 {
    public void invoke(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find next prime number : ");
        int input = scan.nextInt();

        boolean findNextPrime = true;
        Question1 question1 = new Question1();
        while (findNextPrime){
            input++;
            if (question1.checkPrimeNumber(input) == true){
                findNextPrime = false;
                System.out.println("Next prime number is : " + input);
            }
        }

    }
}
