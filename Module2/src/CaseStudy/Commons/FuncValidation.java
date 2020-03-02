package CaseStudy.Commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = "";
    private static Scanner scanner;

    //Check name validate
    public static boolean checkNameService(String str) {
        regex = "^[A-Z][a-z]+$";
        return str.matches(regex);
    }

    //check Number double

    public static double checkValidateNumberDouble(String content, String errMes) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(content);
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println(errMes);
            }
        }
    }

    public static int checkValidateNumberInt(String content, String errMes) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(content);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println(errMes);
            }
        }
    }
}
