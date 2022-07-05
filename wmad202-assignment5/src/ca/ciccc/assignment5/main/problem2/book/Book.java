package ca.ciccc.assignment5.main.problem2.book;

import java.util.ArrayList;

public class Book {
    private int bookPages;
    private ArrayList<String> bookWords;

    public Book(int bookPages,ArrayList<String> bookWords){
        this.bookPages=bookPages;
        this.bookWords=bookWords;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public ArrayList<String> getBookWords() {
        return bookWords;
    }

    public void setBookWords(ArrayList<String> bookWords) {
        this.bookWords = bookWords;
    }

    public int getWordCreation(String word){
        int counter=0;
        for(String s: bookWords){
            if(s.equals(word)){
                counter++;
            }
        }
        return counter;
    }
}
