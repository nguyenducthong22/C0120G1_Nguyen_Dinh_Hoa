package WS.Work3;

public abstract class People extends Tong {
    String address;

    public People() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public People(String id, String name, String address) {
        super(id, name);
        this.address = address;
    }
}
