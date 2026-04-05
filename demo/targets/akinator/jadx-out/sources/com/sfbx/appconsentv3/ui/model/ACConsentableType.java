package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.ConsentableType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum ACConsentableType {
    PURPOSE,
    SPECIAL_PURPOSE,
    FEATURE,
    SPECIAL_FEATURE,
    STACK,
    EXTRA_PURPOSE,
    EXTRA_SPECIAL_PURPOSE,
    EXTRA_FEATURE,
    EXTRA_SPECIAL_FEATURE,
    UNKNOWN;

    public final ConsentableType convertTo$appconsent_ui_v3_prodXchangeRelease() {
        return ConsentableType.valueOf(name());
    }
}
