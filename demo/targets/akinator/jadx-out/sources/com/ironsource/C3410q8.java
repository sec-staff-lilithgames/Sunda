package com.ironsource;

import android.content.Context;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3410q8 implements InterfaceC3116a1 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f38212b = "q8";

    /* renamed from: c, reason: collision with root package name */
    private static C3410q8 f38213c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, K8> f38214a = a.b.u();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.q8$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3393p8 f38215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f38216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38217c;

        public a(C3393p8 c3393p8, Context context, String str) {
            this.f38215a = c3393p8;
            this.f38216b = context;
            this.f38217c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3410q8.this.f38214a.put(this.f38217c, new C3302k8(this.f38215a, this.f38216b));
        }
    }

    private C3267i8 b(JSONObject jSONObject) {
        C3267i8 c3267i8 = new C3267i8();
        try {
            return a(jSONObject);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return c3267i8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C3191e4.h.f36508s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static synchronized C3410q8 a() {
        try {
            if (f38213c == null) {
                f38213c = new C3410q8();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38213c;
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f38212b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f38214a.containsKey(string)) {
            Logger.i(f38212b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        K8 k82 = this.f38214a.get(string);
        if (k82 != null) {
            k82.c(jSONObject, str, str2);
        }
    }

    private C3267i8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(C3191e4.h.O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new C3267i8(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return new C3267i8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f38214a.containsKey(string)) {
                K8 k82 = this.f38214a.get(string);
                String string2 = jSONObject.getString(C3191e4.h.f36514v0);
                if (k82 != null) {
                    k82.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f38212b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f38212b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f38214a.containsKey(string)) {
                K8 k82 = this.f38214a.get(string);
                this.f38214a.remove(string);
                if (k82 != null) {
                    k82.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(f38212b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f38212b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC3320l8 interfaceC3320l8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C3267i8 c3267i8B = b(jSONObject);
            if (!this.f38214a.containsKey(string)) {
                C3393p8 c3393p8 = new C3393p8(interfaceC3320l8, context, string, c3267i8B);
                c3393p8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c3393p8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    V7.f35633a.d(new a(c3393p8, context, string));
                    return;
                } else {
                    this.f38214a.put(string, c3393p8);
                    return;
                }
            }
            Logger.i(f38212b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(f38212b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC3116a1
    public K8 a(String str) {
        if (str.isEmpty() || !this.f38214a.containsKey(str)) {
            return null;
        }
        return this.f38214a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f38214a.containsKey(string)) {
                K8 k82 = this.f38214a.get(string);
                if (k82 != null) {
                    k82.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f38212b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f38212b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
