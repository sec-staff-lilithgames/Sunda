package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f23411a = 50;

    /* renamed from: b, reason: collision with root package name */
    public Integer f23412b = 50;

    /* renamed from: c, reason: collision with root package name */
    public Set f23413c = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "pausePct", this.f23411a);
        c1.a(jSONObject, "playPct", this.f23412b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f23413c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        c1.a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }
}
