package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R3 implements X5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f35379a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35380a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f35381b = false;

        /* renamed from: c, reason: collision with root package name */
        public static final String f35382c = "curlError";

        private a() {
        }
    }

    public R3(JSONObject jSONObject) {
        this.f35379a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f35379a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.f35379a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.f35379a.optBoolean("reportController", true);
    }
}
