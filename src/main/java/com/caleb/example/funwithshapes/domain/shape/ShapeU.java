package com.caleb.example.funwithshapes.domain.shape;

public class ShapeU implements Shape {
    private String load;

    @Override
    public String getDescription() {
        return "This is U - as Unleash Unstoppable Side";
    }

    @Override
    public String getLoad() {
        return load;
    }

    @Override
    public void setLoad(Integer[] positions) {
        load = prepareLoad(positions, "UU");
    }

}
