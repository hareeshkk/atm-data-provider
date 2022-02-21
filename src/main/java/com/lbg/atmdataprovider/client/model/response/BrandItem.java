package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BrandItem {

    @JsonProperty("BrandName")
    private String brandName;

    @JsonProperty("ATM")
    private List<ATMItem> aTM;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<ATMItem> getATM() {
        return aTM;
    }

    public void setATM(List<ATMItem> aTM) {
        this.aTM = aTM;
    }

    @Override
    public String toString() {
        return
                "BrandItem{" +
                        "brandName = '" + brandName + '\'' +
                        ",aTM = '" + aTM + '\'' +
                        "}";
    }
}