package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m implements l {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48070b;

    /* renamed from: c, reason: collision with root package name */
    public kv.a f48071c;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f48072e;

    /* renamed from: f, reason: collision with root package name */
    public final WebView f48073f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d f48074g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableSharedFlow f48075h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableSharedFlow f48076i;

    /* renamed from: j, reason: collision with root package name */
    public final StateFlow f48077j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48078i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ n f48080k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48080k = nVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return m.this.new a(this.f48080k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48078i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = m.this.f48075h;
                this.f48078i = 1;
                if (mutableSharedFlow.emit(this.f48080k, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f48081b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f48082b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$b$a$a, reason: collision with other inner class name */
            public static final class C0413a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48083i;

                /* renamed from: j, reason: collision with root package name */
                public int f48084j;

                public C0413a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f48083i = obj;
                    this.f48084j |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f48082b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.b.a.C0413a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.b.a.C0413a) r0
                    int r1 = r0.f48084j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f48084j = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f48083i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f48084j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p) r5
                    boolean r6 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.f
                    if (r6 == 0) goto L3d
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p$f r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.f) r5
                    goto L3e
                L3d:
                    r5 = 0
                L3e:
                    if (r5 == 0) goto L4b
                    r0.f48084j = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f48082b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.b.a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f48081b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f48081b.collect(new a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    public /* synthetic */ m(boolean z10, kv.a aVar, CoroutineScope coroutineScope, int i10, WebView webView, SharedFlow sharedFlow, kotlin.jvm.internal.u uVar) {
        this(z10, aVar, coroutineScope, i10, webView, sharedFlow);
    }

    public static Object b(m mVar) {
        return c1.property0(new q0(mVar.f48074g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static final x0 q() {
        return x0.f87415a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l
    public void D() {
        a(n.f48086b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean K() {
        return this.f48070b;
    }

    public final kv.a S() {
        return this.f48071c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public SharedFlow<n> a() {
        return this.f48076i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l
    public WebView c() {
        return this.f48073f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        this.f48071c.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l
    public StateFlow<p.f> e() {
        return this.f48077j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> m() {
        return this.f48074g.m();
    }

    public m(boolean z10, kv.a closeFullscreenAdRepresentation, CoroutineScope scope, int i10, WebView webView, SharedFlow<? extends p> mraidJsCommands) {
        e0.checkNotNullParameter(closeFullscreenAdRepresentation, "closeFullscreenAdRepresentation");
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(webView, "webView");
        e0.checkNotNullParameter(mraidJsCommands, "mraidJsCommands");
        this.f48070b = z10;
        this.f48071c = closeFullscreenAdRepresentation;
        this.f48072e = scope;
        this.f48073f = webView;
        this.f48074g = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f.a(i10, scope);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f48075h = mutableSharedFlowMutableSharedFlow$default;
        this.f48076i = mutableSharedFlowMutableSharedFlow$default;
        this.f48077j = FlowKt.stateIn(new b(mraidJsCommands), scope, SharingStarted.Companion.getEagerly(), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(a.f position) {
        e0.checkNotNullParameter(position, "position");
        a(n.f48087c);
    }

    public final void a(kv.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f48071c = aVar;
    }

    public final Job a(n nVar) {
        return BuildersKt__Builders_commonKt.launch$default(this.f48072e, null, null, new a(nVar, null), 3, null);
    }

    public /* synthetic */ m(boolean z10, kv.a aVar, CoroutineScope coroutineScope, int i10, WebView webView, SharedFlow sharedFlow, int i11, kotlin.jvm.internal.u uVar) {
        this(z10, (i11 & 2) != 0 ? new com.moloco.sdk.service_locator.b(7) : aVar, coroutineScope, i10, webView, sharedFlow, null);
    }
}
