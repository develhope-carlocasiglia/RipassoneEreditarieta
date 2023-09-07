package org.example;

public class Square extends Shape {

    int l;

    public Square(int l) {
        this.name = "Quadrato";
        this.numbOfSegments = 4;
        this.l = l;
    }

    public double area() {
        return (double) l*l;
    }

}
