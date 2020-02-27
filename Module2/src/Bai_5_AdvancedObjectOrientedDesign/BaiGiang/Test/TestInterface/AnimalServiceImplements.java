package Bai_5_AdvancedObjectOrientedDesign.BaiGiang.Test.TestInterface;

public class AnimalServiceImplements implements AnimalService {

    @Override
    public void them() {
        System.out.println("them");
    }

    @Override
    public void sua() {
        System.out.println("sua");
    }

    @Override
    public void xoa() {
        System.out.println("xoa");
    }
}
