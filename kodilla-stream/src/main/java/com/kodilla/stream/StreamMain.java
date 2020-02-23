package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text to decorate 1", String::toUpperCase);
        poemBeautifier.beautify("Text to decorate 2", decoration -> "ABC " + decoration);
        poemBeautifier.beautify("Text to decorate 3", decoration -> "" + decoration + " ABC");
        poemBeautifier.beautify("Text to decorate 4", decoration -> "*** " + decoration + " ***");
        poemBeautifier.beautify("Text to decorate 5", decoration -> "!!! " + decoration + " :-)");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
