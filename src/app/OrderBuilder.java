package app;

import app.app.TShirt;

public class OrderBuilder {
    private TShirt tShirt;
    private Cap cap;

    public OrderBuilder() {}
    public OrderBuilder addTShirt(String color, String manufacturer) {
        this.tShirt = new TShirt(color, manufacturer);
        return this;
    }
    public OrderBuilder addCap(String color, String manufacturer) {
        this.cap = new Cap(color, manufacturer);
        return this;
    }
    public Order build() {
        return new Order(tShirt, cap);
    }
}
