package WS.Work.models;

public class Laptop extends Products {
    private int ram;

    public Laptop() {
    }

    public Laptop(int ram) {
        this.ram = ram;
    }

    public Laptop(int id, int price, String url, int ram) {
        super(id, price, url);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
