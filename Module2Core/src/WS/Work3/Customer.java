package WS.Work3;

public class Customer extends People {
    private int age;

    public Customer() {
    }

    @Override
    protected void addNew() {

    }

    @Override
    protected void edit() {

    }

    @Override
    protected void getAll() {

    }

    @Override
    protected void findBy() {

    }

    @Override
    protected void delete() {

    }


    public Customer(String id, String name, String address, int age) {
        super(id, name, address);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
