package com.lld.design.patterns.prototype.userdetails;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry{

    Map<UserType, User> map = new HashMap<>();
    @Override
    public void addPrototype(User user) {
        map.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return map.get(type);
    }

    @Override
    public User clone(UserType type) {
        User copyUser = map.get(type).cloneObject();
        return copyUser;
    }
}
