package WS.Test;

import java.util.Scanner;

public class testttttttttt {

    public static boolean checkNumber(int n) {
        boolean flag = true;
        if (n < 2) {
            flag = false;
        }
        for (int i = 2; i < n ; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("nhap n : ");
                n = scanner.nextInt();
                if (checkNumber(n)) {
                    System.out.println("la so nguyen to");
                }
                else System.out.println("khong la so nguyen to");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("nhap lai");
                scanner.nextLine();
            }

        }



    }

}
