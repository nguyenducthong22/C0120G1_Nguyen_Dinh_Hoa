package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.Construstor;

public class Construstor {
    public String Name;
    public Construstor() {
        this.setName("ten mac dinh");
    }

    public Construstor(String name) {
        Name = name;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
