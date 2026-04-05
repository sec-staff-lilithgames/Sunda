package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f49926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49927b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49928c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49929d;

    /* renamed from: e, reason: collision with root package name */
    public final List f49930e;

    /* renamed from: f, reason: collision with root package name */
    public final List f49931f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f49932g;

    /* renamed from: h, reason: collision with root package name */
    public final t f49933h;

    public f(a0 resource, int i10, int i11, String str, List<String> clickTracking, List<String> viewTracking, Long l9, t tVar) {
        e0.checkNotNullParameter(resource, "resource");
        e0.checkNotNullParameter(clickTracking, "clickTracking");
        e0.checkNotNullParameter(viewTracking, "viewTracking");
        this.f49926a = resource;
        this.f49927b = i10;
        this.f49928c = i11;
        this.f49929d = str;
        this.f49930e = clickTracking;
        this.f49931f = viewTracking;
        this.f49932g = l9;
        this.f49933h = tVar;
    }

    public final String a() {
        return this.f49929d;
    }

    public final List<String> b() {
        return this.f49930e;
    }

    public final Long c() {
        return this.f49932g;
    }

    public final int d() {
        return this.f49928c;
    }

    public final t e() {
        return this.f49933h;
    }

    public final a0 f() {
        return this.f49926a;
    }

    public final List<String> g() {
        return this.f49931f;
    }

    public final int h() {
        return this.f49927b;
    }
}
