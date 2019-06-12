package com.johncross;

public class MultiplesImpl implements Multiples {

    @Override
    public String multipliesEvensByTen(Integer x) {
        return doesMultiplication(x);
    }

    public String doesMultiplication(Integer x) {
        if (x % 2 == 0) {
            Integer product = x * 10;
            String productAsString = product.toString();
            return x + " multiplied by ten is " + product + ". " + x + " is an even number.";
        } else {
            return x + " is not an even number and so won't be multiplied by ten.";
        }
    }
}
