package Bai_Test.Comparable_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<Student>();
        Student student = new Student("B",1);
        Student student2 = new Student("A", 3);
        Student student3 = new Student("A", 4);
        Student student4 = new Student("C", 2);
        Student student5 = new Student("D", 2);
        listStudent.add(student);
        Student student1 = new Student("A", 2);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        Collections.sort(listStudent);
        System.out.println(listStudent);

    }
}
