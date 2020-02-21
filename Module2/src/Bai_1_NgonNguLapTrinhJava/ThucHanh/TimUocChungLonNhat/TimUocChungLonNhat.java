package Bai_1_NgonNguLapTrinhJava.ThucHanh.TimUocChungLonNhat;

import java.util.Scanner;

public class TimUocChungLonNhat {
    Scanner scanner = new Scanner(System.in);
    public int soNguyenNhapVao(int i) {
        System.out.println("Nhap so thu " + i);
        return scanner.nextInt();
    }

    public static int timUocChung(int a, int b) {
        if (a == 0 || b == 0){
            System.out.println("Khong co UCLN");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    public static void main(String[] args) {
        TimUocChungLonNhat timUocChungLonNhat = new TimUocChungLonNhat();
        int a = timUocChungLonNhat.soNguyenNhapVao(1);
        int b = timUocChungLonNhat.soNguyenNhapVao(2);
        int c = timUocChung(a, b);
        System.out.println("Uoc chung lon nhat la : " + c);
    }
}
