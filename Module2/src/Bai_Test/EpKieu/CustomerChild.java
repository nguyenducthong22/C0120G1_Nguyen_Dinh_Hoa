package Bai_Test.EpKieu;

public class CustomerChild extends Customer {
    String age;

    public CustomerChild() {
    }

    @Override
    public String toString() {
        return "CustomerChild{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public CustomerChild(String name, String age) {
        super(name);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
