package com.soongjamm.figure;

import com.soongjamm.number.Multiply;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Rectangle {

    private final Set<Point> points = new HashSet<>(4);

    public Rectangle(Point c1, Point c2, Point c3, Point c4) {
        this.points.addAll(Set.of(c1, c2, c3, c4));
    }

    public Number area() {
        List<Point> copied = new ArrayList<>(points);
        Point base = copied.remove(0);
        copied.removeIf(oppositeSideCoordinate(base));

        return new Multiply(
                new Line(base, copied.get(0)).length(),
                new Line(base, copied.get(1)).length()
        );
    }

    private Predicate<Point> oppositeSideCoordinate(Point one) {
        return each -> !one.x().equals(each.x()) && !one.y().equals(each.y());
    }
}
