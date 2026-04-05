package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.B7;
import com.ironsource.C3191e4;
import com.ironsource.C3237ge;
import com.ironsource.InterfaceC3378oa;
import com.ironsource.Mb;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import i2.hQ.aTNDubNmpwAqdU;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private static final String f38577c = "i";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38578d = "getDeviceData";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38579e = "deviceDataFunction";

    /* renamed from: f, reason: collision with root package name */
    private static final String f38580f = "deviceDataParams";

    /* renamed from: g, reason: collision with root package name */
    private static final String f38581g = "success";

    /* renamed from: h, reason: collision with root package name */
    private static final String f38582h = "fail";

    /* renamed from: a, reason: collision with root package name */
    private Context f38583a;

    /* renamed from: b, reason: collision with root package name */
    private final B7 f38584b = Mb.U().i();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f38585a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f38586b;

        /* renamed from: c, reason: collision with root package name */
        String f38587c;

        /* renamed from: d, reason: collision with root package name */
        String f38588d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public i(Context context) {
        this.f38583a = context;
    }

    public void a(String str, InterfaceC3378oa interfaceC3378oa) throws Exception {
        a aVarA = a(str);
        if (f38578d.equals(aVarA.f38585a)) {
            interfaceC3378oa.a(true, aVarA.f38587c, a());
            return;
        }
        Logger.i(f38577c, "unhandled API request " + str);
    }

    private C3237ge a() throws JSONException {
        C3237ge c3237ge = new C3237ge();
        c3237ge.b(SDKUtils.encodeString(aTNDubNmpwAqdU.tAIIfWBRpj), SDKUtils.encodeString(String.valueOf(this.f38584b.j())));
        c3237ge.b(SDKUtils.encodeString(C3191e4.i.f36542j0), SDKUtils.encodeString(String.valueOf(this.f38584b.q(this.f38583a))));
        c3237ge.b(SDKUtils.encodeString(C3191e4.i.f36544k0), SDKUtils.encodeString(String.valueOf(this.f38584b.C(this.f38583a))));
        c3237ge.b(SDKUtils.encodeString(C3191e4.i.f36546l0), SDKUtils.encodeString(String.valueOf(this.f38584b.D(this.f38583a))));
        c3237ge.b(SDKUtils.encodeString(C3191e4.i.f36548m0), SDKUtils.encodeString(String.valueOf(this.f38584b.e(this.f38583a))));
        c3237ge.b(SDKUtils.encodeString(C3191e4.i.f36550n0), SDKUtils.encodeString(String.valueOf(this.f38584b.h(this.f38583a))));
        return c3237ge;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f38585a = jSONObject.optString(f38579e);
        aVar.f38586b = jSONObject.optJSONObject(f38580f);
        aVar.f38587c = jSONObject.optString("success");
        aVar.f38588d = jSONObject.optString("fail");
        return aVar;
    }
}
