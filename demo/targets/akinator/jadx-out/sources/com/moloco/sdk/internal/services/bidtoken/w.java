package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final InternalMolocoPrivacySettings f46960a;

    public w(InternalMolocoPrivacySettings internalMolocoPrivacySettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalMolocoPrivacySettings, "internalMolocoPrivacySettings");
        this.f46960a = internalMolocoPrivacySettings;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.x
    public MolocoPrivacy.PrivacySettings getPrivacy() {
        return this.f46960a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }
}
