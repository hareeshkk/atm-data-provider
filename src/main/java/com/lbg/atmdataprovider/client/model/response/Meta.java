package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {

    @JsonProperty("Agreement")
    private String agreement;

    @JsonProperty("TermsOfUse")
    private String termsOfUse;

    @JsonProperty("License")
    private String license;

    @JsonProperty("TotalResults")
    private int totalResults;

    @JsonProperty("LastUpdated")
    private String lastUpdated;

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return
                "Meta{" +
                        "agreement = '" + agreement + '\'' +
                        ",termsOfUse = '" + termsOfUse + '\'' +
                        ",license = '" + license + '\'' +
                        ",totalResults = '" + totalResults + '\'' +
                        ",lastUpdated = '" + lastUpdated + '\'' +
                        "}";
    }
}