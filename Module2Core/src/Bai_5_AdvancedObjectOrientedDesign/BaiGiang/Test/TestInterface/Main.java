package Bai_5_AdvancedObjectOrientedDesign.BaiGiang.Test.TestInterface;

public class Main {
    public static void main(String[] args) {
        AnimalServiceImplements animalServiceImplements = new AnimalServiceImplements();
        animalServiceImplements.xoa();

        AnimalService animalService = new AnimalServiceImplements();
        animalService.sua();

        EmployeeServiceImplements employeeServiceImplements = new EmployeeServiceImplements();
        employeeServiceImplements.luong();

    }
}
