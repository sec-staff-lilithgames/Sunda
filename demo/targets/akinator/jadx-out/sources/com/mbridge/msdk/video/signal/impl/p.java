package com.mbridge.msdk.video.signal.impl;

import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.s;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class p extends g {
    public void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(C3191e4.h.G, new s(com.mbridge.msdk.foundation.controller.c.m().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
