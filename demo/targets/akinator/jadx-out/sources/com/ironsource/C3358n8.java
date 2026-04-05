package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3358n8 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3320l8 f37956a;

    /* renamed from: c, reason: collision with root package name */
    private WebView f37958c;

    /* renamed from: d, reason: collision with root package name */
    private String f37959d;

    /* renamed from: e, reason: collision with root package name */
    private String f37960e = "n8";

    /* renamed from: f, reason: collision with root package name */
    private String[] f37961f = {"handleGetViewVisibility"};

    /* renamed from: g, reason: collision with root package name */
    private final String[] f37962g = {C3284j8.f37007h, C3284j8.f37008i, C3284j8.f37006g, "handleGetViewVisibility", C3284j8.f37009j};

    /* renamed from: b, reason: collision with root package name */
    private qg f37957b = new qg();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.n8$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37964b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37965c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f37966d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f37963a = str;
            this.f37964b = str2;
            this.f37965c = str3;
            this.f37966d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C3358n8.this.b(this.f37963a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f37963a;
                    Log.e(C3358n8.this.f37960e, str);
                    C3358n8.this.a(this.f37964b, str);
                    return;
                }
                if (this.f37963a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C3358n8.this.e(this.f37965c);
                    return;
                }
                if (!this.f37963a.equalsIgnoreCase(C3284j8.f37009j) && !this.f37963a.equalsIgnoreCase(C3284j8.f37008i)) {
                    return;
                }
                C3358n8.this.a(this.f37966d.getString("params"), this.f37965c, this.f37964b);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f37963a;
                Log.e(C3358n8.this.f37960e, str2);
                C3358n8.this.a(this.f37964b, str2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.n8$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37969b;

        public b(String str, String str2) {
            this.f37968a = str;
            this.f37969b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3358n8.this.f37958c.evaluateJavascript(this.f37968a, null);
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                Log.e(C3358n8.this.f37960e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f37969b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f37956a == null || this.f37957b == null) {
            return;
        }
        a(C3284j8.f37000a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f37961f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C3284j8.f37010k);
    }

    public void e() {
        if (this.f37956a == null || this.f37957b == null) {
            return;
        }
        a(C3284j8.f37001b, a());
    }

    public void f(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f37959d);
            a(str, jSONObject);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void g(String str) {
        this.f37959d = str;
    }

    public void a(WebView webView) {
        this.f37958c = webView;
    }

    public void b() {
        this.f37956a = null;
        this.f37957b = null;
    }

    public String c() {
        return this.f37959d;
    }

    public void a(InterfaceC3320l8 interfaceC3320l8) {
        this.f37956a = interfaceC3320l8;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (!TextUtils.isEmpty(strOptString) && h(strOptString)) {
                if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                    a(jSONObject, (String) null, (String) null);
                    return;
                }
                return;
            }
            a(jSONObject.optString(C3284j8.f37021v, C3284j8.f37002c), jSONObject);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            Log.e(this.f37960e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.f37962g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d(String str) {
        V7.f35633a.d(new b(a.b.l("javascript:try{", str, "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}"), str));
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC3320l8 interfaceC3320l8 = this.f37956a;
        if (interfaceC3320l8 != null) {
            interfaceC3320l8.a(str, jSONObject);
        }
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.f37957b.a();
        jSONObjectA.put("adViewId", this.f37959d);
        a(str, jSONObjectA);
    }

    public void a(String str, String str2) {
        InterfaceC3320l8 interfaceC3320l8 = this.f37956a;
        if (interfaceC3320l8 != null) {
            interfaceC3320l8.a(str, str2, this.f37959d);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f37956a == null) {
            A8.a(C3219fe.f36717t, new C3494v8().a(G5.f34451y, "mDelegate is null").a());
        } else {
            V7.f35633a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(String str, int i10, boolean z10) {
        this.f37957b.a(str, i10, z10);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3284j8.f37018s, this.f37957b.a());
            jSONObject.put(C3284j8.f37015p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.f37958c == null) {
            String strK = a.b.k("No external adUnit attached to ISNAdView while trying to send message: ", str);
            Log.e(this.f37960e, strK);
            this.f37956a.a(str3, strK, this.f37959d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f37959d);
        a(str2, jSONObject);
    }

    private String a(String str) {
        return String.format(C3284j8.f37020u, str);
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f37957b.a());
            return jSONObject2;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Log.e(this.f37960e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject2;
        }
    }
}
