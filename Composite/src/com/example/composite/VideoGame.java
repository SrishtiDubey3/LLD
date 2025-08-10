package com.example.composite;

// Leaf Class

public class VideoGame extends Product {
	
	// Calls the constructor of the parent class(Product) with the same two arguments, so that we don't have to manually set them in the Book constructor(which's repetitive) 
	public VideoGame(String title, double price) {
		super(title, price);
	}
	
	// Interface method implementation
	@Override
	public double calculatePrice() {
		return getPrice();
	}

}
