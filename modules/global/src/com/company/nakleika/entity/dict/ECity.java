package com.company.nakleika.entity.dict;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ECity implements EnumClass<String> {

    ALMATY("ALMATY"),
    NUR_SULTAN("NUR_SULTAN");

    private String id;

    ECity(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ECity fromId(String id) {
        for (ECity at : ECity.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}