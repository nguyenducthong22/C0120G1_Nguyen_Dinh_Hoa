package Bai_1_NgonNguLapTrinhJava.ThucHanh.TinhChiSoCanNang;

import java.util.Scanner;

public class TinhChiSoCanNang {
    Scanner scanner = new Scanner(System.in);

    public double chieuCao() {
        System.out.println("Nhap chieu cao : ");
        return scanner.nextDouble();
    }
    public double canNang() {
        System.out.println("Nhap can nang : ");
        return scanner.nextDouble();
    }

    public static double tinhBMI(double chieuCao,double canNang) {
        double chiSoBMI;
        chiSoBMI = canNang / (chieuCao * chieuCao)*10000;
        return chiSoBMI;
    }

    public static void main(String[] args) {
        TinhChiSoCanNang tinhChiSoCanNang = new TinhChiSoCanNang();
        double chieuCao;
        double canNang;
        double chisoBMI;
        chieuCao = tinhChiSoCanNang.chieuCao();
        canNang = tinhChiSoCanNang.canNang();
        chisoBMI = tinhBMI(chieuCao, canNang);
        System.out.println("Chi So BMI la : " + chisoBMI);

        if (chisoBMI < 18)
            System.out.printf("%-20.2f%s", chisoBMI, "Underweight");
        else if (chisoBMI < 25.0)
            System.out.printf("%-20.2f%s", chisoBMI, "Normal");
        else if (chisoBMI < 30.0)
            System.out.printf("%-20.2f%s", chisoBMI, "Overweight");
        else
            System.out.printf("%-20.2f%s", chisoBMI, "Obese");
    }
}
