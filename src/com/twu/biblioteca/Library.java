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

}
