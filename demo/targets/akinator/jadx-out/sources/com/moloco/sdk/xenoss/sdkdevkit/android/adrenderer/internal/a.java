package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.c1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

    /* renamed from: b, reason: collision with root package name */
    public final Context f47592b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47593c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f47594e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineScope f47595f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f47596g;

    /* renamed from: h, reason: collision with root package name */
    public final q0 f47597h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f47598i;

    /* renamed from: j, reason: collision with root package name */
    public final tu.o f47599j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f47600k;

    /* renamed from: l, reason: collision with root package name */
    public final MutableStateFlow f47601l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a$a, reason: collision with other inner class name */
    public static final class C0395a extends bv.n implements kv.q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f47602i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f47603j;

        public C0395a(zu.d<? super C0395a> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, zu.d<? super Boolean> dVar) {
            C0395a c0395a = new C0395a(dVar);
            c0395a.f47602i = z10;
            c0395a.f47603j = z11;
            return c0395a.invokeSuspend(x0.f87415a);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (zu.d) obj3);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            return bv.b.boxBoolean(this.f47602i && this.f47603j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47604i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47605j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f47607l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f47608m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C0396a extends kotlin.jvm.internal.a0 implements kv.a {
            public C0396a(Object obj) {
                super(0, obj, a.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((a) this.receiver).o();
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a$b$b, reason: collision with other inner class name */
        public static final class C0397b extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f47609i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f47610j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f47611k;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a$b$b$a, reason: collision with other inner class name */
            public static final class C0398a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f47612i;

                public C0398a(zu.d<? super C0398a> dVar) {
                    super(2, dVar);
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h hVar, zu.d<? super Boolean> dVar) {
                    return ((C0398a) create(hVar, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    C0398a c0398a = new C0398a(dVar);
                    c0398a.f47612i = obj;
                    return c0398a;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    tu.a0.throwOnFailure(obj);
                    return bv.b.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h) this.f47612i) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0397b(a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, zu.d<? super C0397b> dVar) {
                super(2, dVar);
                this.f47610j = aVar;
                this.f47611k = kVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0397b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0397b(this.f47610j, this.f47611k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar;
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47609i;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h> unrecoverableError = this.f47610j.f47596g.getUnrecoverableError();
                    C0398a c0398a = new C0398a(null);
                    this.f47609i = 1;
                    obj = FlowKt.first(unrecoverableError, c0398a, this);
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
                if (hVar != null && (kVar = this.f47611k) != null) {
                    kVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.b(hVar));
                }
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f47613i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f47614j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f47615k;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a$b$c$a, reason: collision with other inner class name */
            public static final class C0399a implements FlowCollector {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f47616b;

                public C0399a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
                    this.f47616b = kVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(x0 x0Var, zu.d<? super x0> dVar) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar = this.f47616b;
                    if (kVar != null) {
                        kVar.a();
                    }
                    return x0.f87415a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, zu.d<? super c> dVar) {
                super(2, dVar);
                this.f47614j = aVar;
                this.f47615k = kVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new c(this.f47614j, this.f47615k, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f47613i;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    SharedFlow<x0> clickthroughEvent = this.f47614j.f47596g.getClickthroughEvent();
                    C0399a c0399a = new C0399a(this.f47615k);
                    this.f47613i = 1;
                    if (clickthroughEvent.collect(c0399a, this) == coroutine_suspended) {
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
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f47607l = lVar;
            this.f47608m = kVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = a.this.new b(this.f47607l, this.f47608m, dVar);
            bVar.f47605j = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Iterable] */
        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f47604i;
            a aVar = a.this;
            try {
                if (r12 == 0) {
                    tu.a0.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f47605j;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar = this.f47608m;
                    List listListOf = uu.p0.listOf((Object[]) new Job[]{BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0397b(aVar, kVar, null), 3, null), BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(aVar, kVar, null), 3, null)});
                    aVar.f47598i.setValue(bv.b.boxBoolean(true));
                    StaticAdActivity.a aVar2 = StaticAdActivity.f48258c;
                    Context context = aVar.f47592b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar3 = aVar.f47596g;
                    C0396a c0396a = new C0396a(aVar);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar = this.f47607l;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var = aVar.f47593c;
                    this.f47605j = listListOf;
                    this.f47604i = 1;
                    r12 = listListOf;
                    if (aVar2.a(context, aVar3, c0396a, lVar, e0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) this.f47605j;
                    tu.a0.throwOnFailure(obj);
                    r12 = list;
                }
                Iterator it = r12.iterator();
                while (it.hasNext()) {
                    Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
                }
                aVar.f47598i.setValue(bv.b.boxBoolean(false));
                return x0.f87415a;
            } catch (Throwable th2) {
                Iterator it2 = r12.iterator();
                while (it2.hasNext()) {
                    Job.DefaultImpls.cancel$default((Job) it2.next(), (CancellationException) null, 1, (Object) null);
                }
                aVar.f47598i.setValue(bv.b.boxBoolean(false));
                throw th2;
            }
        }
    }

    public a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adm, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        this.f47592b = context;
        this.f47593c = watermark;
        this.f47594e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50235e;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f47595f = coroutineScopeO;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, new com.moloco.sdk.internal.services.d0(externalLinkHandler, customUserEventBuilderService), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(), false, null, 50, null);
        this.f47596g = aVar;
        this.f47597h = new q0(adm, coroutineScopeO, aVar);
        Boolean bool = Boolean.FALSE;
        this.f47598i = StateFlowKt.MutableStateFlow(bool);
        this.f47599j = tu.q.lazy(new a1.e(this, 11));
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f47600k = MutableStateFlow;
        this.f47601l = MutableStateFlow;
    }

    public static final StateFlow f(a aVar) {
        return FlowKt.stateIn(FlowKt.flowCombine(aVar.f47598i, aVar.f47596g.c(), new C0395a(null)), aVar.f47595f, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    public static Object g(a aVar) {
        return c1.property0(new kotlin.jvm.internal.q0(aVar.f47597h, q0.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f47595f, null, 1, null);
        this.f47596g.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f47594e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f47597h.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public StateFlow<Boolean> k() {
        return this.f47601l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return (StateFlow) this.f47599j.getValue();
    }

    public final void o() {
        this.f47598i.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        this.f47597h.a(j10, hVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        BuildersKt__Builders_commonKt.launch$default(this.f47595f, null, null, new b(options, kVar, null), 3, null);
    }
}
