package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeographicCoordinates {

    @JsonProperty("Latitude")
    private String latitude;

    @JsonProperty("Longitude")
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return
                "GeographicCoordinates{" +
                        "latitude = '" + latitude + '\'' +
                        ",longitude = '" + longitude + '\'' +
                        "}";
    }
}