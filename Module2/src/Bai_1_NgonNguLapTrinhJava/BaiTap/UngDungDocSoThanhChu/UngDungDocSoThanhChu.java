package Bai_1_NgonNguLapTrinhJava.BaiTap.UngDungDocSoThanhChu;

import java.util.Scanner;

public class UngDungDocSoThanhChu {

    Scanner scanner = new Scanner(System.in);

    public int soNhapVao() {
        System.out.println("Nhap vao so can doc (2 chu so) : ");
        return scanner.nextInt();
    }

    public static void ketQua(int a) {
        int soHangChuc;
        int soHangDonVi;
        soHangDonVi = a % 10;
        soHangChuc = (a - soHangDonVi) / 10;
        String chuHangDonVi;
        String chuHangChuc;
        switch (soHangDonVi) {
            case 0:
                chuHangDonVi = "";
                break;
            case 1:
                chuHangDonVi = " mot";
                break;
            case 2:
                chuHangDonVi = " hai";
                break;
            case 3:
                chuHangDonVi = " ba";
                break;
            case 4:
                chuHangDonVi = " tu";
                break;
            case 5:
                chuHangDonVi = " nam";
                break;
            case 6:
                chuHangDonVi = " sau";
                break;
            case 7:
                chuHangDonVi = " bay";
                break;
            case 8:
                chuHangDonVi = " tam";
                break;
            case 9:
                chuHangDonVi = " chin";
                break;
            default:
                return;
        }
        switch (soHangChuc) {

            case 1:
                chuHangChuc = " muoi";
                break;
            case 2:
                chuHangChuc = " hai muoi";
                break;
            case 3:
                chuHangChuc = " ba muoi";
                break;
            case 4:
                chuHangChuc = " bon muoi";
                break;
            case 5:
                chuHangChuc = " nam muoi";
                break;
            case 6:
                chuHangChuc = " sau muoi";
                break;
            case 7:
                chuHangChuc = " bay muoi";
                break;
            case 8:
                chuHangChuc = " tam muoi";
                break;
            case 9:
                chuHangChuc = " chin muoi";
                break;
            default:
                return;
        }

        System.out.println("Doc la: " + chuHangChuc + chuHangDonVi);
    }

    public static void main(String[] args) {
        UngDungDocSoThanhChu ungDungDocSoThanhChu = new UngDungDocSoThanhChu();
        int soNhapVao;
        soNhapVao = ungDungDocSoThanhChu.soNhapVao();
        ungDungDocSoThanhChu.ketQua(soNhapVao);
    }
}


