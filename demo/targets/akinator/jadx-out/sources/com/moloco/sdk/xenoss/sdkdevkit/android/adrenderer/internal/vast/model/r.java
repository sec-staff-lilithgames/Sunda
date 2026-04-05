package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final t f49371a;

    /* renamed from: b, reason: collision with root package name */
    public final e f49372b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f49373c;

    /* renamed from: d, reason: collision with root package name */
    public final List f49374d;

    /* renamed from: e, reason: collision with root package name */
    public final List f49375e;

    /* renamed from: f, reason: collision with root package name */
    public final a f49376f;

    /* renamed from: g, reason: collision with root package name */
    public final List f49377g;

    public r(t tVar, e eVar, Long l9, List<s> mediaFiles, List<w> trackingList, a aVar, List<n> icons) {
        e0.checkNotNullParameter(mediaFiles, "mediaFiles");
        e0.checkNotNullParameter(trackingList, "trackingList");
        e0.checkNotNullParameter(icons, "icons");
        this.f49371a = tVar;
        this.f49372b = eVar;
        this.f49373c = l9;
        this.f49374d = mediaFiles;
        this.f49375e = trackingList;
        this.f49376f = aVar;
        this.f49377g = icons;
    }

    public final e a() {
        return this.f49372b;
    }

    public final Long b() {
        return this.f49373c;
    }

    public final List<n> c() {
        return this.f49377g;
    }

    public final List<s> d() {
        return this.f49374d;
    }

    public final t e() {
        return this.f49371a;
    }

    public final List<w> f() {
        return this.f49375e;
    }

    public final a g() {
        return this.f49376f;
    }
}
