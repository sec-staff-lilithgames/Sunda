package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v implements j {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.b f46932b;

    /* renamed from: c, reason: collision with root package name */
    public u f46933c;

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

    public v(com.moloco.sdk.internal.services.b networkInfoService) {
        e0.checkNotNullParameter(networkInfoService, "networkInfoService");
        this.f46932b = networkInfoService;
        this.f46933c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46933c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        u uVarE = e();
        boolean z10 = !e0.areEqual(uVarE, this.f46933c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS needsRefresh: " + z10 + ", with nis: " + uVarE + ", cached: " + this.f46933c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "NISignalProvider";
    }

    public final u e() {
        com.moloco.sdk.internal.services.b bVar = this.f46932b;
        try {
            u uVar = new u(bVar.d(), bVar.b(), Boolean.valueOf(bVar.a()), bVar.c());
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + uVar, false, 4, null);
            return uVar;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS Error", e10, false, 8, null);
            return new u(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public u d() {
        return this.f46933c;
    }
}
