package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16173a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16174b;

    public x3(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f16173a = JsonUtils.getString(jSONObject, "id", "");
        this.f16174b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f16173a;
    }

    public String b() {
        return this.f16174b;
    }
}
