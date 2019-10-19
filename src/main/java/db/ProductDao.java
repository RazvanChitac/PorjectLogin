package db;

import sda.java.loginproject.entity.Product;

public class ProductDao extends Dbinitializer {

    public void insertProduct(Product product){
        openSessionAndTransaction();
        session.persist(product);
        closeSessionAndTransaction();
    }
}
