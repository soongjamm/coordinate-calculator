package com.soongjamm.coordinate;

import com.soongjamm.helper.NumberRange;

public class LimitedPosition implements Position {

    private final Number value;

    public LimitedPosition(NumberRange numberRange, Number value) {
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
