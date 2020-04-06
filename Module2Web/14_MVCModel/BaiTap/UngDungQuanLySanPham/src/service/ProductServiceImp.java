package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImp implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"a",10,"a","a"));
        products.put(2, new Product(2,"b",20,"b","b"));
        products.put(3, new Product(3,"c",30,"c","c"));
        products.put(4, new Product(4,"d",40,"d","d"));
        products.put(5, new Product(5,"e",50,"e","e"));
        products.put(6, new Product(6,"f",60,"f","f"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void saveProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findByName(String name) {
        for (Product product : products.values() ) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }


    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void removeProduct(int id) {
        products.remove(id);
    }
}
