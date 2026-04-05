package com.ironsource;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U2 {

    /* renamed from: a, reason: collision with root package name */
    private final b f35532a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f35533b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35534a = new a();

        public a() {
            super(1);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject it) {
            kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
            return new b(it);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f35535a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35536b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35537c;

        /* renamed from: d, reason: collision with root package name */
        private final long f35538d;

        /* renamed from: e, reason: collision with root package name */
        private final float f35539e;

        /* renamed from: f, reason: collision with root package name */
        private final List<String> f35540f;

        public b(JSONObject features) {
            kotlin.jvm.internal.e0.checkNotNullParameter(features, "features");
            JSONObject jSONObject = features.has(W2.f35662a) ? features : null;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(W2.f35662a) : null;
            this.f35535a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(W2.f35663b, 25000) : 25000;
            this.f35536b = iOptInt;
            this.f35537c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            this.f35538d = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(W2.f35665d) || jSONObjectOptJSONObject.isNull(W2.f35665d)) ? iOptInt : jSONObjectOptJSONObject.optLong(W2.f35665d);
            this.f35539e = features.has(W2.f35666e) ? features.optInt(W2.f35666e) / 100.0f : 0.15f;
            List<String> listB = features.has(W2.f35667f) ? C3286ja.b(features.getJSONArray(W2.f35667f)) : uu.p0.listOf((Object[]) new String[]{com.ironsource.mediationsdk.l.f37554a, com.ironsource.mediationsdk.l.f37557d});
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f35540f = listB;
        }

        public final List<String> a() {
            return this.f35540f;
        }

        public final float b() {
            return this.f35539e;
        }

        public final int c() {
            return this.f35536b;
        }

        public final long d() {
            return this.f35538d;
        }

        public final boolean e() {
            return this.f35537c;
        }
    }

    public U2(JSONObject bannerConfigurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.f35532a = new b(bannerConfigurations);
        this.f35533b = new X0(bannerConfigurations).a(a.f35534a);
    }

    public final Map<String, b> a() {
        return this.f35533b;
    }

    public final b b() {
        return this.f35532a;
    }
}
