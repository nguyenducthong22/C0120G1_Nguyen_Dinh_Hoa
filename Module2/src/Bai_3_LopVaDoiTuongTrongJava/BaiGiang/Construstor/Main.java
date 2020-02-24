package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.Construstor;

public class Main {
    public static void main(String[] args) {
        Construstor construstor = new Construstor("Dinh Hoa");
        System.out.println(construstor.getName());
        Construstor construstor1 = new Construstor();
        System.out.println(construstor1.getName());
    }
}
