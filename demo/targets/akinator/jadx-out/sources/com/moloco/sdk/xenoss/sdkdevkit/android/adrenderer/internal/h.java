package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import androidx.lifecycle.c3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import kotlin.jvm.internal.c1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

    /* renamed from: b, reason: collision with root package name */
    public final Context f47794b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47795c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f47796e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineScope f47797f;

    /* renamed from: g, reason: collision with root package name */
    public final f f47798g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f47799h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f47800i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f47801j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f47802k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47803i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 f47805k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 f47806l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0405a extends kotlin.jvm.internal.a0 implements kv.a {
            public C0405a(Object obj) {
                super(0, obj, h.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                h.e((h) this.receiver);
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 d0Var, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f47805k = c0Var;
            this.f47806l = d0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return h.this.new a(this.f47805k, this.f47806l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47803i;
            x0 x0Var = x0.f87415a;
            h hVar = h.this;
            try {
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    com.moloco.sdk.internal.w wVarA = hVar.f47798g.a();
                    boolean z10 = wVarA instanceof w.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var = this.f47805k;
                    if (z10) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((w.a) wVarA).a();
                        if (c0Var != null) {
                            c0Var.a(cVar);
                            return x0Var;
                        }
                    } else {
                        if (!(wVarA instanceof w.b)) {
                            throw new tu.t();
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((w.b) wVarA).a();
                        if (aVar.j().j().exists()) {
                            VastActivity.a aVar2 = VastActivity.f48810f;
                            Context context = hVar.f47794b;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 d0Var = this.f47806l;
                            C0405a c0405a = new C0405a(hVar);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var = hVar.f47795c;
                            c3 c3Var = new c3(8, hVar, c0Var);
                            this.f47803i = 1;
                            if (aVar2.a(aVar, context, d0Var, c0405a, e0Var, c3Var, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastFullscreenAdImpl", "VAST ad media file does not exist", null, false, 12, null);
                            if (c0Var != null) {
                                c0Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n.f47741f);
                            }
                        }
                    }
                    return x0Var;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
                return x0Var;
            } finally {
                hVar.f47799h.setValue(bv.b.boxBoolean(false));
            }
        }

        public static final x0 a(h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            hVar.a(bVar, c0Var);
            return x0.f87415a;
        }
    }

    public h(Context context, com.moloco.sdk.internal.ortb.model.c bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e loadVast, b0 decLoader, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadVast, "loadVast");
        kotlin.jvm.internal.e0.checkNotNullParameter(decLoader, "decLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        this.f47794b = context;
        this.f47795c = watermark;
        this.f47796e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50233b;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f47797f = coroutineScopeO;
        this.f47798g = new f(bid, coroutineScopeO, loadVast, decLoader, z10);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f47799h = MutableStateFlow;
        this.f47800i = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f47801j = MutableStateFlow2;
        this.f47802k = MutableStateFlow2;
    }

    public static final void e(h hVar) {
        hVar.f47801j.setValue(Boolean.TRUE);
        hVar.f47799h.setValue(Boolean.FALSE);
    }

    public static Object f(h hVar) {
        return c1.property0(new kotlin.jvm.internal.q0(hVar.f47798g, f.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f47797f, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f47796e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f47798g.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public StateFlow<Boolean> k() {
        return this.f47802k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return this.f47800i;
    }

    public final void q() {
        this.f47799h.setValue(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        this.f47798g.a(j10, hVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        BuildersKt__Builders_commonKt.launch$default(this.f47797f, null, null, new a(c0Var, options, null), 3, null);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
        if (kotlin.jvm.internal.e0.areEqual(bVar, b.g.f49469a)) {
            q();
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual(bVar, b.C0459b.f49464a)) {
            q();
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual(bVar, b.d.f49466a)) {
            q();
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual(bVar, b.i.f49471a)) {
            if (c0Var != null) {
                c0Var.a(true);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual(bVar, b.c.f49465a)) {
            if (c0Var != null) {
                c0Var.a(false);
            }
        } else if (kotlin.jvm.internal.e0.areEqual(bVar, b.a.f49463a)) {
            if (c0Var != null) {
                c0Var.a();
            }
        } else if (bVar instanceof b.f) {
            if (c0Var != null) {
                c0Var.a(((b.f) bVar).a());
            }
        } else if (!kotlin.jvm.internal.e0.areEqual(bVar, b.h.f49470a) && !kotlin.jvm.internal.e0.areEqual(bVar, b.e.f49467a)) {
            throw new tu.t();
        }
    }
}
