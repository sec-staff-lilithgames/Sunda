package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C3422r4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final String f38566c = "com.ironsource.sdk.controller.g";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38567d = "functionName";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38568e = "params";

    /* renamed from: f, reason: collision with root package name */
    private static final String f38569f = "hash";

    /* renamed from: a, reason: collision with root package name */
    private final b f38570a;

    /* renamed from: b, reason: collision with root package name */
    private final s f38571b;

    public g(b bVar, s sVar) {
        this.f38570a = bVar;
        this.f38571b = sVar;
    }

    private void a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.i(f38566c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void b(String str, String str2, String str3) {
        this.f38570a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(f38566c, "messageHandler(" + str + " " + str3 + ")");
            if (this.f38571b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e10) {
            a(e10);
        }
    }

    private void a(String str, String str2) throws Exception {
        this.f38570a.a(str, str2);
    }

    private void a(String str) {
        this.f38570a.b(str);
    }

    private String a(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f38569f, SDKUtils.encodeString(str3));
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }
}
