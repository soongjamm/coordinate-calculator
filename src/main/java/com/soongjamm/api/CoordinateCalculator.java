package com.soongjamm.api;

import com.soongjamm.figure.Figure;
import com.soongjamm.figure.Figures;
import com.soongjamm.figure.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CoordinateCalculator {

    private final Logger logger;
    private final Input input;
    private final Figures figures;

    public CoordinateCalculator(Input input) {
        this.logger = LoggerFactory.getLogger(CoordinateCalculator.class);
        this.input = input;
        this.figures = new Figures();
    }

    public void start() {
        logger.info("좌표를 입력하세요.");
        List<Point> points = new CoordinateListAsString(input.input()).parse();
        Figure figure = figures.make(points);
        logger.info("{}", figure);
    }
}
