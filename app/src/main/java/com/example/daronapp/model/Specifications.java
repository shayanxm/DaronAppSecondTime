package com.example.daronapp.model;

import com.google.gson.annotations.SerializedName;

public class Specifications {
    private PivotCode pivot;
    @SerializedName("id")
    private int pivotKindCode;


    public static void pivotCodeDecoder(int code) {
        if (code == 1) {
            ////color
        }
        if (code == 0) {
            ///size

        }
    }

    public PivotCode getPivot() {
        return pivot;
    }

    public void setPivot(PivotCode pivot) {
        this.pivot = pivot;
    }

    public int getPivotKindCode() {
        return pivotKindCode;
    }

    public void setPivotKindCode(int pivotKindCode) {
        this.pivotKindCode = pivotKindCode;
    }
}
