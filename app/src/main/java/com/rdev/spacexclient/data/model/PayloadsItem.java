package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PayloadsItem {

    @SerializedName("payload_type")
    private String payloadType;

    @SerializedName("payload_mass_kg")
    private int payloadMassKg;

    @SerializedName("payload_id")
    private String payloadId;

    @SerializedName("nationality")
    private String nationality;

    @SerializedName("norad_id")
    private List<Object> noradId;

    @SerializedName("customers")
    private List<String> customers;

    @SerializedName("orbit")
    private String orbit;

    @SerializedName("orbit_params")
    private OrbitParams orbitParams;

    @SerializedName("payload_mass_lbs")
    private double payloadMassLbs;

    @SerializedName("reused")
    private boolean reused;

    @SerializedName("manufacturer")
    private String manufacturer;

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    public String getPayloadType() {
        return payloadType;
    }

    public void setPayloadMassKg(int payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    public int getPayloadMassKg() {
        return payloadMassKg;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public String getPayloadId() {
        return payloadId;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNoradId(List<Object> noradId) {
        this.noradId = noradId;
    }

    public List<Object> getNoradId() {
        return noradId;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    public List<String> getCustomers() {
        return customers;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbitParams(OrbitParams orbitParams) {
        this.orbitParams = orbitParams;
    }

    public OrbitParams getOrbitParams() {
        return orbitParams;
    }

    public void setPayloadMassLbs(double payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    public double getPayloadMassLbs() {
        return payloadMassLbs;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public boolean isReused() {
        return reused;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return
                "PayloadsItem{" +
                        "payload_type = '" + payloadType + '\'' +
                        ",payload_mass_kg = '" + payloadMassKg + '\'' +
                        ",payload_id = '" + payloadId + '\'' +
                        ",nationality = '" + nationality + '\'' +
                        ",norad_id = '" + noradId + '\'' +
                        ",customers = '" + customers + '\'' +
                        ",orbit = '" + orbit + '\'' +
                        ",orbit_params = '" + orbitParams + '\'' +
                        ",payload_mass_lbs = '" + payloadMassLbs + '\'' +
                        ",reused = '" + reused + '\'' +
                        ",manufacturer = '" + manufacturer + '\'' +
                        "}";
    }
}