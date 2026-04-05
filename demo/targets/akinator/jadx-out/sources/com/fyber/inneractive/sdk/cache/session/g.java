package com.fyber.inneractive.sdk.cache.session;

import com.amazon.device.ads.DTBMetricReport;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f23154a;

    /* renamed from: b, reason: collision with root package name */
    public int f23155b;

    /* renamed from: c, reason: collision with root package name */
    public int f23156c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23157d;

    public g(int i10, int i11, int i12, long j10) {
        this.f23157d = j10;
        this.f23154a = i10;
        this.f23155b = i11;
        this.f23156c = i12;
    }

    public final JSONObject a(boolean z10, boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put(DTBMetricReport.TIME, this.f23157d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f23154a);
        if (z11) {
            jSONObject.put("com", this.f23156c);
        }
        jSONObject.put("cli", this.f23155b);
        return jSONObject;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong(DTBMetricReport.TIME);
        int iOptInt = jSONObject.optInt("cli", -1);
        int iOptInt2 = jSONObject.optInt("imp", -1);
        int iOptInt3 = jSONObject.optInt("com", -1);
        if (jOptLong == 0 || iOptInt < 0 || iOptInt2 < 0 || iOptInt3 < 0) {
            return null;
        }
        return new g(iOptInt2, iOptInt, iOptInt3, jOptLong);
    }
}
