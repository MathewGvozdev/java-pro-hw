package de.telran.mgvozdev.prof.hw10.children;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChildComparisonTest {

    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();
        children.add(new Child(150));
        children.add(new Child(145));
        children.add(new Child(160));
        children.add(new Child(130));
        children.add(new Child(155));

        Collections.sort(children);
        System.out.println(children);
    }
}
