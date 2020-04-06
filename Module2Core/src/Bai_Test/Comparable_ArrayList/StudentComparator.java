package Bai_Test.Comparable_ArrayList;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        //neu 01 la null coi nhu 02 lon hon
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        //sap xep tuoi tang dan
        int value = o1.getAge() - o2.getAge();
        if (value != 0) {
            return value;
        }
        value = o1.getName().compareTo(o2.getName());
        return value;
    }
}
