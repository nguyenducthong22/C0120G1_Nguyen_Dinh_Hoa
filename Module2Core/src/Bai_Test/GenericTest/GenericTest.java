package Bai_Test.GenericTest;

import java.util.ArrayList;

public class GenericTest {
    public <T> void showArrayElement(T[] objects) {
        for (T o : objects
        ) {
            System.out.println(o);
        }
    }

    public <K, V> void showInfo(K key, V value) {
        System.out.println(key + " " + value);
    }

    public <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];
        for (T t : arr) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add(0, "asdasd");
        Integer[] integers = {4, 65, 7, 5};
        String[] strings = {"asd", "asdd", "fdfd"};
        Double[] doubles = {3.4, 3.6, 45.4};

        GenericTest genericTest = new GenericTest();
        genericTest.showArrayElement(strings);
        genericTest.showArrayElement(integers);
        genericTest.showArrayElement(doubles);

        genericTest.showInfo(1, "df");
        genericTest.showInfo(6, "fgf");
        genericTest.showInfo("sdsd", 6);

        System.out.println(genericTest.findMax(integers));


    }
}
