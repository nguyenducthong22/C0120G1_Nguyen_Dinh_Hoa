package Bai_Test.ComparableInterface;

import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<Student>();
        listStudent.add(new Student("A1", 4, 24, "Nguyen Van A"));
        listStudent.add(new Student("B1", 9, 23, "Nguyen Van C"));
        listStudent.add(new Student("C1", 2, 54, "Nguyen Van B"));
        listStudent.add(new Student("A2", 5, 12, "Nguyen Van E"));
        listStudent.add(new Student("B2", 6, 52, "Nguyen Van H"));
        listStudent.add(new Student("C2", 4, 87, "Nguyen Van J"));

            //Comparable
//        Collections.sort(listStudent);
//        for (Student s : listStudent) {
//            System.out.println(s);
//
//        }

        //Comparator
        Collections.sort(listStudent, new SortByName());
        for (Student s : listStudent) {
            System.out.println(s);

        }


    }
}
