package de.telran.mgvozdev.prof.hw3.database;

public class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
               "title='" + title + '\'' +
               '}';
    }
}
