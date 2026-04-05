package com.google.gson;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum c extends j {
    public c() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.FieldNamingStrategy
    public String translateName(Field field) {
        return field.getName();
    }
}
