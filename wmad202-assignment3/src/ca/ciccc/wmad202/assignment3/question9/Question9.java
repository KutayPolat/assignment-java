package ca.ciccc.wmad202.assignment3.question9;

import ca.ciccc.wmad202.assignment3.question1.Question1;

import java.util.*;

public class Question9 {
    public void invoke(){
        List<Integer> numbers = Arrays.asList(15,19,10,11,8,7,3,3,1);

        for (int i= 0; i < numbers.size(); i++){
            primeVisibility(numbers.get(i),i);
        }


    }

    public void primeVisibility(int number, int index){
        Question1 question1 = new Question1();
        Map<Integer ,Integer> map = new HashMap<>();
        if(question1.checkPrimeNumber(number)) {
            map.put(index, 1);
        }else {
            map.put(index,0);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer ,Integer>  entry : entrySet) {
            System.out.printf("%s : %d %n ", entry.getKey(),entry.getValue());
        }
    }
}
