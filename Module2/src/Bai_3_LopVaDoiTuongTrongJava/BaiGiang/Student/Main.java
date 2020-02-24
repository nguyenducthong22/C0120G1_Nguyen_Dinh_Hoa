package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student();

        student.setBirthDay(1994);
        student.setName("Hoa");
        student.setCode("Dep Trai");

        System.out.println(student.noiChuyen());

        student.showInfo();

        student1.setBirthDay(1996);
        student1.setName("Cuong");
        student1.setCode("MSV", 300);
        System.out.println(student1.noiChuyen());
        student1.showInfo();

        Student student2 = new Student("Hien", "MSV300", 30);
        student2.setCode("Ma sinh vien ",200);
        System.out.println(student2.noiChuyen());
        student2.showInfo();

    }
}
