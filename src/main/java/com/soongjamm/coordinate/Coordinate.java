package com.soongjamm.coordinate;

import com.soongjamm.helper.NumberAsString;

public class Coordinate {
    private final Point x;
    private final Point y;

    public Coordinate(String x, String y) {
        this(new Point(new NumberAsString(x)), new Point(new NumberAsString(y)));
    }

    public Coordinate(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public Point x() {
        return this.x;
    }

    public Point y() {
        return this.y;
    }

}
