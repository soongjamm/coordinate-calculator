package com.soongjamm.figure;

import com.soongjamm.number.Multiply;

import java.util.*;
import java.util.function.Predicate;

public class Rectangle implements Quadrangle {

    private final Set<Point> points = new HashSet<>(4);

    public Rectangle(Collection<Point> points) {
        this.points.addAll(points);
    }

    @Override
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Objects.equals(points, rectangle.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
