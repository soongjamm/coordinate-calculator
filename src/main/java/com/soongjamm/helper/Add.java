package com.soongjamm.helper;

public class Add extends Number {

    private final Number one;
    private final Number other;

    public Add(Number one, Number other) {
        this.one = one;
        this.other = other;
    }

    @Override
    public int intValue() {
        return one.intValue() + other.intValue();
    }

    @Override
    public long longValue() {
        return one.longValue() + other.longValue();
    }

    @Override
    public float floatValue() {
        return one.floatValue() + other.floatValue();
    }

    @Override
    public double doubleValue() {
        return one.doubleValue() + other.doubleValue();
    }
}
