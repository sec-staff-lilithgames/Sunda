package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class t extends d {

    /* renamed from: w, reason: collision with root package name */
    public int f41193w;

    /* renamed from: x, reason: collision with root package name */
    public int f41194x;

    public t(Context context) {
        super(context);
        this.f41194x = l0.v();
        this.f41193w = l0.h();
    }

    @Override // com.mbridge.msdk.foundation.tools.d
    public JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f41194x + "");
                jSONObject.put("dmf", this.f41193w);
                return jSONObjectA;
            }
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("DomainDeviceInfo", e10.getMessage());
            }
        }
        return jSONObjectA;
    }
}
