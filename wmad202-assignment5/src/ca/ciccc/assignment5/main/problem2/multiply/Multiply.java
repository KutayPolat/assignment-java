package ca.ciccc.assignment5.main.problem2.multiply;

import java.util.ArrayList;

public class Multiply {

    private ArrayList<String> ChoiceList = new ArrayList<>();

    public void giveChoices(String a1,String a2,String a3,String a4) {
        ChoiceList.add("A");
        System.out.println("A-" + a1);
        ChoiceList.add("B");
        System.out.println("B-" + a2);
        ChoiceList.add("C");
        System.out.println("C-" + a3);
        ChoiceList.add("D");
        System.out.println("D-" + a3);
    }

    public void showQuestion(String s) {
        System.out.println(s);
    }

    public void showTheAnswer(String s) {
        System.out.println("Correct answer : " + s);
    }

    public void checkChoice(String answer, String answer1) {
        String correct = answer1;
        if(answer == correct) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
