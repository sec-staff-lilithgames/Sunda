package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f {

    /* renamed from: i, reason: collision with root package name */
    public final Context f48200i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.c f48201j;

    /* renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f48202k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f48203l;

    /* renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f48204m;

    /* renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f48205n;

    /* renamed from: o, reason: collision with root package name */
    public final CoroutineScope f48206o;

    /* renamed from: p, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.c0 f48207p;

    /* renamed from: q, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p f48208q;

    /* renamed from: r, reason: collision with root package name */
    public final String f48209r;

    /* renamed from: s, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f48210s;

    /* renamed from: t, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m f48211t;

    /* renamed from: u, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f f48212u;

    /* renamed from: v, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f f48213v;

    /* renamed from: w, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f f48214w;

    /* renamed from: x, reason: collision with root package name */
    public final a f48215x;

    /* renamed from: y, reason: collision with root package name */
    public final MutableStateFlow f48216y;

    /* renamed from: z, reason: collision with root package name */
    public final StateFlow f48217z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i {

        /* renamed from: b, reason: collision with root package name */
        public final MutableStateFlow f48218b;

        /* renamed from: c, reason: collision with root package name */
        public final StateFlow f48219c;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f48221f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r$a$a, reason: collision with other inner class name */
        public static final class C0418a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f48222i;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ r f48224k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f48225l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f48226m;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r$a$a$a, reason: collision with other inner class name */
            public static final class C0419a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f48227a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f48228b;

                public C0419a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, r rVar) {
                    this.f48227a = hVar;
                    this.f48228b = rVar;
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
                public void a() {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48227a;
                    if (hVar != null) {
                        hVar.a();
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(timeoutError, "timeoutError");
                    r rVar = this.f48228b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o creativeType = rVar.getCreativeType();
                    int i10 = creativeType == null ? -1 : q.f48190a[creativeType.ordinal()];
                    if (i10 == -1) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, rVar.f48209r, "creativeType is null", new Throwable(), false, 8, null);
                        return;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48227a;
                    if (i10 == 1) {
                        if (hVar != null) {
                            hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f47663j);
                        }
                    } else if (i10 == 2) {
                        if (hVar != null) {
                            hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f47664k);
                        }
                    } else {
                        if (i10 != 3) {
                            throw new tu.t();
                        }
                        if (hVar != null) {
                            hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f47665l);
                        }
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(internalError, "internalError");
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48227a;
                    if (hVar != null) {
                        hVar.a(internalError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0418a(r rVar, long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, zu.d<? super C0418a> dVar) {
                super(2, dVar);
                this.f48224k = rVar;
                this.f48225l = j10;
                this.f48226m = hVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0418a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return a.this.new C0418a(this.f48224k, this.f48225l, this.f48226m, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48222i;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    this.f48222i = 1;
                    if (a.this.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                }
                r rVar = this.f48224k;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f bannerImpl = rVar.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.a(this.f48225l, new C0419a(this.f48226m, rVar));
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends bv.d {

            /* renamed from: i, reason: collision with root package name */
            public a f48229i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f48230j;

            /* renamed from: l, reason: collision with root package name */
            public int f48232l;

            public b(zu.d<? super b> dVar) {
                super(dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                this.f48230j = obj;
                this.f48232l |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ boolean f48233i;

            public c(zu.d<? super c> dVar) {
                super(2, dVar);
            }

            public final Object a(boolean z10, zu.d<? super x0> dVar) {
                return ((c) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                c cVar = a.this.new c(dVar);
                cVar.f48233i = ((Boolean) obj).booleanValue();
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
                a.this.f48218b.setValue(bv.b.boxBoolean(this.f48233i));
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class d extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ boolean f48235i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ r f48236j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(r rVar, zu.d<? super d> dVar) {
                super(2, dVar);
                this.f48236j = rVar;
            }

            public final Object a(boolean z10, zu.d<? super x0> dVar) {
                return ((d) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                d dVar2 = new d(this.f48236j, dVar);
                dVar2.f48235i = ((Boolean) obj).booleanValue();
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
                this.f48236j.f48216y.setValue(bv.b.boxBoolean(this.f48235i));
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class e extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ r f48237i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(r rVar, zu.d<? super e> dVar) {
                super(2, dVar);
                this.f48237i = rVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o> dVar) {
                return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new e(this.f48237i, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                z zVar = z.f50224a;
                r rVar = this.f48237i;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVarC = zVar.c(rVar.f48201j.a());
                rVar.f48210s = oVarC;
                return oVarC;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar) {
            this.f48221f = bVar;
            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.f48218b = MutableStateFlow;
            this.f48219c = FlowKt.asStateFlow(MutableStateFlow);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
        public StateFlow<Boolean> isLoaded() {
            return this.f48219c;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
        public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
            BuildersKt__Builders_commonKt.launch$default(r.this.f48206o, null, null, new C0418a(r.this, j10, hVar, null), 3, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(zu.d<? super tu.x0> r19) {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.a.a(zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {
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
            return r.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            r rVar = r.this;
            r.super.destroy();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f bannerImpl = rVar.getBannerImpl();
            if (bannerImpl != null) {
                bannerImpl.destroy();
            }
            return x0.f87415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar, com.moloco.sdk.internal.ortb.model.c bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n options, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.internal.a viewLifecycleOwner, CoroutineScope scope, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p buttonTracker) {
        super(context, scope);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.f48200i = context;
        this.f48201j = bid;
        this.f48202k = options;
        this.f48203l = externalLinkHandler;
        this.f48204m = watermark;
        this.f48205n = viewLifecycleOwner;
        this.f48206o = scope;
        this.f48207p = clickthroughService;
        this.f48208q = buttonTracker;
        this.f48209r = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.f48210s = oVar;
        this.f48215x = new a(customUserEventBuilderService);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f48216y = MutableStateFlow;
        this.f48217z = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f getBannerImpl() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar = this.f48212u;
        if (fVar != null) {
            return fVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar2 = this.f48213v;
        return fVar2 == null ? this.f48214w : fVar2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        BuildersKt__Builders_commonKt.launch$default(this.f48206o, null, null, new b(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getAdLoader() {
        return this.f48215x;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f48210s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getAdShowListener() {
        return this.f48211t;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public void k() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return this.f48217z;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public void setAdShowListener(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar) {
        this.f48211t = mVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar = this.f48212u;
        if (fVar != null) {
            fVar.setAdShowListener(mVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar2 = this.f48213v;
        if (fVar2 == null) {
            fVar2 = this.f48214w;
        }
        if (fVar2 != null) {
            fVar2.setAdShowListener(mVar);
        }
    }
}
