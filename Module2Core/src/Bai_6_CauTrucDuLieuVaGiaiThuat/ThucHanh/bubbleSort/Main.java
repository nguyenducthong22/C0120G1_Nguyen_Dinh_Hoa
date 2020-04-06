package Bai_6_CauTrucDuLieuVaGiaiThuat.ThucHanh.bubbleSort;

public class Main {
    private static void swap(Integer a, Integer b) {
        Integer temp;
        temp = a.intValue();
        a = b.intValue();
        b = temp.intValue();

    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int  j =  0 ; j <arr.length -  1  - i; j ++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    } 


    public static void main(String[] args) {
        Integer a = new Integer(11);
        Integer b = new Integer(7);
        swap(a, b);
        System.out.println(a+" " +b);


//        Main main = new Main();
//        int[] arr = {4, 1, 3, 5, 7, 8, 6, 6};
//        arr = main.bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
    }
}
