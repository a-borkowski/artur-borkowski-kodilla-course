package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String decoration, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(decoration);
        System.out.println(result);
    }
}
