package Bai_3_LopVaDoiTuongTrongJava.BaiTap.PhuongTrinhBacHai;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    private double inputNumber(String inputNumber) {
        System.out.println(inputNumber);
        return scanner.nextDouble();
    }

    public void calculator(QuadraticEquation quadraticEquation){
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Nghiem thu nhat la : "+quadraticEquation.getRoot1());
            System.out.println("Nghiem thu hai la : "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co 1 nghiem duy nhat la : " + quadraticEquation.getRoot1());
        } else System.out.println("Phuong trinh vo nghiem");
    }

    public static void main(String[] args) {
        Main main = new Main();
        double a, b, c;
        System.out.println("Giai phuong trinh bac hai:  ");
        a = main.inputNumber("Nhap a : ");
        b = main.inputNumber("Nhap b : ");
        c = main.inputNumber("Nhap c : ");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        main.calculator(quadraticEquation);
    }
}
