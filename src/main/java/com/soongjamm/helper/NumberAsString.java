package com.soongjamm.helper;

import java.util.Objects;

public class NumberAsString extends Number {

    private final String value;

    public NumberAsString(String value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return Integer.parseInt(this.value);
    }

    @Override
    public long longValue() {
        return Long.parseLong(this.value);
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("floatValue()는 지원하지 않습니다.");
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberAsString that)) return false;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
