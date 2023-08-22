package de.telran.mgvozdev.prof.hw7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder implements Iterable<File>{

    private String name;
    private String ownerName;
    private List<File> files;

    public Folder(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public Iterator<File> iterator() {
        return files.iterator();
    }
}
