package com.java.lld.designpatterns.creational.builder;


import java.util.Objects;

// Immutable Database class using Record (Java 14+)
public record Database_v2(
        String host,
        Integer port,
        String name,
        String userName,
        String password,
        DatabaseType type,
        Boolean compressed
) {
    // Builder Pattern with Fluent API
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String host;
        private Integer port;
        private String name;
        private String userName;
        private String password;
        private DatabaseType type;
        private Boolean compressed = false; // Default false

        public Builder withHost(String host) {
            this.host = host;
            return this;
        }

        public Builder withPort(Integer port) {
            this.port = port;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCredentials(String userName, String password) {
            this.userName = userName;
            this.password = password;
            return this;
        }

        public Builder mysql() {
            this.type = DatabaseType.MYSQL;
            return this;
        }

        public Builder oracle() {
            this.type = DatabaseType.ORACLE;
            return this;
        }

        public Builder dynamoDB() {
            this.type = DatabaseType.DYNAMODB;
            return this;
        }

        public Builder compressed() {
            this.compressed = true;
            return this;
        }

        public Database_v2 build() {
            validate();
            return new Database_v2(host, port, name, userName, password, type, compressed);
        }

        private void validate() {
            Objects.requireNonNull(host, "Host cannot be null");
            Objects.requireNonNull(port, "Port cannot be null");
            Objects.requireNonNull(type, "Database type cannot be null");

            if (type == DatabaseType.ORACLE && port != 1521) {
                throw new IllegalArgumentException("Oracle DB must use port 1521");
            }
        }
    }
}
