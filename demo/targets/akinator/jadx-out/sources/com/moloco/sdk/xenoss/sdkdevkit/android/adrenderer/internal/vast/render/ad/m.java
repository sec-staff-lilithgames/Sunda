package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
import java.util.List;
import qv.v;
import tu.k0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {
    public static final List<n> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, e0 externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        n.c cVar = new n.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f(aVar.j(), 0, z10, bool, i10, z11, z12, context, customUserEventBuilderService, externalLinkHandler));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVarF = aVar.f();
        n.a aVar2 = cVarF != null ? new n.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c(cVarF, k0.m7056constructorimpl(v.coerceAtLeast(i11, 0)), context, customUserEventBuilderService, externalLinkHandler, z10, null)) : null;
        a0 a0VarG = aVar.g();
        return p0.listOfNotNull((Object[]) new n[]{cVar, aVar2, a0VarG != null ? new n.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(a0VarG, aVar.j().i(), k0.m7056constructorimpl(v.coerceAtLeast(i12, 0)), context, customUserEventBuilderService, externalLinkHandler, null)) : null});
    }
}
