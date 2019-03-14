package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

public class PayloadWeightsItem {

    @SerializedName("lb")
    private int lb;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private String id;

    @SerializedName("kg")
    private int kg;

    public void setLb(int lb) {
        this.lb = lb;
    }

    public int getLb() {
        return lb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getKg() {
        return kg;
    }

    @Override
    public String toString() {
        return
                "PayloadWeightsItem{" +
                        "lb = '" + lb + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        ",kg = '" + kg + '\'' +
                        "}";
    }
}