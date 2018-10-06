package com.ankur.practice.extreme;

import java.util.Comparator;

public class Pair<K, V> implements Comparable {
    K key;
    V value;

    public Pair() {
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {

        if (Integer.valueOf((Integer)this.getKey()) >= Integer.valueOf((Integer) ((Pair) o).getKey()))
            return 1;
        else return -1;
    }
}
