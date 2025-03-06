package com.workintech.library.main;

import com.workintech.library.model.Category;
import com.workintech.library.model.Book;
import com.workintech.library.model.Librarian;
import com.workintech.library.model.Library;
import com.workintech.library.model.Reader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Librarian ismi verilerek nesne oluşturuluyor
        Librarian theLibrarian = Librarian.getInstance("admin", "adminSurname");

        Library library = new Library();

        // Tarih formatı için Locale ekleniyor
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.ENGLISH); // İngilizce ay adları

        // Kitaplar
        Book book1 = new Book(1, "J.C. Grange", "Le Passager", 65.4, 30, LocalDate.parse("01 November 2019", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.MYSTERY);
        Book book2 = new Book(2, "Dan Brown", "Cehennem", 95, 30, LocalDate.parse("01 December 2009", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.MYSTERY);
        Book book3 = new Book(3, "Fyodor Dostoevsky", "Crime and Punishment", 55, 30, LocalDate.parse("01 December 2009", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.PSYCHOLOGICAL);
        Book book4 = new Book(4, "J. K. Rowling", "Harry Potter and the Deathly Hallows", 100, 30, LocalDate.parse("01 December 2009", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book5 = new Book(5, "J. R. R. Tolkien", "The Lord of the Rings", 100, 30, LocalDate.parse("01 December 2009", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book6 = new Book(6, "Charles Dickens", "A Tale of Two Cities", 100, 30, LocalDate.parse("01 December 2009", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.ROMANCE);
        Book book7 = new Book(7, "J.C. Grange", "Blood Red Rivers", 65.4, 30, LocalDate.parse("01 November 2019", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.MYSTERY);
        Book book8 = new Book(8, "İlber Ortaylı", "Türklerin Tarihi", 65.4, 30, LocalDate.parse("01 November 2019", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.HISTORY);
        Book book9 = new Book(9, "İlber Ortaylı", "Bir Ömür Nasıl Yaşanır?", 65.2, 35, LocalDate.parse("01 February 2019", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.HISTORY);
        Book book10 = new Book(10, "George Orwell", "1984", 95, 40, LocalDate.parse("01 June 1949", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book11 = new Book(11, "Aldous Huxley", "Brave New World", 85, 35, LocalDate.parse("01 January 1932", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book12 = new Book(12, "J.R.R. Tolkien", "The Hobbit", 88, 30, LocalDate.parse("01 September 1937", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book13 = new Book(13, "Agatha Christie", "Murder on the Orient Express", 90, 30, LocalDate.parse("01 January 1934", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.MYSTERY);
        Book book14 = new Book(14, "Herman Melville", "Moby Dick", 120, 35, LocalDate.parse("01 November 1851", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.CLASSIC);
        Book book15 = new Book(15, "F. Scott Fitzgerald", "The Great Gatsby", 80, 35, LocalDate.parse("01 April 1925", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.CLASSIC);
        Book book16 = new Book(16, "J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 100, 25, LocalDate.parse("01 June 1997", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book17 = new Book(17, "Margaret Atwood", "The Handmaid's Tale", 95, 30, LocalDate.parse("01 January 1985", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.DYSTOPIAN);
        Book book18 = new Book(18, "J.D. Salinger", "The Catcher in the Rye", 70, 25, LocalDate.parse("01 July 1951", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.CLASSIC);
        Book book19 = new Book(19, "Mark Twain", "Adventures of Huckleberry Finn", 110, 40, LocalDate.parse("01 December 1884", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.CLASSIC);
        Book book20 = new Book(20, "John Steinbeck", "Of Mice and Men", 70, 30, LocalDate.parse("01 February 1937", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book21 = new Book(21, "Harper Lee", "To Kill a Mockingbird", 75, 40, LocalDate.parse("01 July 1960", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book22 = new Book(22, "Jane Austen", "Pride and Prejudice", 80, 35, LocalDate.parse("01 January 1813", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.ROMANCE);
        Book book23 = new Book(23, "Leo Tolstoy", "War and Peace", 150, 50, LocalDate.parse("01 January 1869", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.HISTORY);
        Book book24 = new Book(24, "Charles Dickens", "Great Expectations", 85, 40, LocalDate.parse("01 December 1860", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.CLASSIC);
        Book book25 = new Book(25, "Victor Hugo", "Les Misérables", 120, 45, LocalDate.parse("01 January 1862", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.HISTORY);
        Book book26 = new Book(26, "Mary Shelley", "Frankenstein", 95, 30, LocalDate.parse("01 January 1818", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);
        Book book27 = new Book(27, "Oscar Wilde", "The Picture of Dorian Gray", 80, 35, LocalDate.parse("01 June 1890", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.CLASSIC);
        Book book28 = new Book(28, "J.R.R. Tolkien", "The Silmarillion", 105, 45, LocalDate.parse("01 September 1977", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book29 = new Book(29, "Stephen King", "The Shining", 120, 40, LocalDate.parse("01 January 1977", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.HORROR);
        Book book30 = new Book(30, "George R.R. Martin", "A Game of Thrones", 150, 50, LocalDate.parse("01 August 1996", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FANTASY);
        Book book31 = new Book(31, "J.R.R. Tolkien", "Unfinished Tales", 110, 40, LocalDate.parse("01 November 1980", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FICTION);
        Book book32 = new Book(32, "Neil Gaiman", "American Gods", 100, 40, LocalDate.parse("01 June 2001", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.FANTASY);
        Book book33 = new Book(33, "Haruki Murakami", "Kafka on the Shore", 95, 35, LocalDate.parse("01 May 2002", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.MYSTERY);
        Book book34 = new Book(34, "Kazuo Ishiguro", "Never Let Me Go", 90, 30, LocalDate.parse("01 February 2005", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.DYSTOPIAN);
        Book book35 = new Book(35, "Isabel Allende", "The House of the Spirits", 100, 40, LocalDate.parse("01 January 1982", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.HISTORY);
        Book book36 = new Book(36, "John Green", "The Fault in Our Stars", 80, 30, LocalDate.parse("01 January 2012", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.ROMANCE);
        Book book37 = new Book(37, "Rainbow Rowell", "Eleanor & Park", 75, 30, LocalDate.parse("01 February 2012", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.ROMANCE);
        Book book38 = new Book(38, "Paulo Coelho", "The Alchemist", 70, 30, LocalDate.parse("01 April 1988", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.ROMANCE);
        Book book39 = new Book(39, "Jodi Picoult", "My Sister's Keeper", 95, 35, LocalDate.parse("01 January 2003", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.DRAMA);
        Book book40 = new Book(40, "Suzanne Collins", "The Hunger Games", 85, 30, LocalDate.parse("01 September 2008", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.DYSTOPIAN);
        Book book41 = new Book(41, "Suzanne Collins", "Catching Fire", 90, 35, LocalDate.parse("01 September 2009", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.DYSTOPIAN);
        Book book42 = new Book(42, "John Green", "Paper Towns", 80, 30, LocalDate.parse("01 October 2008", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.ROMANCE);
        Book book43 = new Book(43, "Hugh Howey", "Wool", 100, 40, LocalDate.parse("01 July 2011", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);
        Book book44 = new Book(44, "Philip K. Dick", "Do Androids Dream of Electric Sheep?", 85, 35, LocalDate.parse("01 January 1968", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);
        Book book45 = new Book(45, "Isaac Asimov", "I, Robot", 95, 40, LocalDate.parse("01 December 1950", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);
        Book book46 = new Book(46, "Douglas Adams", "The Hitchhiker's Guide to the Galaxy", 80, 35, LocalDate.parse("01 October 1979", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);
        Book book47 = new Book(47, "Arthur C. Clarke", "2001: A Space Odyssey", 110, 45, LocalDate.parse("01 July 1968", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);
        Book book48 = new Book(48, "Orson Scott Card", "Ender's Game", 100, 40, LocalDate.parse("01 January 1985", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);
        Book book49 = new Book(49, "Ray Bradbury", "Fahrenheit 451", 85, 35, LocalDate.parse("01 October 1953", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.DYSTOPIAN);
        Book book50 = new Book(50, "William Gibson", "Neuromancer", 120, 50, LocalDate.parse("01 July 1984", DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)), Category.SCIENCE_FICTION);

        // 15 okuyucu nesnesi oluşturuldu.
        Reader reader1 = new Reader("Alper", "Yılmaz", 123);
        Reader reader2 = new Reader("Veli", "Demir", 456);
        Reader reader3 = new Reader("Ahmet", "Kaya", 789);
        Reader reader4 = new Reader("Ali", "Çelik", 101);
        Reader reader5 = new Reader("Zeynep", "Aydın", 202);
        Reader reader6 = new Reader("Murat", "Turan", 303);
        Reader reader7 = new Reader("Ayşe", "Gök", 404);
        Reader reader8 = new Reader("Mehmet", "Özdemir", 505);
        Reader reader9 = new Reader("Fatma", "Arslan", 606);
        Reader reader10 = new Reader("Ahmet", "Aksoy", 707);
        Reader reader11 = new Reader("Emine", "Coşkun", 808);
        Reader reader12 = new Reader("Mustafa", "Sarı", 909);
        Reader reader13 = new Reader("Serkan", "Ekinci", 1010);
        Reader reader14 = new Reader("Elif", "Büyük", 1111);
        Reader reader15 = new Reader("Can", "Köksal", 1212);


        // Oluşturulan okuyucular kütüphaneye eklendi.
        library.getReaders().add(reader1);
        library.getReaders().add(reader2);
        library.getReaders().add(reader3);
        library.getReaders().add(reader4);
        library.getReaders().add(reader5);
        library.getReaders().add(reader6);
        library.getReaders().add(reader7);
        library.getReaders().add(reader8);
        library.getReaders().add(reader9);
        library.getReaders().add(reader10);
        library.getReaders().add(reader11);
        library.getReaders().add(reader12);
        library.getReaders().add(reader13);
        library.getReaders().add(reader14);
        library.getReaders().add(reader15);

        System.out.println(library.getReaders());


        // Önceden oluşturulmuş kitap nesneleri, kütüphaneye ID'leri ile eklendi.
        library.getBooks().put(book1.getBookID(), book1);
        library.getBooks().put(book2.getBookID(), book2);
        library.getBooks().put(book3.getBookID(), book3);
        library.getBooks().put(book4.getBookID(), book4);
        library.getBooks().put(book5.getBookID(), book5);
        library.getBooks().put(book6.getBookID(), book6);
        library.getBooks().put(book7.getBookID(), book7);
        library.getBooks().put(book8.getBookID(), book8);
        library.getBooks().put(book9.getBookID(), book9);
        library.getBooks().put(book10.getBookID(), book10);
        library.getBooks().put(book11.getBookID(), book11);
        library.getBooks().put(book12.getBookID(), book12);
        library.getBooks().put(book13.getBookID(), book13);
        library.getBooks().put(book14.getBookID(), book14);
        library.getBooks().put(book15.getBookID(), book15);
        library.getBooks().put(book16.getBookID(), book16);
        library.getBooks().put(book17.getBookID(), book17);
        library.getBooks().put(book18.getBookID(), book18);
        library.getBooks().put(book19.getBookID(), book19);
        library.getBooks().put(book20.getBookID(), book20);
        library.getBooks().put(book21.getBookID(), book21);
        library.getBooks().put(book22.getBookID(), book22);
        library.getBooks().put(book23.getBookID(), book23);
        library.getBooks().put(book24.getBookID(), book24);
        library.getBooks().put(book25.getBookID(), book25);
        library.getBooks().put(book26.getBookID(), book26);
        library.getBooks().put(book27.getBookID(), book27);
        library.getBooks().put(book28.getBookID(), book28);
        library.getBooks().put(book29.getBookID(), book29);
        library.getBooks().put(book30.getBookID(), book30);
        library.getBooks().put(book31.getBookID(), book31);
        library.getBooks().put(book32.getBookID(), book32);
        library.getBooks().put(book33.getBookID(), book33);
        library.getBooks().put(book34.getBookID(), book34);
        library.getBooks().put(book35.getBookID(), book35);
        library.getBooks().put(book36.getBookID(), book36);
        library.getBooks().put(book37.getBookID(), book37);
        library.getBooks().put(book38.getBookID(), book38);
        library.getBooks().put(book39.getBookID(), book39);
        library.getBooks().put(book40.getBookID(), book40);
        library.getBooks().put(book41.getBookID(), book41);
        library.getBooks().put(book42.getBookID(), book42);
        library.getBooks().put(book43.getBookID(), book43);
        library.getBooks().put(book44.getBookID(), book44);
        library.getBooks().put(book45.getBookID(), book45);
        library.getBooks().put(book46.getBookID(), book46);
        library.getBooks().put(book47.getBookID(), book47);
        library.getBooks().put(book48.getBookID(), book48);
        library.getBooks().put(book49.getBookID(), book49);
        library.getBooks().put(book50.getBookID(), book50);

        System.out.println(library.getBooks());

        // reader1 (Alper) adlı okuyucuya ilk beş kitap ödünç olarak verildi.
        reader1.getBooks().put(book1.getBookID(), book1);
        reader1.getBooks().put(book2.getBookID(), book2);
        reader1.getBooks().put(book3.getBookID(), book3);
        reader1.getBooks().put(book4.getBookID(), book4);
        reader1.getBooks().put(book5.getBookID(), book5);

        // Scanner nesnesi oluşturuldu.
        Scanner scanner = new Scanner(System.in);

        if (theLibrarian.canLogin()) {
            while (true) {
                try {
                    // Kullanıcıya yapılacak işlemi seçmesi için seçenekler sunuluyor.
                    System.out.println("**Yapmak istediğiniz işlemi seçin**");
                    System.out.println("1- Yeni kitap ekle:");
                    System.out.println("2- Kitap ödünç al:");
                    System.out.println("3- Yazarın kitaplarını listele:");
                    System.out.println("4- Kitabı adı ile ara:");
                    System.out.println("5- ID ile ara:");
                    System.out.println("6- Kitap bilgilerini güncelle:");
                    System.out.println("7- Kitap kaydını sil:");
                    System.out.println("8- Kategoriye ait kitapları listele:");
                    System.out.println("9- Kitap iade et:");
                    System.out.println("10- Yeni üye ekle:");
                    System.out.println("11- Kitap ara:");
                    System.out.println("Sistemden çıkmak için 0'a basınız:");

                    // Kullanıcının seçimini alıyoruz.
                    int choice = scanner.nextInt();

                    // Seçime göre işlem yapılır.
                    switch (choice) {
                        case 0:
                            System.out.println("Çıkış yapılıyor...");
                            System.exit(0);
                            break;
                        case 1:
                            library.addNewBook(); // Yeni kitap ekle
                            break;
                        case 2:
                            library.barrowBook(); // Kitap ödünç al
                            break;
                        case 3:
                            library.getAuthorAllBooks(); // Yazarın kitaplarını listele
                            break;
                        case 4:
                            library.getBookByName(); // Kitabı adı ile ara
                            break;

                        case 5:
                            library.getBookByID(); // ID ile ara
                            break;
                        case 6:
                            library.updateBook(); // Kitap bilgilerini güncelle
                            break;
                        case 7:
                            library.deleteBook(); // Kitap kaydını sil
                            break;
                        case 8:
                            library.getAllBooksInCategory(); // Kategoriye ait kitapları listele
                            break;
                        case 9:
                            library.bookToReturn(); // Kitap iade et
                            break;
                        case 10:
                            library.addMember(); // Yeni üye ekle
                            break;
                        case 11:
                            library.searchBook(); // Kitap ara
                            break;
                        default:
                            System.out.println("Geçersiz seçim. Lütfen tekrar deneyin!");
                            break;
                    }
                } catch (Exception ex) {
                    System.out.println("**Lütfen bir tamsayı giriniz!**");
                    scanner.nextLine(); // Boş satırı temizle
                }
            }
        }
    }
}