package com.company.nakleika.entity.car;

import com.company.nakleika.entity.dict.DCarColor;
import com.company.nakleika.entity.dict.DCarModel;
import com.company.nakleika.entity.dict.ECarClass;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "NAKLEIKA_CAR")
@Entity(name = "nakleika_Car")
@NamePattern("%s %s (%s)|carModel,plateNumber,color")
public class Car extends StandardEntity {
    private static final long serialVersionUID = -4074106269488848605L;

    @Column(name = "PLATE_NUMBER", nullable = false, unique = true)
    @NotNull
    private String plateNumber;

    @NotNull
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COLOR_ID")
    private DCarColor color;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CAR_MODEL_ID")
    @NotNull
    private DCarModel carModel;

    @NotNull
    @Column(name = "CAR_CLASS", nullable = false)
    private String carClass;

    @NotNull
    @Column(name = "RELEASE_YEAR", nullable = false)
    private Integer releaseYear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_FILE_ID")
    protected FileDescriptor imageFile;

    public void setImageFile(FileDescriptor imageFile) {
        this.imageFile = imageFile;
    }

    public FileDescriptor getImageFile() {
        return imageFile;
    }

    public DCarColor getColor() {
        return color;
    }

    public void setColor(DCarColor color) {
        this.color = color;
    }

    public DCarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(DCarModel carModel) {
        this.carModel = carModel;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public ECarClass getCarClass() {
        return carClass == null ? null : ECarClass.fromId(carClass);
    }

    public void setCarClass(ECarClass carClass) {
        this.carClass = carClass == null ? null : carClass.getId();
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}