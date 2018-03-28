package com.caleb.example.funwithshapes.domain.shape;

public class ShapeS implements Shape {
    private String load;

    @Override
    public String getDescription() {
        return "This is S - as Sleep can wait";
    }

    @Override
    public String getLoad() {
        return load;
    }

    @Override
    public void setLoad(Integer[] positions) {
        load = prepareLoad(positions, "SS");
    }
}
