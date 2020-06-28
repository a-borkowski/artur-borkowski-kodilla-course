package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return this.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library copy = this.clone();
        copy.books = new HashSet<>();
        for (Book book : books) {
            Book newBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());
            copy.books.add(newBook);
        }
        return copy;
    }
}