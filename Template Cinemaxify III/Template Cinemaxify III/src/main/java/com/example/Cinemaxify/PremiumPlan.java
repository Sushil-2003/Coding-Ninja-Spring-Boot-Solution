package com.example.Cinemaxify;

public class PremiumPlan implements Plan {

    private String planName = "premium";

    @Override
    public String getPlanName() {
       return planName;
    }

}
