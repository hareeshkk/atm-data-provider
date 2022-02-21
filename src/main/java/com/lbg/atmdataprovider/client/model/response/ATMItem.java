package com.lbg.atmdataprovider.client.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ATMItem {

    @JsonProperty("SupportedLanguages")
    private List<String> supportedLanguages;

    @JsonProperty("MinimumPossibleAmount")
    private String minimumPossibleAmount;

    @JsonProperty("OtherAccessibility")
    private List<OtherAccessibilityItem> otherAccessibility;

    @JsonProperty("SupportedCurrencies")
    private List<String> supportedCurrencies;

    @JsonProperty("Accessibility")
    private List<String> accessibility;

    @JsonProperty("Branch")
    private Branch branch;

    @JsonProperty("ATMServices")
    private List<String> aTMServices;

    @JsonProperty("Note")
    private List<String> note;

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Access24HoursIndicator")
    private boolean access24HoursIndicator;

    @JsonProperty("OtherATMServices")
    private List<OtherATMServicesItem> otherATMServices;

    @JsonProperty("Location")
    private Location location;

    public List<String> getSupportedLanguages() {
        return supportedLanguages;
    }

    public void setSupportedLanguages(List<String> supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    public String getMinimumPossibleAmount() {
        return minimumPossibleAmount;
    }

    public void setMinimumPossibleAmount(String minimumPossibleAmount) {
        this.minimumPossibleAmount = minimumPossibleAmount;
    }

    public List<OtherAccessibilityItem> getOtherAccessibility() {
        return otherAccessibility;
    }

    public void setOtherAccessibility(List<OtherAccessibilityItem> otherAccessibility) {
        this.otherAccessibility = otherAccessibility;
    }

    public List<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    public void setSupportedCurrencies(List<String> supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }

    public List<String> getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(List<String> accessibility) {
        this.accessibility = accessibility;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public List<String> getATMServices() {
        return aTMServices;
    }

    public void setATMServices(List<String> aTMServices) {
        this.aTMServices = aTMServices;
    }

    public List<String> getNote() {
        return note;
    }

    public void setNote(List<String> note) {
        this.note = note;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public boolean isAccess24HoursIndicator() {
        return access24HoursIndicator;
    }

    public void setAccess24HoursIndicator(boolean access24HoursIndicator) {
        this.access24HoursIndicator = access24HoursIndicator;
    }

    public List<OtherATMServicesItem> getOtherATMServices() {
        return otherATMServices;
    }

    public void setOtherATMServices(List<OtherATMServicesItem> otherATMServices) {
        this.otherATMServices = otherATMServices;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return
                "ATMItem{" +
                        "supportedLanguages = '" + supportedLanguages + '\'' +
                        ",minimumPossibleAmount = '" + minimumPossibleAmount + '\'' +
                        ",otherAccessibility = '" + otherAccessibility + '\'' +
                        ",supportedCurrencies = '" + supportedCurrencies + '\'' +
                        ",accessibility = '" + accessibility + '\'' +
                        ",branch = '" + branch + '\'' +
                        ",aTMServices = '" + aTMServices + '\'' +
                        ",note = '" + note + '\'' +
                        ",identification = '" + identification + '\'' +
                        ",access24HoursIndicator = '" + access24HoursIndicator + '\'' +
                        ",otherATMServices = '" + otherATMServices + '\'' +
                        ",location = '" + location + '\'' +
                        "}";
    }
}