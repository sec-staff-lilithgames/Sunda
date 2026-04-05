package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {

    /* renamed from: b, reason: collision with root package name */
    public final Context f48493b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f48494c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.c f48495e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f48496f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f48497g;

    /* renamed from: h, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f48498h;

    /* renamed from: i, reason: collision with root package name */
    public final CoroutineScope f48499i;

    /* renamed from: j, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f48500j;

    /* renamed from: k, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f48501k;

    /* renamed from: l, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f48502l;

    /* renamed from: m, reason: collision with root package name */
    public final i0 f48503m;

    /* renamed from: n, reason: collision with root package name */
    public final MutableStateFlow f48504n;

    /* renamed from: o, reason: collision with root package name */
    public final MutableStateFlow f48505o;

    /* renamed from: p, reason: collision with root package name */
    public final MutableStateFlow f48506p;

    /* renamed from: q, reason: collision with root package name */
    public final MutableStateFlow f48507q;

    /* renamed from: r, reason: collision with root package name */
    public final MutableStateFlow f48508r;

    /* renamed from: s, reason: collision with root package name */
    public final MutableStateFlow f48509s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48510i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f48512k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f48513l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u$a$a, reason: collision with other inner class name */
        public static final class C0440a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f48514a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f48515b;

            public C0440a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, u uVar) {
                this.f48514a = hVar;
                this.f48515b = uVar;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            public void a() {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48514a;
                if (hVar != null) {
                    hVar.a();
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                kotlin.jvm.internal.e0.checkNotNullParameter(timeoutError, "timeoutError");
                u uVar = this.f48515b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o creativeType = uVar.getCreativeType();
                int i10 = creativeType == null ? -1 : t.f48309a[creativeType.ordinal()];
                if (i10 == -1) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, u.c(uVar), "creativeType is null", null, false, 12, null);
                    return;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48514a;
                if (i10 == 1) {
                    if (hVar != null) {
                        hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f47660g);
                    }
                } else if (i10 == 2) {
                    if (hVar != null) {
                        hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f47661h);
                    }
                } else {
                    if (i10 != 3) {
                        throw new tu.t();
                    }
                    if (hVar != null) {
                        hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f47662i);
                    }
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                kotlin.jvm.internal.e0.checkNotNullParameter(internalError, "internalError");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48514a;
                if (hVar != null) {
                    hVar.a(internalError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48512k = j10;
            this.f48513l = hVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return u.this.new a(this.f48512k, this.f48513l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48510i;
            u uVar = u.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                this.f48510i = 1;
                if (uVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarO = uVar.o();
            if (rVarO != null) {
                rVarO.a(this.f48512k, new C0440a(this.f48513l, uVar));
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public u f48516i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f48517j;

        /* renamed from: l, reason: collision with root package name */
        public int f48519l;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48517j = obj;
            this.f48519l |= Integer.MIN_VALUE;
            return u.this.b(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f48520i;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((c) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = u.this.new c(dVar);
            cVar.f48520i = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            u.this.f48504n.setValue(bv.b.boxBoolean(this.f48520i));
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f48522i;

        public d(zu.d<? super d> dVar) {
            super(2, dVar);
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((d) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = u.this.new d(dVar);
            dVar2.f48522i = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            u.this.f48506p.setValue(bv.b.boxBoolean(this.f48522i));
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f48524i;

        public e(zu.d<? super e> dVar) {
            super(2, dVar);
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((e) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            e eVar = u.this.new e(dVar);
            eVar.f48524i = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            u.this.f48508r.setValue(bv.b.boxBoolean(this.f48524i));
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {
        public f(zu.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return u.this.new f(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            z zVar = z.f50224a;
            u uVar = u.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVarC = zVar.c(uVar.f48495e.a());
            uVar.f48498h = oVarC;
            return oVarC;
        }
    }

    public u(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar, com.moloco.sdk.internal.ortb.model.c bid, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        this.f48493b = context;
        this.f48494c = customUserEventBuilderService;
        this.f48495e = bid;
        this.f48496f = externalLinkHandler;
        this.f48497g = watermark;
        this.f48498h = oVar;
        this.f48499i = com.google.android.gms.internal.play_billing.a.o();
        this.f48503m = new i0();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f48504n = MutableStateFlow;
        this.f48505o = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f48506p = MutableStateFlow2;
        this.f48507q = MutableStateFlow2;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.f48508r = MutableStateFlow3;
        this.f48509s = MutableStateFlow3;
    }

    public static final /* synthetic */ String c(u uVar) {
        uVar.getClass();
        return "AggregatedFullscreenAd";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f48499i, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarO = o();
        if (rVarO != null) {
            rVarO.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f48498h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f48505o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public StateFlow<Boolean> k() {
        return this.f48509s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return this.f48507q;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r o() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar = this.f48500j;
        if (rVar != null) {
            return rVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar2 = this.f48501k;
        return rVar2 == null ? this.f48502l : rVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zu.d<? super tu.x0> r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u.b(zu.d):java.lang.Object");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f48499i, null, null, new a(j10, hVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar) {
        x0 x0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar = this.f48500j;
        if (rVar != null) {
            rVar.a(options.c(), mVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar2 = this.f48501k;
        if (rVar2 != null) {
            rVar2.a(options.a(), mVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar3 = this.f48502l;
        if (rVar3 != null) {
            rVar3.a(options.b(), mVar);
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var != null || mVar == null) {
            return;
        }
        mVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f47668b);
    }
}
