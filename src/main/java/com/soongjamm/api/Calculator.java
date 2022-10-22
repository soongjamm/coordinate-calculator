package com.soongjamm.api;

import com.soongjamm.coordinate.Coordinate;
import com.soongjamm.coordinate.Line;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Calculator {

    private final Logger logger;
    private final Input input;

    public Calculator(Input input) {
        this.logger = LoggerFactory.getLogger(Calculator.class);
        this.input = input;
    }

    public void start() {
        logger.info("좌표를 입력하세요.");
        List<Coordinate> coordinates = new CoordinateListAsString(input.input()).parse();
        Line result = null;
        if (coordinates.size() == 2) {
            result = new Line(coordinates.get(0), coordinates.get(1));
        }
        logger.info("두 점 사이의 거리는 {}", result.length().doubleValue());
    }
}
