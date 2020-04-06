package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.ConNguoi;

public class Person {
    String name;
    int birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void showInfo() {
        System.out.println("My name is : " + this.name + "\n" + "My birhday is: " + this.birthDay);
    }
}
