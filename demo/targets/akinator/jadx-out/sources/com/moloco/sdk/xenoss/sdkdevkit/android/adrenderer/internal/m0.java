package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.jvm.internal.c1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

    /* renamed from: b, reason: collision with root package name */
    public final Context f47868b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47869c;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f47870e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f f47871f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l f47872g;

    /* renamed from: h, reason: collision with root package name */
    public final MraidActivity.a f47873h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f47874i;

    /* renamed from: j, reason: collision with root package name */
    public final CoroutineScope f47875j;

    /* renamed from: k, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f47876k;

    /* renamed from: l, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f47877l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f47878m;

    /* renamed from: n, reason: collision with root package name */
    public final MutableStateFlow f47879n;

    /* renamed from: o, reason: collision with root package name */
    public final MutableStateFlow f47880o;

    /* renamed from: p, reason: collision with root package name */
    public final MutableStateFlow f47881p;

    /* renamed from: q, reason: collision with root package name */
    public final MutableStateFlow f47882q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.l {
        public a(Object obj) {
            super(1, obj, m0.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d p02) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            ((m0) this.receiver).a(p02);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.a {
        public b(Object obj) {
            super(0, obj, m0.class, "destroy", "destroy()V", 0);
        }

        public final void a() {
            ((m0) this.receiver).destroy();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class c extends kotlin.jvm.internal.a0 implements kv.a {
        public c(Object obj) {
            super(0, obj, m0.class, "onForciblyClosed", "onForciblyClosed()V", 0);
        }

        public final void a() {
            ((m0) this.receiver).o();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    public m0(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, k0 mraidAdLoader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f mraidBaseAd, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l mraidFullscreenController, MraidActivity.a mraidActivity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidActivity, "mraidActivity");
        this.f47868b = context;
        this.f47869c = watermark;
        this.f47870e = mraidAdLoader;
        this.f47871f = mraidBaseAd;
        this.f47872g = mraidFullscreenController;
        this.f47873h = mraidActivity;
        this.f47874i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50234c;
        this.f47875j = com.google.android.gms.internal.play_billing.a.o();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f47879n = MutableStateFlow;
        this.f47880o = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f47881p = MutableStateFlow2;
        this.f47882q = MutableStateFlow2;
    }

    public static Object b(m0 m0Var) {
        return c1.property0(new kotlin.jvm.internal.q0(m0Var.f47870e, k0.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f47875j, null, 1, null);
        this.f47871f.destroy();
        this.f47879n.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f47874i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f47870e.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public StateFlow<Boolean> k() {
        return this.f47882q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return this.f47880o;
    }

    public final void o() {
        this.f47881p.setValue(Boolean.TRUE);
    }

    public static final x0 b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        if (kVar != null) {
            kVar.a();
        }
        return x0.f87415a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        this.f47876k = hVar;
        this.f47871f.a(new a(this));
        this.f47870e.a(j10, hVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        this.f47871f.a(new a1.e(kVar, 17));
        this.f47877l = kVar;
        this.f47878m = true;
        com.moloco.sdk.internal.w wVarA = this.f47870e.a();
        if (wVarA instanceof w.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) ((w.a) wVarA).a();
            if (kVar != null) {
                kVar.a(dVar);
                return;
            }
            return;
        }
        if (wVarA instanceof w.b) {
            if (this.f47873h.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d) ((w.b) wVarA).a(), this.f47872g, this.f47868b, options, this.f47869c, new b(this), new c(this))) {
                this.f47879n.setValue(Boolean.TRUE);
                return;
            } else {
                if (kVar != null) {
                    kVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f47680l);
                    return;
                }
                return;
            }
        }
        throw new tu.t();
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        if (this.f47878m) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar = this.f47877l;
            if (kVar != null) {
                kVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.b(dVar));
                return;
            }
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f47876k;
        if (hVar != null) {
            hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.b(dVar));
        }
    }
}
