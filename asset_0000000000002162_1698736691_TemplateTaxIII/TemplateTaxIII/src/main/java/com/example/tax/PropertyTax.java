package com.example.tax;

public class PropertyTax implements Tax {

    double taxAmount;
    double taxableAmount;
    boolean isTaxPayed;

    public PropertyTax() {
        isTaxPayed = false;
    }

    @Override
    public void setTaxableAmount(int amount) {
        taxableAmount = amount;
    }

    // 5 % of  property value
    @Override
    public void calculateTaxAmount() {
        taxAmount = 0.05 * taxableAmount;
    }

    @Override
    public double getTaxAmount() {
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "property";
    }

    @Override
    public boolean isTaxPayed() {
        return isTaxPayed;
    }

    @Override
    public void payTax() {
        System.out.println("Hi, your property tax is paid");
        isTaxPayed = true;
    }
}
