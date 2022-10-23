package com.soongjamm.coordinate;

import com.soongjamm.number.NumberRange;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LimitedPosition that)) return false;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
