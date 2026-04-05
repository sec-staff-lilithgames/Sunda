package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f35241a;

    public Q5(JSONObject jSONObject) {
        this.f35241a = jSONObject;
    }

    public final Boolean a(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f35241a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    public final Integer b(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f35241a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    public final String c(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f35241a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }
}
