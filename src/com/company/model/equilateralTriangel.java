package com.company.model;

public class equilateralTriangel extends IsoscelesTriangle {

    public equilateralTriangel(double side) {
        this.name = "Равнобедренный треугольник";
        this.firstSide = this.secondSide =
                this.thirdSide = side;
    }

    @Override
    public String toString() {
        return name + "со сторонами " + thirdSide;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    public equilateralTriangel(double side, double base) {
        super(side, base);

    }
}
