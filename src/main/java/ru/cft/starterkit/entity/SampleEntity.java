package ru.cft.starterkit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class SampleEntity {

    private Long id;

    private String foo;

    private Double bar;

    private Double price;
    private String status;
    private Long date;

    @JsonIgnore
    private UUID baz;

    public SampleEntity() {
    }

    public SampleEntity(String foo, Double bar, Double price, String status, UUID baz) {
        this.foo = foo;
        this.bar = bar;
        this.baz = baz;
        this.price = price;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public Double getBar() {
        return bar;
    }

    public void setBar(Double bar) {
        this.bar = bar;
    }

    public UUID getBaz() {
        return baz;
    }

    public void setBaz(UUID baz) {
        this.baz = baz;
    }

    public void setDate() {
        this.date = Instant.now().getEpochSecond();
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrice() { return price; }
    public Long getDate() { return date; }
    public String getStatus() { return status; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SampleEntity)) return false;
        SampleEntity entity = (SampleEntity) o;
        return Objects.equals(id, entity.id) &&
               Objects.equals(foo, entity.foo) &&
               Objects.equals(bar, entity.bar) &&
               Objects.equals(baz, entity.baz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, foo, bar, baz);
    }

    @Override
    public String toString() {
        return "SampleEntity{" +
               "id=" + id +
               ", foo='" + foo + '\'' +
               ", bar=" + bar +
               ", baz=" + baz +
               '}';
    }

}
