package Bai_1_NgonNguLapTrinhJava.ThucHanh.GiaiPhuongTrinhBacNhat;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    Scanner scanner = new Scanner(System.in);

    public double nhapA() {
        System.out.println("Nhap a trong ax + b = c");
        return scanner.nextDouble();
    }

    public double nhapB() {
        System.out.println("Nhap b trong ax + b = c");
        return scanner.nextDouble();
    }

    public double nhapC() {
        System.out.println("Nhap c trong ax + b = c");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        GiaiPhuongTrinhBacNhat giaiPhuongTrinhBacNhat = new GiaiPhuongTrinhBacNhat();

        double a = giaiPhuongTrinhBacNhat.nhapA();
        double b = giaiPhuongTrinhBacNhat.nhapB();
        double c = giaiPhuongTrinhBacNhat.nhapC();
        double x;
        if (a == 0) {
            if (b == c) {
                System.out.println("Phuong trinh vo so nghiem");
            } else System.out.println("Phuong trinh vo nghiem");
        } else {
            x = (c - b) / a;
            System.out.println("Gia tri cua x la : " + x);
        }
    }
}
