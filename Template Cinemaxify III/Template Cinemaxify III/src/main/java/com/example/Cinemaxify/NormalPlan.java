package com.example.Cinemaxify;

public class NormalPlan implements Plan{
    private String planName = "normal";

    @Override
    public String getPlanName() {
        return planName;
    }
}
