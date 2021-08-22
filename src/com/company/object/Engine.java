package com.company.object;

public class Engine {
    private int horsePower;
    private double weight;
    private double millage;

    public Engine(int horsePower, double weight, double millage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.millage = millage;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMillage() {
        return millage;
    }

    public void setMillage(double millage) {
        this.millage = millage;
    }
}
