package app;

import app.app.TShirt;

public class Order {
    private TShirt tShirt;
    private Cap cap;
    public Order(TShirt tShirt, Cap cap) {
        this.tShirt = tShirt;
        this.cap = cap;
    }
    public double getTotalCost() {
        double tShirtPrice = 10.0;
        double capPrice = 5.0;
        return tShirtPrice + capPrice;
    }
    public void printOrderDetails() {
        System.out.println("Футболка: " + tShirt.getColor() + ", " + tShirt.getManufacturer());
        System.out.println("Кепка: " + cap.getColor() + ", " + cap.getManufacturer());
        System.out.println("Загальна вартість замовлення: " + getTotalCost() + " у.о.");
    }
}
