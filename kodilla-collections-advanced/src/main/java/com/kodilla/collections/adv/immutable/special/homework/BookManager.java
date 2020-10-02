package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class BookManager {

    private static List<Book> books = new LinkedList<>();

    public static Book createBook(String name, String author) {

        for (Book book : books) {
            if (book.getTitle().equals(name) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        Book book = new Book(name, author);
        books.add(book);
        return book;
    }

    public static void printLibrary() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "BookManager{}";
    }


}
