package com.company;
public class Samsung extends Phone  {
    public Samsung(int year, String model, String color) {
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
