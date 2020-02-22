package Bai_1_NgonNguLapTrinhJava.BaiTap.SoNguyenTo;

import java.util.Scanner;

public class SoNguyenTo {
    Scanner scanner = new Scanner(System.in);

    public int soNhapVao(String a) {
        System.out.println(a);
        return scanner.nextInt();
    }

    public static boolean kiemTraSoNguyenTo(int soNhapVao) {
        boolean flag = true;
        if (soNhapVao < 2) {
            flag = false;
        }
        for (int i = 2; i < soNhapVao; i++) {
            if ((soNhapVao % i) == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void hienThi(int soLuong) {
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        int dem = 0;
        for (int i = 1; ; i++) {
            if (soNguyenTo.kiemTraSoNguyenTo(i)) {
                dem++;
                System.out.println("So nguyen to thu "+dem+" la "+i);
            }
            if (dem == soLuong) {
                break;
            }
        }
    }
    public static void soLonNhat(int soLonNhat) {
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        int i = 0;
        int dem = 1;
        while (i <= soLonNhat) {

            if (soNguyenTo.kiemTraSoNguyenTo(i)) {
                System.out.println("so nguyen to thu " + dem + " la " + i);
                dem++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        int soNhapVao;
        soNhapVao = soNguyenTo.soNhapVao("Nhap vao so can kiem tra phai so Nguyen To khong :");
        if (soNguyenTo.kiemTraSoNguyenTo(soNhapVao)) {
            System.out.println("La so nguyen to ");
        } else System.out.println("khong la so nguyen to ");

        int soLuong;
        soLuong = soNguyenTo.soNhapVao("Nhap so luong so nguyen to can hien thi : ");
        soNguyenTo.hienThi(soLuong);

        int soLonNhat;
        soLonNhat = soNguyenTo.soNhapVao("Ban can in so nguyen to tu 2 den bao nhieu? =))");
        soNguyenTo.soLonNhat(soLonNhat);
    }
}
