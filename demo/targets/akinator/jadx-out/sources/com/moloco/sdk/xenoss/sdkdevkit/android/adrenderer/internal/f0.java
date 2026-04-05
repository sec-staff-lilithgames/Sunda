package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47783a;

    public f0(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47783a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0
    public boolean a(String uri) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uri, "uri");
        return g0.b(this.f47783a, uri);
    }
}
