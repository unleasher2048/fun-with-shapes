package com.caleb.example.funwithshapes.domain.shape;

public class ShapeX implements Shape {
    private String load;

    @Override
    public String getDescription() {
        return "This is X - as eXpress yourself";
    }

    @Override
    public String getLoad() {
        return load;
    }

    @Override
    public void setLoad(Integer[] positions) {
        load = prepareLoad(positions, "XX");
    }
}
