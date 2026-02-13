package org.sena.library;

public class Book {
    private final int id_book;
    private String title;
    private String author;
    public static int countBook;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.id_book = ++countBook;
    }

    //

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "{\nId = " + this.id_book + ",\nTitle = " + this.title
                + ",\nname = " + this.author + "\n}";
    }
}
