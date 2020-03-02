package Bai_4_KeThua.BaiTap.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Bai_4_KeThua.BaiTap.Triangle.TriangleException.triangleException;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public double soNhapVao(String a) {
        System.out.println(a);
        return scanner.nextDouble();
    }

    public String mauTamGiac(String a) {
        System.out.println(a);
        return scanner.nextLine();
    }

    public boolean filled(String a) {
        System.out.println(a);
        return scanner.nextBoolean();
    }
    public static void main(String[] args) {
        try {
            Main main = new Main();
            double side1;
            double side2;
            double side3;
            String color;
            boolean filled;
            side1 = main.soNhapVao("Nhap canh thu 1");
            side2 = main.soNhapVao("Nhap canh thu 2");
            side3 = main.soNhapVao("Nhap canh thu 3");
            main.mauTamGiac("");
            color = main.mauTamGiac("Nhap mau tam giac");
            filled = main.filled("Filled: ");
            Shape triangle = new Triangle(color,filled,side1,side2,side3);
            triangleException( ((Triangle) triangle).getSize1(),((Triangle) triangle).getSize2(),((Triangle) triangle).getSize3());
            System.out.println(triangle.toString());
        } catch (TriangleException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ban can nhap so");
        }
    }
}
