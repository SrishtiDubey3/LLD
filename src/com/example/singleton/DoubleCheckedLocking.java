package com.example.singleton;

public class DoubleCheckedLocking {
	// The single instance, initially null, marked as volatile
    private static volatile DoubleCheckedLocking instance;
    
    // Private constructor to prevent instantiation
    private DoubleCheckedLocking() {}
    
    // Public method to get the instance
    public static DoubleCheckedLocking getInstance() {
        // First check (not synchronized)n
        if (instance == null) {
            // Synchronize on the class object
            synchronized (DoubleCheckedLocking.class) {
                // Second check (synchronized)
                if (instance == null) {
                    // Create the instance
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        // Return the instance (either newly created or existing)
        return instance;
    }
}
