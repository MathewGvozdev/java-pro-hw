package de.telran.mgvozdev.prof.hw10.newspaper;

import java.util.Comparator;

public class Advertisement implements Comparable<Advertisement> {

    private int year;
    private String title;
    private String author;
    private String description;
    private double price;

    public Advertisement(int year, String title, String author, String description, double price) {
        this.year = year;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
               "year=" + year +
               ", title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", description='" + description + '\'' +
               ", price=" + price +
               '}';
    }

    @Override
    public int compareTo(Advertisement o) {
        return Double.compare(this.price, o.price);
    }

    public static class AdvertisementComparator implements Comparator<Advertisement> {

        @Override
        public int compare(Advertisement o1, Advertisement o2) {
            Comparator<Advertisement> comparator = Comparator
                    .comparingInt(Advertisement::getYear)
                    .thenComparing(Advertisement::getTitle)
                    .thenComparing(Advertisement::getAuthor)
                    .thenComparing(Advertisement::getDescription);
            return comparator.compare(o1, o2);
        }
    }
}
