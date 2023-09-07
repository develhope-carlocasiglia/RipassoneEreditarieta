package org.example;

public class Triangle extends Shape {

    int l1;
    int l2;
    int l3;

    public Triangle(int l1, int l2, int l3) {
        super.name = "Triangolo";
        super.numbOfSegments = 3;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double area() {
        int p = l1 + l2 + l3; // perimetro
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }

}
