package org.d11.rest.api.model;

import java.time.LocalDate;

public class PlayerDTO extends PlayerBaseDTO {

    private int countryId;
    private String countryName;
    private int whoScoredId;
    private LocalDate dateOfBirth;
    private int height;
    private int weight;
    private String parameterizedName;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getWhoScoredId() {
        return whoScoredId;
    }

    public void setWhoScoredId(int whoScoredId) {
        this.whoScoredId = whoScoredId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getParameterizedName() {
        return parameterizedName;
    }

    public void setParameterizedName(String parameterizedName) {
        this.parameterizedName = parameterizedName;
    }

}
