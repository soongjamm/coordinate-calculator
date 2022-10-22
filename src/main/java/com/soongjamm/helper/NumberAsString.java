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
        throw new UnsupportedOperationException("longValue()는 지원하지 않습니다.");
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("floatValue()는 지원하지 않습니다.");
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("doubleValue()는 지원하지 않습니다.");
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
