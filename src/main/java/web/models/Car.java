package web.models;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private int series;
    private double engine;

    public Car(String model, int series, double engine) {
        this.model = model;
        this.series = series;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", engine=" + engine +
                '}';
    }
}
