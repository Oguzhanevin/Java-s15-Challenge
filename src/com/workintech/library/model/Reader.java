package com.workintech.library.model;

import com.workintech.library.model.Book;
import com.workintech.library.model.Person;

import java.util.*;

public class Reader extends Person {
    private Map<Integer, Book> books;
    private double bill;
    private int memberNum;

    public Reader(String name, String surname, int memberNum) {
        super(name, surname);
        books = new LinkedHashMap<>();
        this.memberNum = memberNum;
        this.bill = 0; // Başlangıçta bill sıfır
    }

    public double getBill() { // Okuyucunun faturası
        bill = 0;
        for (Book book : books.values()) {
            bill += book.getPrice();
        }
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getMemberNum() {
        return memberNum;
    } // Okuyucunun üye numarası

    // Bir Okuyucu en fazla 5 kitap alabilir.
    public Map<Integer, Book> getBooks() { // Okuyucunun ödünç aldığı kitapların mapini döndürür
        return books;
    }

    // Kitap eklerken, kitap sayısı 5'i aşarsa, en son alınan kitabı siler
    public void addBook(Book book) {
        if (books.size() >= 5) {
            System.out.println("Bir okuyucu 5'ten fazla kitap alamaz! Son kitap silindi.");
            Iterator<Integer> iterator = books.keySet().iterator();
            if (iterator.hasNext()) {
                books.remove(iterator.next());
            }
        }
        books.put(book.getBookID(), book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return memberNum == reader.memberNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNum);
    }
}
