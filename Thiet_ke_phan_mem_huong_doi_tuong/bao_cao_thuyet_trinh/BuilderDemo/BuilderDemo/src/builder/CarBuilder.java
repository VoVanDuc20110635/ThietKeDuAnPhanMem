package builder;

import product.Car;

public class CarBuilder {
    private int id; private String brand; private String model;
    private String color; private int nbrDoors;
    private String screenType; private double weight;
    private double height;
    public Car build(){
        return new
                Car(id,brand,model,
                color,nbrDoors,screenType,
                weight,height);
    }
    public CarBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public CarBuilder setModel(String model) {
        this.model=model;
        return this;
    }
    public CarBuilder setColor(String color) {
        this.color=color;
        return this;
    }
    public CarBuilder setNbrDoors(int nbrDoors) {
        this.nbrDoors = nbrDoors;
        return this;
    }
    public CarBuilder setScreenType(String screenType) {
        this.screenType = screenType;
        return this;
    }
    public CarBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }
    public CarBuilder setHeight(double height) {
        this.height = height;
        return this;
    }
}








