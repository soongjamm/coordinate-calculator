package com.soongjamm.coordinate;

import java.util.Objects;

public record DefaultPoint(Number value) implements Point {

    public Number value() {
        return value.intValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultPoint defaultPoint)) return false;
        return Objects.equals(value, defaultPoint.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Point{" +
                "value=" + value +
                '}';
    }
}
