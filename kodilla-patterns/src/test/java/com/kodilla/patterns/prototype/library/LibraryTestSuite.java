package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testDeepCopy() throws CloneNotSupportedException {
        //Given
        Library library = new Library("Lib1");
        library.getBooks().add(new Book("Tytuł1", "Autor1", LocalDate.of(2000, 12, 1)));
        library.getBooks().add(new Book("Tytuł2", "Autor2", LocalDate.of(2001, 12, 1)));

        //When
        Library copy = library.deepCopy();

        //Then
        library.getBooks().remove(new Book("Tytuł1", "Autor1", LocalDate.of(2000, 12, 1)));
        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(2, copy.getBooks().size());
    }

    @Test
    public void testShallowCopy() throws CloneNotSupportedException {
        //Given
        Library library = new Library("Lib1");
        library.getBooks().add(new Book("Tytuł1", "Autor1", LocalDate.of(2000, 12, 1)));
        library.getBooks().add(new Book("Tytuł2", "Autor2", LocalDate.of(2001, 12, 1)));

        //When
        Library copy = library.shallowCopy();

        //Then
        library.getBooks().remove(new Book("Tytuł1", "Autor1", LocalDate.of(2000, 12, 1)));
        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, copy.getBooks().size());
    }
}
