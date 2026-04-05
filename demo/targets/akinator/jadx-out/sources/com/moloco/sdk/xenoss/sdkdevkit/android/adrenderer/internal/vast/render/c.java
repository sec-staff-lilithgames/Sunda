package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f49539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49541c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49542d;

    /* renamed from: e, reason: collision with root package name */
    public final List f49543e;

    /* renamed from: f, reason: collision with root package name */
    public final List f49544f;

    public c(a0 resource, int i10, int i11, String str, List<String> clickTracking, List<String> creativeViewTracking) {
        e0.checkNotNullParameter(resource, "resource");
        e0.checkNotNullParameter(clickTracking, "clickTracking");
        e0.checkNotNullParameter(creativeViewTracking, "creativeViewTracking");
        this.f49539a = resource;
        this.f49540b = i10;
        this.f49541c = i11;
        this.f49542d = str;
        this.f49543e = clickTracking;
        this.f49544f = creativeViewTracking;
    }

    public final String a() {
        return this.f49542d;
    }

    public final List<String> b() {
        return this.f49543e;
    }

    public final List<String> c() {
        return this.f49544f;
    }

    public final int d() {
        return this.f49541c;
    }

    public final a0 e() {
        return this.f49539a;
    }

    public final int f() {
        return this.f49540b;
    }
}
