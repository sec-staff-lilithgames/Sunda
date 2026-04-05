package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f47633b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47634c;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f47635e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c f47636f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f47637g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a f47638h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f47639i;

    /* renamed from: j, reason: collision with root package name */
    public final tu.o f47640j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f47641k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f47642i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f47643j;

        public b(zu.d<? super b> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, zu.d<? super Boolean> dVar) {
            b bVar = new b(dVar);
            bVar.f47642i = z10;
            bVar.f47643j = z11;
            return bVar.invokeSuspend(x0.f87415a);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (zu.d) obj3);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            boolean z10 = this.f47642i;
            boolean z11 = this.f47643j;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("isAdDisplaying final: ");
            boolean z12 = false;
            sb2.append(z10 && z11);
            sb2.append(", _isAdDisplaying: ");
            sb2.append(z10);
            sb2.append(", webViewIsDisplaying: ");
            sb2.append(z11);
            MolocoLogger.info$default(molocoLogger, "TemplateFullscreenAd", sb2.toString(), null, false, 12, null);
            if (z10 && z11) {
                z12 = true;
            }
            return bv.b.boxBoolean(z12);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47644i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47645j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C0400d f47647l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ List f47648i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ d f47649j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<? extends Job> list, d dVar, zu.d<? super a> dVar2) {
                super(2, dVar2);
                this.f47648i = list;
                this.f47649j = dVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x0 x0Var, zu.d<? super x0> dVar) {
                return ((a) create(x0Var, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f47648i, this.f47649j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                Iterator it = this.f47648i.iterator();
                while (it.hasNext()) {
                    Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Calling close()", null, false, 12, null);
                FullscreenWebviewActivity.f48460e.a();
                new Handler(Looper.getMainLooper()).postDelayed(new a2.s(this.f47649j, 24), 1000L);
                return x0.f87415a;
            }

            public static final void a(d dVar) {
                dVar.destroy();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f47650i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ d f47651j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ C0400d f47652k;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class a implements FlowCollector {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0400d f47653b;

                public a(C0400d c0400d) {
                    this.f47653b = c0400d;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(x0 x0Var, zu.d<? super x0> dVar) {
                    this.f47653b.a();
                    return x0.f87415a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, C0400d c0400d, zu.d<? super b> dVar2) {
                super(2, dVar2);
                this.f47651j = dVar;
                this.f47652k = c0400d;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new b(this.f47651j, this.f47652k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47650i;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    MutableSharedFlow<x0> mutableSharedFlowC = this.f47651j.f47637g.c();
                    a aVar = new a(this.f47652k);
                    this.f47650i = 1;
                    if (mutableSharedFlowC.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0400d c0400d, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f47647l = c0400d;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = d.this.new c(this.f47647l, dVar);
            cVar.f47645j = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47644i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f47645j;
                C0400d c0400d = this.f47647l;
                d dVar = d.this;
                List listListOf = uu.o0.listOf(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(dVar, c0400d, null), 3, null));
                MutableSharedFlow<x0> mutableSharedFlowC = dVar.f47636f.c();
                a aVar = new a(listListOf, dVar, null);
                this.f47644i = 1;
                if (FlowKt.collectLatest(mutableSharedFlowC, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    public d(Context context, String adm, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f47633b = context;
        this.f47634c = watermark;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f47635e = coroutineScopeO;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(coroutineScopeO);
        this.f47636f = cVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h(coroutineScopeO);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b(clickthroughService, coroutineScopeO);
        this.f47637g = bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g(coroutineScopeO);
        this.f47638h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(context, adm, c2.setOf((Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a[]{cVar, bVar, hVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(metricsRecorder), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(externalLinkHandler), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e(persistentHttpRequest), gVar}), bVar, hVar, gVar, metricsRecorder);
        Boolean bool = Boolean.FALSE;
        this.f47639i = StateFlowKt.MutableStateFlow(bool);
        this.f47640j = tu.q.lazy(new a1.e(this, 12));
        this.f47641k = StateFlowKt.MutableStateFlow(bool);
    }

    public static final StateFlow c(d dVar) {
        return FlowKt.stateIn(FlowKt.flowCombine(dVar.f47639i, dVar.f47638h.m(), new b(null)), dVar.f47635e, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        this.f47638h.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f47638h.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public StateFlow<Boolean> k() {
        return this.f47641k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return (StateFlow) this.f47640j.getValue();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d$d, reason: collision with other inner class name */
    public static final class C0400d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 f47654a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f47655b;

        public C0400d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var, d dVar) {
            this.f47654a = a0Var;
            this.f47655b = dVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.e0.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var = this.f47654a;
            if (a0Var != null) {
                a0Var.a(internalShowError);
            }
            this.f47655b.destroy();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a() {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var = this.f47654a;
            if (a0Var != null) {
                a0Var.a();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        C0400d c0400d = new C0400d(a0Var, this);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = this.f47638h;
        this.f47634c.a(aVar.q());
        aVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0) c0400d);
        FullscreenWebviewActivity.f48460e.a(this.f47633b, this.f47639i, aVar, this.f47641k);
        BuildersKt__Builders_commonKt.launch$default(this.f47635e, null, null, new c(c0400d, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        this.f47638h.a(j10, hVar);
    }
}
