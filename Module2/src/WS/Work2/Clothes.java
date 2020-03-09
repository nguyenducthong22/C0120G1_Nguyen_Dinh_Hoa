package WS.Work2;

public class Clothes extends DoLamDep implements AddNew,Delete,Edit,Find,Get {

    String collor;

    public Clothes() {
    }

    public Clothes(String collor) {
        this.collor = collor;
    }

    public Clothes(String id, String name, int size, String collor) {
        super(id, name, size);
        this.collor = collor;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
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
