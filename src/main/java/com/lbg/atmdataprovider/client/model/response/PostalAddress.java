package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PostalAddress {

    @JsonProperty("StreetName")
    private String streetName;

    @JsonProperty("CountrySubDivision")
    private List<String> countrySubDivision;

    @JsonProperty("AddressLine")
    private List<String> addressLine;

    @JsonProperty("BuildingNumber")
    private String buildingNumber;

    @JsonProperty("TownName")
    private String townName;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("GeoLocation")
    private GeoLocation geoLocation;

    @JsonProperty("PostCode")
    private String postCode;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public List<String> getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(List<String> countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }

    public List<String> getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return
                "PostalAddress{" +
                        "streetName = '" + streetName + '\'' +
                        ",countrySubDivision = '" + countrySubDivision + '\'' +
                        ",addressLine = '" + addressLine + '\'' +
                        ",buildingNumber = '" + buildingNumber + '\'' +
                        ",townName = '" + townName + '\'' +
                        ",country = '" + country + '\'' +
                        ",geoLocation = '" + geoLocation + '\'' +
                        ",postCode = '" + postCode + '\'' +
                        "}";
    }
}