package com.soongjamm.coordinate;

import com.soongjamm.helper.NumberRange;

public class LimitedPoint extends Point {

    public LimitedPoint(NumberRange numberRange, Number value) {
        super(value);
        if (not(numberRange.contains(value))) {
            throw new IllegalArgumentException();
        }
    }

    private boolean not(boolean bool) {
        return !bool;
    }
}
