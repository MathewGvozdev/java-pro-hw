package de.telran.mgvozdev.prof.hw3.database;

public interface ProductDatabase {

    void save(Product product);
    Product findByTitle(String productTitle);
}
