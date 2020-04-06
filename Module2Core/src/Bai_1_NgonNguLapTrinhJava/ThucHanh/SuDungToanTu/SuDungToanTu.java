package Bai_1_NgonNguLapTrinhJava.ThucHanh.SuDungToanTu;

import java.util.Scanner;

public class SuDungToanTu {
    Scanner input = new Scanner(System.in);

    public double nhapChieuDai() {
        System.out.println("Nhap vao chieu dai");
        return input.nextDouble();
    }

    public double nhapChieuRong() {
        System.out.println("Nhap vao chieu rong");
        return input.nextDouble();
    }

    public static void main(String[] args) {
        SuDungToanTu suDungToanTu = new SuDungToanTu();
        double chieuDai;
        double chieuRong;
        double chuVi;
        double dienTich;
        chieuDai = suDungToanTu.nhapChieuDai();
        chieuRong = suDungToanTu.nhapChieuRong();

        chuVi = (chieuDai + chieuRong) * 2;
        dienTich = chieuDai * chieuRong;
        System.out.println("Chu vi hinh chu nhat la : " + chuVi);
        System.out.println("Dien tich hinh chu nhat la : " + dienTich);
    }
}
