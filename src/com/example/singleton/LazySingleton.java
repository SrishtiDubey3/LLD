package com.example.singleton;

//public class LazySingleton {
//	// The single instance -> initially 'null'
//	private static LazySingleton instance;
//
//	// Private constructor to prevent instantiation(preventing external objects from creating new instances)
//    private LazySingleton() {}
//
//    // Public method to get the instance
//    public static LazySingleton getInstance() {
//    	// Check if instance is null
//        if (instance == null) {
//        	// If null, create a new instance
//            instance = new LazySingleton();
//        }
//        // Return the instance (either newly created or existing)
//        return instance;
//    }
//}


// Lazy Singleton is thread-unsafe

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            // Simulate delay to increase chance of race condition
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton();
        }
        return instance;
    }
}
