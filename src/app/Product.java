package app;

public class Product {
    private String color;
    private String manufacturer;
    public Product(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }
    public String getColor() {
        return color;
    }
    public String getManufacturer() {
        return manufacturer;
    }
}
