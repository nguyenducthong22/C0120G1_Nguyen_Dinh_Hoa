package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.Circle;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public double inputNumber(String a) {
        System.out.println(a);
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        Main main = new Main();
        double radiusCircle;
        double radiusCylinder;
        double heightCylinder;

        radiusCircle = main.inputNumber("Nhap ban kinh duong tron : ");
        radiusCylinder = main.inputNumber("Nhap ban kinh hinh tru : ");
        heightCylinder = main.inputNumber("Nhap chieu cao hinh tru : ");


        Circle circle1 = new Circle(radiusCircle);
        System.out.println("Chu vi hinh tron la : "+circle1.getArena());
        System.out.println("Dien tich hinh tron la : "+circle1.getPerimeter());

        Cylinder cylinder1 = new Cylinder(radiusCylinder, heightCylinder);
        System.out.println("Chu vi hinh tru la : "+cylinder1.getArena());
        System.out.println("The tich hinh tru la : "+cylinder1.getVolume());


        System.out.println(circle1.toString());
        System.out.println(cylinder1.toString());


    }
}
