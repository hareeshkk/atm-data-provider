package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ClientResponse {

    @JsonProperty("data")
    private List<DataItem> data;

    @JsonProperty("meta")
    private Meta meta;

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "data = '" + data + '\'' +
                        ",meta = '" + meta + '\'' +
                        "}";
    }
}