package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Branch {

    @JsonProperty("Identification")
    private String identification;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public String toString() {
        return
                "Branch{" +
                        "identification = '" + identification + '\'' +
                        "}";
    }
}