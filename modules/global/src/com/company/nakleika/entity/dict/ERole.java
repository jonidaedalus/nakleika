package com.company.nakleika.entity.dict;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ERole implements EnumClass<String> {

    ;

    private String id;

    ERole(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ERole fromId(String id) {
        for (ERole at : ERole.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}