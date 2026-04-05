package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import kotlin.jvm.internal.a0;
import p0.d0;
import p0.w;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {
        public a(x0 x0Var) {
        }

        public final void a(w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1040652088, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastView.<anonymous>.<anonymous> (VastActivity.kt:231)");
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b extends a0 implements kv.a {
        public b(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.receiver).y();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    public static final x0 a(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, kv.p pVar, e0 e0Var, int i10, int i11, w wVar, int i12) {
        a(activity, aVar, pVar, e0Var, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.app.Activity r23, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a r24, kv.p r25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 r26, p0.w r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(android.app.Activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, kv.p, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, p0.w, int, int):void");
    }

    public static final View a(kv.p pVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Context ctx) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ctx, "ctx");
        return (View) pVar.invoke(ctx, aVar);
    }
}
