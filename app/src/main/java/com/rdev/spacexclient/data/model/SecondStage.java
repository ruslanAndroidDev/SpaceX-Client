package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class SecondStage {

    @SerializedName("fuel_amount_tons")
    private double fuelAmountTons;

    @SerializedName("payloads")
    private Payloads payloads;

    @SerializedName("engines")
    private int engines;

    @SerializedName("burn_time_sec")
    private int burnTimeSec;

    @SerializedName("thrust")
    private Thrust thrust;

    @SerializedName("reusable")
    private boolean reusable;

    public void setFuelAmountTons(double fuelAmountTons) {
        this.fuelAmountTons = fuelAmountTons;
    }

    public double getFuelAmountTons() {
        return fuelAmountTons;
    }

    public void setPayloads(Payloads payloads) {
        this.payloads = payloads;
    }

    public Payloads getPayloads() {
        return payloads;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public int getEngines() {
        return engines;
    }

    public void setBurnTimeSec(int burnTimeSec) {
        this.burnTimeSec = burnTimeSec;
    }

    public int getBurnTimeSec() {
        return burnTimeSec;
    }

    public void setThrust(Thrust thrust) {
        this.thrust = thrust;
    }

    public Thrust getThrust() {
        return thrust;
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

    public boolean isReusable() {
        return reusable;
    }

    @Override
    public String toString() {
        return
                "SecondStage{" +
                        "fuel_amount_tons = '" + fuelAmountTons + '\'' +
                        ",payloads = '" + payloads + '\'' +
                        ",engines = '" + engines + '\'' +
                        ",burn_time_sec = '" + burnTimeSec + '\'' +
                        ",thrust = '" + thrust + '\'' +
                        ",reusable = '" + reusable + '\'' +
                        "}";
    }
}