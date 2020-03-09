package Bai_Test.String;

import java.util.ArrayList;

public class StringTest {
    public static void main(String[] args) {
//        String string1 = new String("Dinh Hoa");
//        String string2 = new String("Dinh Hoa");
//        String string3;
//        string3 = string1.concat(string2);
//        System.out.println(string3);

        ArrayList<String> list = new ArrayList<String>();
        list.add("asd");
        list.add("dsa");
        list.add("qwe");
        list.add("re");
        list.add("asd");
        list.add("csd");
        list.add("isd");
        list.add("esd");

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);
    }
}
