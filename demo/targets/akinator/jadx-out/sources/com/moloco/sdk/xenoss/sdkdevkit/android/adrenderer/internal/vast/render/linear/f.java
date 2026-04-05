package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import android.content.Context;
import bv.n;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.t;
import tu.v;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c {
    public int A;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g f49981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49982c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49983e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f49984f;

    /* renamed from: g, reason: collision with root package name */
    public final CoroutineScope f49985g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableSharedFlow f49986h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableSharedFlow f49987i;

    /* renamed from: j, reason: collision with root package name */
    public final String f49988j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f49989k;

    /* renamed from: l, reason: collision with root package name */
    public final MutableStateFlow f49990l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableStateFlow f49991m;

    /* renamed from: n, reason: collision with root package name */
    public final StateFlow f49992n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f49993o;

    /* renamed from: p, reason: collision with root package name */
    public final String f49994p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f49995q;

    /* renamed from: r, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b f49996r;

    /* renamed from: s, reason: collision with root package name */
    public final o f49997s;

    /* renamed from: t, reason: collision with root package name */
    public final MutableStateFlow f49998t;

    /* renamed from: u, reason: collision with root package name */
    public final StateFlow f49999u;

    /* renamed from: v, reason: collision with root package name */
    public final MutableStateFlow f50000v;

    /* renamed from: w, reason: collision with root package name */
    public final MutableStateFlow f50001w;

    /* renamed from: x, reason: collision with root package name */
    public final k f50002x;

    /* renamed from: y, reason: collision with root package name */
    public final h f50003y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f50004z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f50005i;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((a) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = f.this.new a(dVar);
            aVar.f50005i = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            boolean z10 = this.f50005i;
            f fVar = f.this;
            if (z10) {
                fVar.f50002x.d(bv.b.boxInt(fVar.R()), fVar.f49988j);
            } else {
                fVar.f50002x.c(bv.b.boxInt(fVar.R()), fVar.f49988j);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f50007i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ d f50009k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, zu.d<? super b> dVar2) {
            super(2, dVar2);
            this.f50009k = dVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f.this.new b(this.f50009k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50007i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = f.this.f49986h;
                this.f50007i = 1;
                if (mutableSharedFlow.emit(this.f50009k, this) == coroutine_suspended) {
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
    public static final class c extends n implements q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f50010i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k f50011j;

        public c(zu.d<? super c> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar, zu.d<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k> dVar) {
            c cVar = new c(dVar);
            cVar.f50010i = z10;
            cVar.f50011j = kVar;
            return cVar.invokeSuspend(x0.f87415a);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) obj2, (zu.d) obj3);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            boolean z10 = this.f50010i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.f50011j;
            if (z10) {
                return kVar;
            }
            return null;
        }
    }

    public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g linear, int i10, boolean z10, Boolean bool, int i11, boolean z11, boolean z12, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, e0 externalLinkHandler) {
        String absolutePath;
        kotlin.jvm.internal.e0.checkNotNullParameter(linear, "linear");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f49981b = linear;
        this.f49982c = z11;
        this.f49983e = z12;
        this.f49984f = externalLinkHandler;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f49985g = coroutineScopeO;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f49986h = mutableSharedFlowMutableSharedFlow$default;
        this.f49987i = mutableSharedFlowMutableSharedFlow$default;
        this.f49988j = linear.l();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z10));
        this.f49989k = MutableStateFlow;
        this.f49990l = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n(Long.valueOf(i10)));
        this.f49991m = MutableStateFlow2;
        this.f49992n = FlowKt.asStateFlow(MutableStateFlow2);
        this.f49993o = a.g.f47460a.b().h();
        if (M()) {
            absolutePath = linear.l();
        } else {
            absolutePath = linear.j().getAbsolutePath();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        }
        this.f49994p = absolutePath;
        this.f49995q = linear.h() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVarI = linear.i();
        List<String> listB = fVarI != null ? fVarI.b() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVarI2 = linear.i();
        this.f49996r = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b(listB, fVarI2 != null ? fVarI2.g() : null, null, 4, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVarI3 = linear.i();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0VarF = fVarI3 != null ? fVarI3.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVarI4 = linear.i();
        Integer numValueOf = fVarI4 != null ? Integer.valueOf(fVarI4.h()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVarI5 = linear.i();
        Integer numValueOf2 = fVarI5 != null ? Integer.valueOf(fVarI5.d()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVarI6 = linear.i();
        final int i12 = 0;
        final int i13 = 1;
        o oVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q.a(a0VarF, numValueOf, numValueOf2, fVarI6 != null ? fVarI6.a() : null, coroutineScopeO, context, customUserEventBuilderService, externalLinkHandler, new kv.a(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f49980c;

            {
                this.f49980c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return f.e(this.f49980c);
                    default:
                        return f.f(this.f49980c);
                }
            }
        }, new kv.a(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f49980c;

            {
                this.f49980c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return f.e(this.f49980c);
                    default:
                        return f.f(this.f49980c);
                }
            }
        });
        this.f49997s = oVarA;
        Boolean bool2 = Boolean.FALSE;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool2);
        this.f49998t = MutableStateFlow3;
        this.f49999u = FlowKt.stateIn(FlowKt.combine(MutableStateFlow3, oVarA.O(), new c(null)), coroutineScopeO, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), null);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool2);
        this.f50000v = MutableStateFlow4;
        this.f50001w = MutableStateFlow4;
        this.f50002x = k.f50023p.a(linear.n(), customUserEventBuilderService);
        FlowKt.launchIn(FlowKt.onEach(isPlaying(), new a(null)), coroutineScopeO);
        this.f50003y = j.a(bool, i11, linear.m());
    }

    public static final x0 e(f fVar) {
        fVar.f49996r.a(Integer.valueOf(fVar.R()), fVar.f49988j);
        return x0.f87415a;
    }

    public static final x0 f(f fVar) {
        fVar.f49996r.b(Integer.valueOf(fVar.R()), fVar.f49988j);
        return x0.f87415a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void F() {
        this.f50003y.t();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void G() {
        this.f50003y.pause();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public String H() {
        return this.f49994p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean K() {
        return this.f49995q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public boolean M() {
        return this.f49993o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k> O() {
        return this.f49999u;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n> Q() {
        return this.f49992n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public int R() {
        return this.A;
    }

    public final void S() {
        this.f49998t.setValue(Boolean.FALSE);
    }

    public final void T() {
        if (this.f49983e) {
            a(false, g.a());
        }
    }

    public final void U() {
        if (this.f49982c) {
            a(false, g.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void d(boolean z10) {
        this.f50000v.setValue(Boolean.valueOf(z10));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f49985g, null, 1, null);
        this.f49997s.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void h() {
        this.f50004z = true;
        this.f50002x.f(Integer.valueOf(R()), this.f49988j);
        a(d.e.f49978a);
        U();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public void i() {
        this.f49997s.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public StateFlow<Boolean> isPlaying() {
        return this.f50001w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> m() {
        return this.f50003y.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public StateFlow<Boolean> r() {
        return this.f49990l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public void s() {
        boolean zBooleanValue = isPlaying().getValue().booleanValue();
        MutableStateFlow mutableStateFlow = this.f49991m;
        if (!zBooleanValue && ((Number) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) mutableStateFlow.getValue()).a()).longValue() == 0 && R() == 0) {
            return;
        }
        mutableStateFlow.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n(0L));
        this.f50002x.e(Integer.valueOf(R()), this.f49988j);
        this.f50004z = false;
        this.A = 0;
        this.f50003y.J();
        S();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public void v() {
        this.f49997s.v();
    }

    public static Object d(f fVar) {
        return c1.property0(new q0(fVar.f50003y, h.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public Flow<d> a() {
        return this.f49987i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(a.f position) {
        kotlin.jvm.internal.e0.checkNotNullParameter(position, "position");
        a(true, position);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void c(boolean z10) {
        this.f49989k.setValue(Boolean.valueOf(z10));
        String str = this.f49988j;
        k kVar = this.f50002x;
        if (z10) {
            kVar.b(Integer.valueOf(R()), str);
        } else {
            kVar.g(Integer.valueOf(R()), str);
        }
    }

    public final Job a(d dVar) {
        return BuildersKt__Builders_commonKt.launch$default(this.f49985g, null, null, new b(dVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void b() {
        a(d.c.f49976a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c button) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        this.f50002x.a(button);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r7, int r8) {
        /*
            r6 = this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g r0 = r6.f49981b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f r0 = r0.i()
            if (r0 != 0) goto L9
            return
        L9:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r1 = r0.e()
            java.lang.Long r0 = r0.c()
            boolean r2 = r1 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.a
            r3 = 0
            if (r2 == 0) goto L20
            int r2 = r8 / 100
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t$a r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.a) r1
            int r1 = r1.a()
            int r1 = r1 * r2
            goto L2d
        L20:
            boolean r2 = r1 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.b
            if (r2 == 0) goto L2c
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t$b r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.b) r1
            long r1 = r1.a()
            int r1 = (int) r1
            goto L2d
        L2c:
            r1 = r3
        L2d:
            qv.m r2 = new qv.m
            r2.<init>(r3, r8)
            int r8 = qv.v.coerceIn(r1, r2)
            if (r0 != 0) goto L3b
            if (r7 < r8) goto L4b
            goto L4a
        L3b:
            long r1 = (long) r8
            long r4 = r0.longValue()
            long r4 = r4 + r1
            long r7 = (long) r7
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L4b
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L4b
        L4a:
            r3 = 1
        L4b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.f49998t
            r8.setValue(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.b(int, int):void");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c.EnumC0490a buttonType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        this.f50002x.a(buttonType);
    }

    public final void a(boolean z10, a.f fVar) {
        String strH = this.f49981b.h();
        if (strH != null) {
            if (z10) {
                this.f50002x.a(fVar, Integer.valueOf(R()), this.f49988j);
            }
            this.f49984f.a(strH);
            a(d.a.f49974a);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        a(new d.C0481d(error));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j progress) {
        v vVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
        boolean z10 = progress instanceof j.a;
        if (z10) {
            int iA = (int) ((j.a) progress).a();
            vVar = tu.e0.to(Integer.valueOf(iA), Integer.valueOf(iA));
        } else if (progress instanceof j.c) {
            j.c cVar = (j.c) progress;
            vVar = tu.e0.to(Integer.valueOf((int) cVar.c()), Integer.valueOf((int) cVar.d()));
        } else if (progress instanceof j.d) {
            vVar = tu.e0.to(0, Integer.valueOf((int) ((j.d) progress).b()));
        } else {
            if (!kotlin.jvm.internal.e0.areEqual(progress, j.b.f49959a)) {
                throw new t();
            }
            return;
        }
        int iIntValue = ((Number) vVar.component1()).intValue();
        int iIntValue2 = ((Number) vVar.component2()).intValue();
        this.A = iIntValue;
        if (!this.f50004z && !(progress instanceof j.d)) {
            this.f50002x.a(this.f49988j, iIntValue, iIntValue2);
        }
        if (z10) {
            if (!this.f50004z) {
                a(d.b.f49975a);
                T();
            }
            this.f50004z = false;
        }
        this.f50003y.a(iIntValue, iIntValue2);
        b(iIntValue, iIntValue2);
    }
}
