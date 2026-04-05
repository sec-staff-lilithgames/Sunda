package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r implements j {

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f46921b;

    /* renamed from: c, reason: collision with root package name */
    public q f46922c;

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

    public r(kv.a _ilrdService) {
        e0.checkNotNullParameter(_ilrdService, "_ilrdService");
        this.f46921b = _ilrdService;
        this.f46922c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46922c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        q qVarF = f();
        boolean z10 = !e0.areEqual(qVarF, this.f46922c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "[Ilrd] needsRefresh: " + z10 + ", with current: " + qVarF + ", cached: " + this.f46922c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "IlrdSignalProvider";
    }

    public final q e() {
        return new q("", -1L, -1L, -1, -1, -1, -1, -1);
    }

    public final q f() {
        q qVarB;
        try {
            com.moloco.sdk.internal.ilrd.k kVar = (com.moloco.sdk.internal.ilrd.k) this.f46921b.invoke();
            if (kVar != null && (qVarB = kVar.b()) != null) {
                return qVarB;
            }
            return e();
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "Error retrieving ILRD signal", e10, false, 8, null);
            return e();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public q d() {
        return this.f46922c;
    }
}
