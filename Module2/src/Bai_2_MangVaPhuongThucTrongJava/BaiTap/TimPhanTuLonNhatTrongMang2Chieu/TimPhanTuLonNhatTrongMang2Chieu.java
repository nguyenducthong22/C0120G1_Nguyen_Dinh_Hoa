package Bai_2_MangVaPhuongThucTrongJava.BaiTap.TimPhanTuLonNhatTrongMang2Chieu;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    Scanner scanner = new Scanner(System.in);
    public double inputNumper(String a) {
        System.out.print(a);
        return scanner.nextDouble();
    }
    public int doRong(String a) {
        System.out.println(a);
        return scanner.nextInt();
    }

    public static void timPhanTuLonNhat(double[][] array) {
        double max;
        int index1 = 0 ;
        int index2 = 0;
//        double[] result;
//        result = new double[3];
        max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Phan tu co gia tri lon nhat la : " + max + " tai vi tri " + index1 + " " + index2);

//        result[0] = max;
//        result[1] = index1;
//        result[2] = index2;
//        return result;
    }

    public static void main(String[] args) {
        TimPhanTuLonNhatTrongMang2Chieu timPhanTuLonNhatTrongMang2Chieu = new TimPhanTuLonNhatTrongMang2Chieu();
        int row;
        int collum;
        row = timPhanTuLonNhatTrongMang2Chieu.doRong("Nhap do dai cua mang");
        collum = timPhanTuLonNhatTrongMang2Chieu.doRong("Nhap do rong cua mang");
        double[][] matrix = new double[row][collum];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < collum ; j++) {
                matrix[i][j] = timPhanTuLonNhatTrongMang2Chieu.inputNumper("nhap phan tu tai cot "+ i+" va dong "+j +" : ");
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        TimPhanTuLonNhatTrongMang2Chieu.timPhanTuLonNhat(matrix);

    }

}
