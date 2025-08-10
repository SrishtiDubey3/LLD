package com.example.composite;

// An abstract class that implements - Box ; Used as a base for concrete products.
public abstract class Product implements Box {
	
	// Two protected final variables
	protected final String title;
    protected final double price;

    // Constructor
    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Getter function
    public double getPrice() {
        return price;
    }

}
