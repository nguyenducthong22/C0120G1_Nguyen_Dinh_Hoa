package MangVaPhuongThucTrongJava.BaiTap.TongSoOMotCotXacDinh;

import java.util.Scanner;

public class TongSoOMotCotXacDinh {
    Scanner scanner = new Scanner(System.in);
    public int soNhapVao(String a) {
        System.out.print(a);
        return scanner.nextInt();
    }

    public int tinhTongCot(int[][] array,int cotCanTinhTong) {
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i][cotCanTinhTong];
        }
        return sum;
    }

    public int tinhTongDong(int[][] array,int dongCanTinhTong) {
        int sum = 0;
        for (int i = dongCanTinhTong; i == dongCanTinhTong ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                sum += array[dongCanTinhTong][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        TongSoOMotCotXacDinh tongSoOMotCotXacDinh = new TongSoOMotCotXacDinh();
        int[][] array;
        int tongSoCot;
        int tongSoDong;
        int cotCanTinhTong;
        int hangCanTinhTong;

        tongSoCot = tongSoOMotCotXacDinh.soNhapVao("nhap so cot : ");
        tongSoDong = tongSoOMotCotXacDinh.soNhapVao("nhap so dong : ");

        array =  new int[tongSoDong][tongSoCot];
        for (int i = 0; i < tongSoDong ; i++) {
            for (int j = 0; j < tongSoCot ; j++) {
                array[i][j] = tongSoOMotCotXacDinh.soNhapVao("nhap phan tu hang : " + i + " cot " + j +" ");
            }  
        }

        System.out.println("Mang da nhap la : ");
        for (int i = 0; i < tongSoDong ; i++) {
            for (int j = 0; j < tongSoCot ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        cotCanTinhTong = tongSoOMotCotXacDinh.soNhapVao("Cot can tinh tong : ");
        hangCanTinhTong = tongSoOMotCotXacDinh.soNhapVao("Nhap dong can tinh tong : ");
        
        System.out.println("Tong cua cot "+cotCanTinhTong  +" la : " + tongSoOMotCotXacDinh.tinhTongCot(array, cotCanTinhTong));
        System.out.println("Tong cua hang "+hangCanTinhTong  +" la : " + tongSoOMotCotXacDinh.tinhTongDong(array, hangCanTinhTong));

    }
}
