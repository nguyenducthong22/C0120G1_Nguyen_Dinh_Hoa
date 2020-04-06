package Bai_2_MangVaPhuongThucTrongJava.BaiTap.TimGiaTriNhoNhatTrongMang;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    Scanner scanner = new Scanner(System.in);
    public int kichThuocMang() {
        System.out.println("Nhap kich thuoc mang");
        return scanner.nextInt();
    }

    public int soNhapVao(int i) {
        System.out.println("Nhap phan tu thu " + (i+1));
        return scanner.nextInt();
    }

    public void timSoNhoNhat(int[] array) {
        int min;
        int index = 0;
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Gia tri nho nhat la : " + min + " tai vi tri thu : " + (index + 1));
    }

    public static void main(String[] args) {
        TimGiaTriNhoNhatTrongMang timGiaTriNhoNhatTrongMang = new TimGiaTriNhoNhatTrongMang();
        int kichThuocMang;
        int[] array;


        kichThuocMang = timGiaTriNhoNhatTrongMang.kichThuocMang();
        array = new int[kichThuocMang];
        for (int i = 0; i <array.length ; i++) {
            array[i] = timGiaTriNhoNhatTrongMang.soNhapVao(i);
        }
        timGiaTriNhoNhatTrongMang.timSoNhoNhat(array);
    }
}

