package Bai_Test.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(scanner.nextInt());
        integers.add(scanner.nextInt());
        integers.add(scanner.nextInt());
        integers.add(scanner.nextInt());
        integers.add(scanner.nextInt());
        integers.add(scanner.nextInt());
        for (Integer a:integers) {
            System.out.println(a);
        }
    }
}
