package com.soongjamm.helper;

import java.util.Objects;

public class Power extends Number {

    private final Number base;
    private final Number exponent;

    public Power(Number base, Number exponent) {
        this.base = Objects.requireNonNull(base);
        this.exponent = Objects.requireNonNull(exponent);
    }

    @Override
    public int intValue() {
        int temp = base.intValue();
        for (int i = 1; i < exponent.intValue() ; i++) {
            temp *= temp;
        }
        return temp;
    }

    @Override
    public long longValue() {
        long temp = base.longValue();
        for (int i = 1; i < exponent.intValue() ; i++) {
            temp *= temp;
        }
        return temp;
    }

    @Override
    public float floatValue() {
        float temp = base.floatValue();
        for (int i = 1; i < exponent.intValue() ; i++) {
            temp *= temp;
        }
        return temp;
    }

    @Override
    public double doubleValue() {
        double temp = base.doubleValue();
        for (int i = 1; i < exponent.intValue() ; i++) {
            temp *= temp;
        }
        return temp;
    }
}
