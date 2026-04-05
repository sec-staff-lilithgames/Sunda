package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C1;
import com.ironsource.C3237ge;
import com.ironsource.C3422r4;
import com.ironsource.InterfaceC3378oa;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f38659b = "q";

    /* renamed from: c, reason: collision with root package name */
    private static final String f38660c = "getPermissions";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38661d = "isPermissionGranted";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38662e = "permissions";

    /* renamed from: f, reason: collision with root package name */
    private static final String f38663f = "permission";

    /* renamed from: g, reason: collision with root package name */
    private static final String f38664g = "status";

    /* renamed from: h, reason: collision with root package name */
    private static final String f38665h = "functionName";

    /* renamed from: i, reason: collision with root package name */
    private static final String f38666i = "functionParams";

    /* renamed from: j, reason: collision with root package name */
    private static final String f38667j = "success";

    /* renamed from: k, reason: collision with root package name */
    private static final String f38668k = "fail";

    /* renamed from: l, reason: collision with root package name */
    private static final String f38669l = "unhandledPermission";

    /* renamed from: a, reason: collision with root package name */
    private Context f38670a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f38671a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f38672b;

        /* renamed from: c, reason: collision with root package name */
        String f38673c;

        /* renamed from: d, reason: collision with root package name */
        String f38674d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public q(Context context) {
        this.f38670a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f38671a = jSONObject.optString("functionName");
        aVar.f38672b = jSONObject.optJSONObject("functionParams");
        aVar.f38673c = jSONObject.optString("success");
        aVar.f38674d = jSONObject.optString("fail");
        return aVar;
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC3378oa interfaceC3378oa) throws JSONException {
        C3237ge c3237ge = new C3237ge();
        try {
            String string = jSONObject.getString(f38663f);
            c3237ge.b(f38663f, string);
            if (C1.d(this.f38670a, string)) {
                c3237ge.b("status", String.valueOf(C1.c(this.f38670a, string)));
                interfaceC3378oa.a(true, aVar.f38673c, c3237ge);
            } else {
                c3237ge.b("status", f38669l);
                interfaceC3378oa.a(false, aVar.f38674d, c3237ge);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            c3237ge.b("errMsg", e10.getMessage());
            interfaceC3378oa.a(false, aVar.f38674d, c3237ge);
        }
    }

    public void a(String str, InterfaceC3378oa interfaceC3378oa) throws Exception {
        a aVarA = a(str);
        if (f38660c.equals(aVarA.f38671a)) {
            a(aVarA.f38672b, aVarA, interfaceC3378oa);
            return;
        }
        if (f38661d.equals(aVarA.f38671a)) {
            b(aVarA.f38672b, aVarA, interfaceC3378oa);
            return;
        }
        Logger.i(f38659b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC3378oa interfaceC3378oa) throws JSONException {
        C3237ge c3237ge = new C3237ge();
        try {
            c3237ge.a(f38662e, C1.a(this.f38670a, jSONObject.getJSONArray(f38662e)));
            interfaceC3378oa.a(true, aVar.f38673c, c3237ge);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f38659b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
            c3237ge.b("errMsg", e10.getMessage());
            interfaceC3378oa.a(false, aVar.f38674d, c3237ge);
        }
    }
}
