package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Description {

    @JsonProperty("type")
    private String type;

    @JsonProperty("enum")
    private List<String> jsonMemberEnum;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getJsonMemberEnum() {
        return jsonMemberEnum;
    }

    public void setJsonMemberEnum(List<String> jsonMemberEnum) {
        this.jsonMemberEnum = jsonMemberEnum;
    }

    @Override
    public String toString() {
        return
                "Description{" +
                        "type = '" + type + '\'' +
                        ",enum = '" + jsonMemberEnum + '\'' +
                        "}";
    }
}