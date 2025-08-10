package com.example.composite;

public class Main {

	public static void main(String[] args) {
		
		DeliveryService dS = new DeliveryService();

        dS.setupOrder(
            new CompositeBox(
                new VideoGame("1", 100)
            ),
            new CompositeBox(
                new CompositeBox(
                    new Book("2", 200),
                    new Book("3", 300)
                ),
                new VideoGame("4", 400),
                new VideoGame("5", 500)
            )
        );

        System.out.println("Total Order Price: " + dS.calculateOrderPrice());
        
	}

}
