package WS.Work3;

public abstract class Tong {
    String id;
    String name;

    public Tong() {
    }

    public Tong(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract protected void addNew();
    abstract protected void edit();
    abstract protected void getAll();
    abstract protected void findBy();
    abstract protected void delete();
}
