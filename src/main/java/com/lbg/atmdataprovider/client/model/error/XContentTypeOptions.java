package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class XContentTypeOptions {

    @JsonProperty("default")
    private String jsonMemberDefault;

    @JsonProperty("description")
    private String description;

    @JsonProperty("type")
    private String type;

    public String getJsonMemberDefault() {
        return jsonMemberDefault;
    }

    public void setJsonMemberDefault(String jsonMemberDefault) {
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
                "XContentTypeOptions{" +
                        "default = '" + jsonMemberDefault + '\'' +
                        ",description = '" + description + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}