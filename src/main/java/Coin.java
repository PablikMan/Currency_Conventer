public abstract class Coin implements ICalculate{

    abstract double getValue();

    public double calculate(double value) {
        return value;
    }
}
