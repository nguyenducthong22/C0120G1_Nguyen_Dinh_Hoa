package WS.Work2;

public class DoLamDep extends CuocSong {
    int size;

    public DoLamDep() {
    }

    public DoLamDep(String id, String name, int size) {
        super(id, name);
        this.size = size;
    }

    public DoLamDep(int size) {
        this.size = size;
    }
}
