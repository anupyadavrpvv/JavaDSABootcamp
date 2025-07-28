package com.anup.tree;

public class Pair<K, V> {
    private Node key;
    private Integer value;

    public Pair(Node key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Node getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    public void setKey(Node key) {
        this.key = key;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
