package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int index){
        return shapes.get(index);
    }

    public void showFigure(){
        for (Shape temp : shapes)
            System.out.println(temp);
    }

    public int getSize(){
        return shapes.size();
    }
}