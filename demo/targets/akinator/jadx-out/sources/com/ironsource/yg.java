package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class yg {

    /* renamed from: c, reason: collision with root package name */
    public static final a f39294c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Double f39295a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f39296b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final b a() {
            return new b();
        }

        public final yg b() {
            return a().a();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Double f39297a;

        /* renamed from: b, reason: collision with root package name */
        private Double f39298b;

        public final void a(Double d10) {
            this.f39298b = d10;
        }

        public final void b(Double d10) {
            this.f39297a = d10;
        }

        public final Double c() {
            return this.f39297a;
        }

        public final b a(double d10) {
            this.f39298b = Double.valueOf(d10);
            return this;
        }

        public final Double b() {
            return this.f39298b;
        }

        public final yg a() {
            return new yg(this, null);
        }

        public final b b(double d10) {
            this.f39297a = Double.valueOf(d10);
            return this;
        }
    }

    public /* synthetic */ yg(b bVar, kotlin.jvm.internal.u uVar) {
        this(bVar);
    }

    public static final b a() {
        return f39294c.a();
    }

    public static final yg b() {
        return f39294c.b();
    }

    public final Double c() {
        return this.f39296b;
    }

    public final Double d() {
        return this.f39295a;
    }

    public final String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f39296b);
            jSONObject.put("floor", this.f39295a);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "json.toString()");
        return string;
    }

    public String toString() {
        return a.b.k("WaterfallConfiguration", e());
    }

    private yg(b bVar) {
        this.f39295a = bVar.c();
        this.f39296b = bVar.b();
    }
}
