package com.company.nakleika.entity.dict;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ECarBrand implements EnumClass<String> {

    TOYOTA("TOYOTA"),
    MERCEDES("MERCEDES"),
    HYUNDAI("HYUNDAI"),
    LADA("LADA");

    private String id;

    ECarBrand(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ECarBrand fromId(String id) {
        for (ECarBrand at : ECarBrand.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}