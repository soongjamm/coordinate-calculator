package com.soongjamm.figure;

import com.soongjamm.number.Add;
import com.soongjamm.number.Multiply;
import com.soongjamm.number.Subtract;

import java.util.List;

public class Figures {

    public Figure make(List<Point> points) {
        if (points.size() == 1) {
            return points.get(0);
        }
        if (points.size() == 2) {
            return new Line(points.get(0), points.get(1));
        }
        if (points.size() == 4 && isRectangle(points)) {
            return new Rectangle(points);
        }
        throw new UnsupportedOperationException();
    }

    private boolean isRectangle(List<Point> points) {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);
        Point p4 = points.get(3);
        return (isOrthogonal(p1, p2, p3) && isOrthogonal(p2, p3, p4) && isOrthogonal(p3, p4, p1))
                || (isOrthogonal(p2, p3, p1) && isOrthogonal(p3, p1, p4) && isOrthogonal(p1, p4, p2))
                || (isOrthogonal(p3, p1, p2) && isOrthogonal(p1, p2, p4) && isOrthogonal(p2, p4, p3));
    }

    private boolean isOrthogonal(Point a, Point b, Point c) {
        return
                new Add(
                        new Multiply(
                                new Subtract(b.x().value(), a.x().value()), new Subtract(b.x().value(), c.x().value())),
                        new Multiply(
                                new Subtract(b.y().value(), a.y().value()), new Subtract(b.y().value(), c.y().value()))
                ).doubleValue() == 0;
    }

}
