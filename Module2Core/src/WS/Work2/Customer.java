package WS.Work2;

public class Customer extends People implements AddNew,Delete,Edit,Get,Find{
    int age;

    public Customer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(String id, String name, String address, int age) {
        super(id, name, address);
        this.age = age;
    }

    public Customer(String address, int age) {
        super(address);
        this.age = age;
    }

    @Override
    public void addNew() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void find() {

    }

    @Override
    public void get() {

    }
}
