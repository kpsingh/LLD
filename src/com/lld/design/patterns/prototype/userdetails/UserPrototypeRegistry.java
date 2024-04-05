package com.lld.design.patterns.prototype.userdetails;

public interface UserPrototypeRegistry {
    void addPrototype(User user);
    User getPrototype(UserType type);
    User clone(UserType type);
}
