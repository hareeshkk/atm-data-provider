package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoLocation {

    @JsonProperty("GeographicCoordinates")
    private GeographicCoordinates geographicCoordinates;

    public GeographicCoordinates getGeographicCoordinates() {
        return geographicCoordinates;
    }

    public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
        this.geographicCoordinates = geographicCoordinates;
    }

    @Override
    public String toString() {
        return
                "GeoLocation{" +
                        "geographicCoordinates = '" + geographicCoordinates + '\'' +
                        "}";
    }
}