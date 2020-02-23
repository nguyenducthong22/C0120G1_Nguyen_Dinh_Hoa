package MangVaPhuongThucTrongJava.BaiTap.GopMang;

import java.util.Scanner;

public class GopMang {
    Scanner scanner = new Scanner(System.in);

    public int soPhanTu(int i) {
        System.out.println("Nhap so phan tu mang thu: "+i);
        return scanner.nextInt();
    }

    public int soNhapVao(int i) {
        System.out.print("Nhap phan tu thu " + (i+1)+" : ");
        return scanner.nextInt();
    }

    public int[] nhapGiaTriMang(int soPhanTu) {
        GopMang gopMang = new GopMang();
        int[] array;
        array = new int[soPhanTu];
        for (int i = 0; i < array.length; i++) {
            array[i] = gopMang.soNhapVao(i);
        }
        return array;
    }

    public static void main(String[] args) {
        GopMang gopMang = new GopMang();
        int soPhanTuMang1;
        int soPhanTuMang2;
        int[] array1;
        int[] array2;
        int[] arrayResult;
        soPhanTuMang1 = gopMang.soPhanTu(1);
        array1 = gopMang.nhapGiaTriMang(soPhanTuMang1);
        soPhanTuMang2 = gopMang.soPhanTu(2);
        array2 = gopMang.nhapGiaTriMang(soPhanTuMang2);
        arrayResult = new int[soPhanTuMang1 + soPhanTuMang2];


        for (int i = 0; i <array1.length ; i++) {
            arrayResult[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayResult[i + array1.length] = array2[i];
        }
        System.out.println("Ket qua sau khi hop la : ");
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i]+ " ");
        }
    }

}
