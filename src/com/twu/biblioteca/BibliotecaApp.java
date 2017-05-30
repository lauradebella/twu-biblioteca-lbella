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

        System.out.println(output.welcomeMessage());
        System.out.println("\nSee all books we have here !!");
        for (Book book: library.getBooks()) {
            System.out.printf("%-15s %-15s %-10s\n", book.name, book.author, book.yearPublished);
            //System.out.println(book.name);
        };

    }

    public static ArrayList<Book> mockLibraryBooks(){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Livro 1", "Author X1", "Year 2001"));
        books.add(new Book("Livro 2", "Author X2", "Year 2002"));
        books.add(new Book("Livro 3", "Author X3", "Year 2003"));
        return books;
    }
    
    


}
