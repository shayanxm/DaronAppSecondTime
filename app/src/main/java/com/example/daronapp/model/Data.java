package com.example.daronapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private String name;
    private Status status;
    @SerializedName("main_price")

    private String price;
    private List<Specifications> specifications;
    @SerializedName("provider_logo")
    private String dataImage;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Specifications> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specifications> specifications) {
        this.specifications = specifications;
    }

    public String getDataImage() {
        return dataImage;
    }

    public void setDataImage(String dataImage) {
        this.dataImage = dataImage;
    }
}
