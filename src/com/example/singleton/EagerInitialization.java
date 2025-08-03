package com.example.singleton;

public class EagerInitialization {
	// The single instance, created immediately
    private static final EagerInitialization instance = new EagerInitialization();
    
    // Private constructor to prevent instantiation
    private EagerInitialization() {}
    
    // Public method to get the instance
    public static EagerInitialization getInstance() {
        return instance;
    }
}