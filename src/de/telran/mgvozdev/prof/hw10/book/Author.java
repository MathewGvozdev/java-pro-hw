package de.telran.mgvozdev.prof.hw10.book;

public class Author {

    private String name;
    private String surname;
    private String birthday;

    public Author(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Author{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", birthday='" + birthday + '\'' +
               '}';
    }
}
