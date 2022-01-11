package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getV(double radius, double Area) {
        return radius * getArea(radius);
    }

    public String toString() {
        return "Hình trụ có bán kính: " + getRadius() + ", màu sắc: " + getColor() + ", chiều cao: " + height + ", thể tích: " + getV(getRadius(), getArea(getRadius()));
    }
}
