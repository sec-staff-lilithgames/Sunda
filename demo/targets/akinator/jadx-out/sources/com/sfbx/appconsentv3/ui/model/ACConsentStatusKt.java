package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.ConsentStatus;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACConsentStatusKt {
    public static final ACConsentStatus convertTo(ConsentStatus consentStatus) {
        e0.checkNotNullParameter(consentStatus, "<this>");
        return ACConsentStatus.valueOf(consentStatus.name());
    }
}
