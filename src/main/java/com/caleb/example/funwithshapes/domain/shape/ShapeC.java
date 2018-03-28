package com.caleb.example.funwithshapes.domain.shape;

public class ShapeC implements Shape {
    private String load;

    @Override
    public String getDescription() {
        return "This is C - as Capitalize the opportunity";
    }

    @Override
    public String getLoad() {
        return load;
    }

    @Override
    public void setLoad(Integer[] positions) {
        load = prepareLoad(positions, "CC");
    }
}
