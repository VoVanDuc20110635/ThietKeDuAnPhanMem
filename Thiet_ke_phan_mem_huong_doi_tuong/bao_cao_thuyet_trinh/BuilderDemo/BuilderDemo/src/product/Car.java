package product;

public class Car {
    private int id; private String brand; private String model;
    private String color; private int nbrDoors;
    private String screenType; private double weight;
    private double height;

    public Car(int id, String brand, String model, String color,
               int nbrDoors, String screenType, double weight,
               double height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbrDoors = nbrDoors;
        this.screenType = screenType;
        this.weight = weight;
        this.height = height;
    }
    public String toString(){
        return "Id: " + id +  "; Brand: " + brand + "; Model: " + model + "; Color: " + color +"; Number of doors: " + nbrDoors +
                "; Screen type: " + screenType + "; Weight: " + weight + "; Height: " + height;

    }

}
