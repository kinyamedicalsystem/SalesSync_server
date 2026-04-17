package com.example.Integrate.Modal;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Installation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String customerName;
    private String city;
    private String customerContact;
    private String address;
    private String invoiceNo;
    private String invoiceDate;
    private String installationDate;
    private String engineerName;
    private String engineerContact;
    @OneToMany(mappedBy = "installation", cascade=CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    //@JsonManagedReference
    private List<InstallationItems> items;
    private Integer warranty;
    private String demoGiven;
    private String trainingGiven;
    private String eventStart;
    private String eventEnd;

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
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(String installationDate) {
        this.installationDate = installationDate;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public String getEngineerContact() {
        return engineerContact;
    }

    public void setEngineerContact(String engineerContact) {
        this.engineerContact = engineerContact;
    }

    public List<InstallationItems> getItems() {
        return items;
    }

    public void setItems(List<InstallationItems> items) {
        this.items = items;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
    }

    public String getDemoGiven() {
        return demoGiven;
    }

    public void setDemoGiven(String demoGiven) {
        this.demoGiven = demoGiven;
    }

    public String getTrainingGiven() {
        return trainingGiven;
    }

    public void setTrainingGiven(String trainingGiven) {
        this.trainingGiven = trainingGiven;
    }

    public String getEventStart() {
        return eventStart;
    }

    public void setEventStart(String eventStart) {
        this.eventStart = eventStart;
    }

    public String getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(String eventEnd) {
        this.eventEnd = eventEnd;
    }
}
