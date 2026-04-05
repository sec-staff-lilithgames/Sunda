package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class B4 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f33869c = "B4";

    /* renamed from: d, reason: collision with root package name */
    private static final String f33870d = "setSharedSignal";

    /* renamed from: e, reason: collision with root package name */
    private static final String f33871e = "getSharedSignal";

    /* renamed from: f, reason: collision with root package name */
    private static final String f33872f = "functionName";

    /* renamed from: g, reason: collision with root package name */
    private static final String f33873g = "functionParams";

    /* renamed from: h, reason: collision with root package name */
    private static final String f33874h = "success";

    /* renamed from: i, reason: collision with root package name */
    private static final String f33875i = "fail";

    /* renamed from: a, reason: collision with root package name */
    private final Context f33876a;

    /* renamed from: b, reason: collision with root package name */
    A4 f33877b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f33878a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f33879b;

        /* renamed from: c, reason: collision with root package name */
        String f33880c;

        /* renamed from: d, reason: collision with root package name */
        String f33881d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f33878a = jSONObject.optString("functionName");
            aVar.f33879b = jSONObject.optJSONObject("functionParams");
            aVar.f33880c = jSONObject.optString("success");
            aVar.f33881d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public B4(Context context, A4 a42) {
        this.f33876a = context;
        this.f33877b = a42;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, InterfaceC3378oa interfaceC3378oa) {
        C3237ge c3237ge = new C3237ge();
        JSONObject jSONObject = aVar.f33879b;
        this.f33877b.a(context, EnumC3558z4.a(jSONObject.optString("source")), jSONObject.optString(C3191e4.h.W), jSONObject.optString("data"));
        interfaceC3378oa.a(true, aVar.f33880c, c3237ge);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r7, com.ironsource.InterfaceC3378oa r8) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "unsupported API: "
            com.ironsource.B4$a r1 = r6.a(r7)
            java.lang.String r2 = r1.f33878a     // Catch: java.lang.Exception -> L22
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> L22
            r4 = 576059875(0x2255f9e3, float:2.8999172E-18)
            r5 = 1
            if (r3 == r4) goto L24
            r4 = 1486812399(0x589ef4ef, float:1.3981986E15)
            if (r3 == r4) goto L18
            goto L2e
        L18:
            java.lang.String r3 = "setSharedSignal"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L2e
            r2 = 0
            goto L2f
        L22:
            r7 = move-exception
            goto L51
        L24:
            java.lang.String r3 = "getSharedSignal"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L2e
            r2 = r5
            goto L2f
        L2e:
            r2 = -1
        L2f:
            if (r2 == 0) goto L4b
            if (r2 != r5) goto L39
            android.content.Context r7 = r6.f33876a     // Catch: java.lang.Exception -> L22
            r6.a(r7, r1, r8)     // Catch: java.lang.Exception -> L22
            return
        L39:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Exception -> L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22
            r3.<init>(r0)     // Catch: java.lang.Exception -> L22
            r3.append(r7)     // Catch: java.lang.Exception -> L22
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Exception -> L22
            r2.<init>(r7)     // Catch: java.lang.Exception -> L22
            throw r2     // Catch: java.lang.Exception -> L22
        L4b:
            android.content.Context r7 = r6.f33876a     // Catch: java.lang.Exception -> L22
            r6.b(r7, r1, r8)     // Catch: java.lang.Exception -> L22
            return
        L51:
            r6.a(r1, r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.B4.a(java.lang.String, com.ironsource.oa):void");
    }

    private void a(Context context, a aVar, InterfaceC3378oa interfaceC3378oa) throws JSONException {
        C3237ge c3237ge = new C3237ge();
        JSONObject jSONObject = aVar.f33879b;
        c3237ge.b("data", this.f33877b.a(context, EnumC3558z4.a(jSONObject.optString("source")), jSONObject.optString(C3191e4.h.W)));
        interfaceC3378oa.a(true, aVar.f33880c, c3237ge);
    }

    private void a(a aVar, InterfaceC3378oa interfaceC3378oa, Exception exc) throws JSONException {
        C3422r4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(f33869c, aVar.f33878a + " exception " + message);
        C3237ge c3237ge = new C3237ge();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c3237ge.b("error", message);
        interfaceC3378oa.a(false, aVar.f33881d, c3237ge);
    }
}
