package MangVaPhuongThucTrongJava.BaiTap.ThemPhanTuVaoMang;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    Scanner scanner = new Scanner(System.in);
    public int nhapSo(String a) {
        System.out.println(a);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        ThemPhanTuVaoMang themPhanTuVaoMang = new ThemPhanTuVaoMang();
        int n;
        int x;
        int index;
        int[] arr;
        n = themPhanTuVaoMang.nhapSo("Nhap so phan tu cua mang");
        arr = new int[n];
        x = themPhanTuVaoMang.nhapSo("Nhap so X can chen");
        index = themPhanTuVaoMang.nhapSo("Nhap vi tri can chen");
        if (index < 0 || index >= arr.length) {
            System.out.println("Khong the chen, vui long nhap lai");
        } else arr[index] = x;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("phan tu vi tri thu " + i + " la " + arr[i]);
        }

    }
}
