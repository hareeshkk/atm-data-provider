package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Location {

    @JsonProperty("Site")
    private Site site;

    @JsonProperty("PostalAddress")
    private PostalAddress postalAddress;

    @JsonProperty("LocationCategory")
    private List<String> locationCategory;

    @JsonProperty("OtherLocationCategory")
    private List<OtherLocationCategoryItem> otherLocationCategory;

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    public List<String> getLocationCategory() {
        return locationCategory;
    }

    public void setLocationCategory(List<String> locationCategory) {
        this.locationCategory = locationCategory;
    }

    public List<OtherLocationCategoryItem> getOtherLocationCategory() {
        return otherLocationCategory;
    }

    public void setOtherLocationCategory(List<OtherLocationCategoryItem> otherLocationCategory) {
        this.otherLocationCategory = otherLocationCategory;
    }

    @Override
    public String toString() {
        return
                "Location{" +
                        "site = '" + site + '\'' +
                        ",postalAddress = '" + postalAddress + '\'' +
                        ",locationCategory = '" + locationCategory + '\'' +
                        ",otherLocationCategory = '" + otherLocationCategory + '\'' +
                        "}";
    }
}