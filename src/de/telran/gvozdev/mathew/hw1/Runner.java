package de.telran.gvozdev.mathew.hw1;

public class Runner {

    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.fullName = "Иван";
        ivan.talk();
        System.out.println(ivan.fullName + " прошел " + ivan.move() + " шагов");

        Person petr = new Person("Петр", 20);
        petr.talk();
        System.out.println(petr.fullName + " прошел " + petr.move() + " шагов");

        Phone iphone = new Phone("+144524978", "Iphone", 180);
        Phone samsung = new Phone("+187478291", "Samsung", 195);
        Phone xiaomi = new Phone("+162940900", "Xiaomi", 200);

        printData(iphone);
        iphone.receiveCall("Boss");
        iphone.call("Irina");

        printData(samsung);
        samsung.receiveCall("Wife");
        samsung.call("Artem");

        printData(xiaomi);
        xiaomi.receiveCall("Service");
        xiaomi.call("Chinese");
    }

    static void printData(Phone phone) {
        System.out.println("Model: " + phone.model + ";\tNumber: " + phone.getNumber() + ";\tWeight: " + phone.getWeight());
    }
}
