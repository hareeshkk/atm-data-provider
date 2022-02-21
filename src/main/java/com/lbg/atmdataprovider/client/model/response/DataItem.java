package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DataItem {

    @JsonProperty("Brand")
    private List<BrandItem> brand;

    public List<BrandItem> getBrand() {
        return brand;
    }

    public void setBrand(List<BrandItem> brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return
                "DataItem{" +
                        "brand = '" + brand + '\'' +
                        "}";
    }
}