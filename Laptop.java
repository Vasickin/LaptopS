package LaptopStore;

import java.util.Objects;

public class Laptop {
    private String brabd;
    private int ram;
    private int storrageCapacity;
    private String operationSystem;
    private int displaySize;
    private String color;

    public Laptop(String brand, int ram, int storageCapacity, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

}