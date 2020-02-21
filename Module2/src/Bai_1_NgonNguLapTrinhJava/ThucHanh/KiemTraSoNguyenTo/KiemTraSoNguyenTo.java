package Bai_1_NgonNguLapTrinhJava.ThucHanh.KiemTraSoNguyenTo;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    Scanner scanner = new Scanner(System.in);

    public int soCanKiemTra() {
        System.out.println("Nhap so can kiem tra");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        KiemTraSoNguyenTo kiemTraSoNguyenTo = new KiemTraSoNguyenTo();
        int soCanKiemTra;
        soCanKiemTra = kiemTraSoNguyenTo.soCanKiemTra();
        boolean flag = true;
        if (soCanKiemTra < 2) {
            System.out.println("Khong phai so nguyen to");
        } else {
            for (int i = 2; i < Math.sqrt(soCanKiemTra); i++) {
                if (soCanKiemTra % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(soCanKiemTra + " la so nguyen to");
            }
            else System.out.println(soCanKiemTra + " khong la so nguyen to");
        }

    }
}
