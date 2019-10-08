package com.example.daronapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {
    @SerializedName("data")
    List<Data> dataList;
    private Meta meta;

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
