package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q {

    /* renamed from: b, reason: collision with root package name */
    public final String f48034b;

    /* renamed from: c, reason: collision with root package name */
    public final u f48035c;

    /* renamed from: e, reason: collision with root package name */
    public kv.a f48036e;

    /* renamed from: f, reason: collision with root package name */
    public kv.l f48037f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f48038g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f48039h;

    /* renamed from: i, reason: collision with root package name */
    public final h f48040i;

    /* renamed from: j, reason: collision with root package name */
    public final String f48041j;

    /* renamed from: k, reason: collision with root package name */
    public final CoroutineScope f48042k;

    /* renamed from: l, reason: collision with root package name */
    public w f48043l;

    /* renamed from: m, reason: collision with root package name */
    public final x f48044m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48045i;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d dVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48045i;
            f fVar = f.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                h hVarJ = fVar.J();
                String str = fVar.f48034b;
                this.f48045i = 1;
                obj = hVarJ.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.w wVar = (com.moloco.sdk.internal.w) obj;
            boolean z10 = wVar instanceof w.a;
            if (z10) {
                return wVar;
            }
            h hVarJ2 = fVar.J();
            hVarJ2.a(false, false, false, false, true);
            hVarJ2.a(fVar.f48035c);
            hVarJ2.a(fVar.f48044m.m().getValue().booleanValue());
            hVarJ2.a(fVar.f48044m.k().getValue().a());
            fVar.b(w.f48133e);
            fVar.V();
            fVar.W();
            fVar.X();
            hVarJ2.j();
            if (wVar instanceof w.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, fVar.f48041j, "Mraid Html data successfully loaded", null, false, 12, null);
                dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d) ((w.b) wVar).a();
            } else {
                if (!z10) {
                    throw new tu.t();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, fVar.f48041j, "Mraid Html data load failed.", null, false, 12, null);
                dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d(null, 1, null);
            }
            fVar.getClass();
            return wVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48047i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f48049i;

            public a(zu.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, zu.d<? super Boolean> dVar2) {
                return ((a) create(dVar, dVar2)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f48049i = obj;
                return aVar;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                return bv.b.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.f48049i) != null);
            }
        }

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48047i;
            f fVar = f.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> stateFlowX = fVar.J().x();
                a aVar = new a(null);
                this.f48047i = 1;
                obj = FlowKt.first(stateFlowX, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
            if (dVar != null) {
                int i11 = g.f48056a[fVar.f48035c.ordinal()];
                if (i11 == 1) {
                    fVar.S().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.b(dVar));
                } else {
                    if (i11 != 2) {
                        throw new tu.t();
                    }
                    fVar.S().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.a(dVar));
                }
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f48050i;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, zu.d<? super x0> dVar) {
            return ((c) create(pVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = f.this.new c(dVar);
            cVar.f48050i = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            p pVar = (p) this.f48050i;
            boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(pVar, p.a.f48099c);
            f fVar = f.this;
            if (zAreEqual) {
                fVar.T();
            } else if (pVar instanceof p.d) {
                fVar.a((p.d) pVar);
            } else if (!(pVar instanceof p.f)) {
                if (pVar instanceof p.c) {
                    fVar.a((p.c) pVar);
                } else {
                    fVar.J().a(pVar, "unsupported command: " + pVar.a());
                }
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f48052i;

        public d(zu.d<? super d> dVar) {
            super(2, dVar);
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((d) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = f.this.new d(dVar);
            dVar2.f48052i = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            f.this.J().a(this.f48052i);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f48054i;

        public e(zu.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(x.a aVar, zu.d<? super x0> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            e eVar = f.this.new e(dVar);
            eVar.f48054i = obj;
            return eVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            f.this.J().a(((x.a) this.f48054i).a());
            return x0.f87415a;
        }
    }

    public f(Context context, String adm, u mraidPlacementType, kv.a onClick, kv.l onError, e0 externalLinkHandler, boolean z10, h mraidBridge) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidPlacementType, "mraidPlacementType");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.e0.checkNotNullParameter(onError, "onError");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidBridge, "mraidBridge");
        this.f48034b = adm;
        this.f48035c = mraidPlacementType;
        this.f48036e = onClick;
        this.f48037f = onError;
        this.f48038g = externalLinkHandler;
        this.f48039h = z10;
        this.f48040i = mraidBridge;
        this.f48041j = "MraidBaseAd";
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f48042k = coroutineScopeO;
        this.f48044m = new x(mraidBridge.c(), context, coroutineScopeO);
    }

    public final h J() {
        return this.f48040i;
    }

    public final kv.a K() {
        return this.f48036e;
    }

    public final kv.l S() {
        return this.f48037f;
    }

    public final void T() {
        if (this.f48044m.m().getValue().booleanValue()) {
            t();
        } else {
            this.f48040i.a(p.a.f48099c, "Can't close ad when mraid container is not visible to the user");
        }
    }

    public final void V() {
        BuildersKt__Builders_commonKt.launch$default(this.f48042k, null, null, new b(null), 3, null);
    }

    public final void W() {
        FlowKt.launchIn(FlowKt.onEach(this.f48040i.w(), new c(null)), this.f48042k);
    }

    public final void X() {
        x xVar = this.f48044m;
        Flow flowOnEach = FlowKt.onEach(xVar.m(), new d(null));
        CoroutineScope coroutineScope = this.f48042k;
        FlowKt.launchIn(flowOnEach, coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(xVar.k(), new e(null)), coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f48042k, null, 1, null);
        this.f48040i.destroy();
        this.f48044m.destroy();
    }

    public void t() {
        if (this.f48043l == w.f48135g) {
            b(w.f48133e);
        }
    }

    public final void b(w wVar) {
        this.f48043l = wVar;
        if (wVar != null) {
            this.f48040i.a(wVar);
        }
    }

    public final Object b(zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt__Builders_commonKt.async$default(this.f48042k, null, null, new a(null), 3, null).await(dVar);
    }

    public final void a(kv.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
        this.f48036e = aVar;
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return x0.f87415a;
    }

    public final void a(kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
        this.f48037f = lVar;
    }

    public final void a(p.d dVar) {
        if (this.f48044m.m().getValue().booleanValue()) {
            String string = dVar.b().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            this.f48038g.a(string);
            this.f48036e.invoke();
            return;
        }
        this.f48040i.a(dVar, "Can't open links when mraid container is not visible to the user");
    }

    public final void a(p.c cVar) {
        boolean z10 = this.f48039h;
        h hVar = this.f48040i;
        if (z10) {
            hVar.a(cVar, "expand() is force blocked for the current ad");
            return;
        }
        if (!this.f48044m.m().getValue().booleanValue()) {
            hVar.a(cVar, "Can't expand() when mraid container is not visible to the user");
            return;
        }
        if (this.f48043l != w.f48133e) {
            hVar.a(cVar, "In order to expand() mraid ad, container must be in Default view state");
            return;
        }
        if (this.f48035c == u.f48119e) {
            hVar.a(cVar, "expand() is not supported for interstitials");
        } else if (cVar.b() != null) {
            hVar.a(cVar, "Two-part expand is not supported yet");
        } else {
            U();
            b(w.f48135g);
        }
    }

    public /* synthetic */ f(Context context, String str, u uVar, kv.a aVar, kv.l lVar, e0 e0Var, boolean z10, h hVar, int i10, kotlin.jvm.internal.u uVar2) {
        this(context, str, uVar, (i10 & 8) != 0 ? new com.moloco.sdk.service_locator.b(6) : aVar, (i10 & 16) != 0 ? new a1.o(14) : lVar, e0Var, (i10 & 64) != 0 ? false : z10, hVar);
    }

    public void U() {
    }
}
