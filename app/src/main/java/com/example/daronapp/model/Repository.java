package com.example.daronapp.model;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository instacne;
    List<Data>dataTillNow;
    private Repository (){
        dataTillNow=new ArrayList<>();
    }
    public static Repository getInstance() {
        if (instacne == null)
            instacne = new Repository();
            return instacne;

    }

    public List<Data> getDataTillNow() {
        return dataTillNow;
    }

    public void setDataTillNow(List<Data> dataTillNow) {
        this.dataTillNow = dataTillNow;
    }
}
