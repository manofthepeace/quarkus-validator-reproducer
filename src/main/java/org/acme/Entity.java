package org.acme;

import io.quarkus.arc.Arc;

@ValidEntity
public class Entity {

    private String test;

    Entity(String test) {
        this.test = test;
    }

    Entity() {}

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        PotatoConfig config = Arc.container().instance(PotatoConfig.class).get();
        return "Entity [test=" + test + "]" + config.test();
    }

}
