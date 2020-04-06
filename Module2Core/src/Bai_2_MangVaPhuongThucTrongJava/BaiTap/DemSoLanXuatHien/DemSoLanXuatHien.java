package Bai_2_MangVaPhuongThucTrongJava.BaiTap.DemSoLanXuatHien;

import java.util.Scanner;

public class DemSoLanXuatHien {
    Scanner scanner = new Scanner(System.in);

    public String chuoiNhapVao(String a) {
        System.out.println(a);
        return scanner.nextLine();
    }

    public Character tuCanDem() {
        System.out.println("Nhap tu can dem :");
        return scanner.nextLine().charAt(0);
    }


    public static void main(String[] args) {
        DemSoLanXuatHien demSoLanXuatHien = new DemSoLanXuatHien();

        String chuoiNhapVao;
        char tuCanDem ;
        int count = 0;


        chuoiNhapVao = demSoLanXuatHien.chuoiNhapVao("Nhap vao chuoi");
        tuCanDem = demSoLanXuatHien.tuCanDem();
        for (int i = 0; i < chuoiNhapVao.length(); i++) {
            if (tuCanDem == (chuoiNhapVao.charAt(i))) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua "+tuCanDem+" trong chuoi "+chuoiNhapVao+" la : "+count);



    }
}
