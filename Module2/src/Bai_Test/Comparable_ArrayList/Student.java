package Bai_Test.Comparable_ArrayList;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
//        return student.getName().compareTo(this.getName()); //xep nguoc
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }
}
