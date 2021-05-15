package com.company.nakleika.entity.dict;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "NAKLEIKA_D_CAR_MODEL")
@Entity(name = "nakleika_DCarModel")
@NamePattern("%s %s|brand,name")
public class DCarModel extends BaseUuidEntity {
    private static final long serialVersionUID = -3359226468058021035L;

    @NotNull
    @Column(name = "BRAND", nullable = false)
    private String brand;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(ECarBrand brand) {
        this.brand = brand == null ? null : brand.getId();
    }

    public ECarBrand getBrand() {
        return brand == null ? null : ECarBrand.fromId(brand);
    }

}