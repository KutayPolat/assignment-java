package ca.ciccc.wmad202.assignment3.question7;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
    /*
    Define and implement a function which does Linear Search. This function receives two
input parameters, one is a list of integers and the other one is a number to search for. The
method returns -1 (negative one) if the number (the second parameter of the function)
does not exist in the list or returns the index of the number if the number exists in the list.
-If there are more than one occurrence of the number, the function will return the index of
the first occurrence
     */
    public void invoke(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(search(list,8));
    }

    public int search(List<Integer> list, int number){
        for (Integer n: list){
            if (n == number){
                return n;
            }
        }
        return -1;
    }
}
