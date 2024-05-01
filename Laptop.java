package LaptopStore;

import java.util.Objects;

public class Laptop {
    private String brand;
    private int ram;
    private int storageCapacity;
    private String operatingSystem;
    private int displaySize;
    private String color;

    public Laptop(String brand, int ram, int storageCapacity, String operatingSystem,int displaySize, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.operatingSystem = operatingSystem;
        this.displaySize = displaySize;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int displaySize(){
        return displaySize;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram &&
                storageCapacity == laptop.storageCapacity &&
                Objects.equals(brand, laptop.brand) &&
                Objects.equals(operatingSystem, laptop.operatingSystem) &&
                Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, storageCapacity, operatingSystem, color);
    }

}

