package main;

import currency.Coins;
import template.Coin;

public class CoinFactory {

    public Coin getCoinInstance (Coins coin){

        switch (coin){
            case ILS:
                return new ILS();
            case USD:
                return new USD();
            case EUR:
                return new EUR();
            default:
                return null;
        }
    }
}
