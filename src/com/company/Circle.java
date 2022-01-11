package com.company;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double radius) {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public String toString() {
        return "Hình tròn có radius= " + radius + ", màu sắc: " + color + ", diện tích là: " + getArea(radius);
    }
}
