package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.widget.FrameLayout;
import com.moloco.sdk.service_locator.a;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f {

    /* renamed from: i, reason: collision with root package name */
    public final Context f47861i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f47862j;

    /* renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k f47863k;

    /* renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f47864l;

    /* renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o f47865m;

    /* renamed from: n, reason: collision with root package name */
    public final k0 f47866n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.l {
        public a(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o) this.receiver).b(dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.a {
        public b(Object obj) {
            super(0, obj, l0.class, "detachMraidViewFromAdViewWrapper", "detachMraidViewFromAdViewWrapper()V", 0);
        }

        public final void a() {
            ((l0) this.receiver).q();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class c extends kotlin.jvm.internal.a0 implements kv.a {
        public c(Object obj) {
            super(0, obj, l0.class, "attachMraidViewToAdViewWrapper", "attachMraidViewToAdViewWrapper()V", 0);
        }

        public final void a() {
            ((l0) this.receiver).o();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    public /* synthetic */ l0(Context context, String str, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k kVar, CoroutineScope coroutineScope, int i10, kotlin.jvm.internal.u uVar) {
        this(context, str, e0Var, e0Var2, (i10 & 16) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k() : kVar, coroutineScope);
    }

    public static final x0 c(l0 l0Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k adShowListener = l0Var.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.a();
        }
        return x0.f87415a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        super.destroy();
        this.f47865m.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o getCreativeType() {
        return this.f47864l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public void k() {
        FrameLayout frameLayoutA = this.f47863k.a(this.f47861i, this.f47865m.c());
        this.f47862j.a(frameLayoutA);
        setAdView(frameLayoutA);
    }

    public final void o() {
        k();
    }

    public final void q() {
        setAdView(null);
    }

    public static final x0 a(l0 l0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k adShowListener = l0Var.getAdShowListener();
        if (adShowListener != null) {
            adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.a(it));
        }
        return x0.f87415a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public k0 getAdLoader() {
        return this.f47866n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, String adm, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k webViewWrapper, CoroutineScope scope) {
        super(context, scope);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f47861i = context;
        this.f47862j = watermark;
        this.f47863k = webViewWrapper;
        setTag("MolocoMraidBannerView");
        this.f47864l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50234c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o oVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o(context, adm, new b(this), new c(this), new a1.e(this, 14), new aw.f(this, 9), true, externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j.a(context, scope, false), null, 512, null);
        this.f47865m = oVar;
        this.f47866n = new k0(scope, null, a.C0394a.f47435a.a(), new a(oVar));
    }
}
