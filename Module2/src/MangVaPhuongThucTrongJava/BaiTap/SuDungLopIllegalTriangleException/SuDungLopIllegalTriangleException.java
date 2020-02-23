package MangVaPhuongThucTrongJava.BaiTap.SuDungLopIllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    //???????

    // Scanner scanner = new Scanner(System.in);   // cai nay de tren hay duoi :))
    public int doDai(String a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(a);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = scanner.nextInt();
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Ban can nhap so");
                scanner.nextLine();
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
        System.out.println(a + b + c);




    }
}
