package com.gaohan.gmall.mock.util;

/**
 * @author shkstart
 * @create 2020-02-06 21:49
 */
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}
