package Bai_1_NgonNguLapTrinhJava.ThucHanh.TinhSoNgayTrongThang;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    Scanner scanner = new Scanner(System.in);

    public int nhapThang() {
        System.out.println("Nhap thang can hien thi so ngay");
        return scanner.nextInt();
    }

    public int nhapNam() {
        System.out.println("Thang 2 nam nao??????");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        TinhSoNgayTrongThang tinhSoNgayTrongThang = new TinhSoNgayTrongThang();
        int thang = tinhSoNgayTrongThang.nhapThang();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                break;
            case 2:
                int nam = tinhSoNgayTrongThang.nhapNam();
                if ((nam % 400 == 0 )|| ((nam % 4 == 0) && (nam % 100 != 0))) {
                    System.out.println("Thang 2 nay co 29 ngay");
                } else System.out.println("Thang 2 nay co 28 ngay");
                break;
            default:
                System.out.println("Nhap khong hop le");
        }
    }
}
