package WS.Work.commons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
    public static int checkAndGetNumber(String m) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(m);
            }
        }
    }


}
