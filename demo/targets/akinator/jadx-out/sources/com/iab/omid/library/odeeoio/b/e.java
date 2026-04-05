package com.iab.omid.library.odeeoio.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.odeeoio.adsession.ErrorType;
import com.ironsource.C3191e4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f31186a = new e();

    private e() {
    }

    public static final e a() {
        return f31186a;
    }

    public void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public void c(WebView webView) {
        a(webView, "publishLoadedEvent", new Object[0]);
    }

    public void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public void b(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public void c(WebView webView, String str) {
        a(webView, "setState", str);
    }

    public void a(WebView webView, float f10) {
        a(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public void b(WebView webView, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }

    public void a(WebView webView, ErrorType errorType, String str) {
        a(webView, "error", errorType.toString(), str);
    }

    public void a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.odeeoio.d.c.a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        a(sb2, objArr);
        sb2.append(")}");
        a(webView, sb2);
    }

    public void a(final WebView webView, StringBuilder sb2) {
        final String string = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string);
        } else {
            handler.post(new Runnable() { // from class: com.iab.omid.library.odeeoio.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    webView.loadUrl(string);
                }
            });
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, C3191e4.a.f36368f, jSONObject);
    }

    public void a(StringBuilder sb2, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append(AbstractJsonLexerKt.STRING);
            } else {
                if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb2.append(string);
                    } else {
                        sb2.append(AbstractJsonLexerKt.STRING);
                        sb2.append(string);
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.append(AbstractJsonLexerKt.STRING);
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
    }

    public boolean a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }
}
