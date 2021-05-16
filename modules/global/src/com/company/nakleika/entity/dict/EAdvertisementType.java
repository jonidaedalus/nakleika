package com.company.nakleika.entity.dict;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum EAdvertisementType implements EnumClass<String> {

    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE");

    private String id;

    EAdvertisementType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EAdvertisementType fromId(String id) {
        for (EAdvertisementType at : EAdvertisementType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}