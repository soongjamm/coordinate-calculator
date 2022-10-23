package com.soongjamm.figure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FiguresTest {

    Figures sut;

    @BeforeEach
    void setUp() {
        sut = new Figures();
    }

    @Test
    void one_point_then_return_point() {
        Point point = new Point("1", "1");

        Figure result = sut.make(List.of(point));

        assertThat(result).isEqualTo(point);
    }

    @Test
    void two_points_then_return_line() {
        Point point1 = new Point("1", "1");
        Point point2 = new Point("2", "2");

        Figure result = sut.make(List.of(point1, point2));

        assertThat(result).isEqualTo(new Line(point1, point2));
    }

    @Test
    void rectangle() {
        /*
        *      (1,2)      (5,2)
        *      (1,1)      (5,1)
        * */
        Point point1 = new Point("1", "1");
        Point point2 = new Point("5", "1");
        Point point3 = new Point("1", "2");
        Point point4 = new Point("5", "2");

        Figure result = sut.make(List.of(point1, point2, point3, point4));

        assertThat(result).isEqualTo(new Rectangle(List.of(point1, point2, point3, point4)));
    }
}