package ca.ciccc.wmad202.assignment2.question3;

import java.util.Scanner;

public class Question3 {

    public void convertBinary() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("binary one : " +Integer.toBinaryString(number));
    }
}
