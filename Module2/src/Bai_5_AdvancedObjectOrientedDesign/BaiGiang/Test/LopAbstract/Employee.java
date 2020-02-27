package Bai_5_AdvancedObjectOrientedDesign.BaiGiang.Test.LopAbstract;

public class Employee extends Person {
    public Employee() {
    }

    public Employee(String ten) {
        super(ten);
    }

    @Override
    public double tinhLhuong() {
        return 0;
    }
}
