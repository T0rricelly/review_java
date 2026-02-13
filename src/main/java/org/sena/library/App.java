package org.sena.library;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Habitos Atomicos", "James Clear");
        Book book2 = new Book("Habitos Atomicos", "James Clear");


        Library library = new Library();
        library.addBooks(book);
        library.addBooks(book2);
        library.showBooks();
    }
}
