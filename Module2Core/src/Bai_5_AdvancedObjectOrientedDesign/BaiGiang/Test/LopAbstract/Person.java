package Bai_5_AdvancedObjectOrientedDesign.BaiGiang.Test.LopAbstract;

public abstract class Person {
    private String ten;

    public Person() {
    }

    public Person(String ten) {
        super();
        this.ten = ten;
    }

    public abstract double tinhLhuong();

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
