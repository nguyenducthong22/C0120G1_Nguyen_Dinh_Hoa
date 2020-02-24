package Bai_2_MangVaPhuongThucTrongJava.BaiTap.XoaPhanTuKhoiMang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    Scanner scanner = new Scanner(System.in);

    public int phanTuMang(String a) {
        System.out.println(a);
        return scanner.nextInt();
    }

    public static void xoaPhanTu(int[] array,int soCanXoa) {
        int index;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == soCanXoa) {
                index = i;
                for (; index < array.length-1 ; index++) {
                    array[index] = array[index+1];

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }




    public static void main(String[] args) {
        XoaPhanTuKhoiMang xoaPhanTuKhoiMang = new XoaPhanTuKhoiMang();
        int doDaiMang;
        int[] array;
        int soCanXoa;
        doDaiMang = xoaPhanTuKhoiMang.phanTuMang("Nhap do dai cua mang ");
        array = new int[doDaiMang];
        for (int i = 0; i <array.length ; i++) {
            array[i] = xoaPhanTuKhoiMang.phanTuMang("Nhap phan tu thu " + i);
        }
        soCanXoa = xoaPhanTuKhoiMang.phanTuMang("Nhap so can xoa ");
        xoaPhanTuKhoiMang.xoaPhanTu(array, soCanXoa);

    }
}
