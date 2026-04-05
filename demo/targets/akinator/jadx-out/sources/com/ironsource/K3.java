package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f34744a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f34745b;

    /* renamed from: c, reason: collision with root package name */
    private final P3 f34746c;

    public K3(JSONObject features) {
        kotlin.jvm.internal.e0.checkNotNullParameter(features, "features");
        this.f34744a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f34745b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f34746c = features.has("unit") ? P3.f35168c.a(features.optString("unit")) : null;
    }

    public final Boolean a() {
        return this.f34744a;
    }

    public final Integer b() {
        return this.f34745b;
    }

    public final P3 c() {
        return this.f34746c;
    }
}
