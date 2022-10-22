package com.soongjamm.coordinate;

import java.util.Objects;

public class Point {

    private final Number value;

    public Point(Number value) {
        this.value = value;
    }

    public Number value() {
        return value.intValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return Objects.equals(value, point.value);
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
