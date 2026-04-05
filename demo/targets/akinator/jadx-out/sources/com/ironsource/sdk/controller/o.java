package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3237ge;
import com.ironsource.C3422r4;
import com.ironsource.Hc;
import com.ironsource.InterfaceC3378oa;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private static final String f38632c = "o";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38633d = "activate";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38634e = "startSession";

    /* renamed from: f, reason: collision with root package name */
    private static final String f38635f = "finishSession";

    /* renamed from: g, reason: collision with root package name */
    private static final String f38636g = "impressionOccurred";

    /* renamed from: h, reason: collision with root package name */
    private static final String f38637h = "getOmidData";

    /* renamed from: i, reason: collision with root package name */
    private static final String f38638i = "omidFunction";

    /* renamed from: j, reason: collision with root package name */
    private static final String f38639j = "omidParams";

    /* renamed from: k, reason: collision with root package name */
    private static final String f38640k = "success";

    /* renamed from: l, reason: collision with root package name */
    private static final String f38641l = "fail";

    /* renamed from: m, reason: collision with root package name */
    private static final String f38642m = "%s | unsupported OMID API";

    /* renamed from: a, reason: collision with root package name */
    private final Context f38643a;

    /* renamed from: b, reason: collision with root package name */
    private final Hc f38644b = new Hc();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f38645a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f38646b;

        /* renamed from: c, reason: collision with root package name */
        String f38647c;

        /* renamed from: d, reason: collision with root package name */
        String f38648d;

        public /* synthetic */ a(int i10) {
            this();
        }

        private a() {
        }
    }

    public o(Context context) {
        this.f38643a = context;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public void a(String str, InterfaceC3378oa interfaceC3378oa) throws Exception {
        a aVarA = a(str);
        C3237ge c3237ge = new C3237ge();
        JSONObject jSONObject = aVarA.f38646b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                c3237ge.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = aVarA.f38645a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(f38633d)) {
                        this.f38644b.a(this.f38643a);
                        c3237ge = this.f38644b.a();
                        interfaceC3378oa.a(true, aVarA.f38647c, c3237ge);
                        return;
                    }
                    break;
                case -984459207:
                    if (str2.equals(f38637h)) {
                        c3237ge = this.f38644b.a();
                        interfaceC3378oa.a(true, aVarA.f38647c, c3237ge);
                        return;
                    }
                    break;
                case 70701699:
                    if (str2.equals(f38635f)) {
                        this.f38644b.b(aVarA.f38646b);
                        interfaceC3378oa.a(true, aVarA.f38647c, c3237ge);
                        return;
                    }
                    break;
                case 1208109646:
                    if (str2.equals(f38636g)) {
                        this.f38644b.c(aVarA.f38646b);
                        interfaceC3378oa.a(true, aVarA.f38647c, c3237ge);
                        return;
                    }
                    break;
                case 1850541012:
                    if (str2.equals(f38634e)) {
                        this.f38644b.d(aVarA.f38646b);
                        interfaceC3378oa.a(true, aVarA.f38647c, c3237ge);
                        return;
                    }
                    break;
            }
            throw new IllegalArgumentException(aVarA.f38645a + " | unsupported OMID API");
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            c3237ge.b("errMsg", e10.getMessage());
            Logger.i(f38632c, "OMIDJSAdapter " + aVarA.f38645a + " Exception: " + e10.getMessage());
            interfaceC3378oa.a(false, aVarA.f38648d, c3237ge);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.f38645a = jSONObject.optString(f38638i);
        aVar.f38646b = jSONObject.optJSONObject(f38639j);
        aVar.f38647c = jSONObject.optString("success");
        aVar.f38648d = jSONObject.optString("fail");
        return aVar;
    }
}
