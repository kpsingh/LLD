package com.java.lld.designpatterns.creational.builder;

/*
    https://github.com/kanmaytacker/design-patterns/blob/master/notes/01-singleton-builder.md
 */

import lombok.Getter;

@Getter
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

    // Trick 1 : have static build method : Fluent Interfaces

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

        // step 4 : expose back out database object, copy back the object details.
        public Database build() {

            // Step 5 : If any global validation needs to be done, do it here before database object creation

            boolean isValid = validate();

            if (!isValid) {
                throw new IllegalArgumentException("Invalid port for database " + type);
            }

            Database database = new Database();
            database.host = this.host;
            database.userName = userName;
            database.password = password;
            database.port = this.port;
            database.type = this.type;
            this.name = name;
            return database;
        }

        private boolean validate() {
            // if database type is oracle then port should be 1521 , etc., basically any kind of validation we need.
            if (type == DatabaseType.ORACLE && port != 1521) {
                return false;
            }
            return true;
        }
    }
}
