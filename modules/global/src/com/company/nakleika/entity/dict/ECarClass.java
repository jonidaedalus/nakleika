package com.company.nakleika.entity.dict;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ECarClass implements EnumClass<String> {

    ECONOM("ECONOM"),
    COMFORT("COMFORT"),
    BUSINESS("BUSINESS"),
    TRUCK("TRUCK");

    private String id;

    ECarClass(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ECarClass fromId(String id) {
        for (ECarClass at : ECarClass.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}