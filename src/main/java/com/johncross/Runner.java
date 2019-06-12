package com.johncross;

public class Runner {

    public static void main(String[] args) {

        Multiples multiples = new MultiplesImpl();
        String result = ((MultiplesImpl) multiples).doesMultiplication(33);
        System.out.println(result);

    }
}
