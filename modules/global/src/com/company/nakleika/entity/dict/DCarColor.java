package com.company.nakleika.entity.dict;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "NAKLEIKA_D_CAR_COLOR")
@Entity(name = "nakleika_DCarColor")
@NamePattern("%s|name")
public class DCarColor extends BaseUuidEntity {
    private static final long serialVersionUID = -8986040986798410293L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}