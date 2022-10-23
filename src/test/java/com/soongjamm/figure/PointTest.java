package com.soongjamm.figure;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    void create_coordinate_with_string() {
        Point sut = new Point("1", "2");

        assertThat(sut.x().value()).isEqualTo(1);
        assertThat(sut.y().value()).isEqualTo(2);
    }

    @Test
    void create_coordinate_with_point() {
        Point sut = new Point(new DefaultPosition(1), new DefaultPosition(2));

        assertThat(sut.x()).isEqualTo(new DefaultPosition(1));
        assertThat(sut.y()).isEqualTo(new DefaultPosition(2));
    }
}
