package lesson15;

import hometask12.ClothSizes;

import java.io.Serializable;

public class GenericModule<T extends Comparable, V extends ClothSizes & Serializable, K> {

    private T t;
    private V v;
    private K k;

    public GenericModule(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }


}
