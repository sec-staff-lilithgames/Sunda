package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.FloatingConsent;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FloatingConsentCoreKt {
    public static final FloatingConsentCore convertTo(FloatingConsent floatingConsent) {
        e0.checkNotNullParameter(floatingConsent, "<this>");
        String id2 = floatingConsent.getId();
        Map<String, String> externalIds = floatingConsent.getExternalIds();
        Map map = externalIds != null ? p1.toMap(externalIds) : null;
        Integer version = floatingConsent.getVersion();
        String uuid = floatingConsent.getUuid();
        String strValueOf = String.valueOf(floatingConsent.getGivenAt());
        ConsentStatus status = floatingConsent.getStatus();
        return new FloatingConsentCore(id2, map, version, uuid, strValueOf, status != null ? ACConsentStatusKt.convertTo(status) : null);
    }
}
