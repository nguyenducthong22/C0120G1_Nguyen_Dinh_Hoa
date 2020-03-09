package Bai_Test.Collection.TestHashMap;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("name", "Hoa");
        stringHashMap.put("age", "18");
        stringHashMap.put("dia chi", "quang nam");
        System.out.println(stringHashMap.get("age"));
        //duyet phan tu trong hashmap
        Set<String> keys = stringHashMap.keySet();
        keys.forEach((key) -> System.out.println(keys));
        keys.forEach((key) -> System.out.println("key : " + key + " value : " + stringHashMap.get(key)));

    }
}
