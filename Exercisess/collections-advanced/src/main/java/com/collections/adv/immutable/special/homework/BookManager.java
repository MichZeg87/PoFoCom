package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
   private static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        for (Book checkBook : books) {
            if (checkBook.getTitle().equals(title) && checkBook.getAuthor().equals(author)){
                System.out.println("This book already exist");
                return checkBook;
            }

        }
        Book book = new Book(title, author);
        books.add(book);
        return book;

    }
}