package de.telran.mgvozdev.prof.hw3.database;

public class Runner {

    public static void main(String[] args) {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        inMemoryDatabase.save(new Product("Apple"));
        inMemoryDatabase.printProductsArraySize();
        inMemoryDatabase.save(new Product("Cookies"));
        inMemoryDatabase.save(new Product("Flour"));
        inMemoryDatabase.save(new Product("Bread"));
        inMemoryDatabase.save(new Product("Juice"));
        inMemoryDatabase.printProductsArraySize();
        inMemoryDatabase.save(new Product("Milk"));
        inMemoryDatabase.printProductsArraySize();
        inMemoryDatabase.save(new Product("Pasta"));
        inMemoryDatabase.printProductsArraySize();

        for (Product product : inMemoryDatabase.getProducts()) {
            System.out.println(product);
        }

        System.out.println("Is there milk? - " + inMemoryDatabase.findByTitle("Milk"));
        System.out.println("Is there a car? - " + inMemoryDatabase.findByTitle("Car"));
    }
}
