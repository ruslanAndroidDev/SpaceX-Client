package com.rdev.spacexclient.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SecondStage {

    @SerializedName("payloads")
    private List<PayloadsItem> payloads;

    @SerializedName("block")
    private int block;

    public void setPayloads(List<PayloadsItem> payloads) {
        this.payloads = payloads;
    }

    public List<PayloadsItem> getPayloads() {
        return payloads;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return
                "SecondStage{" +
                        "payloads = '" + payloads + '\'' +
                        ",block = '" + block + '\'' +
                        "}";
    }
}