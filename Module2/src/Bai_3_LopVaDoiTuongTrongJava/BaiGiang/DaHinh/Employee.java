package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.DaHinh;

public class Employee extends Person {
    private double luong;

    public Employee() {
    }

    public Employee(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Employee(String ten, int tuoi, double luong) {
        super(ten, tuoi);
        this.luong = luong;
    }

    @Override
    public void thongTin() {
        System.out.println("Class con");
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
