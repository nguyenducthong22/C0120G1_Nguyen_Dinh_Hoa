package Bai_Test.String;

public class StringTest {
    public static void main(String[] args) {
        String string1 = new String("Dinh Hoa");
        String string2 = new String("Dinh Hoa");
        String string3;
        string3 = string1.concat(string2);
        System.out.println(string3);
    }
}
