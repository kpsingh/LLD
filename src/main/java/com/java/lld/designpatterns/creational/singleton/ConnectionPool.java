package com.java.lld.designpatterns.creational.singleton;

/*
    We need singleton when we want to create a shared resource. In order to make this shared resource unifirm across, we make only one
    instance so that there should not be any consistency issue.
 */


public class ConnectionPool {
    // step 1 : initialize static member
    private static volatile ConnectionPool INSTANCE = null; // Eager initialization - slow startup

    // step 2 : Male the private constructor
    private ConnectionPool() {
    }

    // step 3 : make the public static method to return the instance
    public static ConnectionPool getInstance() {
        if (INSTANCE == null) {
            synchronized (ConnectionPool.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }

        return INSTANCE;
    }


    // Cons of this approach:
    // 1. SRP violation
    // 2. Thread safety is not guaranteed
    // 3. Performance is not guaranteed in thread-safe mode - Double checked locking
    // Enum implementation, inner static class

}
