package com.soongjamm.coordinate;

import com.soongjamm.helper.NumberRange;

public class LimitedPoint implements Point {

    private final Number value;

    public LimitedPoint(NumberRange numberRange, Number value) {
        if (not(numberRange.contains(value))) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    private boolean not(boolean bool) {
        return !bool;
    }

    @Override
    public Number value() {
        return value;
    }
}
