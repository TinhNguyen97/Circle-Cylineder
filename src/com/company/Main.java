package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2, "blue");
        System.out.println(circle);
        circle=new Cylinder(3,"red",4);
        System.out.println(circle);
    }
}
