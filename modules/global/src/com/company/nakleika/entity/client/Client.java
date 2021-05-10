package com.company.nakleika.entity.client;

import com.company.nakleika.entity.client.dict.DCity;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "NAKLEIKA_CLIENT")
@Entity(name = "nakleika_Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -6911287770545708947L;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    private String phoneNumber;

    @NotNull
    @Column(name = "CITY", nullable = false)
    private String city;

    public DCity getCity() {
        return city == null ? null : DCity.fromId(city);
    }

    public void setCity(DCity city) {
        this.city = city == null ? null : city.getId();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}