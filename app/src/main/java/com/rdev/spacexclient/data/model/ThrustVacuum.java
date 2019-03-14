package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class ThrustVacuum {

    @SerializedName("lbf")
    private int lbf;

    @SerializedName("kN")
    private int kN;

    public void setLbf(int lbf) {
        this.lbf = lbf;
    }

    public int getLbf() {
        return lbf;
    }

    public void setKN(int kN) {
        this.kN = kN;
    }

    public int getKN() {
        return kN;
    }

    @Override
    public String toString() {
        return
                "ThrustVacuum{" +
                        "lbf = '" + lbf + '\'' +
                        ",kN = '" + kN + '\'' +
                        "}";
    }
}