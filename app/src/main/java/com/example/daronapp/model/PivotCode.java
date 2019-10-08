package com.example.daronapp.model;

import com.google.gson.annotations.SerializedName;

public class PivotCode {
    @SerializedName("value")
    String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
