package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Bb {

    /* renamed from: c, reason: collision with root package name */
    public static final a f33894c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f33895d = "revenue";

    /* renamed from: e, reason: collision with root package name */
    public static final String f33896e = "precision";

    /* renamed from: a, reason: collision with root package name */
    private final double f33897a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33898b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final Bb a(JSONObject json) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullParameter(json, "json");
            try {
                double d10 = json.getDouble("revenue");
                String precision = json.getString("precision");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(precision, "precision");
                return new Bb(d10, precision);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                C3518wf.a(e10);
                return null;
            }
        }

        private a() {
        }
    }

    public Bb(double d10, String precision) {
        kotlin.jvm.internal.e0.checkNotNullParameter(precision, "precision");
        this.f33897a = d10;
        this.f33898b = precision;
    }

    public final double a() {
        return this.f33897a;
    }

    public final String b() {
        return this.f33898b;
    }

    public final String c() {
        return this.f33898b;
    }

    public final double d() {
        return this.f33897a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bb)) {
            return false;
        }
        Bb bb2 = (Bb) obj;
        return Double.compare(this.f33897a, bb2.f33897a) == 0 && kotlin.jvm.internal.e0.areEqual(this.f33898b, bb2.f33898b);
    }

    public int hashCode() {
        return this.f33898b.hashCode() + (Double.hashCode(this.f33897a) * 31);
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.f33897a + ", precision=" + this.f33898b + ")";
    }

    public final Bb a(double d10, String precision) {
        kotlin.jvm.internal.e0.checkNotNullParameter(precision, "precision");
        return new Bb(d10, precision);
    }

    public static /* synthetic */ Bb a(Bb bb2, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = bb2.f33897a;
        }
        if ((i10 & 2) != 0) {
            str = bb2.f33898b;
        }
        return bb2.a(d10, str);
    }

    public static final Bb a(JSONObject jSONObject) {
        return f33894c.a(jSONObject);
    }
}
