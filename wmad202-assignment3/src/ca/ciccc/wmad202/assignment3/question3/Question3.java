package ca.ciccc.wmad202.assignment3.question3;

import java.util.Scanner;

public class Question3 {
    public void invoke(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        System.out.println("enter a number (1-2-3) for pattern of stars");
        int shape = scanner.nextInt();
        if (shape == 1){
            printShape(number, "SHAPE1");
        }else if (shape == 2){
            printShape(number, "SHAPE2");
        }else{
            printShape(number, "SHAPE3");
        }
    }

    private static void printShape(int number, String format){
        if (format.equalsIgnoreCase("SHAPE1")){
            for (int i= 0; i<= number-1 ; i++) {
                for (int j=0; j<=i; j++) {
                    System.out.print(" ");
                }
                for (int k=0; k<=number-1-i; k++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        } else if(format.equalsIgnoreCase("SHAPE2")){
            for (int i= number-1; i>=0 ; i--) {
                for (int j=0; j<=i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        } else if (format.equalsIgnoreCase("SHAPE3")){
            for(int i = 1; i <= number; i++) {
                for(int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }

    }

}
