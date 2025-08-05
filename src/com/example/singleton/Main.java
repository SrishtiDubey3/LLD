package com.example.singleton;

//public class Main {
//
//	public static void main(String[] args) {
//		
//		  LazySingleton obj1 = LazySingleton.getInstance();
//        LazySingleton obj2 = LazySingleton.getInstance();
//
//        System.out.println("HashCode of obj1: " + obj1.hashCode());
//        System.out.println("HashCode of obj2: " + obj2.hashCode());
//
//        if (obj1 == obj2) {
//            System.out.println("Both references point to the same instance (Singleton works).");
//        } else {
//            System.out.println("Different instances (Singleton FAILED).");
//        }
//	}
//
//}



// Main to check lazy singleton is not thread-safe

//public class Main {
//
//    public static void main(String[] args) {
//        // Create multiple threads that try to get the singleton instance
//        Runnable task = () -> {
//            LazySingleton instance = LazySingleton.getInstance();
//            System.out.println("Instance hashcode: " + instance.hashCode());
//        };
//
//	    // Create multiple threads (20 or more to provoke race condition)
//	    for (int i = 0; i < 20; i++) {
//	          Thread th = new Thread(task);
//	          th.start();
//	    }
//    }
//}




// Main function for "Double Checked Locking Singleton"

//public class Main {
//
//    public static void main(String[] args) {
//        // Create multiple threads that try to get the singleton instance
//        Runnable task = () -> {
//            DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
//            System.out.println("Instance hashcode: " + instance.hashCode());
//        };
//
//	    // Create multiple threads (20 or more to provoke race condition)
//	    for (int i = 0; i < 20; i++) {
//	          Thread th = new Thread(task);
//	          th.start();
//	    }
//    }
//}




//Main function for "Eager Singleton"

//public class Main {
//
// public static void main(String[] args) {
//     // Create multiple threads that try to get the singleton instance
//     Runnable task = () -> {
//         EagerInitialization instance = EagerInitialization.getInstance();
//         System.out.println("Instance hashcode: " + instance.hashCode());
//     };
//
//	    // Create multiple threads (20 or more to provoke race condition)
//	    for (int i = 0; i < 20; i++) {
//	          Thread th = new Thread(task);
//	          th.start();
//	    }
// }
//}



//Main function for "Enum Singleton"

public class Main {

	public static void main(String[] args) {
	   // Create multiple threads that try to get the singleton instance
	   Runnable task = () -> {
	       EnumSingleton instance = EnumSingleton.INSTANCE;
	       System.out.println("Instance hashcode: " + instance.hashCode());
	   };

	    // Create multiple threads (20 or more to provoke race condition)
	    for (int i = 0; i < 20; i++) {
	          Thread th = new Thread(task);
	          th.start();
	    }
	}
}
