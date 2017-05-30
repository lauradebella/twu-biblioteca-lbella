package com.twu.biblioteca;

import com.twu.book.Book;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lbella on 30/05/17.
 */
public class LibraryTest {

    @Test
    public void shouldReturnABooksListWith3Elements(){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Livro 1", "Author X1", "Year 2001"));
        books.add(new Book("Livro 2", "Author X2", "Year 2002"));
        books.add(new Book("Livro 3", "Author X3", "Year 2003"));
        Library library = new Library(books);

        assertThat(library.getBooks().size(), is(3));
    }


}