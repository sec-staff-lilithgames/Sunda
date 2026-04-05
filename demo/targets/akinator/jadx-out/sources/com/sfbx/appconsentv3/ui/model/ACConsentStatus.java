package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.ConsentStatus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum ACConsentStatus {
    PENDING(0),
    ALLOWED(1),
    MIXED(2),
    DISALLOWED(-1),
    UNDEFINED(-2);

    private final int value;

    ACConsentStatus(int i10) {
        this.value = i10;
    }

    public final ConsentStatus convertTo$appconsent_ui_v3_prodXchangeRelease() {
        return ConsentStatus.valueOf(name());
    }

    public final int getValue$appconsent_ui_v3_prodXchangeRelease() {
        return this.value;
    }
}
