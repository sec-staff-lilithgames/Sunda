package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3237ge;
import com.ironsource.C3410q8;
import com.ironsource.C3422r4;
import com.ironsource.InterfaceC3320l8;
import com.ironsource.InterfaceC3378oa;
import com.ironsource.Mg;
import com.ironsource.wg;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a implements InterfaceC3320l8 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f38441d = "loadWithUrl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38442e = "sendMessage";

    /* renamed from: f, reason: collision with root package name */
    public static final String f38443f = "removeAdView";

    /* renamed from: g, reason: collision with root package name */
    public static final String f38444g = "webviewAction";

    /* renamed from: h, reason: collision with root package name */
    public static final String f38445h = "handleGetViewVisibility";

    /* renamed from: i, reason: collision with root package name */
    private static final String f38446i = "functionName";

    /* renamed from: j, reason: collision with root package name */
    private static final String f38447j = "functionParams";

    /* renamed from: k, reason: collision with root package name */
    private static final String f38448k = "success";

    /* renamed from: l, reason: collision with root package name */
    private static final String f38449l = "fail";

    /* renamed from: m, reason: collision with root package name */
    public static final String f38450m = "errMsg";

    /* renamed from: n, reason: collision with root package name */
    private static final String f38451n = "%s | unsupported AdViews API";

    /* renamed from: a, reason: collision with root package name */
    private Mg f38452a;

    /* renamed from: b, reason: collision with root package name */
    private C3410q8 f38453b = C3410q8.a();

    /* renamed from: c, reason: collision with root package name */
    private Context f38454c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    public static class C0238a {

        /* renamed from: a, reason: collision with root package name */
        String f38455a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f38456b;

        /* renamed from: c, reason: collision with root package name */
        String f38457c;

        /* renamed from: d, reason: collision with root package name */
        String f38458d;

        public /* synthetic */ C0238a(int i10) {
            this();
        }

        private C0238a() {
        }
    }

    public a(Context context) {
        this.f38454c = context;
    }

    public void a(Mg mg2) {
        this.f38452a = mg2;
    }

    @Override // com.ironsource.InterfaceC3320l8
    public void a(String str, JSONObject jSONObject) {
        if (this.f38452a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f38452a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC3320l8
    public void a(String str, String str2, String str3) {
        a(str, wg.a(str2, str3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(String str, InterfaceC3378oa interfaceC3378oa) throws Exception {
        String str2;
        C0238a c0238aA = a(str);
        C3237ge c3237ge = new C3237ge();
        try {
            str2 = c0238aA.f38455a;
        } catch (Exception e10) {
            e = e10;
        }
        try {
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f38443f)) {
                        this.f38453b.c(c0238aA.f38456b, c0238aA.f38457c, c0238aA.f38458d);
                        return;
                    }
                    throw new IllegalArgumentException(c0238aA.f38455a + " | unsupported AdViews API");
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        this.f38453b.d(c0238aA.f38456b, c0238aA.f38457c, c0238aA.f38458d);
                        return;
                    }
                    throw new IllegalArgumentException(c0238aA.f38455a + " | unsupported AdViews API");
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        this.f38453b.a(this, c0238aA.f38456b, this.f38454c, c0238aA.f38457c, c0238aA.f38458d);
                        return;
                    }
                    throw new IllegalArgumentException(c0238aA.f38455a + " | unsupported AdViews API");
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        this.f38453b.a(c0238aA.f38456b, c0238aA.f38457c, c0238aA.f38458d);
                        return;
                    }
                    throw new IllegalArgumentException(c0238aA.f38455a + " | unsupported AdViews API");
                case 1491535759:
                    if (str2.equals(f38444g)) {
                        this.f38453b.b(c0238aA.f38456b, c0238aA.f38457c, c0238aA.f38458d);
                        return;
                    }
                    throw new IllegalArgumentException(c0238aA.f38455a + " | unsupported AdViews API");
                default:
                    throw new IllegalArgumentException(c0238aA.f38455a + " | unsupported AdViews API");
            }
        } catch (Exception e11) {
            e = e11;
            C3422r4.d().a(e);
            c3237ge.b("errMsg", e.getMessage());
            String strC = this.f38453b.c(c0238aA.f38456b);
            if (!TextUtils.isEmpty(strC)) {
                c3237ge.b("adViewId", strC);
            }
            interfaceC3378oa.a(false, c0238aA.f38458d, c3237ge);
        }
    }

    private C0238a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C0238a c0238a = new C0238a(0);
        c0238a.f38455a = jSONObject.optString("functionName");
        c0238a.f38456b = jSONObject.optJSONObject("functionParams");
        c0238a.f38457c = jSONObject.optString("success");
        c0238a.f38458d = jSONObject.optString("fail");
        return c0238a;
    }
}
