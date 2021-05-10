package com.company.nakleika.entity.client.dict;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DCity implements EnumClass<String> {

    ALMATY("Almaty");

    private String id;

    DCity(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DCity fromId(String id) {
        for (DCity at : DCity.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}