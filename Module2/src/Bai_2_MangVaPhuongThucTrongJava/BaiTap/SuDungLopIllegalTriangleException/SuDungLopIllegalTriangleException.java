package Bai_2_MangVaPhuongThucTrongJava.BaiTap.SuDungLopIllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    //chua lam duoc
    public int doDai(String a) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int n =0;
        while (!check) {
            try {
                System.out.println(a);
                n = scanner.nextInt();
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Ban can nhap so");
                scanner.nextInt();
            }

            if (n < 0) {
                System.out.println("nhap so lon hon 0");
                check = false;
            }


        }
        return n;

    }


    public static void main(String[] args) {
        SuDungLopIllegalTriangleException suDungLopIllegalTriangleException = new SuDungLopIllegalTriangleException();
        int a;
        int b;
        int c;
        a = suDungLopIllegalTriangleException.doDai("Nhap canh a");
        b = suDungLopIllegalTriangleException.doDai("Nhap canh b");
        c = suDungLopIllegalTriangleException.doDai("Nhap canh c");
        if (((a + b) < c) || ((a + c) < b) || ((c + b) < a)) {
            System.out.println("khong the la 3 canh cua 1 tam giac ");
        } else {
            System.out.println("OKKKK");
        }


    }
}
