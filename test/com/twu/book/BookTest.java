package com.twu.book;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lbella on 30/05/17.
 */
public class BookTest {

    @Test
    public void shouldVerifyName(){
        Book book = new Book("Name", "Author", "Year Published");
        assertThat(book.name, is("Name"));
    }

    @Test
    public void shouldVerifyAuthor(){
        Book book = new Book("Name", "Author", "Year Published");
        assertThat(book.author, is("Author"));
    }

    @Test
    public void shouldVerifyYearPublish(){
        Book book = new Book("Name", "Author", "Year Published");
        assertThat(book.yearPublished, is("Year Published"));
    }
}