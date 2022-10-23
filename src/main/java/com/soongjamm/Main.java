package com.soongjamm;

import com.soongjamm.api.CoordinateCalculator;
import com.soongjamm.api.ConsoleInput;

public class Main {
    public static void main(String[] args) {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator(new ConsoleInput());
        coordinateCalculator.start();
    }
}
