package com.soongjamm.helper;

import java.util.Objects;

public class LimitedNumber extends Number {

    private final NumberRange numberRange;
    private final int value;

    public LimitedNumber(NumberRange numberRange, int value) {
        if (not(numberRange.contains(value))) {
            throw new IllegalArgumentException();
        }
        this.numberRange = numberRange;
        this.value = value;
    }

    private boolean not(boolean bool) {
        return !bool;
    }

    @Override
    public int intValue() {
        return this.value;
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
        if (!(o instanceof LimitedNumber that)) return false;
        return value == that.value && Objects.equals(numberRange, that.numberRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberRange, value);
    }
}
