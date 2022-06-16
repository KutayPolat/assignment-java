package ca.ciccc.wmad202.assignment3.question6;

import java.util.*;

public class Question6 {
    public void invoke(){
        List<Integer> list = Arrays.asList(1,1,2,2,3,3,3,3,4,5,6,7,8);
        distinctNumber(list);

    }
    public void distinctNumber(List<Integer> list){
        Map<Integer ,Integer> map = new HashMap<>();

        for(Integer numbers: list) {
            if(!map.containsKey(numbers)) {
                map.put(numbers, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer ,Integer>  entry : entrySet) {
            System.out.printf("%s , ", entry.getKey());
        }
    }
}
