package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("Karen K", "New era");
        BookHacked bookHacked = (BookHacked) book;
        //bookHacked.modifyTitle("Old era");

        System.out.println(book.getTitle());

    }
}
