package com.company.object;


/**
 * An immutable object is an object whose internal state remains constant after it has been entirely created.
 * Design two classes named Car and Engine. Car class must be immutable, but Engine not.
 * Car fields -> productionYear, model, mark and Engine.
 * Engine fields -> horsePower, weight, mileage.
 * Note: Don't use clone() method of Object class.
 * Simple result example:
 * public class Main {
 * public static void main(String[] args) {
 * Engine engine = new Engine(..., ..., ...);
 * Car car = new Car(..., ..., ..., engine);
 * System.out.println(car.getEngine().getHorsePower());
 * engine.setHorsePower(12);
 * System.out.println(car.getEngine().getHorsePower()); // Must not be changed as car object is immutable
 * }
 * }
 *
 * @author Argishti_Tigranyan
 */

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(102, 10, 20);
        Car car = new Car(2021, "ersfd", "egrfr", engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower());
    }
}
