package com.soongjamm;

import com.soongjamm.api.Calculator;
import com.soongjamm.api.ConsoleInput;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ConsoleInput());
        calculator.start();
    }
}
