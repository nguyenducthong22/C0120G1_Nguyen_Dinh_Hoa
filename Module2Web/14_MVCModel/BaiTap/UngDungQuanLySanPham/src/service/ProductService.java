package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void saveProduct(Product product);

    Product findByName(String name);

    Product findById(int id);


    void updateProduct(int id, Product product);

    void removeProduct(int id);


}
