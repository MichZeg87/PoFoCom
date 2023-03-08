package com.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book =  BookManager.createBook("Dune", "Frank Herbert");
        Book book1 = BookManager.createBook("Institute", "Stephen King");
        Book book2 =  BookManager.createBook("Institute", "Stephen King");
        System.out.println(book.equals(book1));
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
    }
}
