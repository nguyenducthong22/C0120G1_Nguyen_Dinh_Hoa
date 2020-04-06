package WS.Work2;

public class Employee extends People implements AddNew,Delete,Edit,Find,Get {
    double salary;

    public Employee() {
    }



    public Employee(String id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
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
