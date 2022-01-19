package se.lexicon.susanne;

//12. Create a new class and call it Car. Add fields for Id, Brand and Model + getters and setters. Create a new hashMap of type <Integer,Car> and populate it with elements

public class Car {
    private String id;
    private String brand;
    private String model;

    public Car(String id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
