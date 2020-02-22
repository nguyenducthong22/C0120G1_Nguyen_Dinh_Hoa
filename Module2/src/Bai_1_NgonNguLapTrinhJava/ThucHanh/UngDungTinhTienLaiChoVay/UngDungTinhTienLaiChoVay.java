package Bai_1_NgonNguLapTrinhJava.ThucHanh.UngDungTinhTienLaiChoVay;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    Scanner scanner = new Scanner(System.in);

    public double soTienGui() {
        System.out.println("Nhap so tien gui");
        return scanner.nextDouble();
    }

    public int soThangGui() {
        System.out.println("Nhap so thang gui");
        return scanner.nextInt();
    }

    public double laiSuat() {
        System.out.println("Nhap lai suat");
        return scanner.nextDouble();
    }

    public static double tinhLaiSuat(double soTienGui, int soThangGui, double laiSuat) {
        double laiSuatNhanDuoc = 0;
        for (int i = 0; i < soThangGui ; i++) {
            laiSuatNhanDuoc += soTienGui * (laiSuat / 100) * i;
        }
        return laiSuatNhanDuoc;
    }

    public static void main(String[] args) {
        UngDungTinhTienLaiChoVay ungDungTinhTienLaiChoVay = new UngDungTinhTienLaiChoVay();

        double soTienGui = ungDungTinhTienLaiChoVay.soTienGui();
        int soThangGui = ungDungTinhTienLaiChoVay.soThangGui();
        double laiSuat = ungDungTinhTienLaiChoVay.laiSuat();
        double laiSuatNhanDuoc;
        laiSuatNhanDuoc = tinhLaiSuat(soTienGui, soThangGui, laiSuat);
        System.out.println("Lai suat nhan duoc la : " + laiSuatNhanDuoc);

    }


}
