package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3555z1 {

    /* renamed from: a, reason: collision with root package name */
    private final Hb f39326a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39327b;

    /* renamed from: c, reason: collision with root package name */
    private final D1 f39328c;

    /* renamed from: d, reason: collision with root package name */
    private final K1 f39329d;

    /* renamed from: e, reason: collision with root package name */
    private final C3521x1 f39330e;

    public C3555z1(JSONObject applicationConfigurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(B1.f33860a);
        this.f39326a = new Hb(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f39327b = applicationConfigurations.optBoolean(B1.f33866g, false);
        JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject(B1.f33867h);
        this.f39328c = new D1(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.f39329d = new K1(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject(B1.f33865f);
        this.f39330e = new C3521x1(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    public final C3521x1 a() {
        return this.f39330e;
    }

    public final D1 b() {
        return this.f39328c;
    }

    public final K1 c() {
        return this.f39329d;
    }

    public final boolean d() {
        return this.f39327b;
    }

    public final Hb e() {
        return this.f39326a;
    }
}
