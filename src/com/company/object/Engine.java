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
       new Engine(horsePower, this.weight, this.millage);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        new Engine(this.horsePower, weight, this.millage);
    }

    public double getMillage() {
        return millage;
    }

    public void setMillage(double millage) {
        new Engine(this.horsePower, this.weight, millage);
    }
}
