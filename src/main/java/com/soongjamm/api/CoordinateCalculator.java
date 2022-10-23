package com.soongjamm.api;

import com.soongjamm.figure.Point;
import com.soongjamm.figure.Line;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CoordinateCalculator {

    private final Logger logger;
    private final Input input;

    public CoordinateCalculator(Input input) {
        this.logger = LoggerFactory.getLogger(CoordinateCalculator.class);
        this.input = input;
    }

    public void start() {
        logger.info("좌표를 입력하세요.");
        List<Point> points = new CoordinateListAsString(input.input()).parse();
        Line result = null;
        if (points.size() == 2) {
            result = new Line(points.get(0), points.get(1));
        }
        logger.info("두 점 사이의 거리는 {}", result.length().doubleValue());
    }
}
