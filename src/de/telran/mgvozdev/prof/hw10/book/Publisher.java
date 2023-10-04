package de.telran.mgvozdev.prof.hw10.book;

public class Publisher {

    private String title;
    private String foundationYear;

    public Publisher(String title, String foundationYear) {
        this.title = title;
        this.foundationYear = foundationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getFoundationYear() {
        return foundationYear;
    }

    @Override
    public String toString() {
        return "Publisher{" +
               "title='" + title + '\'' +
               ", foundationYear='" + foundationYear + '\'' +
               '}';
    }
}
