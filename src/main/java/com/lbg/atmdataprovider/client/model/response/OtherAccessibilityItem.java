package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherAccessibilityItem {

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Name")
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
                "OtherAccessibilityItem{" +
                        "description = '" + description + '\'' +
                        ",code = '" + code + '\'' +
                        ",name = '" + name + '\'' +
                        "}";
    }
}