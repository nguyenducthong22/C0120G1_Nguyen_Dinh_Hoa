package Bai_3_LopVaDoiTuongTrongJava.BaiGiang.DaHinh;

public class Main {
    public static void main(String[] args) {

        //ep kieu
        long x = 10;
        int i = (int) x;



        Employee employee1 = new Employee();
        Person employee2 = new Employee();

        employee1.setLuong(34);
        employee1.setTen("asd");
        System.out.println(employee1.getLuong());
        System.out.println(employee1.getTen());

       //ep kieu
        System.out.println(((Employee) employee2).getLuong());
        System.out.println(((Employee) employee2).getLuong());

        employee2.setTen("asd");
        System.out.println(employee2.getTen());
        employee2.thongTin();
        employee1.thongTin();

    }
}
