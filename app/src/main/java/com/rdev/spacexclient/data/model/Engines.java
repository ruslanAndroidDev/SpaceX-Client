package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Engines {

    @SerializedName("layout")
    private String layout;

    @SerializedName("number")
    private int number;

    @SerializedName("propellant_1")
    private String propellant1;

    @SerializedName("thrust_sea_level")
    private ThrustSeaLevel thrustSeaLevel;

    @SerializedName("engine_loss_max")
    private int engineLossMax;

    @SerializedName("thrust_to_weight")
    private double thrustToWeight;

    @SerializedName("thrust_vacuum")
    private ThrustVacuum thrustVacuum;

    @SerializedName("type")
    private String type;

    @SerializedName("version")
    private String version;

    @SerializedName("propellant_2")
    private String propellant2;

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getLayout() {
        return layout;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setPropellant1(String propellant1) {
        this.propellant1 = propellant1;
    }

    public String getPropellant1() {
        return propellant1;
    }

    public void setThrustSeaLevel(ThrustSeaLevel thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public ThrustSeaLevel getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setEngineLossMax(int engineLossMax) {
        this.engineLossMax = engineLossMax;
    }

    public int getEngineLossMax() {
        return engineLossMax;
    }

    public void setThrustToWeight(int thrustToWeight) {
        this.thrustToWeight = thrustToWeight;
    }

    public double getThrustToWeight() {
        return thrustToWeight;
    }

    public void setThrustVacuum(ThrustVacuum thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }

    public ThrustVacuum getThrustVacuum() {
        return thrustVacuum;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setPropellant2(String propellant2) {
        this.propellant2 = propellant2;
    }

    public String getPropellant2() {
        return propellant2;
    }

    @Override
    public String toString() {
        return
                "Engines{" +
                        "layout = '" + layout + '\'' +
                        ",number = '" + number + '\'' +
                        ",propellant_1 = '" + propellant1 + '\'' +
                        ",thrust_sea_level = '" + thrustSeaLevel + '\'' +
                        ",engine_loss_max = '" + engineLossMax + '\'' +
                        ",thrust_to_weight = '" + thrustToWeight + '\'' +
                        ",thrust_vacuum = '" + thrustVacuum + '\'' +
                        ",type = '" + type + '\'' +
                        ",version = '" + version + '\'' +
                        ",propellant_2 = '" + propellant2 + '\'' +
                        "}";
    }
}