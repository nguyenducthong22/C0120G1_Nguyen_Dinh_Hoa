package Bai_Test.Testtttt;

public class Animal {
    protected int leg;
    protected String color;

    public void keu() {
        System.out.println("O` o' o");
    }


    public Animal() {
    }

    public Animal(int leg, String color) {
        this.leg = leg;
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
