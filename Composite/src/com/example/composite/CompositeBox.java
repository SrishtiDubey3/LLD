package com.example.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Composite class
public class CompositeBox implements Box {

	// Creates an empty list to store objects that implement the Box interface(another CompositeBox or SingleProductBox)
	private final List<Box> children = new ArrayList<>();

	// Constructor -> (Box... boxes) means varargs parameter, meaning you can pass any number of Box objects when creating a CompositeBox(including zero).
    public CompositeBox(Box... boxes) {
    	
    	// Converts the varargs array into a List<Box> and adds all those to 'children' list
        children.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
    	
    	// Calls calculatePrice() on each child box and turns the results into a stream of doubles and later adds them up and return
        return children.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();
    }

}
