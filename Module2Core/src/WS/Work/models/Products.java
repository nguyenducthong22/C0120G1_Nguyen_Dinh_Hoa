package WS.Work.models;

public class Products {
    protected int id;
    protected int price;
    protected String url;

    public Products() {
    }

    public Products(int id, int price, String url) {
        this.id = id;
        this.price = price;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
