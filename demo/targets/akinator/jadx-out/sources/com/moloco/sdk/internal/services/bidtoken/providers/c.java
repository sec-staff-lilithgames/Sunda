package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements j {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.p f46879b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.internal.services.o f46880c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public c(com.moloco.sdk.internal.services.p advertisingService) {
        e0.checkNotNullParameter(advertisingService, "advertisingService");
        this.f46879b = advertisingService;
        this.f46880c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46880c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z10 = !e0.areEqual(this.f46880c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", o2.n("[CBT][ASP]: needsRefresh: ", z10), false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "AdvertisingSignalProvider";
    }

    public final com.moloco.sdk.internal.services.o e() {
        com.moloco.sdk.internal.services.o oVarA = this.f46879b.a();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: adData: " + oVarA, false, 4, null);
        return oVarA;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.o d() {
        return e();
    }
}
