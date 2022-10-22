package com.soongjamm.api;

import com.soongjamm.coordinate.Coordinate;

import java.util.Arrays;
import java.util.List;

record CoordinateListAsString(String value) {

    List<Coordinate> parse() {
        return Arrays.stream(value.split("-"))
                .map(CoordinateAsString::new)
                .map(CoordinateAsString::parse)
                .toList();
    }
}
