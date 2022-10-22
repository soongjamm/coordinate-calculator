package com.soongjamm.api;

import com.soongjamm.coordinate.Coordinate;

record CoordinateAsString(String value) {

    Coordinate parse() {
        String[] positions = value.split(",");
        return new Coordinate(positions[0].replace("(", "").trim(), positions[1].replace(")", "").trim());
    }
}
