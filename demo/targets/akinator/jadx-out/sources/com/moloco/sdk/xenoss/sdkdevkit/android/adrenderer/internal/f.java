package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.c f47744b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f47745c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e f47746e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f47747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47748g;

    /* renamed from: h, reason: collision with root package name */
    public com.moloco.sdk.internal.w f47749h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f47750i;

    /* renamed from: j, reason: collision with root package name */
    public final StateFlow f47751j;

    /* renamed from: k, reason: collision with root package name */
    public Job f47752k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47753i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47754j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f47756l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f47757m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f$a$a, reason: collision with other inner class name */
        public static final class C0401a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f47758i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f47759j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a0 f47760k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ f f47761l;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f$a$a$a, reason: collision with other inner class name */
            public static final class C0402a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public int f47762i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ a0 f47763j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ f f47764k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0402a(a0 a0Var, f fVar, zu.d<? super C0402a> dVar) {
                    super(2, dVar);
                    this.f47763j = a0Var;
                    this.f47764k = fVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a0> dVar) {
                    return ((C0402a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0402a(this.f47763j, this.f47764k, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                    int i10 = this.f47762i;
                    if (i10 == 0) {
                        tu.a0.throwOnFailure(obj);
                        a0 a0Var = this.f47763j;
                        if (a0Var == null) {
                            return null;
                        }
                        f fVar = this.f47764k;
                        b0 b0Var = fVar.f47747f;
                        com.moloco.sdk.internal.ortb.model.d dVarE = fVar.f47744b.e();
                        String strE = dVarE != null ? dVarE.e() : null;
                        this.f47762i = 1;
                        obj = b0Var.a(a0Var, strE, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tu.a0.throwOnFailure(obj);
                    }
                    return (a0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0401a(long j10, a0 a0Var, f fVar, zu.d<? super C0401a> dVar) {
                super(2, dVar);
                this.f47759j = j10;
                this.f47760k = a0Var;
                this.f47761l = fVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a0> dVar) {
                return ((C0401a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0401a(this.f47759j, this.f47760k, this.f47761l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47758i;
                a0 a0Var = this.f47760k;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    C0402a c0402a = new C0402a(a0Var, this.f47761l, null);
                    this.f47758i = 1;
                    obj = TimeoutKt.m5138withTimeoutOrNullKLykuaI(this.f47759j, c0402a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                }
                a0 a0Var2 = (a0) obj;
                return a0Var2 == null ? a0Var : a0Var2;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f47765i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f47766j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ f f47767k;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f$a$b$a, reason: collision with other inner class name */
            public static final class C0403a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public int f47768i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ f f47769j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0403a(f fVar, zu.d<? super C0403a> dVar) {
                    super(2, dVar);
                    this.f47769j = fVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
                    return ((C0403a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0403a(this.f47769j, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                    int i10 = this.f47768i;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tu.a0.throwOnFailure(obj);
                        return obj;
                    }
                    tu.a0.throwOnFailure(obj);
                    f fVar = this.f47769j;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar = fVar.f47746e;
                    String strA = fVar.f47744b.a();
                    String strA2 = com.moloco.sdk.internal.ortb.model.f.a(fVar.f47744b);
                    this.f47768i = 1;
                    Object objA = eVar.a(strA, strA2, false, this);
                    return objA == coroutine_suspended ? coroutine_suspended : objA;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, f fVar, zu.d<? super b> dVar) {
                super(2, dVar);
                this.f47766j = j10;
                this.f47767k = fVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new b(this.f47766j, this.f47767k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47765i;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                    return obj;
                }
                tu.a0.throwOnFailure(obj);
                C0403a c0403a = new C0403a(this.f47767k, null);
                this.f47765i = 1;
                Object objM5137withTimeoutKLykuaI = TimeoutKt.m5137withTimeoutKLykuaI(this.f47766j, c0403a, this);
                return objM5137withTimeoutKLykuaI == coroutine_suspended ? coroutine_suspended : objM5137withTimeoutKLykuaI;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, long j10, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f47756l = hVar;
            this.f47757m = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = f.this.new a(this.f47756l, this.f47757m, dVar);
            aVar.f47754j = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public Object f47770i;

        /* renamed from: j, reason: collision with root package name */
        public int f47771j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47772k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f47774m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f47775n;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f47776i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f47777j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a0 f47778k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ f f47779l;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f$b$a$a, reason: collision with other inner class name */
            public static final class C0404a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public int f47780i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ a0 f47781j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ f f47782k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0404a(a0 a0Var, f fVar, zu.d<? super C0404a> dVar) {
                    super(2, dVar);
                    this.f47781j = a0Var;
                    this.f47782k = fVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a0> dVar) {
                    return ((C0404a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0404a(this.f47781j, this.f47782k, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                    int i10 = this.f47780i;
                    if (i10 == 0) {
                        tu.a0.throwOnFailure(obj);
                        a0 a0Var = this.f47781j;
                        if (a0Var == null) {
                            return null;
                        }
                        f fVar = this.f47782k;
                        b0 b0Var = fVar.f47747f;
                        com.moloco.sdk.internal.ortb.model.d dVarE = fVar.f47744b.e();
                        String strE = dVarE != null ? dVarE.e() : null;
                        this.f47780i = 1;
                        obj = b0Var.a(a0Var, strE, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tu.a0.throwOnFailure(obj);
                    }
                    return (a0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j10, a0 a0Var, f fVar, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f47777j = j10;
                this.f47778k = a0Var;
                this.f47779l = fVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f47777j, this.f47778k, this.f47779l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47776i;
                a0 a0Var = this.f47778k;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    C0404a c0404a = new C0404a(a0Var, this.f47779l, null);
                    this.f47776i = 1;
                    obj = TimeoutKt.m5138withTimeoutOrNullKLykuaI(this.f47777j, c0404a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                }
                a0 a0Var2 = (a0) obj;
                return a0Var2 == null ? a0Var : a0Var2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, long j10, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f47774m = hVar;
            this.f47775n = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = f.this.new b(this.f47774m, this.f47775n, dVar);
            bVar.f47772k = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(com.moloco.sdk.internal.ortb.model.c bid, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e loadVast, b0 decLoader, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadVast, "loadVast");
        kotlin.jvm.internal.e0.checkNotNullParameter(decLoader, "decLoader");
        this.f47744b = bid;
        this.f47745c = scope;
        this.f47746e = loadVast;
        this.f47747f = decLoader;
        this.f47748g = z10;
        this.f47749h = new w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.m.f47714b);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f47750i = MutableStateFlow;
        this.f47751j = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f47751j;
    }

    public final void c(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        Job job = this.f47752k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f47752k = BuildersKt__Builders_commonKt.launch$default(this.f47745c, null, null, new b(hVar, j10, null), 3, null);
    }

    public final com.moloco.sdk.internal.w a() {
        return this.f47749h;
    }

    public final void b(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        Job job = this.f47752k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f47752k = BuildersKt__Builders_commonKt.launch$default(this.f47745c, null, null, new a(hVar, j10, null), 3, null);
    }

    public final void a(com.moloco.sdk.internal.w wVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wVar, "<set-?>");
        this.f47749h = wVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        if (this.f47748g) {
            c(j10, hVar);
        } else {
            b(j10, hVar);
        }
    }

    public final void b(Deferred<a0> deferred, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f47657c;
        this.f47749h = new w.a(cVar);
        if (hVar != null) {
            hVar.a(aVar);
        }
    }

    public final void a(Deferred<a0> deferred, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoad", "Vast AD failed to load: " + cVar, null, false, 12, null);
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
        this.f47749h = new w.a(cVar);
        if (hVar != null) {
            hVar.a(cVar);
        }
    }
}
