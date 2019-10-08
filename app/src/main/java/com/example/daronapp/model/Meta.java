package com.example.daronapp.model;

import com.google.gson.annotations.SerializedName;

public class Meta {
    @SerializedName("current_page")
    private int currentPage;
    @SerializedName("last_page")
    private int lastPage;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    @SerializedName("per_p" +
            "age")
    private int perPage;

}
