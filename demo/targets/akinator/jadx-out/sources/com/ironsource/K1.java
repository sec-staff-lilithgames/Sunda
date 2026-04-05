package com.ironsource;

import com.ironsource.C3191e4;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f34729a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34730b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34731c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34732d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f34733e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34734f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f34735g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f34736h;

    /* renamed from: i, reason: collision with root package name */
    private final int f34737i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f34738j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f34739k;

    /* renamed from: l, reason: collision with root package name */
    private final JSONObject f34740l;

    public K1(JSONObject config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        this.f34729a = config;
        this.f34730b = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", T5.f35489j);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f34731c = strOptString;
        this.f34732d = config.optBoolean(Q6.f35250c1, true);
        this.f34733e = config.optBoolean("radvid", false);
        this.f34734f = config.optInt("uaeh", 0);
        this.f34735g = config.optBoolean("sharedThreadPool", false);
        this.f34736h = config.optBoolean("sharedThreadPoolADP", true);
        this.f34737i = config.optInt(Q6.S0, -1);
        this.f34738j = config.optBoolean("axal", false);
        this.f34739k = config.optBoolean("psrt", false);
        this.f34740l = config.optJSONObject(C3191e4.a.f36365c);
    }

    private final JSONObject a() {
        return this.f34729a;
    }

    public final int b() {
        return this.f34737i;
    }

    public final JSONObject c() {
        return this.f34740l;
    }

    public final String d() {
        return this.f34731c;
    }

    public final boolean e() {
        return this.f34739k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K1) && kotlin.jvm.internal.e0.areEqual(this.f34729a, ((K1) obj).f34729a);
    }

    public final boolean f() {
        return this.f34733e;
    }

    public final boolean g() {
        return this.f34732d;
    }

    public final boolean h() {
        return this.f34735g;
    }

    public int hashCode() {
        return this.f34729a.hashCode();
    }

    public final boolean i() {
        return this.f34736h;
    }

    public final int j() {
        return this.f34734f;
    }

    public final boolean k() {
        return this.f34738j;
    }

    public final boolean l() {
        return this.f34730b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f34729a + ")";
    }

    public final K1 a(JSONObject config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        return new K1(config);
    }

    public static /* synthetic */ K1 a(K1 k12, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = k12.f34729a;
        }
        return k12.a(jSONObject);
    }
}
