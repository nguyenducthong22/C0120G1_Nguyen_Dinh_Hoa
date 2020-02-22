package MangVaPhuongThucTrongJava.ThucHanh.TimGiaTriNhoNhatCuaMang;

import java.util.Scanner;

public class TimGiaTriNhoNhatCuaMang {
    Scanner scanner = new Scanner(System.in);

    public int inputNumber(String a) {
        System.out.print(a);
        return scanner.nextInt();
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        TimGiaTriNhoNhatCuaMang timGiaTriNhoNhatCuaMang = new TimGiaTriNhoNhatCuaMang();
        int n;
        int[] arr;
        n = timGiaTriNhoNhatCuaMang.inputNumber("Nhap so phan tu cua mang : ");
        arr = new int[n];
        for (int i = 0; i < n ; i++) {
            int phanTu;
            phanTu = timGiaTriNhoNhatCuaMang.inputNumber("Nhap phan tu thu " + (i + 1)+" : ");
            arr[i] = phanTu;
        }
        int index = minValue(arr);
        System.out.println("So nho nhat trong mang la : " + arr[index]);
    }
}
