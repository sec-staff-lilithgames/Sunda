package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f47811b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.c f47812c;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f47813e;

    /* renamed from: f, reason: collision with root package name */
    public final kv.l f47814f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f47815g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f47816h;

    /* renamed from: i, reason: collision with root package name */
    public com.moloco.sdk.internal.w f47817i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d f47818i;

        /* renamed from: j, reason: collision with root package name */
        public int f47819j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47820k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f47822m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f47823n;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0$a$a, reason: collision with other inner class name */
        public static final class C0406a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f47824i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f47825j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a0 f47826k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ k0 f47827l;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0$a$a$a, reason: collision with other inner class name */
            public static final class C0407a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public a0 f47828i;

                /* renamed from: j, reason: collision with root package name */
                public int f47829j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ a0 f47830k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ k0 f47831l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0407a(a0 a0Var, k0 k0Var, zu.d<? super C0407a> dVar) {
                    super(2, dVar);
                    this.f47830k = a0Var;
                    this.f47831l = k0Var;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a0> dVar) {
                    return ((C0407a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0407a(this.f47830k, this.f47831l, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    a0 a0Var;
                    com.moloco.sdk.internal.ortb.model.d dVarE;
                    Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                    int i10 = this.f47829j;
                    if (i10 == 0) {
                        tu.a0.throwOnFailure(obj);
                        String strE = null;
                        a0 a0Var2 = this.f47830k;
                        if (a0Var2 == null) {
                            return null;
                        }
                        k0 k0Var = this.f47831l;
                        try {
                            b0 b0Var = k0Var.f47813e;
                            com.moloco.sdk.internal.ortb.model.c cVar = k0Var.f47812c;
                            if (cVar != null && (dVarE = cVar.e()) != null) {
                                strE = dVarE.e();
                            }
                            this.f47828i = a0Var2;
                            this.f47829j = 1;
                            obj = b0Var.a(a0Var2, strE, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            a0Var = a0Var2;
                        } catch (Exception unused) {
                            return a0Var2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var = this.f47828i;
                        try {
                            tu.a0.throwOnFailure(obj);
                        } catch (Exception unused2) {
                            return a0Var;
                        }
                    }
                    return (a0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0406a(long j10, a0 a0Var, k0 k0Var, zu.d<? super C0406a> dVar) {
                super(2, dVar);
                this.f47825j = j10;
                this.f47826k = a0Var;
                this.f47827l = k0Var;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a0> dVar) {
                return ((C0406a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0406a(this.f47825j, this.f47826k, this.f47827l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47824i;
                a0 a0Var = this.f47826k;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    C0407a c0407a = new C0407a(a0Var, this.f47827l, null);
                    this.f47824i = 1;
                    obj = TimeoutKt.m5138withTimeoutOrNullKLykuaI(this.f47825j, c0407a, this);
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
            public int f47832i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ long f47833j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ k0 f47834k;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0$a$b$a, reason: collision with other inner class name */
            public static final class C0408a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public int f47835i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ k0 f47836j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0408a(k0 k0Var, zu.d<? super C0408a> dVar) {
                    super(2, dVar);
                    this.f47836j = k0Var;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
                    return ((C0408a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0408a(this.f47836j, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                    int i10 = this.f47835i;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tu.a0.throwOnFailure(obj);
                        return obj;
                    }
                    tu.a0.throwOnFailure(obj);
                    kv.l lVar = this.f47836j.f47814f;
                    this.f47835i = 1;
                    Object objInvoke = lVar.invoke(this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, k0 k0Var, zu.d<? super b> dVar) {
                super(2, dVar);
                this.f47833j = j10;
                this.f47834k = k0Var;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new b(this.f47833j, this.f47834k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47832i;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                    return obj;
                }
                tu.a0.throwOnFailure(obj);
                C0408a c0408a = new C0408a(this.f47834k, null);
                this.f47832i = 1;
                Object objM5138withTimeoutOrNullKLykuaI = TimeoutKt.m5138withTimeoutOrNullKLykuaI(this.f47833j, c0408a, this);
                return objM5138withTimeoutOrNullKLykuaI == coroutine_suspended ? coroutine_suspended : objM5138withTimeoutOrNullKLykuaI;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, long j10, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f47822m = hVar;
            this.f47823n = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = k0.this.new a(this.f47822m, this.f47823n, dVar);
            aVar.f47820k = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k0(CoroutineScope scope, com.moloco.sdk.internal.ortb.model.c cVar, b0 decLoader, kv.l loadAndReadyMraid) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(decLoader, "decLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadAndReadyMraid, "loadAndReadyMraid");
        this.f47811b = scope;
        this.f47812c = cVar;
        this.f47813e = decLoader;
        this.f47814f = loadAndReadyMraid;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f47815g = MutableStateFlow;
        this.f47816h = MutableStateFlow;
        this.f47817i = new w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f47676h);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f47816h;
    }

    public final com.moloco.sdk.internal.w a() {
        return this.f47817i;
    }

    public final void a(com.moloco.sdk.internal.w wVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wVar, "<set-?>");
        this.f47817i = wVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f47811b, null, null, new a(hVar, j10, null), 3, null);
    }
}
