package Lesson2.Task3;

import static java.lang.Math.sqrt;

class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // calculate perimeter
    double calculatePerimeter () {
        return side1+side2+side3;
    }
    // calculate area
    double calculateArea () {
        double semiPerimeter =  calculatePerimeter()/2;
        return sqrt(semiPerimeter*
                (semiPerimeter-side1)*
                (semiPerimeter-side2)*
                (semiPerimeter-side3));
    }
}