package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.c1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public String f23343a;

    /* renamed from: b, reason: collision with root package name */
    public String f23344b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f23345c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f23346d;

    /* renamed from: e, reason: collision with root package name */
    public p0 f23347e;

    /* renamed from: f, reason: collision with root package name */
    public t0 f23348f;

    /* renamed from: g, reason: collision with root package name */
    public u0 f23349g;

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "id", this.f23343a);
        c1.a(jSONObject, "spotId", this.f23344b);
        c1.a(jSONObject, "display", this.f23345c);
        c1.a(jSONObject, "monitor", this.f23346d);
        c1.a(jSONObject, "native", this.f23347e);
        c1.a(jSONObject, "video", this.f23348f);
        c1.a(jSONObject, "viewability", this.f23349g);
        return jSONObject.toString();
    }
}
