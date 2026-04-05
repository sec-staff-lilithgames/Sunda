package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3422r4;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f37583a;

    /* renamed from: b, reason: collision with root package name */
    private String f37584b;

    /* renamed from: c, reason: collision with root package name */
    private String f37585c;

    /* renamed from: d, reason: collision with root package name */
    private int f37586d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i10) {
        this.f37583a = ironSourceTag;
        this.f37584b = str;
        this.f37585c = str2;
        this.f37586d = i10;
    }

    public int a() {
        return this.f37586d;
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f37584b);
            jSONObject.put("tag", this.f37583a);
            jSONObject.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f37586d);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, this.f37585c);
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
