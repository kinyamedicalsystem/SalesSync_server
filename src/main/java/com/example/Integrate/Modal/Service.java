package com.example.Integrate.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import java.util.*;
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private int csrNo;
    private String customerName;
    private String address;
    private String city;
    private String customerContact;
    @OneToMany(mappedBy = "service", cascade=CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<ServiceSpare> spares;
    private String equipmentName;
    private String serialNo;
    private String manufacturer;
    private String model;
    private String customerProblem;
    private String diagnosis;
    private String rectification;
    private String serviceType;
    private String event;
    private String  startOfService;
    private String endOfService;
    private String rootCause;
    private String correctiveAction;
    private String preventiveAction;
    private String expectedClosedDate;
    private String closedDate;
    private String engineerName;
    private String status;

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

    public int getCsrNo() {
        return csrNo;
    }

    public void setCsrNo(int csrNo) {
        this.csrNo = csrNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public List<ServiceSpare> getSpares() {
        return spares;
    }

    public void setSpares(List<ServiceSpare> spares) {
        this.spares = spares;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCustomerProblem() {
        return customerProblem;
    }

    public void setCustomerProblem(String customerProblem) {
        this.customerProblem = customerProblem;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getRectification() {
        return rectification;
    }

    public void setRectification(String rectification) {
        this.rectification = rectification;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getStartOfService() {
        return startOfService;
    }

    public void setStartOfService(String startOfService) {
        this.startOfService = startOfService;
    }

    public String getEndOfService() {
        return endOfService;
    }

    public void setEndOfService(String endOfService) {
        this.endOfService = endOfService;
    }

    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public String getCorrectiveAction() {
        return correctiveAction;
    }

    public void setCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction;
    }

    public String getPreventiveAction() {
        return preventiveAction;
    }

    public void setPreventiveAction(String preventiveAction) {
        this.preventiveAction = preventiveAction;
    }

    public String getExpectedClosedDate() {
        return expectedClosedDate;
    }

    public void setExpectedClosedDate(String expectedClosedDate) {
        this.expectedClosedDate = expectedClosedDate;
    }

    public String getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName){
        this.engineerName=engineerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
