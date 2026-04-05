package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.widget.FrameLayout;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f {

    /* renamed from: i, reason: collision with root package name */
    public final Context f48239i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f48240j;

    /* renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f48241k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f48242l;

    /* renamed from: m, reason: collision with root package name */
    public final CoroutineScope f48243m;

    /* renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k f48244n;

    /* renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f48245o;

    /* renamed from: p, reason: collision with root package name */
    public final tu.o f48246p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f48247i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f48248j;

        public a(zu.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, zu.d<? super Boolean> dVar) {
            a aVar = new a(dVar);
            aVar.f48247i = z10;
            aVar.f48248j = z11;
            return aVar.invokeSuspend(x0.f87415a);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (zu.d) obj3);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            return bv.b.boxBoolean(this.f48247i && this.f48248j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f48249i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f48251i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ r0 f48252j;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0$b$a$a, reason: collision with other inner class name */
            public static final class C0420a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48253i;

                public C0420a(zu.d<? super C0420a> dVar) {
                    super(2, dVar);
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h hVar, zu.d<? super Boolean> dVar) {
                    return ((C0420a) create(hVar, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    C0420a c0420a = new C0420a(dVar);
                    c0420a.f48253i = obj;
                    return c0420a;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    tu.a0.throwOnFailure(obj);
                    return bv.b.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h) this.f48253i) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r0 r0Var, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f48252j = r0Var;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f48252j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k adShowListener;
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48251i;
                r0 r0Var = this.f48252j;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h> unrecoverableError = r0Var.f48241k.getUnrecoverableError();
                    C0420a c0420a = new C0420a(null);
                    this.f48251i = 1;
                    obj = FlowKt.first(unrecoverableError, c0420a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h) obj;
                if (hVar != null && (adShowListener = r0Var.getAdShowListener()) != null) {
                    adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.a(hVar));
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0$b$b, reason: collision with other inner class name */
        public static final class C0421b extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f48254i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ r0 f48255j;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0$b$b$a */
            public static final class a implements FlowCollector {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r0 f48256b;

                public a(r0 r0Var) {
                    this.f48256b = r0Var;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(x0 x0Var, zu.d<? super x0> dVar) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k adShowListener = this.f48256b.getAdShowListener();
                    if (adShowListener != null) {
                        adShowListener.a();
                    }
                    return x0.f87415a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0421b(r0 r0Var, zu.d<? super C0421b> dVar) {
                super(2, dVar);
                this.f48255j = r0Var;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0421b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0421b(this.f48255j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48254i;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    r0 r0Var = this.f48255j;
                    SharedFlow<x0> clickthroughEvent = r0Var.f48241k.getClickthroughEvent();
                    a aVar = new a(r0Var);
                    this.f48254i = 1;
                    if (clickthroughEvent.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                }
                throw new tu.k();
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
            b bVar = r0.this.new b(dVar);
            bVar.f48249i = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f48249i;
            r0 r0Var = r0.this;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(r0Var, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0421b(r0Var, null), 3, null);
            FrameLayout frameLayoutA = r0Var.f48244n.a(r0Var.f48239i, r0Var.f48241k);
            r0Var.getWatermark().a(frameLayoutA);
            r0Var.setAdView(frameLayoutA);
            return x0.f87415a;
        }
    }

    public /* synthetic */ r0(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, q0 q0Var, CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k kVar, int i10, kotlin.jvm.internal.u uVar) {
        this(context, e0Var, aVar, q0Var, coroutineScope, (i10 & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k() : kVar);
    }

    public static final StateFlow d(r0 r0Var) {
        return FlowKt.stateIn(FlowKt.flowCombine(super.m(), r0Var.f48241k.c(), new a(null)), r0Var.f48243m, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        super.destroy();
        this.f48241k.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f48245o;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 getWatermark() {
        return this.f48240j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public void k() {
        b bVar = new b(null);
        BuildersKt.launch(this.f48243m, zu.n.f98854b, CoroutineStart.DEFAULT, bVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return (StateFlow) this.f48246p.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public q0 getAdLoader() {
        return this.f48242l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView, q0 adLoader, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k webViewWrapper) {
        super(context, scope);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(staticWebView, "staticWebView");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoader, "adLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        this.f48239i = context;
        this.f48240j = watermark;
        this.f48241k = staticWebView;
        this.f48242l = adLoader;
        this.f48243m = scope;
        this.f48244n = webViewWrapper;
        setTag("MolocoStaticBannerView");
        this.f48245o = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50235e;
        this.f48246p = tu.q.lazy(new a1.e(this, 19));
    }
}
