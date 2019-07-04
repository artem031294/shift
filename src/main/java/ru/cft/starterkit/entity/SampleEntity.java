package ru.cft.starterkit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class SampleEntity {

    private Long id;

    private Double price;
    private String status;
    //private Long date1;
    private String date;
    private String productList;

    private Long supID;

    @JsonIgnore
    private UUID baz;

    public SampleEntity() {
    }

    public SampleEntity(String date, Double price, String status, String productList, Long supID, UUID baz) {

        this.baz = baz;

        this.date = date;
        this.price = price;
        this.status = status;
        this.supID = supID;
        this.productList = productList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getBaz() {
        return baz;
    }

    public void setBaz(UUID baz) {
        this.baz = baz;
    }

    //public void setDate() {this.date1 = Instant.now().getEpochSecond();}
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setSupID(Long supID) {
        this.supID = supID;
    }

    public Long getSupID() { return supID; }

    public Double getPrice() { return price; }
    public String getStatus() { return status; }
    public String getDate() { return date; }
    public String getProductList() { return productList; }

}
