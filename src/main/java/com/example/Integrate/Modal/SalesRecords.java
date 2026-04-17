package com.example.Integrate.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SalesRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String drName;
    private String hospitalName;
    private String currentUnit;
    private String productName;
    private String phone;
    private String place;
    private String state;
    private String email;
    private String distributorName;
    private String salesPerson;
    private String pipelineStage;
    private Double potentialValue;
    private Double winningPercentage;
    private Double buyingPercentage;
    private Double totalPercentage;
    private Double weightedForecast;
    private String forecastMonth;
    private String closedMonth;
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCurrentUnit() {
        return currentUnit;
    }

    public void setCurrentUnit(String currentUnit) {
        this.currentUnit = currentUnit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getPipelineStage() {
        return pipelineStage;
    }

    public void setPipelineStage(String pipelineStage) {
        this.pipelineStage = pipelineStage;
    }

    public Double getPotentialValue() {
        return potentialValue;
    }

    public void setPotentialValue(Double potentialValue) {
        this.potentialValue = potentialValue;
    }

    public Double getWinningPercentage() {
        return winningPercentage;
    }

    public void setWinningPercentage(Double winningPercentage) {
        this.winningPercentage = winningPercentage;
    }

    public Double getBuyingPercentage() {
        return buyingPercentage;
    }

    public void setBuyingPercentage(Double buyingPercentage) {
        this.buyingPercentage = buyingPercentage;
    }

    public Double getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(Double totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public Double getWeightedForecast() {
        return weightedForecast;
    }

    public void setWeightedForecast(Double weightedForecast) {
        this.weightedForecast = weightedForecast;
    }

    public String getForecastMonth() {
        return forecastMonth;
    }

    public void setForecastMonth(String forecastMonth) {
        this.forecastMonth = forecastMonth;
    }

    public String getClosedMonth() {
        return closedMonth;
    }

    public void setClosedMonth(String closedMonth) {
        this.closedMonth = closedMonth;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
