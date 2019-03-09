package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Launch {

    @SerializedName("mission_name")
    private String missionName;

    @SerializedName("static_fire_date_utc")
    private Object staticFireDateUtc;

    @SerializedName("launch_year")
    private String launchYear;

    @SerializedName("launch_date_utc")
    private String launchDateUtc;

    @SerializedName("flight_number")
    private int flightNumber;

    @SerializedName("is_tentative")
    private boolean isTentative;

    @SerializedName("rocket")
    private Rocket rocket;

    @SerializedName("mission_id")
    private List<Object> missionId;

    @SerializedName("launch_window")
    private Object launchWindow;

    @SerializedName("launch_date_local")
    private String launchDateLocal;

    @SerializedName("tentative_max_precision")
    private String tentativeMaxPrecision;

    @SerializedName("ships")
    private List<Object> ships;

    @SerializedName("launch_date_unix")
    private int launchDateUnix;

    @SerializedName("launch_success")
    private Object launchSuccess;

    @SerializedName("static_fire_date_unix")
    private Object staticFireDateUnix;

    @SerializedName("tbd")
    private boolean tbd;

    @SerializedName("timeline")
    private Object timeline;

    @SerializedName("telemetry")
    private Telemetry telemetry;

    @SerializedName("links")
    private Links links;

    @SerializedName("details")
    private Object details;

    @SerializedName("launch_site")
    private LaunchSite launchSite;

    @SerializedName("upcoming")
    private boolean upcoming;

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setStaticFireDateUtc(Object staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    public Object getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setIsTentative(boolean isTentative) {
        this.isTentative = isTentative;
    }

    public boolean isIsTentative() {
        return isTentative;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setMissionId(List<Object> missionId) {
        this.missionId = missionId;
    }

    public List<Object> getMissionId() {
        return missionId;
    }

    public void setLaunchWindow(Object launchWindow) {
        this.launchWindow = launchWindow;
    }

    public Object getLaunchWindow() {
        return launchWindow;
    }

    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }

    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
    }

    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }

    public void setShips(List<Object> ships) {
        this.ships = ships;
    }

    public List<Object> getShips() {
        return ships;
    }

    public void setLaunchDateUnix(int launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }

    public int getLaunchDateUnix() {
        return launchDateUnix;
    }

    public void setLaunchSuccess(Object launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public Object getLaunchSuccess() {
        return launchSuccess;
    }

    public void setStaticFireDateUnix(Object staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    public Object getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    public void setTbd(boolean tbd) {
        this.tbd = tbd;
    }

    public boolean isTbd() {
        return tbd;
    }

    public void setTimeline(Object timeline) {
        this.timeline = timeline;
    }

    public Object getTimeline() {
        return timeline;
    }

    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Links getLinks() {
        return links;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    public Object getDetails() {
        return details;
    }

    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    @Override
    public String toString() {
        return
                "Launch{" +
                        "mission_name = '" + missionName + '\'' +
                        ",static_fire_date_utc = '" + staticFireDateUtc + '\'' +
                        ",launch_year = '" + launchYear + '\'' +
                        ",launch_date_utc = '" + launchDateUtc + '\'' +
                        ",flight_number = '" + flightNumber + '\'' +
                        ",is_tentative = '" + isTentative + '\'' +
                        ",rocket = '" + rocket + '\'' +
                        ",mission_id = '" + missionId + '\'' +
                        ",launch_window = '" + launchWindow + '\'' +
                        ",launch_date_local = '" + launchDateLocal + '\'' +
                        ",tentative_max_precision = '" + tentativeMaxPrecision + '\'' +
                        ",ships = '" + ships + '\'' +
                        ",launch_date_unix = '" + launchDateUnix + '\'' +
                        ",launch_success = '" + launchSuccess + '\'' +
                        ",static_fire_date_unix = '" + staticFireDateUnix + '\'' +
                        ",tbd = '" + tbd + '\'' +
                        ",timeline = '" + timeline + '\'' +
                        ",telemetry = '" + telemetry + '\'' +
                        ",links = '" + links + '\'' +
                        ",details = '" + details + '\'' +
                        ",launch_site = '" + launchSite + '\'' +
                        ",upcoming = '" + upcoming + '\'' +
                        "}";
    }
}