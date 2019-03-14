package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Diameter {

    @SerializedName("feet")
    private double feet;

    @SerializedName("meters")
    private double meters;

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getFeet() {
        return feet;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getMeters() {
        return meters;
    }

    @Override
    public String toString() {
        return
                "Diameter{" +
                        "feet = '" + feet + '\'' +
                        ",meters = '" + meters + '\'' +
                        "}";
    }
}