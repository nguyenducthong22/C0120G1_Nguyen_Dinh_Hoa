package WS.Work3;

public class Shoes extends DoLamDep {
    String brand;

    public Shoes() {
    }

    public Shoes(String id, String name, int size, String brand) {
        super(id, name, size);
        this.brand = brand;
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


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
