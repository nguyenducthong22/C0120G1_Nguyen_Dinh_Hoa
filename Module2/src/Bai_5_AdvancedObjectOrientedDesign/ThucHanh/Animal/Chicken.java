package Bai_5_AdvancedObjectOrientedDesign.ThucHanh.Animal;

public class Chicken extends Animal implements Edible  {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
