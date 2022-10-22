package com.soongjamm.coordinate;

import com.soongjamm.helper.NumberAsString;
import com.soongjamm.helper.NumberRange;

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

}
