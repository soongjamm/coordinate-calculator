package com.soongjamm.number;

public class SquareRoot extends Number {

    private final Number value;

    public SquareRoot(Number value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        throw new UnsupportedOperationException("intValue()는 지원하지 않습니다.");
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
        return Math.sqrt(value.doubleValue());
    }

}
