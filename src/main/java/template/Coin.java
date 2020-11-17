package template;

import template.ICalculate;

public abstract class Coin implements ICalculate {

    protected abstract double getValue();

    public double calculate(double value) {
        return value;
    }
}
