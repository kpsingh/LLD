package com.java.lld;


import com.java.lld.designpatterns.creational.builder.Database;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

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
