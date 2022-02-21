package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {

    @JsonProperty("schema")
    private Schema schema;

    @JsonProperty("headers")
    private Headers headers;

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return
                "ErrorResponse{" +
                        "schema = '" + schema + '\'' +
                        ",headers = '" + headers + '\'' +
                        "}";
    }
}