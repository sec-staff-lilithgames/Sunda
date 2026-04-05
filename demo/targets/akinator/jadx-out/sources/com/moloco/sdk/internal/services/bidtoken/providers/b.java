package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.m f46877b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.internal.services.bidtoken.providers.a f46878c;

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

    public b(com.moloco.sdk.internal.services.m accessibilityInfoService) {
        e0.checkNotNullParameter(accessibilityInfoService, "accessibilityInfoService");
        this.f46877b = accessibilityInfoService;
        this.f46878c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46878c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.a aVarE = e();
        boolean z10 = !e0.areEqual(aVarE, this.f46878c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] needsRefresh: " + z10 + ", with current: " + aVarE + ", cached: " + this.f46878c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "AcSignalProvider";
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.a e() {
        com.moloco.sdk.internal.services.m mVar = this.f46877b;
        try {
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(Boolean.valueOf(mVar.c()), Boolean.valueOf(mVar.b()), Boolean.valueOf(mVar.a()), Float.valueOf(mVar.getFontScale()));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] ACS Error", e10, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.a d() {
        return this.f46878c;
    }
}
