package org.example.interfaceimplementation;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
