package sda.java.loginproject.db;

import sda.java.loginproject.entity.Products;

public class ProductDao extends Dbinitializer {

    public void insertProduct(Products product){
        openSessionAndTransaction();
        session.persist(product);
        closeSessionAndTransaction();
    }
}
