package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
import java.util.List;
import tu.k0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e {
    public static final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n> a(d dVar, l mraidFullscreenContentController, int i10, Context context, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        n.d dVar2 = new n.d(mraidFullscreenContentController);
        a0 a0VarB = dVar.b();
        return p0.listOfNotNull((Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n[]{dVar2, a0VarB != null ? new n.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(a0VarB, null, k0.m7056constructorimpl(qv.v.coerceAtLeast(i10, 0)), context, customUserEventBuilderService, externalLinkHandler, null)) : null});
    }
}
