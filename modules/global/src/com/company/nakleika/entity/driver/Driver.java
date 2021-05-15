package com.company.nakleika.entity.driver;

import com.company.nakleika.entity.car.Car;
import com.company.nakleika.entity.client.Client;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "NAKLEIKA_DRIVER")
@Entity(name = "nakleika_Driver")
public class Driver extends Client {
    private static final long serialVersionUID = 161144632629047915L;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CAR_ID")
    @NotNull
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    //BALANCE, STATISTICS

}