package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.ConsentableType;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACConsentableTypeKt {
    public static final ACConsentableType convertTo(ConsentableType consentableType) {
        e0.checkNotNullParameter(consentableType, "<this>");
        return ACConsentableType.valueOf(consentableType.name());
    }
}
