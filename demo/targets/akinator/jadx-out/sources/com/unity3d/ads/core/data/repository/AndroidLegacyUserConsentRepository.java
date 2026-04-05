package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidLegacyUserConsentRepository implements LegacyUserConsentRepository {
    private final LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(LegacyUserConsentDataSource legacyUserConsentDataSource) {
        e0.checkNotNullParameter(legacyUserConsentDataSource, "legacyUserConsentDataSource");
        this.legacyUserConsentDataSource = legacyUserConsentDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.LegacyUserConsentRepository
    public String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}
