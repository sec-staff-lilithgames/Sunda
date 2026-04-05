package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f {

    /* renamed from: i, reason: collision with root package name */
    public final Context f47784i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f47785j;

    /* renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 f47786k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f47787l;

    /* renamed from: m, reason: collision with root package name */
    public final CoroutineScope f47788m;

    /* renamed from: n, reason: collision with root package name */
    public final f f47789n;

    /* renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f47790o;

    /* renamed from: p, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f47791p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f47792i;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, zu.d<? super x0> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = g.this.new a(dVar);
            aVar.f47792i = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f47792i;
            boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(bVar, b.i.f49471a);
            g gVar = g.this;
            if (zAreEqual) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0) gVar.getAdShowListener();
                if (c0Var != null) {
                    c0Var.a(true);
                }
            } else if (kotlin.jvm.internal.e0.areEqual(bVar, b.c.f49465a)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0) gVar.getAdShowListener();
                if (c0Var2 != null) {
                    c0Var2.a(false);
                }
            } else if (kotlin.jvm.internal.e0.areEqual(bVar, b.a.f49463a)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0) gVar.getAdShowListener();
                if (c0Var3 != null) {
                    c0Var3.a();
                }
            } else if (bVar instanceof b.f) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0) gVar.getAdShowListener();
                if (c0Var4 != null) {
                    c0Var4.a(((b.f) bVar).a());
                }
            } else if (!kotlin.jvm.internal.e0.areEqual(bVar, b.g.f49469a) && !kotlin.jvm.internal.e0.areEqual(bVar, b.C0459b.f49464a) && !kotlin.jvm.internal.e0.areEqual(bVar, b.d.f49466a) && !kotlin.jvm.internal.e0.areEqual(bVar, b.h.f49470a) && !kotlin.jvm.internal.e0.areEqual(bVar, b.e.f49467a)) {
                throw new tu.t();
            }
            return x0.f87415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 options, e0 externalLinkHandler, CoroutineScope scope, f adLoader) {
        super(context, scope);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoader, "adLoader");
        this.f47784i = context;
        this.f47785j = customUserEventBuilderService;
        this.f47786k = options;
        this.f47787l = externalLinkHandler;
        this.f47788m = scope;
        this.f47789n = adLoader;
        setTag("MolocoVastBannerView");
        this.f47790o = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50233b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f47791p;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f47791p = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f47790o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public void k() {
        com.moloco.sdk.internal.w wVarA = getAdLoader().a();
        if (wVarA instanceof w.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((w.a) wVarA).a();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0) getAdShowListener();
            if (c0Var != null) {
                c0Var.a(cVar);
                return;
            }
            return;
        }
        if (!(wVarA instanceof w.b)) {
            throw new tu.t();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((w.b) wVarA).a();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 d0Var = this.f47786k;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a(aVar, this.f47787l, this.f47784i, this.f47785j, d0Var.g(), d0Var.e(), d0Var.f(), d0Var.c(), d0Var.d(), d0Var.b(), d0Var.a());
        this.f47791p = aVarA;
        setAdView((View) d0Var.h().invoke(this.f47784i, aVarA));
        o();
        aVarA.d();
    }

    public final void o() {
        Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> flowA;
        Flow flowOnEach;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f47791p;
        if (aVar == null || (flowA = aVar.a()) == null || (flowOnEach = FlowKt.onEach(flowA, new a(null))) == null) {
            return;
        }
        FlowKt.launchIn(flowOnEach, this.f47788m);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public f getAdLoader() {
        return this.f47789n;
    }
}
