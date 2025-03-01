package com.java.lld.designpatterns.creational.builder;

/*
    https://github.com/kanmaytacker/design-patterns/blob/master/notes/01-singleton-builder.md
 */
public class Database {
    private String host;
    private Integer port;
    private String name;
    private String userName;
    private String password;
    private DatabaseType type;
    private Boolean compressed;

    private Database() {
        // private constructor so that can't be instantiated from outside of this class
    }

    // Trick 1 : have static build method

    public static Builder builder() {
        return new Builder();
    }


    // Step 1 : Create the private static inner class
    public static class Builder {
        // Step 2: Copy the attributes from the outer class
        private String host;
        private Integer port;
        private String name;
        private String userName;
        private String password;
        private DatabaseType type;
        private Boolean compressed;

        // Step 3 create the setters for them

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        public Builder name(String name) {
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
    }
}
