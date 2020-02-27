package Bai_4_KeThua.BaiTap.Triangle;

import java.util.InputMismatchException;

public class TriangleException extends Exception {
    public TriangleException(String s) {
        super(s);
    }

    public static void triangleException(double a, double b, double c) throws TriangleException, InputMismatchException {
        if (a < 0 || b < 0 || c < 0) {
            throw new TriangleException("Canh cua tam giac khong duoc <0");
        } else if (a + b < c || a + c < b || c + b < a) {
            throw new TriangleException("Tong cua 2 canh phai lon hon canh thu ba");
        }
    }


}
