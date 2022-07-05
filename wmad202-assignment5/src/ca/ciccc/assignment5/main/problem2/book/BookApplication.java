package ca.ciccc.assignment5.main.problem2.book;

import java.util.ArrayList;

public class BookApplication {
    public void runApplication() {
        ArrayList<String> words = new ArrayList<>();
        words.add("light");
        words.add("apple");
        words.add("pen");
        words.add("book");
        Book book = new Book(203,words);
        System.out.println("the number of occurrences of a \n" +
                "given word inside a book: "+ book.getWordCreation("apple"));
    }

}
