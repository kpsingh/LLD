package com.java.lld.designpatterns.creational.builder;


import org.junit.jupiter.api.Test;

public class DatabaseBuilderTest {

    @Test
    public void testDatabaseBuilder() {
        Database database = Database.builder()
                .mysql()
                .host("localhost")
                .withCredentials("user", "password")
                .port(1521)
                .build();
    }


}
