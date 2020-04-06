package Bai_5_AdvancedObjectOrientedDesign.BaiGiang.Test.LopAbstract;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person() {};
//        person.setTen("asd");
//        System.out.println(person.getTen());

        Employee employee = new Employee();
        Employee employee1 = new Employee("asd");
        employee.setTen("asd");
        System.out.println(employee.getTen());
        System.out.println(employee1.getTen());

        System.out.println(employee.tinhLhuong());

    }
}
