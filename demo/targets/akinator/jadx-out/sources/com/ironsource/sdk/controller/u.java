package com.ironsource.sdk.controller;

import android.content.Context;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.ironsource.C3131ag;
import com.ironsource.C3237ge;
import com.ironsource.C3397pc;
import com.ironsource.C3422r4;
import com.ironsource.InterfaceC3378oa;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class u {

    /* renamed from: d, reason: collision with root package name */
    private static final String f38681d = "u";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38682e = "updateToken";

    /* renamed from: f, reason: collision with root package name */
    private static final String f38683f = "getToken";

    /* renamed from: g, reason: collision with root package name */
    private static final String f38684g = "functionName";

    /* renamed from: h, reason: collision with root package name */
    private static final String f38685h = "functionParams";

    /* renamed from: i, reason: collision with root package name */
    private static final String f38686i = "success";

    /* renamed from: j, reason: collision with root package name */
    private static final String f38687j = "fail";

    /* renamed from: b, reason: collision with root package name */
    private Context f38689b;

    /* renamed from: a, reason: collision with root package name */
    private C3397pc f38688a = new C3397pc();

    /* renamed from: c, reason: collision with root package name */
    private C3131ag f38690c = new C3131ag();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f38691a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f38692b;

        /* renamed from: c, reason: collision with root package name */
        String f38693c;

        /* renamed from: d, reason: collision with root package name */
        String f38694d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public u(Context context) {
        this.f38689b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f38691a = jSONObject.optString("functionName");
        aVar.f38692b = jSONObject.optJSONObject("functionParams");
        aVar.f38693c = jSONObject.optString("success");
        aVar.f38694d = jSONObject.optString("fail");
        return aVar;
    }

    public void a(String str, InterfaceC3378oa interfaceC3378oa) throws Exception {
        a aVarA = a(str);
        if (f38682e.equals(aVarA.f38691a)) {
            a(aVarA.f38692b, aVarA, interfaceC3378oa);
            return;
        }
        if (PtLatqAYjEFT.NJaTMOXbVpV.equals(aVarA.f38691a)) {
            a(aVarA, interfaceC3378oa);
            return;
        }
        Logger.i(f38681d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC3378oa interfaceC3378oa) {
        C3237ge c3237ge = new C3237ge();
        try {
            this.f38688a.a(jSONObject);
            interfaceC3378oa.a(true, aVar.f38693c, c3237ge);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f38681d, "updateToken exception " + e10.getMessage());
            interfaceC3378oa.a(false, aVar.f38694d, c3237ge);
        }
    }

    private void a(a aVar, InterfaceC3378oa interfaceC3378oa) throws JSONException {
        try {
            JSONObject jSONObjectA = this.f38690c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC3378oa.a(true, aVar.f38693c, jSONObjectA);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            interfaceC3378oa.a(false, aVar.f38694d, e10.getMessage());
        }
    }
}
