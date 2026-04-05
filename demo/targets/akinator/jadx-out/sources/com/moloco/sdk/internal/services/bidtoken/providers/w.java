package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w implements j {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.x f46934b;

    /* renamed from: c, reason: collision with root package name */
    public MolocoPrivacy.PrivacySettings f46935c;

    public w(com.moloco.sdk.internal.services.bidtoken.x privacyProvider) {
        e0.checkNotNullParameter(privacyProvider, "privacyProvider");
        this.f46934b = privacyProvider;
        this.f46935c = privacyProvider.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46935c = this.f46934b.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean zAreEqual = e0.areEqual(this.f46935c, this.f46934b.getPrivacy());
        boolean z10 = !zAreEqual;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "PrivacyStateSignalProvider", !zAreEqual ? "[CBT] privacy updated" : "[CBT] privacy didn't change", false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "PrivacyStateSignalProvider";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MolocoPrivacy.PrivacySettings d() {
        return this.f46935c;
    }
}
