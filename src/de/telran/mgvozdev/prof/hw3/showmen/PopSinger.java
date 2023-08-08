package de.telran.mgvozdev.prof.hw3.showmen;

public class PopSinger implements Danceable, Singable {

    @Override
    public void dance() {
        System.out.println("Pop-singer is flexing");
    }

    @Override
    public void sing() {
        System.out.println("Pop-singer is screaming");
    }
}
