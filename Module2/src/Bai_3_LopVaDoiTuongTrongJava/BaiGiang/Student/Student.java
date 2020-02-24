package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.Student;

import java.util.Calendar;

public class Student {
    public String name;
    public String code;
    public int birthDay;

    //constructor
    public Student() {
    }


    public Student(String name, String code, int birthDay) {
        this.name = name;
        this.code = code;
        this.birthDay = birthDay;
    }

    //phuong thuc

    public String noiChuyen() {
        return "Hello my name is : " + this.getName() +" . My birthday is : "+this.getBirthDay() ;
    }
    public int getAge() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) -this.getBirthDay() ;
    }

    public void showInfo() {
        System.out.println("Tuoi :\t\t " + this.getAge());
        System.out.println("Ten : \t\t" + this.getName());
        System.out.println("Code : \t\t" +this.getCode());
    }

    //getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //OverLoading - Nap chong
    public void setCode(String str,int number) {
        this.code = str + number;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
}
