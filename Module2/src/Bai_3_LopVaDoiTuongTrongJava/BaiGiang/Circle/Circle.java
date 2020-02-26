package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.Circle;

public class Circle {
    double radius;

    //construster

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //method

    public double getArena() {
        return this.radius * 2 * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * this.radius * Math.PI;
    }


    //getter setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
