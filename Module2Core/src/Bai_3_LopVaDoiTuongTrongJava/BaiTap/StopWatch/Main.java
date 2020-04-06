package Bai_3_LopVaDoiTuongTrongJava.BaiTap.StopWatch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public void selectionSort() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
//        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++) {
            int minArr = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minArr]>arr[j]) {
                    minArr = j;
                }
            }
            if(i!=minArr){}
                swap(arr, minArr, i);
        }
    }

    private static void swap(int[]arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args) {
        Main main = new Main();
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime(stopWatch.start());
        main.selectionSort();
        stopWatch.setEndTime(stopWatch.stop());
        System.out.println("Thoi gian thuc hien la : " + stopWatch.getElapsedTime()+" mili giay");
    }

}
