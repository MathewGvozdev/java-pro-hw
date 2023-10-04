package de.telran.mgvozdev.prof.hw10.newspaper;

import de.telran.mgvozdev.prof.hw10.newspaper.Advertisement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Newspaper {

    private List<Advertisement> advertisements = new ArrayList<>();

    public void addAdvertisement(Advertisement ad) {
        advertisements.add(ad);
    }

    public void sortAdvertisements() {
        advertisements.sort(new Advertisement.AdvertisementComparator());
    }

    public Advertisement findMaxAdvertisement() {
        return Collections.max(advertisements);
    }

    public Advertisement findMinAdvertisement() {
        return Collections.min(advertisements);
    }

    public void printAdvertisements() {
        int count = 1;
        for (Advertisement advertisement : advertisements) {
            System.out.println(count + ": " + advertisement);
            count++;
        }
    }
}
