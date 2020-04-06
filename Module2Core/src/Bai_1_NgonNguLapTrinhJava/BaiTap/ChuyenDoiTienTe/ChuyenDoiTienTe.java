package Bai_1_NgonNguLapTrinhJava.BaiTap.ChuyenDoiTienTe;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    Scanner scanner = new Scanner(System.in);

    public double soTien() {
        System.out.println("Nhap vao so tien USD");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        ChuyenDoiTienTe chuyenDoiTienTe = new ChuyenDoiTienTe();
        final double VND = 23000;
        double soTienQuyDoi;
        double USD;
        USD = chuyenDoiTienTe.soTien();
        soTienQuyDoi = USD * VND;
        System.out.println("So tien da quy doi la : " + soTienQuyDoi +"VND");


    }
}
