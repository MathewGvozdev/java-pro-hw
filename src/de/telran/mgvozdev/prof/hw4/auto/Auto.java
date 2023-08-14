package de.telran.mgvozdev.prof.hw4.auto;

import java.util.Arrays;

public abstract class Auto {

    private int releaseYear;
    private String brand;
    private String model;
    private Tire[] tires = new Tire[4];
    private boolean isBroken;

    public Auto(int releaseYear, String brand, String model) {
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.model = model;
        Arrays.fill(tires, Tire.SUMMER);
        this.isBroken = false;
    }

    public void drive() {
        System.out.println("drive");
    }

    public void breakDown() {
        isBroken = true;
        System.out.println("break down");
    }

    public void turnOn() {
        System.out.println("turn on");
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String toString() {
        return "Auto{" +
               "releaseYear=" + releaseYear +
               ", brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", tires=" + Arrays.toString(tires) +
               ", isBroken=" + isBroken +
               '}';
    }
}
