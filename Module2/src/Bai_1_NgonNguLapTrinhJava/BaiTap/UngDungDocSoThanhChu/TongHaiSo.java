package Bai_1_NgonNguLapTrinhJava.BaiTap.UngDungDocSoThanhChu;

import java.util.Scanner;

public class TongHaiSo {
    Scanner scanner = new Scanner(System.in);
    private static int tinhTong(int a, int b) {
        return a + b;
    }

    private int soTuNhien(int i ) {
        System.out.println("Nhap so thu " +i);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a;
        int b;
        TongHaiSo tongHaiSo = new TongHaiSo();
        a = tongHaiSo.soTuNhien(1);
        b = tongHaiSo.soTuNhien(2);
        System.out.println("tong la " + tinhTong(a, b));
    }
}
