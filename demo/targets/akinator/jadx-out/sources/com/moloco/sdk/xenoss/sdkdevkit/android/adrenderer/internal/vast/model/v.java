package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f49394a;

    /* renamed from: b, reason: collision with root package name */
    public final k f49395b;

    public v(String resource, k creativeType) {
        e0.checkNotNullParameter(resource, "resource");
        e0.checkNotNullParameter(creativeType, "creativeType");
        this.f49394a = resource;
        this.f49395b = creativeType;
    }

    public final k a() {
        return this.f49395b;
    }

    public final String b() {
        return this.f49394a;
    }
}
