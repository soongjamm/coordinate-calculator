package com.soongjamm.api;

import com.soongjamm.figure.Point;

import java.util.Arrays;
import java.util.List;

record CoordinateListAsString(String value) {

    List<Point> parse() {
        return Arrays.stream(value.split("-"))
                .map(CoordinateAsString::new)
                .map(CoordinateAsString::parse)
                .toList();
    }
}
