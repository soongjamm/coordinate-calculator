package com.soongjamm.coordinate;

import com.soongjamm.helper.NumberAsString;
import com.soongjamm.helper.NumberRange;

public class Coordinate {
    private final Point x;
    private final Point y;

    public Coordinate(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(String x, String y) {
        this(
                new LimitedPoint(new NumberRange(0, 24), new NumberAsString(x)),
                new LimitedPoint(new NumberRange(0, 24), new NumberAsString(y))
        );
    }

    public Point x() {
        return this.x;
    }

    public Point y() {
        return this.y;
    }

}
