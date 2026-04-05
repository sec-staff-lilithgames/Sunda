package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.api.proto.Consent;
import kotlin.jvm.internal.e0;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentCoreKt {
    public static final ConsentCore convertTo(Consent consent) {
        e0.checkNotNullParameter(consent, "<this>");
        return new ConsentCore(consent.getConsentString(), y0.toList(consent.getSpecialFeatureOptIns()), y0.toList(consent.getPurposesConsent()), y0.toList(consent.getPurposesLITransparency()), y0.toList(consent.getVendorsConsent()), y0.toList(consent.getVendorLIT()), consent.getCmpVersion(), consent.getUuid(), consent.getType(), consent.getCmpHash(), consent.getCmpHashVersion(), p1.toMap(consent.getExternalIds()));
    }
}
