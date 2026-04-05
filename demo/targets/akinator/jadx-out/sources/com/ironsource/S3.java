package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S3 implements X5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f35439a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35440a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f35441b = false;

        private a() {
        }
    }

    public S3(JSONObject jSONObject) {
        this.f35439a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f35439a.optBoolean("clickCheck", false);
    }
}
