package Bai_4_KeThua.BaiTap.Triangle;

public class Triangle extends Shape {
    private double size1 = 1;
    private double size2 = 1;
    private double size3 = 1;

    public Triangle() {
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea() {
        return this.getSize1() + this.getSize2() + this.getSize3();
    }

    public double getPerimeter() {
        double p = this.getArea() / 2;
        return Math.sqrt(p * (p - this.getSize1()) * (p - this.getSize2()) * (p - this.getSize3()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                ", Arena=" + this.getArea() +
                ", Perimeter=" + this.getPerimeter() +
                ", color=" + this.getColor() +
                (isFilled() ? ", filled" : ", not filled") +
                '}';
    }
}
