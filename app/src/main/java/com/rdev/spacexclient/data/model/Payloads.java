package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Payloads {

    @SerializedName("composite_fairing")
    private CompositeFairing compositeFairing;

    @SerializedName("option_1")
    private String option1;

    public void setCompositeFairing(CompositeFairing compositeFairing) {
        this.compositeFairing = compositeFairing;
    }

    public CompositeFairing getCompositeFairing() {
        return compositeFairing;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption1() {
        return option1;
    }

    @Override
    public String toString() {
        return
                "Payloads{" +
                        "composite_fairing = '" + compositeFairing + '\'' +
                        ",option_1 = '" + option1 + '\'' +
                        "}";
    }
}