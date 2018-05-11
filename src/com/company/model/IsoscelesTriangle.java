package com.company.model;

public class IsoscelesTriangle extends Triangle {


    public IsoscelesTriangle() {
    }

    public IsoscelesTriangle(double side, double base) {
        if (validate(side, base)) {
            this.name = "Равнобедренный треугольник";
            this.firstSide = side;
            this.secondSide = side;
            this.thirdSide = base;

        }
    }

    @Override
    public String toString() {
        return name + " с боковомы сторонами " + firstSide + " и основанием " + thirdSide;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }


    private boolean validate(double side, double base) {
        return (side * 2) > base;

    }
}
