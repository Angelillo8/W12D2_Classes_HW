package com.codeclan.example;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(ArrayList<Book> books) {
        this.books = books;
        this.capacity = 3;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        int stock = this.countBooks();
        if(stock < this.capacity) {
            this.books.add(book);
        }
    }
}
