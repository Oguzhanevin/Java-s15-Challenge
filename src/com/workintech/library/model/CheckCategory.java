package com.workintech.library.model;

import java.util.Scanner;

public class CheckCategory {
    public static Category checkCategory() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("FICTION için 1'e basınız,");
        System.out.println("MYSTERY için 2'ye basınız,");
        System.out.println("SCIENCE_FICTION için 3'e basınız,");
        System.out.println("ROMANCE için 4'e basınız,");
        System.out.println("HISTORY için 5'e basınız,");
        System.out.println("PSYCHOLOGICAL için 6'ya basınız,");
        System.out.println("CLASSIC için 7'ye basınız,");
        System.out.println("DYSTOPIAN için 8'e basınız,");
        System.out.println("HORROR için 9'a basınız,");
        System.out.println("FANTASY için 10'a basınız,");
        System.out.println("DRAMA için 11'e basınız,");

        int choice = scanner.nextInt();
        Category category = null;

        switch (choice) {
            case 1:
                category = Category.FICTION;
                break;
            case 2:
                category = Category.MYSTERY;
                break;
            case 3:
                category = Category.SCIENCE_FICTION;
                break;
            case 4:
                category = Category.ROMANCE;
                break;
            case 5:
                category = Category.HISTORY;
                break;
            case 6:
                category = Category.PSYCHOLOGICAL;
                break;
            case 7:
                category = Category.CLASSIC;
                break;
            case 8:
                category = Category.DYSTOPIAN;
                break;
            case 9:
                category = Category.HORROR;
                break;
            case 10:
                category = Category.FANTASY;
                break;
            case 11:
                category = Category.DRAMA;
                break;
            default:
                System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                break;
        }

        if (category == null) {
            System.out.println("Geçersiz kategori. Lütfen tekrar deneyin.");
        }

        return category;
    }
}
