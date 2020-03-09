package WS.Work3;

public abstract class DoLamDep extends Tong {
    int size;

    public DoLamDep() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoLamDep(String id, String name, int size) {
        super(id, name);
        this.size = size;
    }
}
