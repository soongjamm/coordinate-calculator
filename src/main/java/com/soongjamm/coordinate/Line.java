package com.soongjamm.coordinate;

import com.soongjamm.helper.Add;
import com.soongjamm.helper.Difference;
import com.soongjamm.helper.Power;
import com.soongjamm.helper.SquareRoot;

public record Line(Coordinate first, Coordinate second) {

    public Number length() {
        return
                new SquareRoot(
                        new Add(
                                new Power(new Difference(first.x().value(), second.x().value()), 2),
                                new Power(new Difference(first.y().value(), second.y().value()), 2)
                        ));
    }
}
