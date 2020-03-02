package Bai_Test.ComparableInterface;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getStudentName().substring(o1.getStudentName().lastIndexOf(" "));
        String name2 = o2.getStudentName().substring(o2.getStudentName().lastIndexOf(" "));
        return name1.compareTo(name2);
    }

}
