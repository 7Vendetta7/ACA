package com.company.object;

public class Car {
    private final int productionYear;
    private final String model;
    private final String mark;
    private final Engine engine;

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        Engine cloneEngine = new Engine(engine.getHorsePower(), engine.getWeight(), engine.getMillage());
        this.engine = cloneEngine;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine;
    }
}
