package com.kodilla.testing.library;

public class Book {
    String title;
    String autor;
    int publicateYear;

    public Book(String title, String autor, int publicateYear) {
        this.title = title;
        this.autor = autor;
        this.publicateYear = publicateYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getPublicateYear() {
        return publicateYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", publicateYear=" + publicateYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (publicateYear != book.publicateYear) return false;
        if (!title.equals(book.title)) return false;
        return autor.equals(book.autor);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + autor.hashCode();
        result = 31 * result + publicateYear;
        return result;
    }
}
