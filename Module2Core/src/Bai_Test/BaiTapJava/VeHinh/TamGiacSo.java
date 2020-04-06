package Bai_Test.BaiTapJava.VeHinh;

import java.util.Scanner;

public class TamGiacSo {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println( " nhap so ");
        h = scanner.nextInt();

        int output;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 2 * h; j++) {
                output = i- Math.abs(j - h);
                if (output > 0) {
                    System.out.printf("%3d", output);
                } else System.out.printf("   ");
            }
            System.out.println();
        }

    }
}
