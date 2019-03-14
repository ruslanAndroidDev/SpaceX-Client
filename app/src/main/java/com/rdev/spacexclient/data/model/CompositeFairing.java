package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class CompositeFairing {

    @SerializedName("diameter")
    private Diameter diameter;

    @SerializedName("height")
    private Height height;

    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    public Diameter getDiameter() {
        return diameter;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Height getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return
                "CompositeFairing{" +
                        "diameter = '" + diameter + '\'' +
                        ",height = '" + height + '\'' +
                        "}";
    }
}