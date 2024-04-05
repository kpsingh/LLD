package com.lld.design.patterns.prototype.configuration;

public class Client {
    public static void main(String[] args) {
        Configuration c1 = new Configuration("Red", true, "Hindi", false, 13, "Cosmic SM", ConfigurationType.ADVANCED);
        ConfigurationPrototypeRegistry  registry = new ConfigurationPrototypeRegistryImpl();
        registry.addPrototype(c1);
        System.out.println(c1);

        Configuration c2 = registry.getPrototype(ConfigurationType.ADVANCED).cloneObject();
        System.out.println(c2);


    }
}

