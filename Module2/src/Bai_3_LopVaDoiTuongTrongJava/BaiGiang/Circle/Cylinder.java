package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.Circle;

public class Cylinder extends Circle {
    public double height;

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }


    @Override
    public double getArena() {
        return super.getArena() * 2 + super.getPerimeter() * this.height;
    }





    public double getVolume() {
        return super.getArena() * this.height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
