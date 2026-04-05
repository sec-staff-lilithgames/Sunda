package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i0 implements h0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.l {
        public a(Object obj) {
            super(1, obj, b.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((b) this.receiver).b(dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f {

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f47807n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h hVar, MutableStateFlow<Boolean> mutableStateFlow, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u uVar) {
            super(context, str, uVar, null, null, e0Var, false, hVar, 88, null);
            this.f47807n = mutableStateFlow;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
        public void t() {
            super.t();
            this.f47807n.setValue(Boolean.FALSE);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class c extends kotlin.jvm.internal.a0 implements kv.a {
        public c(Object obj) {
            super(0, obj, b.class, "closeFullscreenAdRepresentation", "closeFullscreenAdRepresentation()V", 0);
        }

        public final void a() {
            ((b) this.receiver).t();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, CoroutineScope scope, com.moloco.sdk.internal.ortb.model.c bid, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, MutableStateFlow<Boolean> isAdDisplaying, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(isAdDisplaying, "isAdDisplaying");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h hVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j.a(context, scope, z10);
        b bVar = new b(context, externalLinkHandler, hVarA, isAdDisplaying, bid.a(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.f48119e);
        return n0.a(context, watermark, new k0(scope, bid, a.C0394a.f47435a.a(), new a(bVar)), bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(true, new c(bVar), scope, tu.k0.m7056constructorimpl(qv.v.coerceAtLeast(0, 0)), hVarA.c(), hVarA.w(), null), MraidActivity.f48006i);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.internal.ortb.model.c bid, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        return i.a(context, bid, a.g.f47460a.b().h(), watermark, null, null, 48, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adm, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b.a(context, customUserEventBuilderService, adm, externalLinkHandler, watermark);
    }
}
