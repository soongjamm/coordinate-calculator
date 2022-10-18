package com.soongjamm.helper;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public record NumberRange(long min, long max) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1905122041950251207L;

    public boolean contains(int value) {
        return min <= value && value <= max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberRange that)) return false;
        return min == that.min && max == that.max;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }
}
