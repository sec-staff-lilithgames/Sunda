package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import android.content.Context;
import bv.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q;
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
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kv.p;
import tu.x0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f49905b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f49906c;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f49907e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d f49908f;

    /* renamed from: g, reason: collision with root package name */
    public final d f49909g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableSharedFlow f49910h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableSharedFlow f49911i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f49912j;

    /* renamed from: k, reason: collision with root package name */
    public final String f49913k;

    /* renamed from: l, reason: collision with root package name */
    public final String f49914l;

    /* renamed from: m, reason: collision with root package name */
    public final String f49915m;

    /* renamed from: n, reason: collision with root package name */
    public final o f49916n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f49917i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b f49919k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49919k = bVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new a(this.f49919k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49917i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = c.this.f49910h;
                this.f49917i = 1;
                if (mutableSharedFlow.emit(this.f49919k, this) == coroutine_suspended) {
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

    public /* synthetic */ c(a0 a0Var, f fVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, e0 e0Var, u uVar) {
        this(a0Var, fVar, i10, context, bVar, e0Var);
    }

    public static Object b(c cVar) {
        return c1.property0(new q0(cVar.f49908f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static Object c(c cVar) {
        return c1.property0(new q0(cVar.f49916n, o.class, "vastPrivacyIcon", "getVastPrivacyIcon()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean K() {
        return this.f49912j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public StateFlow<k> O() {
        return this.f49916n.O();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f49907e, null, 1, null);
        this.f49916n.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public String g() {
        return this.f49914l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public void i() {
        this.f49916n.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public String l() {
        return this.f49913k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> m() {
        return this.f49908f.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.f49908f.reset();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    public void u() {
        this.f49909g.b();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public void v() {
        this.f49916n.v();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public String z() {
        return this.f49915m;
    }

    public c(a0 dec, f fVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, e0 externalLinkHandler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dec, "dec");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f49905b = dec;
        this.f49906c = externalLinkHandler;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f49907e = coroutineScopeO;
        this.f49908f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f.a(i10, coroutineScopeO);
        this.f49909g = new d(customUserEventBuilderService, p0.listOfNotNull(dec.k()), p0.listOfNotNull(dec.m()), p0.listOfNotNull(dec.n()), null, null, 48, null);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f49910h = mutableSharedFlowMutableSharedFlow$default;
        this.f49911i = mutableSharedFlowMutableSharedFlow$default;
        this.f49912j = dec.l() != null;
        this.f49913k = dec.h();
        this.f49914l = dec.i();
        this.f49915m = dec.j();
        this.f49916n = q.a(fVar != null ? fVar.f() : null, fVar != null ? Integer.valueOf(fVar.h()) : null, fVar != null ? Integer.valueOf(fVar.d()) : null, fVar != null ? fVar.a() : null, coroutineScopeO, context, customUserEventBuilderService, externalLinkHandler, null, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    public Flow<b> a() {
        return this.f49911i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public void b() {
        this.f49909g.a();
        a(b.f49901b);
    }

    public final Job a(b bVar) {
        return BuildersKt__Builders_commonKt.launch$default(this.f49907e, null, null, new a(bVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c button) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        this.f49909g.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(a.f position) {
        kotlin.jvm.internal.e0.checkNotNullParameter(position, "position");
        String strL = this.f49905b.l();
        if (strL != null) {
            this.f49909g.a(position);
            this.f49906c.a(strL);
            a(b.f49902c);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c.EnumC0490a buttonType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        this.f49909g.a(buttonType);
    }
}
