package WS.Work3;

public class Clothes extends DoLamDep {
    String color;

    public Clothes() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Clothes(String id, String name, int size, String color) {
        super(id, name, size);
        this.color = color;
    }
}
