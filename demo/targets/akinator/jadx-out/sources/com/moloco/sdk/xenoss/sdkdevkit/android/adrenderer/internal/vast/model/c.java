package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f49317a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f49318b;

    /* renamed from: c, reason: collision with root package name */
    public final d f49319c;

    public c(String str, Integer num, d child) {
        e0.checkNotNullParameter(child, "child");
        this.f49317a = str;
        this.f49318b = num;
        this.f49319c = child;
    }

    public final d a() {
        return this.f49319c;
    }

    public final String b() {
        return this.f49317a;
    }

    public final Integer c() {
        return this.f49318b;
    }
}
