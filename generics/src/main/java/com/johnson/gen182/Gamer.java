package com.johnson.gen182;

public class Gamer<K,V,T> {
    private K name;
    private V alias;
    private T range;

    public Gamer(K name, V alias, T range) {
        this.name = name;
        this.alias = alias;
        this.range = range;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getAlias() {
        return alias;
    }

    public void setAlias(V alias) {
        this.alias = alias;
    }

    public T getRange() {
        return range;
    }

    public void setRange(T range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Gamer: " +
                "name=" + name +
                ", alias=" + alias +
                ", range=" + range;
    }
}
