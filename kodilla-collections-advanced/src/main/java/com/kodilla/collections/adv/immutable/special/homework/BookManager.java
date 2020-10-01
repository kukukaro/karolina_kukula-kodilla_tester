package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;


public class BookManager {

    private static Map<Book, Book> books = new HashMap<>();

    public static Book createBook(String name, String author) {
        Book book = new Book(name, author);
        if (books.containsKey(book)){
            return books.get(book);
        }
        books.put(book, book);
        return  book;
    }


}
