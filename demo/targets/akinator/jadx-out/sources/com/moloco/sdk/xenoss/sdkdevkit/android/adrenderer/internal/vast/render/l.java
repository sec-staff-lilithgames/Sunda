package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q {

    /* renamed from: b, reason: collision with root package name */
    public final k f49967b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q f49968c;

    public l(k resource, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVar) {
        e0.checkNotNullParameter(resource, "resource");
        this.f49967b = resource;
        this.f49968c = qVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVar = this.f49968c;
        if (qVar != null) {
            qVar.destroy();
        }
    }

    public final k k() {
        return this.f49967b;
    }

    public /* synthetic */ l(k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVar, int i10, u uVar) {
        this(kVar, (i10 & 2) != 0 ? null : qVar);
    }
}
