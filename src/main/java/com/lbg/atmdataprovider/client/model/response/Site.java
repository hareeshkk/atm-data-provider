package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Site {

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Name")
    private String name;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Site{" +
                        "identification = '" + identification + '\'' +
                        ",name = '" + name + '\'' +
                        "}";
    }
}