package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f49309a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f49310b;

    /* renamed from: c, reason: collision with root package name */
    public final f f49311c;

    /* renamed from: d, reason: collision with root package name */
    public final List f49312d;

    /* renamed from: e, reason: collision with root package name */
    public final List f49313e;

    /* renamed from: f, reason: collision with root package name */
    public final List f49314f;

    public b(String vastAdTagUrl, Boolean bool, f fVar, List<p> impressions, List<String> errorUrls, List<i> creatives) {
        e0.checkNotNullParameter(vastAdTagUrl, "vastAdTagUrl");
        e0.checkNotNullParameter(impressions, "impressions");
        e0.checkNotNullParameter(errorUrls, "errorUrls");
        e0.checkNotNullParameter(creatives, "creatives");
        this.f49309a = vastAdTagUrl;
        this.f49310b = bool;
        this.f49311c = fVar;
        this.f49312d = impressions;
        this.f49313e = errorUrls;
        this.f49314f = creatives;
    }

    public final f a() {
        return this.f49311c;
    }

    public final List<i> b() {
        return this.f49314f;
    }

    public final List<String> c() {
        return this.f49313e;
    }

    public final Boolean d() {
        return this.f49310b;
    }

    public final List<p> e() {
        return this.f49312d;
    }

    public final String f() {
        return this.f49309a;
    }
}
