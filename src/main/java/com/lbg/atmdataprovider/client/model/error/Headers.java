package com.lbg.atmdataprovider.client.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headers {

    @JsonProperty("X-Frame-Options")
    private XFrameOptions xFrameOptions;

    @JsonProperty("Strict-Transport-Security")
    private StrictTransportSecurity strictTransportSecurity;

    @JsonProperty("X-Content-Type-Options")
    private XContentTypeOptions xContentTypeOptions;

    @JsonProperty("Status Code")
    private StatusCode statusCode;

    public XFrameOptions getXFrameOptions() {
        return xFrameOptions;
    }

    public void setXFrameOptions(XFrameOptions xFrameOptions) {
        this.xFrameOptions = xFrameOptions;
    }

    public StrictTransportSecurity getStrictTransportSecurity() {
        return strictTransportSecurity;
    }

    public void setStrictTransportSecurity(StrictTransportSecurity strictTransportSecurity) {
        this.strictTransportSecurity = strictTransportSecurity;
    }

    public XContentTypeOptions getXContentTypeOptions() {
        return xContentTypeOptions;
    }

    public void setXContentTypeOptions(XContentTypeOptions xContentTypeOptions) {
        this.xContentTypeOptions = xContentTypeOptions;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return
                "Headers{" +
                        "x-Frame-Options = '" + xFrameOptions + '\'' +
                        ",strict-Transport-Security = '" + strictTransportSecurity + '\'' +
                        ",x-Content-Type-Options = '" + xContentTypeOptions + '\'' +
                        ",status Code = '" + statusCode + '\'' +
                        "}";
    }
}