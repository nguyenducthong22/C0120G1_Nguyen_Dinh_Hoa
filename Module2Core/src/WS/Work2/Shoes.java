package WS.Work2;

public class Shoes extends DoLamDep implements Delete,Find,Get,AddNew,Edit {
    String brand;

    public Shoes() {
    }


    public Shoes(String id, String name, int size, String brand) {
        super(id, name, size);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void addNew() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {

    }

    @Override
    public void get() {

    }

    @Override
    public void edit() {

    }
}
