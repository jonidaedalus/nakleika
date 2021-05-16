package com.company.nakleika.entity.advertisement;

import com.company.nakleika.entity.advertiser.Advertiser;
import com.company.nakleika.entity.dict.EAdvertisementType;
import com.company.nakleika.entity.dict.ECarClass;
import com.company.nakleika.entity.sticker.Sticker;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "NAKLEIKA_ADVERTISEMENT")
@Entity(name = "nakleika_Advertisement")
public class Advertisement extends StandardEntity {
    private static final long serialVersionUID = 7186263107910531730L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADVERTISER_ID")
    private Advertiser advertiser;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    private String type;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STICKER_ID")
    private Sticker sticker;

    @NotNull
    @Column(name = "BUDGET", nullable = false)
    private BigDecimal budget;

    @NotNull
    @Column(name = "CAR_CLASS", nullable = false)
    private String carClass;

    public ECarClass getCarClass() {
        return carClass == null ? null : ECarClass.fromId(carClass);
    }

    public void setCarClass(ECarClass carClass) {
        this.carClass = carClass == null ? null : carClass.getId();
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public EAdvertisementType getType() {
        return type == null ? null : EAdvertisementType.fromId(type);
    }

    public void setType(EAdvertisementType type) {
        this.type = type == null ? null : type.getId();
    }


    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }
}