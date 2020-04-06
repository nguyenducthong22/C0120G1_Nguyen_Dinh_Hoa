package Bai_Test.Collection.List;

import java.util.ArrayList;

public class TestArraylist {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A1");
        arrayList.add("B1");
        arrayList.add("C1");
        //xoa
        arrayList.remove(0);
        //
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        arrayList.set(0, "123");
        for (String t :arrayList   ) {
            System.out.println(t);
        }
    }
}
