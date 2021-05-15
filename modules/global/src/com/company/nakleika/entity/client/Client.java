package com.company.nakleika.entity.client;

import com.company.nakleika.entity.dict.ECity;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
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

    public void setCity(ECity city) {
        this.city = city == null ? null : city.getId();
    }

    public ECity getCity() {
        return city == null ? null : ECity.fromId(city);
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