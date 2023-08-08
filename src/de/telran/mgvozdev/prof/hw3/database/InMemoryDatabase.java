package de.telran.mgvozdev.prof.hw3.database;

public class InMemoryDatabase implements ProductDatabase {

    private Product[] products = new Product[5];
    private int index = 0;

    @Override
    public void save(Product product) {
        if (index >= products.length) {
            expandArray();
        }
        products[index] = product;
        index++;
    }

    @Override
    public Product findByTitle(String productTitle) {
        Product searchedProduct = null;
        for (Product product : products) {
            if (productTitle.equals(product.getTitle())) {
                searchedProduct = product;
            }
        }
        return searchedProduct;
    }

    private void expandArray() {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        products = newProducts;
    }

    public void printProductsArraySize() {
        System.out.println(products.length);
    }

    public Product[] getProducts() {
        return products;
    }
}
