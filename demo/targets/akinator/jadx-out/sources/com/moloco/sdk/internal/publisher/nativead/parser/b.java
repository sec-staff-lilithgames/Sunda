package com.moloco.sdk.internal.publisher.nativead.parser;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f46584b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f46585c;

    public b(int i10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c errorSubType) {
        e0.checkNotNullParameter(errorSubType, "errorSubType");
        this.f46584b = i10;
        this.f46585c = errorSubType;
    }

    public final int a() {
        return this.f46584b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.f46585c;
    }
}
