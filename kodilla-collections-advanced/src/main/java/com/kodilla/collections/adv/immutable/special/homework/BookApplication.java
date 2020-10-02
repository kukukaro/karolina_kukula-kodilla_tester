package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book01 = BookManager.createBook("Harry Potter", "JKRowling");
        Book book02 = BookManager.createBook("Kot Jaśniepan", "JKłaczek");
        Book book03 = BookManager.createBook("Kot Jaśniepan", "JKłaczek");

        System.out.println(book01==book02);
        System.out.println(book02==book03);

        BookManager.printLibrary();

        }
    }

