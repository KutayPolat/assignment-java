package ca.ciccc.wmad202.assignment3.question8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Question8 {

    public void invoke(){
        int number = 3;
        Random r = new Random();
        int low = 40;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.println("Toplimit => " + result);
        System.out.println("number => " + number);
        System.out.println(listOfNumbers(result,number));
    }

    public List<Integer> listOfNumbers(int topLimit, int number){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= topLimit; i++){
            if (i % number == 0){
                numbers.add(i);
            }
        }
        return numbers;
    }
}
