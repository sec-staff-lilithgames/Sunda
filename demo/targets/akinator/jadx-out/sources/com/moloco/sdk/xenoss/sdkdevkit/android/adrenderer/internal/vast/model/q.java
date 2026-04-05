package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final f f49363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49364b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49365c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49366d;

    /* renamed from: e, reason: collision with root package name */
    public final u f49367e;

    /* renamed from: f, reason: collision with root package name */
    public final List f49368f;

    /* renamed from: g, reason: collision with root package name */
    public final List f49369g;

    /* renamed from: h, reason: collision with root package name */
    public final List f49370h;

    public q(f fVar, String str, String str2, String str3, u uVar, List<p> impressions, List<String> errorUrls, List<i> creatives) {
        e0.checkNotNullParameter(impressions, "impressions");
        e0.checkNotNullParameter(errorUrls, "errorUrls");
        e0.checkNotNullParameter(creatives, "creatives");
        this.f49363a = fVar;
        this.f49364b = str;
        this.f49365c = str2;
        this.f49366d = str3;
        this.f49367e = uVar;
        this.f49368f = impressions;
        this.f49369g = errorUrls;
        this.f49370h = creatives;
    }

    public final f a() {
        return this.f49363a;
    }

    public final String b() {
        return this.f49364b;
    }

    public final String c() {
        return this.f49366d;
    }

    public final List<i> d() {
        return this.f49370h;
    }

    public final String e() {
        return this.f49365c;
    }

    public final List<String> f() {
        return this.f49369g;
    }

    public final List<p> g() {
        return this.f49368f;
    }

    public final u h() {
        return this.f49367e;
    }
}
