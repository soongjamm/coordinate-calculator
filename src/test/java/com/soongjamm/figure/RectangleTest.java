package com.soongjamm.figure;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {

    @Test
    void square_area() {
        Point c1 = new Point("10", "10");
        Point c2 = new Point("22", "10");
        Point c3 = new Point("22", "18");
        Point c4 = new Point("10", "18");

        Rectangle sut = new Rectangle(c1, c2, c3, c4);

        assertThat(sut.area().intValue()).isEqualTo(96);
    }

}
