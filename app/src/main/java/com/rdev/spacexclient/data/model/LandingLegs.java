package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class LandingLegs {

    @SerializedName("number")
    private int number;

    @SerializedName("material")
    private Object material;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

    public Object getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return
                "LandingLegs{" +
                        "number = '" + number + '\'' +
                        ",material = '" + material + '\'' +
                        "}";
    }
}