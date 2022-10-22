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
}
