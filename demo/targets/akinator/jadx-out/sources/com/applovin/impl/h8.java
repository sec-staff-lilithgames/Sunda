package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14085a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14086b;

    /* renamed from: c, reason: collision with root package name */
    private final List f14087c;

    public h8(JSONObject jSONObject) {
        this.f14085a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f14086b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f14087c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f14085a;
    }

    public String b() {
        return this.f14086b;
    }

    public List c() {
        return this.f14087c;
    }
}
