package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o extends f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o {

    /* renamed from: n, reason: collision with root package name */
    public final kv.a f48090n;

    /* renamed from: o, reason: collision with root package name */
    public final kv.a f48091o;

    /* renamed from: p, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p f48092p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public o f48093i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f48094j;

        /* renamed from: l, reason: collision with root package name */
        public int f48096l;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f48094j = obj;
            this.f48096l |= Integer.MIN_VALUE;
            return o.this.c(this);
        }
    }

    public /* synthetic */ o(Context context, String str, kv.a aVar, kv.a aVar2, kv.a aVar3, kv.l lVar, boolean z10, e0 e0Var, h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this(context, str, aVar, aVar2, aVar3, lVar, z10, e0Var, hVar, (i10 & 512) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a() : pVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void U() {
        super.U();
        this.f48090n.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c button) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        this.f48092p.a(button);
    }

    public final WebView c() {
        return J().c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f
    public void t() {
        super.t();
        this.f48091o.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c.EnumC0490a buttonType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        this.f48092p.a(buttonType);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zu.d<? super android.webkit.WebView> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o.a
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o.a) r0
            int r1 = r0.f48096l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48096l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f48094j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48096l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o r0 = r0.f48093i
            tu.a0.throwOnFailure(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            tu.a0.throwOnFailure(r5)
            r0.f48093i = r4
            r0.f48096l = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            boolean r5 = r5 instanceof com.moloco.sdk.internal.w.b
            if (r5 == 0) goto L4f
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h r5 = r0.J()
            android.webkit.WebView r5 = r5.c()
            return r5
        L4f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o.c(zu.d):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, String adm, kv.a onNeedToDetachAdViewBeforeExpand, kv.a onExpandAdViewClosed, kv.a onClick, kv.l onError, boolean z10, e0 externalLinkHandler, h mraidBridge, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p buttonTracker) {
        super(context, adm, u.f48118c, onClick, onError, externalLinkHandler, z10, mraidBridge);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(onNeedToDetachAdViewBeforeExpand, "onNeedToDetachAdViewBeforeExpand");
        kotlin.jvm.internal.e0.checkNotNullParameter(onExpandAdViewClosed, "onExpandAdViewClosed");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.e0.checkNotNullParameter(onError, "onError");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidBridge, "mraidBridge");
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.f48090n = onNeedToDetachAdViewBeforeExpand;
        this.f48091o = onExpandAdViewClosed;
        this.f48092p = buttonTracker;
    }
}
