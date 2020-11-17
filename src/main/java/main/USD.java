package main;

import template.Coin;

import java.io.Serializable;

public class USD extends Coin implements Serializable {

    private final double value = 3.52;

    public double getValue() {

        return value;
    }

    public double calculate(double input) {

        return input * getValue();
    }
}
