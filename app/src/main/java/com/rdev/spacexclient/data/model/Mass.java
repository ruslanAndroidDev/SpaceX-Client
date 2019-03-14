package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Mass {

    @SerializedName("lb")
    private int lb;

    @SerializedName("kg")
    private int kg;

    public void setLb(int lb) {
        this.lb = lb;
    }

    public int getLb() {
        return lb;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getKg() {
        return kg;
    }

    @Override
    public String toString() {
        return
                "Mass{" +
                        "lb = '" + lb + '\'' +
                        ",kg = '" + kg + '\'' +
                        "}";
    }
}