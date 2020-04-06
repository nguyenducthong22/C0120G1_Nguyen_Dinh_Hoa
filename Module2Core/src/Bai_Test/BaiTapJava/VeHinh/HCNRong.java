package Bai_Test.BaiTapJava.VeHinh;

import java.util.Scanner;

public class HCNRong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai HCN");
        int chieuNgang ;
        chieuNgang = scanner.nextInt();
        System.out.println("Nhap rong dai HCN");
        int chieuDoc ;
        chieuDoc = scanner.nextInt();
        String[][] arr = new String[chieuNgang][chieuDoc];
        for (int i = 0; i < chieuNgang ; i++) {
            for (int j = 0; j < chieuDoc ; j++) {
                arr[i][j] = "";
                if (i == 0 || i == chieuNgang - 1 || j == 0 || j == chieuDoc - 1) {
                    arr[i][j] = "* ";
                } else {
                    arr[i][j] = "  ";
                }


            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
