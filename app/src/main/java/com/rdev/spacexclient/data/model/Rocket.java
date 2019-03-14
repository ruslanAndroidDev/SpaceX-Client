package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rocket {

    @SerializedName("country")
    private String country;

    @SerializedName("second_stage")
    private SecondStage secondStage;

    @SerializedName("rocket_id")
    private String rocketId;

    @SerializedName("mass")
    private Mass mass;

    @SerializedName("active")
    private boolean active;

    @SerializedName("cost_per_launch")
    private int costPerLaunch;

    @SerializedName("description")
    private String description;

    @SerializedName("rocket_name")
    private String rocketName;

    @SerializedName("payload_weights")
    private List<PayloadWeightsItem> payloadWeights;

    @SerializedName("first_flight")
    private String firstFlight;

    @SerializedName("landing_legs")
    private LandingLegs landingLegs;

    @SerializedName("diameter")
    private Diameter diameter;

    @SerializedName("flickr_images")
    private List<String> flickrImages;

    @SerializedName("first_stage")
    private FirstStage firstStage;

    @SerializedName("engines")
    private Engines engines;

    @SerializedName("stages")
    private int stages;

    @SerializedName("boosters")
    private int boosters;

    @SerializedName("rocket_type")
    private String rocketType;

    @SerializedName("company")
    private String company;

    @SerializedName("id")
    private int id;

    @SerializedName("success_rate_pct")
    private int successRatePct;

    @SerializedName("wikipedia")
    private String wikipedia;

    @SerializedName("height")
    private Height height;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }

    public SecondStage getSecondStage() {
        return secondStage;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public Mass getMass() {
        return mass;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setCostPerLaunch(int costPerLaunch) {
        this.costPerLaunch = costPerLaunch;
    }

    public int getCostPerLaunch() {
        return costPerLaunch;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setPayloadWeights(List<PayloadWeightsItem> payloadWeights) {
        this.payloadWeights = payloadWeights;
    }

    public List<PayloadWeightsItem> getPayloadWeights() {
        return payloadWeights;
    }

    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    public String getFirstFlight() {
        return firstFlight;
    }

    public void setLandingLegs(LandingLegs landingLegs) {
        this.landingLegs = landingLegs;
    }

    public LandingLegs getLandingLegs() {
        return landingLegs;
    }

    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    public Diameter getDiameter() {
        return diameter;
    }

    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }

    public List<String> getFlickrImages() {
        return flickrImages;
    }

    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }

    public FirstStage getFirstStage() {
        return firstStage;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setStages(int stages) {
        this.stages = stages;
    }

    public int getStages() {
        return stages;
    }

    public void setBoosters(int boosters) {
        this.boosters = boosters;
    }

    public int getBoosters() {
        return boosters;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSuccessRatePct(int successRatePct) {
        this.successRatePct = successRatePct;
    }

    public int getSuccessRatePct() {
        return successRatePct;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getWikipedia() {
        return wikipedia;
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
                "Rocket{" +
                        "country = '" + country + '\'' +
                        ",second_stage = '" + secondStage + '\'' +
                        ",rocket_id = '" + rocketId + '\'' +
                        ",mass = '" + mass + '\'' +
                        ",active = '" + active + '\'' +
                        ",cost_per_launch = '" + costPerLaunch + '\'' +
                        ",description = '" + description + '\'' +
                        ",rocket_name = '" + rocketName + '\'' +
                        ",payload_weights = '" + payloadWeights + '\'' +
                        ",first_flight = '" + firstFlight + '\'' +
                        ",landing_legs = '" + landingLegs + '\'' +
                        ",diameter = '" + diameter + '\'' +
                        ",flickr_images = '" + flickrImages + '\'' +
                        ",first_stage = '" + firstStage + '\'' +
                        ",engines = '" + engines + '\'' +
                        ",stages = '" + stages + '\'' +
                        ",boosters = '" + boosters + '\'' +
                        ",rocket_type = '" + rocketType + '\'' +
                        ",company = '" + company + '\'' +
                        ",id = '" + id + '\'' +
                        ",success_rate_pct = '" + successRatePct + '\'' +
                        ",wikipedia = '" + wikipedia + '\'' +
                        ",height = '" + height + '\'' +
                        "}";
    }
}