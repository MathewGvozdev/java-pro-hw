package de.telran.mgvozdev.prof.hw2.zoo;

public class ZooTest {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog("Sharik", "brown");
        Animal cow = new Cow("Murka", "white-black");
        Animal lamb = new Lamb();

        String meat = "meat";
        String grass = "grass";

        System.out.println(cat);
        cat.eat(meat);
        cat.voice();
        cat.jump();
        cat.jump(4);

        System.out.println(dog);
        dog.voice();
        dog.eat(meat);

        System.out.println(cow);
        cow.voice();
        cow.eat(meat);
        cow.eat(grass);

        System.out.println(lamb);
        lamb.voice();
        lamb.eat(meat);
        lamb.eat(grass);
    }
}
