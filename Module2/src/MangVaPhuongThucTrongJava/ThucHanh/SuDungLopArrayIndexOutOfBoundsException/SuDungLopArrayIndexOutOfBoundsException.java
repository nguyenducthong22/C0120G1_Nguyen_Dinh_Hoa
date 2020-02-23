package MangVaPhuongThucTrongJava.ThucHanh.SuDungLopArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class SuDungLopArrayIndexOutOfBoundsException {
    public int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        SuDungLopArrayIndexOutOfBoundsException arrExample = new SuDungLopArrayIndexOutOfBoundsException();
        int[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[(x-1)]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
