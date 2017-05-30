package com.twu.biblioteca;

import com.twu.book.Book;

import java.util.ArrayList;

/**
 * Created by lbella on 30/05/17.
 */
public class Library {

    ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void listBooks() {
        System.out.println("\nSee all books we have here !!");
        for (Book book: this.getBooks()) {
            System.out.printf("%-15s %-15s %-10s\n", book.name, book.author, book.yearPublished);
        };
    }
}
