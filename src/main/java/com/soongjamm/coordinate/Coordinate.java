package com.soongjamm.coordinate;

import com.soongjamm.number.NumberAsString;
import com.soongjamm.number.NumberRange;

import java.util.Objects;

public class Coordinate {
    private final Position x;
    private final Position y;

    public Coordinate(Position x, Position y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(String x, String y) {
        this(
                new LimitedPosition(new NumberRange(0, 24), new NumberAsString(x)),
                new LimitedPosition(new NumberRange(0, 24), new NumberAsString(y))
        );
    }

    public Position x() {
        return this.x;
    }

    public Position y() {
        return this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate that)) return false;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
