package com.java.lld;

import com.java.lld.designpatterns.creational.builder.DatabaseType;
import com.java.lld.designpatterns.creational.builder.Database_v2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseBuilderTest_V2 {
    @Test
    void shouldCreateValidDatabase() {
        Database_v2 db = Database_v2.builder()
                .withHost("localhost")
                .withPort(1521)
                .withName("TestDB")
                .withCredentials("admin", "secret123")
                .oracle()  // Choosing Oracle DB
                .compressed()  // Enabling compression
                .build();

        assertNotNull(db);
        assertEquals("localhost", db.host());
        assertEquals(1521, db.port());
        assertEquals("TestDB", db.name());
        assertEquals("admin", db.userName());
        assertEquals("secret123", db.password());
        assertEquals(DatabaseType.ORACLE, db.type());
        assertTrue(db.compressed());
    }

    @Test
    void shouldThrowExceptionForNullHost() {
        Exception exception = assertThrows(NullPointerException.class, () ->
                Database_v2.builder()
                        .withPort(1521)
                        .oracle()
                        .build()
        );
        assertEquals("Host cannot be null", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForNullPort() {
        Exception exception = assertThrows(NullPointerException.class, () ->
                Database_v2.builder()
                        .withHost("localhost")
                        .oracle()
                        .build()
        );
        assertEquals("Port cannot be null", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForNullDatabaseType() {
        Exception exception = assertThrows(NullPointerException.class, () ->
                Database_v2.builder()
                        .withHost("localhost")
                        .withPort(1521)
                        .build()
        );
        assertEquals("Database type cannot be null", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForInvalidOraclePort() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Database_v2.builder()
                        .withHost("localhost")
                        .withPort(3306) // Invalid port for Oracle
                        .oracle()
                        .build()
        );
        assertEquals("Oracle DB must use port 1521", exception.getMessage());
    }

    @Test
    void shouldCreateMysqlDatabase() {
        Database_v2 db = Database_v2.builder()
                .withHost("192.168.1.100")
                .withPort(3306)
                .withName("MySQLDB")
                .withCredentials("root", "mysqlpass")
                .mysql()
                .build();

        assertNotNull(db);
        assertEquals("192.168.1.100", db.host());
        assertEquals(3306, db.port());
        assertEquals("MySQLDB", db.name());
        assertEquals(DatabaseType.MYSQL, db.type());
        assertFalse(db.compressed()); // Default should be false
    }

    @Test
    void shouldBeImmutable() {
        Database_v2 db1 = Database_v2.builder()
                .withHost("localhost")
                .withPort(1521)
                .withName("DB1")
                .withCredentials("admin", "pass")
                .oracle()
                .build();

        Database_v2 db2 = Database_v2.builder()
                .withHost("localhost")
                .withPort(1521)
                .withName("DB1")
                .withCredentials("admin", "pass")
                .oracle()
                .build();

        // Even if both objects have the same values, they are separate instances
        assertNotSame(db1, db2);
    }
}
