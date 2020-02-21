package Bai_1_NgonNguLapTrinhJava.BaiTap.HienThiLoiChao;

import java.util.Scanner;

public class HienThiLoiChao {
    Scanner scanner = new Scanner(System.in);
    public String yourName() {
        System.out.println("Nhap chieu cao cua ban");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        HienThiLoiChao hienThiLoiChao = new HienThiLoiChao();
        String yourName;
        yourName = hienThiLoiChao.yourName();
        System.out.println("Chieu cao cua ban la : " + yourName + "cm");
    }

}
