package com.soongjamm.api;

import com.soongjamm.figure.Point;

record CoordinateAsString(String value) {

    Point parse() {
        String[] positions = value.split(",");
        return new Point(positions[0].replace("(", "").trim(), positions[1].replace(")", "").trim());
    }
}
