package com.ironsource;

import com.ironsource.C3191e4;
import com.ironsource.InterfaceC3426r8;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3443s8 implements InterfaceC3426r8, InterfaceC3426r8.a {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f38369a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f38370b = new JSONObject();

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f38371c = new JSONObject();

    private final Object e(String str) {
        if (this.f38371c.has(str)) {
            return this.f38371c.get(str);
        }
        if (this.f38370b.has(str)) {
            return this.f38370b.get(str);
        }
        if (this.f38369a.has(str)) {
            return this.f38369a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3426r8
    public JSONObject a(String configKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3426r8
    public Integer b(String configKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3426r8
    public Boolean c(String configKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3426r8
    public String d(String configKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC3426r8.a
    public void a(JSONObject controllerConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.f38369a = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(C3191e4.a.f36364b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.f38370b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f38369a.optJSONObject(C3191e4.a.f36365c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.f38371c = jSONObjectOptJSONObject2;
    }
}
