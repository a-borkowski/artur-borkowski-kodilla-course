package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testMedian(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Autor1", "Tutuł1", 2000, "Syg1"));
        books.add(new Book("Autor2", "Tutuł2", 2001, "Syg2"));
        books.add(new Book("Autor3", "Tutuł3", 2002, "Syg3"));

        //When
        int result = medianAdapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(2001, result);
    }
}