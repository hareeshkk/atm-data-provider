package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusCode {

    @JsonProperty("default")
    private int jsonMemberDefault;

    @JsonProperty("description")
    private String description;

    @JsonProperty("type")
    private String type;

    public int getJsonMemberDefault() {
        return jsonMemberDefault;
    }

    public void setJsonMemberDefault(int jsonMemberDefault) {
        this.jsonMemberDefault = jsonMemberDefault;
    }

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
                "StatusCode{" +
                        "default = '" + jsonMemberDefault + '\'' +
                        ",description = '" + description + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}