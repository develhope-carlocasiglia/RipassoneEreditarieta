package org.example;

public class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        this.name = "Cerchio";
        this.numbOfSegments = 0;
        this.radius = radius;
    }

    public double area() {
        return 2*Math.PI*radius;
    }

}
