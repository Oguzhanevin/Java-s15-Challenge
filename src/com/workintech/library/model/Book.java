package com.workintech.library.model;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private int bookID;
    private String author;
    private String name;
    private double price;
    private int edition;
    private LocalDate dateOfPurchase;
    private Category category;

    public Book(int bookID, String author, String name, double price, int edition, LocalDate dateOfPurchase, Category category) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.category = category;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book {" +
                "ID=" + bookID +
                ", Author='" + author + '\'' +
                ", Title='" + name + '\'' +
                ", Price=" + price +
                ", Edition=" + edition +
                ", Purchase Date=" + dateOfPurchase +
                ", Category=" + (category != null ? category.toString() : "Unknown") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookID == book.bookID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID);
    }
}
