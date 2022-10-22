package com.soongjamm.coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoordinateTest {

    @Test
    void create_coordinate_with_string() {
        Coordinate sut = new Coordinate("1", "2");

        assertThat(sut.x().value()).isEqualTo(1);
        assertThat(sut.y().value()).isEqualTo(2);
    }

    @Test
    void create_coordinate_with_point() {
        Coordinate sut = new Coordinate(new DefaultPosition(1), new DefaultPosition(2));

        assertThat(sut.x()).isEqualTo(new DefaultPosition(1));
        assertThat(sut.y()).isEqualTo(new DefaultPosition(2));
    }
}
