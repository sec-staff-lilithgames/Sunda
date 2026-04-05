package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import android.content.Context;
import bv.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f49549b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f49550c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f49551e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f49552f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f49553g;

    /* renamed from: h, reason: collision with root package name */
    public final CoroutineScope f49554h;

    /* renamed from: i, reason: collision with root package name */
    public final d f49555i;

    /* renamed from: j, reason: collision with root package name */
    public a.f f49556j;

    /* renamed from: k, reason: collision with root package name */
    public final g f49557k;

    /* renamed from: l, reason: collision with root package name */
    public final MutableSharedFlow f49558l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableSharedFlow f49559m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f49560n;

    /* renamed from: o, reason: collision with root package name */
    public l f49561o;

    /* renamed from: p, reason: collision with root package name */
    public final MutableStateFlow f49562p;

    /* renamed from: q, reason: collision with root package name */
    public final MutableStateFlow f49563q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public c f49564i;

        /* renamed from: j, reason: collision with root package name */
        public int f49565j;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49565j;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                c cVar2 = c.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0VarE = cVar2.f49549b.e();
                Context context = cVar2.f49550c;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar = cVar2.f49551e;
                e0 e0Var = cVar2.f49552f;
                int iF = cVar2.f49549b.f();
                int iD = cVar2.f49549b.d();
                a1.e eVar = new a1.e(cVar2, 18);
                aw.f fVar = new aw.f(cVar2, 11);
                boolean z10 = cVar2.f49553g;
                this.f49564i = cVar2;
                this.f49565j = 1;
                Object objA = m.a(a0VarE, context, bVar, e0Var, iF, iD, eVar, fVar, z10, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = objA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = this.f49564i;
                a0.throwOnFailure(obj);
            }
            cVar.a((l) obj);
            return x0.f87415a;
        }

        public static final x0 a(c cVar) {
            cVar.f49557k.a(cVar.f49556j);
            cVar.a(b.a.f49545a);
            return x0.f87415a;
        }

        public static final x0 a(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar2) {
            cVar.a(cVar2);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f49567i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b f49569k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f49569k = bVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new b(this.f49569k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49567i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = c.this.f49558l;
                this.f49567i = 1;
                if (mutableSharedFlow.emit(this.f49569k, this) == coroutine_suspended) {
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

    public /* synthetic */ c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, e0 e0Var, boolean z10, u uVar) {
        this(cVar, i10, context, bVar, e0Var, z10);
    }

    public static Object i(c cVar) {
        return c1.property0(new q0(cVar.f49555i, d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void A() {
        a(b.C0465b.f49546a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean K() {
        return this.f49560n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public StateFlow<k> L() {
        return this.f49563q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f49554h, null, 1, null);
        l lVar = this.f49561o;
        if (lVar != null) {
            lVar.destroy();
        }
        a((l) null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> m() {
        return this.f49555i.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.f49555i.reset();
    }

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c companion, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, e0 externalLinkHandler, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(companion, "companion");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f49549b = companion;
        this.f49550c = context;
        this.f49551e = customUserEventBuilderService;
        this.f49552f = externalLinkHandler;
        this.f49553g = z10;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f49554h = coroutineScopeO;
        this.f49555i = f.a(i10, coroutineScopeO);
        this.f49556j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f48771a.a(i1.h.f59344b.m4173getZeroF1C5BW0());
        this.f49557k = new g(customUserEventBuilderService, companion.b(), companion.c(), null, null, 24, null);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f49558l = mutableSharedFlowMutableSharedFlow$default;
        this.f49559m = mutableSharedFlowMutableSharedFlow$default;
        this.f49560n = companion.a() != null;
        l lVar = this.f49561o;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(lVar != null ? lVar.k() : null);
        this.f49562p = MutableStateFlow;
        this.f49563q = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(coroutineScopeO, null, null, new a(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void b() {
        this.f49557k.a();
        a(b.c.f49547a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a
    public Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> a() {
        return this.f49559m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(a.f position) {
        kotlin.jvm.internal.e0.checkNotNullParameter(position, "position");
        String strA = this.f49549b.a();
        if (strA != null) {
            this.f49557k.a(position);
            this.f49552f.a(strA);
            a(b.a.f49545a);
        }
    }

    public final Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar) {
        return BuildersKt__Builders_commonKt.launch$default(this.f49554h, null, null, new b(bVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        a(new b.d(error));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c button) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        this.f49557k.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c.EnumC0490a buttonType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        this.f49557k.a(buttonType);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void a(a.f position) {
        kotlin.jvm.internal.e0.checkNotNullParameter(position, "position");
        this.f49556j = position;
    }

    public final void a(l lVar) {
        this.f49561o = lVar;
        this.f49562p.setValue(lVar != null ? lVar.k() : null);
    }
}
