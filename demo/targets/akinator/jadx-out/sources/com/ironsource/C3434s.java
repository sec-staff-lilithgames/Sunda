package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3434s {

    /* renamed from: d, reason: collision with root package name */
    public static final c f38303d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    public static final String f38304e = "capping";

    /* renamed from: f, reason: collision with root package name */
    public static final String f38305f = "pacing";

    /* renamed from: g, reason: collision with root package name */
    public static final String f38306g = "delivery";

    /* renamed from: h, reason: collision with root package name */
    public static final String f38307h = "progressiveLoadingConfig";

    /* renamed from: i, reason: collision with root package name */
    public static final String f38308i = "expiredDurationInMinutes";

    /* renamed from: j, reason: collision with root package name */
    public static final String f38309j = "reward";

    /* renamed from: k, reason: collision with root package name */
    public static final String f38310k = "name";

    /* renamed from: l, reason: collision with root package name */
    public static final String f38311l = "amount";

    /* renamed from: m, reason: collision with root package name */
    public static final String f38312m = "virtualItemName";

    /* renamed from: n, reason: collision with root package name */
    public static final String f38313n = "virtualItemCount";

    /* renamed from: o, reason: collision with root package name */
    public static final long f38314o = 60;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, d> f38315a;

    /* renamed from: b, reason: collision with root package name */
    private final d f38316b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, d> f38317c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38318a = new a();

        public a() {
            super(1);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s$b */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38319a = new b();

        public b() {
            super(1);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s$c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.u uVar) {
            this();
        }

        private c() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.s$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final K3 f38320a;

        /* renamed from: b, reason: collision with root package name */
        private final C3164cd f38321b;

        /* renamed from: c, reason: collision with root package name */
        private final R4 f38322c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f38323d;

        /* renamed from: e, reason: collision with root package name */
        private final Hd f38324e;

        /* renamed from: f, reason: collision with root package name */
        private final Hd f38325f;

        /* renamed from: g, reason: collision with root package name */
        private final C3533xd f38326g;

        public d(JSONObject features) throws JSONException {
            K3 k32;
            C3164cd c3164cd;
            kotlin.jvm.internal.e0.checkNotNullParameter(features, "features");
            C3533xd c3533xd = null;
            if (features.has(C3434s.f38304e)) {
                JSONObject jSONObject = features.getJSONObject(C3434s.f38304e);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                k32 = new K3(jSONObject);
            } else {
                k32 = null;
            }
            this.f38320a = k32;
            if (features.has(C3434s.f38305f)) {
                JSONObject jSONObject2 = features.getJSONObject(C3434s.f38305f);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                c3164cd = new C3164cd(jSONObject2);
            } else {
                c3164cd = null;
            }
            this.f38321b = c3164cd;
            this.f38322c = features.has(C3434s.f38306g) ? new R4(features.getBoolean(C3434s.f38306g)) : null;
            this.f38323d = features.has(C3434s.f38308i) ? Long.valueOf(features.getLong(C3434s.f38308i)) : null;
            JSONObject jSONObjectOptJSONObject = features.optJSONObject(C3434s.f38309j);
            this.f38324e = jSONObjectOptJSONObject != null ? new Hd(jSONObjectOptJSONObject, "name", "amount") : null;
            Hd hd = new Hd(features, C3434s.f38312m, C3434s.f38313n);
            String strB = hd.b();
            this.f38325f = (strB == null || strB.length() == 0 || hd.a() == null) ? null : hd;
            if (features.has(C3434s.f38307h)) {
                JSONObject jSONObject3 = features.getJSONObject(C3434s.f38307h);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                c3533xd = new C3533xd(jSONObject3);
            }
            this.f38326g = c3533xd;
        }

        public final Hd a() {
            return this.f38324e;
        }

        public final K3 b() {
            return this.f38320a;
        }

        public final R4 c() {
            return this.f38322c;
        }

        public final Long d() {
            return this.f38323d;
        }

        public final C3164cd e() {
            return this.f38321b;
        }

        public final Hd f() {
            return this.f38325f;
        }

        public final C3533xd g() {
            return this.f38326g;
        }
    }

    public C3434s(JSONObject configurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configurations, "configurations");
        this.f38315a = new C3465td(configurations).a(b.f38319a);
        this.f38316b = new d(configurations);
        this.f38317c = new X0(configurations).a(a.f38318a);
    }

    public final Map<String, d> a() {
        return this.f38317c;
    }

    public final d b() {
        return this.f38316b;
    }

    public final Map<String, d> c() {
        return this.f38315a;
    }
}
