package com.soongjamm.helper;

public class Power extends Number {

    private final Number base;
    private final Number exponent;

    public Power(Number base, Number exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public int intValue() {
        return (int) Math.pow(base.intValue(), exponent.intValue());
    }

    @Override
    public long longValue() {
        return (long) Math.pow(base.longValue(), exponent.longValue());
    }

    @Override
    public float floatValue() {
        return (float) Math.pow(base.floatValue(), exponent.floatValue());
    }

    @Override
    public double doubleValue() {
        return Math.pow(base.doubleValue(), exponent.doubleValue());
    }
}
