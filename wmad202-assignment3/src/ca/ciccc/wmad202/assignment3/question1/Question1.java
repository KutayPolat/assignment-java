package ca.ciccc.wmad202.assignment3.question1;

import java.util.Scanner;

public class Question1 {

    public void invoke(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for check it is prime or not : ");
        int input = scan.nextInt();
        System.out.println("it is prime = " + checkPrimeNumber(input));
    }

    public boolean checkPrimeNumber(int input) {

        boolean isPrime = true;
        if (input <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= input / 2; i++) {
                if ((input % i) == 0) {
                    isPrime = false;

                    break;
                }
            }
        }
        return isPrime;
    }
}
