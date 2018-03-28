package com.caleb.example.funwithshapes.domain.shape;

public class ShapeK implements Shape {
    private String load;

    @Override
    public String getDescription() {
        return "This is K - as Keep moving forward";
    }

    @Override
    public String getLoad() {
        return load;
    }

    @Override
    public void setLoad(Integer[] positions) {
        load = prepareLoad(positions, "KK");
    }
}
