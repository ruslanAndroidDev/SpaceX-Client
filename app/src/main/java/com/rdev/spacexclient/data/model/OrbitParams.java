package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class OrbitParams {

    @SerializedName("periapsis_km")
    private Object periapsisKm;

    @SerializedName("mean_anomaly")
    private Object meanAnomaly;

    @SerializedName("inclination_deg")
    private Object inclinationDeg;

    @SerializedName("regime")
    private Object regime;

    @SerializedName("arg_of_pericenter")
    private Object argOfPericenter;

    @SerializedName("eccentricity")
    private Object eccentricity;

    @SerializedName("apoapsis_km")
    private Object apoapsisKm;

    @SerializedName("semi_major_axis_km")
    private Object semiMajorAxisKm;

    @SerializedName("raan")
    private Object raan;

    @SerializedName("epoch")
    private Object epoch;

    @SerializedName("lifespan_years")
    private double lifespanYears;

    @SerializedName("reference_system")
    private Object referenceSystem;

    @SerializedName("period_min")
    private Object periodMin;

    @SerializedName("mean_motion")
    private Object meanMotion;

    @SerializedName("longitude")
    private Object longitude;

    public void setPeriapsisKm(Object periapsisKm) {
        this.periapsisKm = periapsisKm;
    }

    public Object getPeriapsisKm() {
        return periapsisKm;
    }

    public void setMeanAnomaly(Object meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    public Object getMeanAnomaly() {
        return meanAnomaly;
    }

    public void setInclinationDeg(Object inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    public Object getInclinationDeg() {
        return inclinationDeg;
    }

    public void setRegime(Object regime) {
        this.regime = regime;
    }

    public Object getRegime() {
        return regime;
    }

    public void setArgOfPericenter(Object argOfPericenter) {
        this.argOfPericenter = argOfPericenter;
    }

    public Object getArgOfPericenter() {
        return argOfPericenter;
    }

    public void setEccentricity(Object eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Object getEccentricity() {
        return eccentricity;
    }

    public void setApoapsisKm(Object apoapsisKm) {
        this.apoapsisKm = apoapsisKm;
    }

    public Object getApoapsisKm() {
        return apoapsisKm;
    }

    public void setSemiMajorAxisKm(Object semiMajorAxisKm) {
        this.semiMajorAxisKm = semiMajorAxisKm;
    }

    public Object getSemiMajorAxisKm() {
        return semiMajorAxisKm;
    }

    public void setRaan(Object raan) {
        this.raan = raan;
    }

    public Object getRaan() {
        return raan;
    }

    public void setEpoch(Object epoch) {
        this.epoch = epoch;
    }

    public Object getEpoch() {
        return epoch;
    }

    public void setLifespanYears(int lifespanYears) {
        this.lifespanYears = lifespanYears;
    }

    public double getLifespanYears() {
        return lifespanYears;
    }

    public void setReferenceSystem(Object referenceSystem) {
        this.referenceSystem = referenceSystem;
    }

    public Object getReferenceSystem() {
        return referenceSystem;
    }

    public void setPeriodMin(Object periodMin) {
        this.periodMin = periodMin;
    }

    public Object getPeriodMin() {
        return periodMin;
    }

    public void setMeanMotion(Object meanMotion) {
        this.meanMotion = meanMotion;
    }

    public Object getMeanMotion() {
        return meanMotion;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return
                "OrbitParams{" +
                        "periapsis_km = '" + periapsisKm + '\'' +
                        ",mean_anomaly = '" + meanAnomaly + '\'' +
                        ",inclination_deg = '" + inclinationDeg + '\'' +
                        ",regime = '" + regime + '\'' +
                        ",arg_of_pericenter = '" + argOfPericenter + '\'' +
                        ",eccentricity = '" + eccentricity + '\'' +
                        ",apoapsis_km = '" + apoapsisKm + '\'' +
                        ",semi_major_axis_km = '" + semiMajorAxisKm + '\'' +
                        ",raan = '" + raan + '\'' +
                        ",epoch = '" + epoch + '\'' +
                        ",lifespan_years = '" + lifespanYears + '\'' +
                        ",reference_system = '" + referenceSystem + '\'' +
                        ",period_min = '" + periodMin + '\'' +
                        ",mean_motion = '" + meanMotion + '\'' +
                        ",longitude = '" + longitude + '\'' +
                        "}";
    }
}