package com.workintech.library.model;

import java.util.HashMap;
import java.util.Map;

public class Author extends Person {
    private Map<Integer, Book> books;

    public Author(String name, String surname) {
        super(name, surname);
        books = new HashMap<>();
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }
}
