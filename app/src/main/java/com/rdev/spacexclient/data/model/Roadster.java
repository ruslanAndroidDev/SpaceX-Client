package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class Roadster{

	@SerializedName("inclination")
	private double inclination;

	@SerializedName("launch_date_utc")
	private String launchDateUtc;

	@SerializedName("earth_distance_km")
	private double earthDistanceKm;

	@SerializedName("norad_id")
	private int noradId;

	@SerializedName("earth_distance_mi")
	private double earthDistanceMi;

	@SerializedName("launch_mass_lbs")
	private int launchMassLbs;

	@SerializedName("mars_distance_mi")
	private double marsDistanceMi;

	@SerializedName("eccentricity")
	private double eccentricity;

	@SerializedName("period_days")
	private double periodDays;

	@SerializedName("epoch_jd")
	private double epochJd;

	@SerializedName("periapsis_au")
	private double periapsisAu;

	@SerializedName("launch_date_unix")
	private int launchDateUnix;

	@SerializedName("speed_mph")
	private double speedMph;

	@SerializedName("periapsis_arg")
	private double periapsisArg;

	@SerializedName("speed_kph")
	private double speedKph;

	@SerializedName("name")
	private String name;

	@SerializedName("mars_distance_km")
	private double marsDistanceKm;

	@SerializedName("orbit_type")
	private String orbitType;

	@SerializedName("details")
	private String details;

	@SerializedName("semi_major_axis_au")
	private double semiMajorAxisAu;

	@SerializedName("wikipedia")
	private String wikipedia;

	@SerializedName("launch_mass_kg")
	private int launchMassKg;

	@SerializedName("apoapsis_au")
	private double apoapsisAu;

	@SerializedName("longitude")
	private double longitude;

	public void setInclination(double inclination){
		this.inclination = inclination;
	}

	public double getInclination(){
		return inclination;
	}

	public void setLaunchDateUtc(String launchDateUtc){
		this.launchDateUtc = launchDateUtc;
	}

	public String getLaunchDateUtc(){
		return launchDateUtc;
	}

	public void setEarthDistanceKm(double earthDistanceKm){
		this.earthDistanceKm = earthDistanceKm;
	}

	public double getEarthDistanceKm(){
		return earthDistanceKm;
	}

	public void setNoradId(int noradId){
		this.noradId = noradId;
	}

	public int getNoradId(){
		return noradId;
	}

	public void setEarthDistanceMi(double earthDistanceMi){
		this.earthDistanceMi = earthDistanceMi;
	}

	public double getEarthDistanceMi(){
		return earthDistanceMi;
	}

	public void setLaunchMassLbs(int launchMassLbs){
		this.launchMassLbs = launchMassLbs;
	}

	public int getLaunchMassLbs(){
		return launchMassLbs;
	}

	public void setMarsDistanceMi(double marsDistanceMi){
		this.marsDistanceMi = marsDistanceMi;
	}

	public double getMarsDistanceMi(){
		return marsDistanceMi;
	}

	public void setEccentricity(double eccentricity){
		this.eccentricity = eccentricity;
	}

	public double getEccentricity(){
		return eccentricity;
	}

	public void setPeriodDays(double periodDays){
		this.periodDays = periodDays;
	}

	public double getPeriodDays(){
		return periodDays;
	}

	public void setEpochJd(double epochJd){
		this.epochJd = epochJd;
	}

	public double getEpochJd(){
		return epochJd;
	}

	public void setPeriapsisAu(double periapsisAu){
		this.periapsisAu = periapsisAu;
	}

	public double getPeriapsisAu(){
		return periapsisAu;
	}

	public void setLaunchDateUnix(int launchDateUnix){
		this.launchDateUnix = launchDateUnix;
	}

	public int getLaunchDateUnix(){
		return launchDateUnix;
	}

	public void setSpeedMph(double speedMph){
		this.speedMph = speedMph;
	}

	public double getSpeedMph(){
		return speedMph;
	}

	public void setPeriapsisArg(double periapsisArg){
		this.periapsisArg = periapsisArg;
	}

	public double getPeriapsisArg(){
		return periapsisArg;
	}

	public void setSpeedKph(double speedKph){
		this.speedKph = speedKph;
	}

	public double getSpeedKph(){
		return speedKph;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMarsDistanceKm(double marsDistanceKm){
		this.marsDistanceKm = marsDistanceKm;
	}

	public double getMarsDistanceKm(){
		return marsDistanceKm;
	}

	public void setOrbitType(String orbitType){
		this.orbitType = orbitType;
	}

	public String getOrbitType(){
		return orbitType;
	}

	public void setDetails(String details){
		this.details = details;
	}

	public String getDetails(){
		return details;
	}

	public void setSemiMajorAxisAu(double semiMajorAxisAu){
		this.semiMajorAxisAu = semiMajorAxisAu;
	}

	public double getSemiMajorAxisAu(){
		return semiMajorAxisAu;
	}

	public void setWikipedia(String wikipedia){
		this.wikipedia = wikipedia;
	}

	public String getWikipedia(){
		return wikipedia;
	}

	public void setLaunchMassKg(int launchMassKg){
		this.launchMassKg = launchMassKg;
	}

	public int getLaunchMassKg(){
		return launchMassKg;
	}

	public void setApoapsisAu(double apoapsisAu){
		this.apoapsisAu = apoapsisAu;
	}

	public double getApoapsisAu(){
		return apoapsisAu;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"Roadster{" + 
			"inclination = '" + inclination + '\'' + 
			",launch_date_utc = '" + launchDateUtc + '\'' + 
			",earth_distance_km = '" + earthDistanceKm + '\'' + 
			",norad_id = '" + noradId + '\'' + 
			",earth_distance_mi = '" + earthDistanceMi + '\'' + 
			",launch_mass_lbs = '" + launchMassLbs + '\'' + 
			",mars_distance_mi = '" + marsDistanceMi + '\'' + 
			",eccentricity = '" + eccentricity + '\'' + 
			",period_days = '" + periodDays + '\'' + 
			",epoch_jd = '" + epochJd + '\'' + 
			",periapsis_au = '" + periapsisAu + '\'' + 
			",launch_date_unix = '" + launchDateUnix + '\'' + 
			",speed_mph = '" + speedMph + '\'' + 
			",periapsis_arg = '" + periapsisArg + '\'' + 
			",speed_kph = '" + speedKph + '\'' + 
			",name = '" + name + '\'' + 
			",mars_distance_km = '" + marsDistanceKm + '\'' + 
			",orbit_type = '" + orbitType + '\'' + 
			",details = '" + details + '\'' + 
			",semi_major_axis_au = '" + semiMajorAxisAu + '\'' + 
			",wikipedia = '" + wikipedia + '\'' + 
			",launch_mass_kg = '" + launchMassKg + '\'' + 
			",apoapsis_au = '" + apoapsisAu + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}