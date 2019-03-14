package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class FirstStage {

    @SerializedName("fuel_amount_tons")
    private double fuelAmountTons;

    @SerializedName("thrust_sea_level")
    private ThrustSeaLevel thrustSeaLevel;

    @SerializedName("engines")
    private int engines;

    @SerializedName("thrust_vacuum")
    private ThrustVacuum thrustVacuum;

    @SerializedName("burn_time_sec")
    private int burnTimeSec;

    @SerializedName("reusable")
    private boolean reusable;

    public void setFuelAmountTons(double fuelAmountTons) {
        this.fuelAmountTons = fuelAmountTons;
    }

    public double getFuelAmountTons() {
        return fuelAmountTons;
    }

    public void setThrustSeaLevel(ThrustSeaLevel thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public ThrustSeaLevel getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public int getEngines() {
        return engines;
    }

    public void setThrustVacuum(ThrustVacuum thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }

    public ThrustVacuum getThrustVacuum() {
        return thrustVacuum;
    }

    public void setBurnTimeSec(int burnTimeSec) {
        this.burnTimeSec = burnTimeSec;
    }

    public int getBurnTimeSec() {
        return burnTimeSec;
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
                "FirstStage{" +
                        "fuel_amount_tons = '" + fuelAmountTons + '\'' +
                        ",thrust_sea_level = '" + thrustSeaLevel + '\'' +
                        ",engines = '" + engines + '\'' +
                        ",thrust_vacuum = '" + thrustVacuum + '\'' +
                        ",burn_time_sec = '" + burnTimeSec + '\'' +
                        ",reusable = '" + reusable + '\'' +
                        "}";
    }
}