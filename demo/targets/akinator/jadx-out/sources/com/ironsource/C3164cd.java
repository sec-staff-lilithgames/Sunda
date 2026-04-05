package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3164cd {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f36184a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f36185b;

    /* renamed from: c, reason: collision with root package name */
    private final P3 f36186c;

    public C3164cd(JSONObject features) {
        kotlin.jvm.internal.e0.checkNotNullParameter(features, "features");
        this.f36184a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f36185b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f36186c = P3.Second;
    }

    public final Boolean a() {
        return this.f36184a;
    }

    public final Integer b() {
        return this.f36185b;
    }

    public final P3 c() {
        return this.f36186c;
    }
}
