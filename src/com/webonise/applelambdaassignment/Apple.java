package com.webonise.applelambdaassignment;

public class Apple {
    private final int id;
    private final int weight;
    private final String color;

    Apple(final int id, final int weight, final String color) {
        this.id = id;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;

    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }


}
