package MangVaPhuongThucTrongJava.BaiTap.TongSoDuongCheoChinhMaTranVuong;

import java.util.Scanner;

public class TongSoDuongCheoChinhMaTranVuong {
    Scanner scanner = new Scanner(System.in);

    public int soNhapVao(String a) {
        System.out.println(a);
        return scanner.nextInt();
    }

    public int tinhTongDuongCheo(int[][] array) {
        int sum;
        sum = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        TongSoDuongCheoChinhMaTranVuong tongSoDuongCheoChinhMaTranVuong = new TongSoDuongCheoChinhMaTranVuong();
        int doDaiMaTran;
        doDaiMaTran = tongSoDuongCheoChinhMaTranVuong.soNhapVao("Nhap do dai cua ma tran vuong : ");
        int[][] array;
        array = new int[doDaiMaTran][doDaiMaTran];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = tongSoDuongCheoChinhMaTranVuong.soNhapVao("Nhap phan tu hang " + i + " cot " + j + " ");
            }
        }
        System.out.println("Ma tran vua nhap la : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tong duong cheo chinh cua ma tran vua nhap la : " + tongSoDuongCheoChinhMaTranVuong.tinhTongDuongCheo(array));

    }
}
