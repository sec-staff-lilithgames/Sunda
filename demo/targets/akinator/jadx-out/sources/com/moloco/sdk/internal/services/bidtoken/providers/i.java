package com.moloco.sdk.internal.services.bidtoken.providers;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.a0;
import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements j {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f46891b;

    /* renamed from: c, reason: collision with root package name */
    public h f46892c;

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

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46892c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z10 = !e0.areEqual(this.f46892c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", o2.n("[CBT][BIS]: needsRefresh: ", z10), false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "BInfoSignalProvider";
    }

    public final h e() {
        a0 a0Var = this.f46891b;
        try {
            h hVar = new h(Integer.valueOf(a0Var.b()), Integer.valueOf(a0Var.a()), Boolean.valueOf(a0Var.c()));
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: blev: " + hVar.e() + ", bst: " + hVar.d() + ", psm: " + hVar.f(), false, 4, null);
            return hVar;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: Error", e10, false, 8, null);
            return new h(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public h d() {
        return this.f46892c;
    }

    public i(a0 a0Var) {
        e0.checkNotNullParameter(a0Var, duhsDlGWdBkekB.EEXgRoC);
        this.f46891b = a0Var;
        this.f46892c = e();
    }
}
