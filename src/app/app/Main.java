package app.app;

import app.Order;
import app.OrderBuilder;

public class Main {
    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();


        Order orderA = orderBuilder.addTShirt("червона", "Active sports")
                .addCap("біла", "Smart caps")
                .build();
        System.out.println("Замовлення А:");
        orderA.printOrderDetails();
        System.out.println();

        Order orderB = orderBuilder.addTShirt("синя", "Active sports")
                .addCap("чорна", "Smart caps")
                .build();
        System.out.println("Замовлення В:");
        orderB.printOrderDetails();
    }
}
