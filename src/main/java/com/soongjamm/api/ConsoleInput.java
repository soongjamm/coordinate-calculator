package com.soongjamm.api;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private final Scanner keyboard = new Scanner(System.in);

    @Override
    public String input() {
        return keyboard.nextLine();
    }

}
