package de.telran.mgvozdev.prof.hw10.book;

public class Book {

    private String title;
    private Author author;
    private Publisher publisher;
    private Integer publicationYear;

    public Book(String title, Author author, Publisher publisher, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author=" + author +
               ", publisher=" + publisher +
               ", publicationYear=" + publicationYear +
               '}';
    }
}
