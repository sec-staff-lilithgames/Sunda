package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static f f41946a = new f();

    private f() {
    }

    public static f a() {
        return f41946a;
    }

    public void b(Object obj, String str) {
        String strL;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                strL = a.b.l("javascript:window.WindVane.onSuccess(", aVar.f41929g, ",'');");
            } else {
                strL = e3.g.l("javascript:window.WindVane.onSuccess(", aVar.f41929g, ",'", i.a(str), "');");
            }
            WindVaneWebView windVaneWebView = aVar.f41924b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f41924b.loadUrl(strL);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str, String str2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String strL = TextUtils.isEmpty(str2) ? a.b.l("javascript:window.WindVane.fireEvent('", str, "', '');") : e3.g.l("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
            WindVaneWebView windVaneWebView = aVar.f41924b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f41924b.loadUrl(strL);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(WebView webView, String str, String str2) {
        String strL;
        if (TextUtils.isEmpty(str2)) {
            strL = a.b.l("javascript:window.WindVane.fireEvent('", str, "', '');");
        } else {
            strL = e3.g.l("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(strL);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!TextUtils.isEmpty(str)) {
                str = i.a(str);
            }
            String strL = e3.g.l("javascript:window.WindVane.onFailure(", aVar.f41929g, ",'", str, "');");
            WindVaneWebView windVaneWebView = aVar.f41924b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f41924b.loadUrl(strL);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f41824j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f41824j, "");
        } catch (Throwable unused2) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f41824j, "");
        }
    }
}
