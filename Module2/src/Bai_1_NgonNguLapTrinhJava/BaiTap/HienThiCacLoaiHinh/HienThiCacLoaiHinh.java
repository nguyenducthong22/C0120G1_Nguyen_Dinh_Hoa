package Bai_1_NgonNguLapTrinhJava.BaiTap.HienThiCacLoaiHinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    Scanner scanner = new Scanner(System.in);

    public int soNhapVao(String x) {
        System.out.println(x);
        return scanner.nextInt();
    }

    public static void inHinhChuNhat() {
        HienThiCacLoaiHinh hienThiCacLoaiHinh = new HienThiCacLoaiHinh();
        int chieuDai;
        int chieuRong;
        chieuDai = hienThiCacLoaiHinh.soNhapVao("Nhap chieu dai HCN can in ra");
        chieuRong = hienThiCacLoaiHinh.soNhapVao("Nhap chieu rong HCN can in ra");
        System.out.println("Ket qua la : ");
        for (int i = 1; i <= chieuDai ; i++) {
            for (int j = 1; j <= chieuRong ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inHinhTamGiacBotLeft() {
        HienThiCacLoaiHinh hienThiCacLoaiHinh = new HienThiCacLoaiHinh();
        int chieuDai;
        chieuDai = hienThiCacLoaiHinh.soNhapVao("Nhap chieu ngang tam giac can in ra");
        System.out.println("Ket qua la : ");
        for (int i = 1; i <=chieuDai ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void inHinhTamGiacTopLeft() {
        HienThiCacLoaiHinh hienThiCacLoaiHinh = new HienThiCacLoaiHinh();
        int chieuDai;
        chieuDai = hienThiCacLoaiHinh.soNhapVao("Nhap chieu ngang tam giac can in ra");
        System.out.println("Ket qua la : ");
        for (int i = chieuDai; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        HienThiCacLoaiHinh hienThiCacLoaiHinh = new HienThiCacLoaiHinh();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. In hinh chu nhat");
            System.out.println("2. In hình tam giac vuong can botton-left" );
            System.out.println("3. In hình tam giac vuong can top-left");
            System.out.println("4. Exit");
            int choose;
            choose = hienThiCacLoaiHinh.soNhapVao("Ban chon so may");
            switch (choose) {
                case 1:
                    hienThiCacLoaiHinh.inHinhChuNhat();
                    break;
                case 2:
                    hienThiCacLoaiHinh.inHinhTamGiacBotLeft();
                    break;
                case 3:
                    hienThiCacLoaiHinh.inHinhTamGiacTopLeft();
                    break;
                case 4:
                    System.out.println("Tam biet :( ");
                    return;
                default:
                    System.out.println("Chon lai di :D");
            }
        }
    }
}
