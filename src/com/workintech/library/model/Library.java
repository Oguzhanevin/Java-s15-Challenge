package com.workintech.library.model;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Library implements Borrowable {
    private Map<Integer, Book> books;
    private Set<Reader> readers;

    public Library() {
        books = new HashMap<>();
        readers = new HashSet<>();
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void addNewBook() { // yeni kitap ekleme
        Scanner scanner = new Scanner(System.in);
        int bookId;
        while (true) {
            System.out.println("Yeni kitap için ID giriniz:");
            bookId = scanner.nextInt();
            if (books.containsKey(bookId)) {
                System.out.println("Bu ID'ye sahip bir kitap zaten kütüphanede bulunuyor. Lütfen başka bir ID giriniz:");
            } else {
                break;
            }
        }

        String bookName;
        String bookAuthor;
        while (true) {
            System.out.println("Yeni kitap için isim giriniz:");
            bookName = getInput().trim();
            if (!bookName.isEmpty()) {
                break;
            }
            System.out.println("Kitap ismi boş bırakılamaz!");
        }

        while (true) {
            System.out.println("Yeni kitap için yazar adı giriniz:");
            bookAuthor = getInput().trim();
            if (!bookAuthor.isEmpty()) {
                break;
            }
            System.out.println("Yazar ismi boş bırakılamaz!");
        }

        System.out.println("Yeni kitap için fiyat bilgisi giriniz:");
        double bookPrice = scanner.nextDouble();
        System.out.println("Yeni kitap için baskı sayısı giriniz:");
        int bookEdition = scanner.nextInt();
        System.out.println("Yeni kitap için satın alma tarihi (yyyy-MM-dd) giriniz:");
        LocalDate bookDateOfPurchase = LocalDate.parse(getInput().trim(), DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Yeni kitap kategorisi seçiniz:");
        Category category = CheckCategory.checkCategory();

        Book book = new Book(bookId, bookAuthor, bookName, bookPrice, bookEdition, bookDateOfPurchase, category);
        books.put(bookId, book);
        System.out.println("Yeni kitap eklendi: " + book.getName());
    }

    public void getBookByName() { // İsme göre kitap arama
        System.out.println("Aradığınız kitabın adını giriniz:");
        String bookName = getInput().toLowerCase().trim();

        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : books.values()) {
            if (book.getName().toLowerCase().trim().equals(bookName)) {
                matchingBooks.add(book);
            }
        }
        if (matchingBooks.isEmpty()) {
            System.out.println("Bu isimde bir kitap bulunamadı.");
        } else {
            System.out.println(matchingBooks);
        }
    }


    Scanner scanner = new Scanner(System.in);

    public void getBookByID() { // ID'ye göre kitap arama
        System.out.println("Aradığınız kitabın ID'sini giriniz:");
        int bookID = scanner.nextInt();
        if (books.containsKey(bookID)) {
            System.out.println(books.get(bookID));
        } else {
            System.out.println("Bu ID'ye sahip kitap bulunamadı!");
        }
    }

    public void barrowBook() { // Kitap ödünç alma
        System.out.println("Ödünç almak istenilen kitap adını yazınız:");
        String bookName = getInput().toLowerCase().trim();
        Book barrowedBook = null;

        for (Book book : books.values()) {
            if (book.getName().toLowerCase().trim().equals(bookName)) {
                barrowedBook = book;
                break;
            }
        }

        if (barrowedBook == null) {
            System.out.println("Kitap mevcut değil.");
            return;
        }

        for (Reader reader : readers) {
            if (reader.getBooks().containsKey(barrowedBook.getBookID())) {
                System.out.println("Bu kitap başkası tarafından ödünç alınmış!");
                System.out.println("Ödünç alan okuyucu: " + reader);
                return;
            }
        }

        System.out.println("Bu kitap mevcut ve ödünç alınabilir. Ödünç almak isteyen okuyucunun üye numarasını giriniz:");
        int memberNumber = scanner.nextInt();

        for (Reader reader : readers) {
            if (reader.getMemberNum() == memberNumber) {
                if (reader.getBooks().size() < 5) {
                    reader.getBooks().put(barrowedBook.getBookID(), barrowedBook);
                    System.out.println("Kitap, " + reader + " adlı okuyucunun kitap listesine eklendi.");
                    System.out.println(reader + " adlı okuyucunun faturası güncellendi: " + reader.getBill() + "₺");
                } else {
                    System.out.println(reader + " adlı okuyucunun kitap listesi dolu.");
                }

                System.out.println("KİTAP LİSTENİZ:" + reader.getBooks());
                return;
            }
        }
        System.out.println(memberNumber + " üye numaralı bir üye bulunamadı!");
    }
    public List<String> getAuthorAllBooks() { // Yazarın tüm kitapları
        System.out.println("Yazar adını yazınız:");
        String firstName = getInput().toLowerCase().trim();

        System.out.println("Yazar soyadını yazınız:");
        String lastName = getInput().toLowerCase().trim();

        Author author = new Author(firstName, lastName); // Author sınıfında soyadı eklenmeli

        for (Book book : books.values()) {
            if (book.getAuthor().toLowerCase().trim().equals(firstName + " " + lastName)) {
                author.getBooks().put(book.getBookID(), book);
            }

        }
        List<String> bookList = new ArrayList<>();
        for (Book book : author.getBooks().values()) {
            bookList.add(book.getName());
        }

        if (!bookList.isEmpty()) {
            System.out.println("Yazarın kitapları:");
            for (String bookTitle : bookList) {
                System.out.println(bookTitle);
            }
        } else {
            System.out.println("Bu yazarın kitapları bulunmamaktadır.");
        }

        return bookList;
    }

    public void updateBook() { // Kitap bilgilerini güncelleme
        System.out.println("Düzenlemek istediğiniz kitabın ID bilgisini giriniz:");
        int bookID = scanner.nextInt();
        if (books.containsKey(bookID)) {
            Book bookToUpdate = books.get(bookID);

            System.out.println("Yeni kitap adını giriniz (AD: " + bookToUpdate.getName() + ");");
            String newName = getInput().trim();
            if (!newName.isEmpty()) {
                bookToUpdate.setName(newName);
            }

            System.out.println("Yeni yazar adını giriniz (YAZAR ADI: " + bookToUpdate.getAuthor() + ");");
            String newAuthor = getInput().trim();
            if (!newAuthor.isEmpty()) {
                bookToUpdate.setAuthor(newAuthor);
            }

            System.out.println("Yeni fiyat bilgisini giriniz (FİYAT: " + bookToUpdate.getPrice() + ");");
            String newPriceString = getInput().trim();
            if (!newPriceString.isEmpty()) {
                double newPrice = Double.parseDouble(newPriceString);
                bookToUpdate.setPrice(newPrice);
            }

            System.out.println("Yeni baskı sayısı bilgisini giriniz (BASKI: " + bookToUpdate.getEdition() + ");");
            String newEditionString = getInput().trim();
            if (!newEditionString.isEmpty()) {
                int newEdition = Integer.parseInt(newEditionString);
                bookToUpdate.setEdition(newEdition);
            }

            System.out.println("Yeni satın alma tarihini giriniz (SATIN ALMA TARİHİ: " + bookToUpdate.getDateOfPurchase() + ");");
            LocalDate newDateOfPurchase = LocalDate.parse(getInput().trim(), DateTimeFormatter.ISO_LOCAL_DATE);
            bookToUpdate.setDateOfPurchase(newDateOfPurchase);

            System.out.println("Yeni kitap kategorisi için (KATEGORİ: " + bookToUpdate.getCategory() + ");");
            Category category = CheckCategory.checkCategory();
            bookToUpdate.setCategory(category);

            System.out.println("Kitap bilgileri güncellendi: " + bookToUpdate.getName());
            System.out.println(bookToUpdate);
        } else {
            System.out.println("Bu ID'ye sahip bir kitap bulunamadı.");
        }
    }

    public void deleteBook() { // Kitap silme
        System.out.println("Silmek istediğiniz kitabın ID bilgisini giriniz:");
        int bookID = scanner.nextInt();
        if (books.containsKey(bookID)) {
            Book deletedBook = books.remove(bookID);
            System.out.println("Kitap silindi: " + deletedBook.getName());
        } else {
            System.out.println("Bu ID'ye sahip bir kitap bulunamadı.");
        }
    }

    public List<String> getAllBooksInCategory() { // Belirli bir kategorideki kitapları listeleme
        System.out.println("Aradığınız kategori için:");
        Category category = CheckCategory.checkCategory();

        List<String> bookList = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getCategory().equals(category)) {
                bookList.add(book.getName());
            }
        }

        if (!bookList.isEmpty()) {
            System.out.println(category + " kategorisindeki kitaplar:");
            for (String bookTitle : bookList) {
                System.out.println(bookTitle);
            }
        } else {
            System.out.println(category + " kategorisinde kitap bulunmamaktadır.");
        }

        return bookList;
    }

    public void bookToReturn() {
        System.out.println("İade edilecek kitabın ID'sini giriniz ");
        int bookID = scanner.nextInt();
        boolean bookFound = false;

        for (Book book : books.values()) {
            if (book.getBookID() == bookID) {
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println(bookID + " ID'li kitap bu kütüphaneye kayıtlı değil.");
            return;
        }

        System.out.println("İade edecek okuyucunun üye numarasını giriniz: ");
        int memberNum = scanner.nextInt();
        boolean readerFound = false;

        for (Reader reader : readers) {
            if (reader.getMemberNum() == memberNum) {
                if (reader.getBooks().containsKey(bookID)) {
                    reader.getBooks().remove(bookID);
                    System.out.println(
                            bookID + " ID'li kitap iade edildi. " );
                } else {
                    System.out.println("İade edilecek kitap okuyucunun kitap listesinde bulunmuyor");
                }
                readerFound = true;
                break;
            }
        }

        if (!readerFound) {
            System.out.println(memberNum + " numaralı okuyucu bulunamadı.");
        }
    }

    public void searchBook() { // Kitap ID'si, adı veya yazarına göre arama
        System.out.println("Aradığınız kitabın ID'sini, yazarını veya adını giriniz.");
        String bookInformation = getInput().toLowerCase().trim();
        List<Book> authorBooks = new ArrayList<>();
        List<Book> matchingBooks = new ArrayList<>();
        boolean bookFound = false;

        for (Book book : books.values()) {
            if (book.getAuthor().toLowerCase().trim().equals(bookInformation)) {
                authorBooks.add(book);
                bookFound = true;
            }
            if (book.getName().toLowerCase().trim().equals(bookInformation)) {
                matchingBooks.add(book);
                bookFound = true;
            }
            if (String.valueOf(book.getBookID()).equals(bookInformation)) {
                System.out.println(book);
                bookFound = true;
                break;
            }
        }

        if (bookFound) {
            if (!authorBooks.isEmpty()) {
                System.out.println("Yazarın kitapları: " + authorBooks);
            }
            if (!matchingBooks.isEmpty()) {
                System.out.println("Bu isimdeki kitaplar: " + matchingBooks);
            }
        } else {
            System.out.println("Kitap bulunamadı!");
        }
    }

    public void addMember() { // Yeni okuyucu ekle
        Scanner scanner = new Scanner(System.in);
        int memberNum;

        // Ensure member number is unique
        while (true) {
            System.out.println("Yeni üye için üye numarası giriniz:");
            memberNum = scanner.nextInt();
            boolean existMember = false;
            for (Reader reader : readers) {
                if (reader.getMemberNum() == memberNum) {
                    System.out.println("Bu üye numarasına sahip bir üye bulunuyor. Lütfen başka bir numara giriniz:");
                    existMember = true;
                    break;
                }
            }
            if (!existMember) {
                break;
            }
        }

        // Collect first name
        String memberFirstName;
        while (true) {
            System.out.println("Yeni üye için isim giriniz:");
            memberFirstName = getInput().trim();
            if (!memberFirstName.isEmpty()) {
                break;
            }
            System.out.println("Üye ismi boş bırakılamaz.");
        }

        // Collect last name
        String memberLastName;
        while (true) {
            System.out.println("Yeni üye için soyisim giriniz:");
            memberLastName = getInput().trim();
            if (!memberLastName.isEmpty()) {
                break;
            }
            System.out.println("Üye soyismi boş bırakılamaz.");
        }

        // Add the new reader
        Reader newReader = new Reader(memberFirstName, memberLastName, memberNum);
        readers.add(newReader);
        System.out.println("Yeni üye eklendi: " + newReader.getName());
    }
}
