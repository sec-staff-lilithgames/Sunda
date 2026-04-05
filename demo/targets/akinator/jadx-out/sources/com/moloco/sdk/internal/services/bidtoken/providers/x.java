package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Moloco;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class x implements j {

    /* renamed from: b, reason: collision with root package name */
    public boolean f46936b = Moloco.isInitialized();

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46936b = Moloco.isInitialized();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        StringBuilder sb2;
        boolean z10 = this.f46936b;
        boolean zIsInitialized = Moloco.isInitialized();
        boolean z11 = z10 != zIsInitialized;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        if (z11) {
            sb2 = new StringBuilder("[CBT] sdkInitialized updated from ");
            sb2.append(z10);
            sb2.append(" to ");
            sb2.append(zIsInitialized);
        } else {
            sb2 = new StringBuilder("[CBT] sdkInitialized didn't change (before: ");
            sb2.append(z10);
            sb2.append(", after: ");
            sb2.append(zIsInitialized);
            sb2.append(')');
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, "SDKInitStateSignalProvider", sb2.toString(), false, 4, null);
        return z11;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "SDKInitStateSignalProvider";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean d() {
        return Boolean.valueOf(this.f46936b);
    }
}
