package com.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
//        Book book = new BookHacked("John Stewart", "The last chance"); // schakowane
        Book book = new Book("John Stewart", "The last chance");
//        BookHacked bookHacked = (BookHacked) book; // schakowane
//        bookHacked.modifyTitle("New title"); // shakowane
        System.out.println(book.getTitle());
    }
}
