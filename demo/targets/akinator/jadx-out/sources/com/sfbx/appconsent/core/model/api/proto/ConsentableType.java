package com.sfbx.appconsent.core.model.api.proto;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum ConsentableType {
    PURPOSE(0),
    FEATURE(1),
    SPECIAL_FEATURE(2),
    SPECIAL_PURPOSE(3);

    private final int value;

    ConsentableType(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
