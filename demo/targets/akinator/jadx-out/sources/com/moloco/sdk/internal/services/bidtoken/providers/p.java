package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.i0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p implements j {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f46910b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.f f46911c;

    /* renamed from: d, reason: collision with root package name */
    public o f46912d;

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

    public p(i0 deviceInfoService, com.moloco.sdk.internal.services.f screenInfoService) {
        e0.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        e0.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.f46910b = deviceInfoService;
        this.f46911c = screenInfoService;
        this.f46912d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46912d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        o oVarE = e();
        boolean z10 = !e0.areEqual(oVarE, this.f46912d);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP needsRefresh: " + z10 + ", with current: " + oVarE + ", cached: " + this.f46912d, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "DSignalProvider";
    }

    public final o e() {
        i0 i0Var = this.f46910b;
        try {
            return new o(this.f46911c.b(), i0Var.c(), i0Var.d());
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP Error", e10, false, 8, null);
            return new o(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public o d() {
        return this.f46912d;
    }
}
