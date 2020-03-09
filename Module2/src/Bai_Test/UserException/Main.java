package Bai_Test.UserException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserException, Exception {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        while (true) {
            try {
                System.out.println("nhap tuoi ");
                student.setAge(scanner.nextInt());
                scanner.nextLine();
                break;
            } catch (UserException | InputMismatchException  e) {
                scanner.nextLine();
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("nhap ten: ");
                student.setName(scanner.nextLine());

            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        }



    }
}
