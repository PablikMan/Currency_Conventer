package main;

import template.Coin;

import java.io.Serializable;

public class EUR extends Coin implements Serializable {

    private final double value = 4.23;

    @Override
    protected double getValue() {
        return value;
    }

    public double calculate(double input){
        return input * getValue();
    }
}
