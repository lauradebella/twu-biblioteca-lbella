package com.twu.biblioteca;

import com.twu.book.Book;
import com.twu.output.Output;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {


    public static void main(String[] args) {

        Output output = new Output();
        Library library = new Library(mockLibraryBooks());

        System.out.println("See all books we have here !!");
        System.out.println(output.welcomeMessage());
        for (Book book: library.getBooks()) {
            System.out.println(book.name);
        };

    }

    public static ArrayList<Book> mockLibraryBooks(){
        ArrayList<Book> allBooks = new ArrayList<Book>();
        allBooks.add(new Book("Livro 1"));
        allBooks.add(new Book("Livro 2"));
        allBooks.add(new Book("Livro 3"));
        return allBooks;
    }
    
    


}
