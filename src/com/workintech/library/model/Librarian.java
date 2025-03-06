package com.workintech.library.model;

import java.util.Scanner;

// Kütüphaneci (Librarian)
public class Librarian extends Person implements Loginable {
    private String password;
    private static Librarian librarian;
    private static final Scanner scanner = new Scanner(System.in);

    private Librarian(String name, String surname) {
        super(name.toLowerCase().trim(), surname.toLowerCase().trim());
        this.password = name.toLowerCase().trim() + "123";
    }

    public synchronized static Librarian getInstance(String name, String surname) {
        if (librarian == null) {
            librarian = new Librarian(name, surname);
        }
        return librarian;
    }

    public String getPassword() {
        return password;
    }

    private static String getInput() {
        return scanner.nextLine().trim();
    }

    @Override
    public boolean canLogin() {
        while (true) {
            System.out.println("Lütfen kullanıcı adınızı girin: ");
            String nameInput = getInput().toLowerCase();

            System.out.println("Lütfen şifrenizi girin: ");
            String passwordInput = getInput();

            if (getName().equals(nameInput) && getPassword().equals(passwordInput)) {
                System.out.println("**Hesabınıza giriş yapıldı**");
                return true;
            } else {
                System.out.println("Yanlış şifre veya isim girdiniz, tekrar deneyiniz!");
            }
        }
    }
}
