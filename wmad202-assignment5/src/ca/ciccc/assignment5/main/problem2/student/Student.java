package ca.ciccc.assignment5.main.problem2.student;

import ca.ciccc.assignment5.main.problem2.multiply.Multiply;

public class Student {
    private String text;
    private String textAnswer;

    public Student(String text, String textAnswer) {
        this.text = text;
        this.textAnswer = textAnswer;
    }

    public void ask() {
        Multiply multiply = new Multiply();
        multiply.showQuestion(text);
    }

    public void printAnswer() {
        Multiply multiply = new Multiply();
        multiply.showTheAnswer(textAnswer);
    }
}
