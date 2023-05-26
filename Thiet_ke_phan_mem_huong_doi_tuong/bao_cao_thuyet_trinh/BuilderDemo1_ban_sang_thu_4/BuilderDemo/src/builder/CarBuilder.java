package builder;

import jdk.jshell.JShell;
import product.Car;

public class CarBuilder implements Builder {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int nbrDoors;
    private String screenType;
    private double weight;
    private double height;



    public String toString(){
        return "ID: "+id+"; Car: " + brand + " " + model + "; Color: " + color +"; Number of doors: " + nbrDoors +
                "; Screen type: " + screenType + "; Weight: " + weight + "; Height: " + height;

    }

    @Override
    public Car build(){
        return new Car(id,brand,model,color,nbrDoors,screenType,weight,height);
    }

    @Override
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder model(String model) {
        this.model=model;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color=color;
        return this;
    }

    @Override
    public Builder nbrDoors(int nbrDoors) {
        this.nbrDoors = nbrDoors;
        return this;
    }

    @Override
    public Builder screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }

    @Override
    public Builder weight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Builder height(double height) {
        this.height = height;
        return this;
    }
}
