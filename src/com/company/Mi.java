package com.company;
public class Mi extends Phone {
    public Mi(int year, String model, String color) {
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
