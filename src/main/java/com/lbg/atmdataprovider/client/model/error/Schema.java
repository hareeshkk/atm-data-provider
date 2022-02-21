package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Schema {

    @JsonProperty("additionalProperties")
    private boolean additionalProperties;

    @JsonProperty("title")
    private String title;

    @JsonProperty("type")
    private String type;

    @JsonProperty("properties")
    private Properties properties;

    @JsonProperty("required")
    private List<String> required;

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(boolean additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return
                "Schema{" +
                        "additionalProperties = '" + additionalProperties + '\'' +
                        ",title = '" + title + '\'' +
                        ",type = '" + type + '\'' +
                        ",properties = '" + properties + '\'' +
                        ",required = '" + required + '\'' +
                        "}";
    }
}