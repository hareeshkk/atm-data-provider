package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StrictTransportSecurity {

    @JsonProperty("description")
    private String description;

    @JsonProperty("type")
    private String type;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "StrictTransportSecurity{" +
                        "description = '" + description + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}