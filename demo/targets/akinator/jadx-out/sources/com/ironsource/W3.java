package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W3 {

    /* renamed from: a, reason: collision with root package name */
    private final C3434s f35671a;

    /* renamed from: b, reason: collision with root package name */
    private final C3434s f35672b;

    /* renamed from: c, reason: collision with root package name */
    private final U2 f35673c;

    /* renamed from: d, reason: collision with root package name */
    private final Sb f35674d;

    /* renamed from: e, reason: collision with root package name */
    private final C3555z1 f35675e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3434s> f35676f;

    public W3(JSONObject configurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configurations, "configurations");
        C3434s c3434s = new C3434s(a(configurations, "rewarded"));
        this.f35671a = c3434s;
        C3434s c3434s2 = new C3434s(a(configurations, "interstitial"));
        this.f35672b = c3434s2;
        this.f35673c = new U2(a(configurations, "banner"));
        this.f35674d = new Sb(a(configurations, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.f35675e = new C3555z1(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f35676f = uu.p1.mapOf(tu.e0.to(LevelPlay.AdFormat.INTERSTITIAL, c3434s2), tu.e0.to(LevelPlay.AdFormat.REWARDED, c3434s));
    }

    public final Map<LevelPlay.AdFormat, C3434s> a() {
        return this.f35676f;
    }

    public final C3555z1 b() {
        return this.f35675e;
    }

    public final U2 c() {
        return this.f35673c;
    }

    public final Sb d() {
        return this.f35674d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
    }
}
