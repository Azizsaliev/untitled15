package com.company;
public abstract class Phone implements Printable {
private int year;
private String model;
private String color;
    public Phone(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
}
