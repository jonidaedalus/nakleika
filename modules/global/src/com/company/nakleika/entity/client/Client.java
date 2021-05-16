package com.company.nakleika.entity.client;

import com.company.nakleika.entity.dict.ECity;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@MappedSuperclass
public class Client extends StandardEntity {
    private static final long serialVersionUID = -6911287770545708947L;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    @Pattern(message = "{msg://Client.fullName.validation.Pattern}", regexp = "^\\+?77([0124567][0-8]\\d{7})$")
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