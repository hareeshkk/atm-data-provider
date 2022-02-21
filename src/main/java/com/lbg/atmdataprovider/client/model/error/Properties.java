package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {

    @JsonProperty("description")
    private Description description;

    @JsonProperty("title")
    private Title title;

    @JsonProperty("status")
    private Status status;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "Properties{" +
                        "description = '" + description + '\'' +
                        ",title = '" + title + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}