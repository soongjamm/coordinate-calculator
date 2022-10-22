package com.soongjamm.helper;

public class Difference extends Number {

    private final Number one;
    private final Number other;

    public Difference(Number one, Number other) {
        this.one = one;
        this.other = other;
    }

    @Override
    public int intValue() {
        return Math.abs(one.intValue() - other.intValue());
    }

    @Override
    public long longValue() {
        return Math.abs(one.longValue() - other.longValue());
    }

    @Override
    public float floatValue() {
        return Math.abs(one.floatValue() - other.floatValue());
    }

    @Override
    public double doubleValue() {
        return Math.abs(one.doubleValue() - other.doubleValue());
    }
}
