package com.sfbx.appconsent.core.model.gcm;

import io.sfbx.appconsent.core.gcm.modal.GCMConsentResponse;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GCMStatusKt {
    public static final GCMStatus convertTo(GCMConsentResponse gCMConsentResponse) {
        e0.checkNotNullParameter(gCMConsentResponse, "<this>");
        return new GCMStatus(gCMConsentResponse.isAnalyticsStorageGranted(), gCMConsentResponse.isAdStorageGranted(), gCMConsentResponse.isAdUserDataGranted(), gCMConsentResponse.isAdPersonalizationGranted());
    }
}
