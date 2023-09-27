package de.telran.mgvozdev.prof.hw9;

import java.util.HashSet;

public class WindowTest {

    public static void main(String[] args) {
        HashSet<Window> windowsSet = new HashSet<>();

        Window window1 = new Window(10.0, 20.0, 30.0, "transparent");
        Window window2 = new Window(10.0, 20.0, 30.0, "transparent");
        Window window3 = new Window(25.0, 25.0, 25.0, "tinted");
        Window window4 = new Window(10.0, 10.0, 10.0, "tinted");
        Window window5 = new Window(25.0, 25.0, 25.0, "transparent");
        Window window6 = new Window(10.0, 10.0, 10.0, "tinted");

        windowsSet.add(window1);
        windowsSet.add(window2);
        windowsSet.add(window3);
        windowsSet.add(window4);
        windowsSet.add(window5);
        windowsSet.add(window6);

        for (Window window : windowsSet) {
            System.out.println(window);
        }
    }
}
