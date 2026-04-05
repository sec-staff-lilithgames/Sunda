package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f49941a;

    /* renamed from: b, reason: collision with root package name */
    public final t f49942b;

    public h(String url, t offset) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(offset, "offset");
        this.f49941a = url;
        this.f49942b = offset;
    }

    public final t a() {
        return this.f49942b;
    }

    public final String b() {
        return this.f49941a;
    }
}
