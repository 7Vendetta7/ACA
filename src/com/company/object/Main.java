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

    public static String reverse(String word){
        if (word.length() == 1){
            return word;
        }
        return word.charAt(word.length()-1) + reverse(word.substring(0, word.length()-1));
    }

    public static void main(String[] args) {

        Engine engine = new Engine(120, 5, 16);
        Car car = new Car(2021, "CLK", "Mercedes", engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower());


       reverse("Barev");
    }
}

