package de.telran.mgvozdev.prof.hw4.auto;

public class Test {

    public static void main(String[] args) {
        Auto car = new ElectricCar(2020, "Tesla", "sport");
        car.turnOn();
        car.drive();
        car.breakDown();

        System.out.println(car);
        AutoService autoService = new ModernAutoService();
        System.out.println(autoService.repairCar(car));
        autoService.replaceTires(car, Tire.WINTER);
        System.out.println(car);
    }
}
