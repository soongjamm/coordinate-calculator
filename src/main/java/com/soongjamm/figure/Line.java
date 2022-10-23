package com.soongjamm.figure;

import com.soongjamm.number.Add;
import com.soongjamm.number.Difference;
import com.soongjamm.number.Power;
import com.soongjamm.number.SquareRoot;

public record Line(Point first, Point second) implements Figure {

    public Number length() {
        return
                new SquareRoot(
                        new Add(
                                new Power(new Difference(first.x().value(), second.x().value()), 2),
                                new Power(new Difference(first.y().value(), second.y().value()), 2)
                        ));
    }
}
