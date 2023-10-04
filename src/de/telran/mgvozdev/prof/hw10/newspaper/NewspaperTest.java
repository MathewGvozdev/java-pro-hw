package de.telran.mgvozdev.prof.hw10.newspaper;

public class NewspaperTest {

    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        newspaper.addAdvertisement(new Advertisement(2001, "economics", "Bill", "economics-1", 10));
        newspaper.addAdvertisement(new Advertisement(2002, "politics", "Anton", "politics-1", 11));
        newspaper.addAdvertisement(new Advertisement(2003, "economics", "John", "economics-2", 15));
        newspaper.addAdvertisement(new Advertisement(2004, "politics", "William", "politics-2", 14));
        newspaper.addAdvertisement(new Advertisement(2005, "politics", "Liza", "politics-3", 4));
        newspaper.addAdvertisement(new Advertisement(2005, "politics", "Robert", "politics-4", 50));
        newspaper.addAdvertisement(new Advertisement(2005, "economics", "Matthew", "economics-3", 20));
        newspaper.addAdvertisement(new Advertisement(2004, "fashion", "James", "fashion-1", 7));
        newspaper.addAdvertisement(new Advertisement(2004, "fashion", "Joseph", "fashion-2", 13));
        newspaper.addAdvertisement(new Advertisement(2002, "economics", "Maria", "economics-4", 12));
        newspaper.sortAdvertisements();
        newspaper.printAdvertisements();

        System.out.println("Highest price: " + newspaper.findMaxAdvertisement());
        System.out.println("Lowest price: " + newspaper.findMinAdvertisement());
    }
}
