package WS.Work3;

public class Employee extends People {
    float salary;

    public Employee() {
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

    public Employee(String id, String name, String address, float salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
