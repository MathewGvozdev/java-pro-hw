package de.telran.mgvozdev.prof.hw7;

public class File {

    private String name;
    private String extension;
    private String content;

    public File(String name, String extension, String content) {
        this.name = name;
        this.extension = extension;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public String getContent() {
        return content;
    }
}
