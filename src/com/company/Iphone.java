package com.company;
public class Iphone extends Phone{
    public Iphone(int year, String model, String color) {
        super(year, model, color);
    }
    @Override
    public void print() {
        System.out.println(
                "\nYear: " + getYear() +
                        "\nModel: " + getModel() +
                        "\nColor: " + getColor());
    }
}
