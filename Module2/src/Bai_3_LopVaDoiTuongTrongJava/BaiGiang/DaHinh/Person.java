package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.DaHinh;

public class Person {
    private String ten;
    private int tuoi;

    public Person() {
    }

    public Person(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public void thongTin() {
        System.out.println("Class cha");
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
