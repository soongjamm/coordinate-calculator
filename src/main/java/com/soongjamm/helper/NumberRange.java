package com.soongjamm.helper;

import java.util.Objects;

public record NumberRange(Number min, Number max) {

    public boolean contains(Number value) {
        if (value instanceof Integer that) {
            return min.intValue() <= that && that <= max.intValue();
        }
        if (value instanceof NumberAsString that) {
            return min.longValue() <= that.longValue() && that.longValue() <= max.longValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberRange that)) return false;
        return Objects.equals(min, that.min) && Objects.equals(max, that.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }
}
