package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class x6 {

    /* renamed from: a, reason: collision with root package name */
    private final a f16202a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f16203b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16204c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16205d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f16206e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            return i10 != 0 ? i10 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public x6(JSONObject jSONObject, String str) {
        this.f16205d = str;
        this.f16202a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f16203b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f16204c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.f16206e = bool;
    }

    public String b() {
        return this.f16205d;
    }

    public String c() {
        return this.f16204c;
    }

    public Integer d() {
        return this.f16203b;
    }

    public String e() {
        Boolean bool = this.f16206e;
        return a.b.o(new StringBuilder("\n"), this.f16205d, " - ", bool != null ? String.valueOf(bool) : p0.b().a(com.applovin.impl.sdk.k.o()));
    }

    public a f() {
        return this.f16202a;
    }

    public Boolean a() {
        return this.f16206e;
    }
}
