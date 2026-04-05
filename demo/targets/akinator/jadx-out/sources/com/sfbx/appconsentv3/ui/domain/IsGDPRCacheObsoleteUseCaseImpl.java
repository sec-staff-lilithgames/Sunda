package com.sfbx.appconsentv3.ui.domain;

import com.sfbx.appconsent.core.AppConsentCore;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IsGDPRCacheObsoleteUseCaseImpl implements IsGDPRCacheObsoleteUseCase {
    private final AppConsentCore appConsentCore;

    public IsGDPRCacheObsoleteUseCaseImpl(AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.appConsentCore = appConsentCore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sfbx.appconsentv3.ui.domain.SimpleDirectUseCase
    public Boolean get() {
        return Boolean.valueOf(this.appConsentCore.isGDPRCacheObsolete());
    }
}
