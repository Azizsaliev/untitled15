package com.company;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
    Objects.requireNonNull(createObject("Iphone")).print();
        System.out.println("---------------");
     Objects.requireNonNull(createObject("Samsung")).print();
        System.out.println("----------------");
     Objects.requireNonNull(createObject("Mi")).print();
    }
    private static Phone createObject(String className) {
        switch (className) {
            case "Iphone":
                return new Iphone(2020, " iphone13pro ", "Black");
            case "Mi":
                return new Mi(2021, "Mi pro8", "White");
            case "Samsung":
                return new Samsung(2022, "samsungS21", "Black");
            default:
                return null;
        }
    }
}




