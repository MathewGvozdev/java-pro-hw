package de.telran.mgvozdev.prof.hw4.auto;

public interface AutoService {

    Auto repairCar(Auto car);

    void replaceTires(Auto car, Tire tireType);
}
