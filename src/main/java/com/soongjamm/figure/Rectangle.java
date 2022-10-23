package com.soongjamm.figure;

import com.soongjamm.coordinate.Coordinate;
import com.soongjamm.number.Multiply;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Rectangle {

    private final Set<Coordinate> coordinates = new HashSet<>(4);

    public Rectangle(Coordinate c1, Coordinate c2, Coordinate c3, Coordinate c4) {
        this.coordinates.addAll(Set.of(c1, c2, c3, c4));
    }

    public Number area() {
        List<Coordinate> copied = new ArrayList<>(coordinates);
        Coordinate base = copied.remove(0);
        copied.removeIf(oppositeSideCoordinate(base));

        return new Multiply(
                new Line(base, copied.get(0)).length(),
                new Line(base, copied.get(1)).length()
        );
    }

    private Predicate<Coordinate> oppositeSideCoordinate(Coordinate one) {
        return each -> !one.x().equals(each.x()) && !one.y().equals(each.y());
    }
}
