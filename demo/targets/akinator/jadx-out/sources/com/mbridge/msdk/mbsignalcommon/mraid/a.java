package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a, reason: collision with other inner class name */
    public static class C0298a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f41888a = new a();
    }

    public static a a() {
        return C0298a.f41888a;
    }

    public void b(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void c(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void a(WebView webView) {
        a(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public void a(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String string = jSONObject.toString();
        try {
            string = URLEncoder.encode(string, C.UTF8_NAME);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        a(webView, a.b.l("javascript:window.mraidbridge.fireChangeEvent(", string, ");"));
    }

    public void b(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public void c(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, a.b.l("javascript:window.mraidbridge.setIsViewable(", str, ");"));
    }

    public void b(WebView webView, String str) throws UnsupportedEncodingException {
        try {
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, a.b.l("javascript:window.mraidbridge.nativeCallComplete('", str, "');"));
    }

    public void a(WebView webView, String str, String str2) throws UnsupportedEncodingException {
        try {
            str2 = URLEncoder.encode(str2, C.UTF8_NAME);
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public void a(WebView webView, double d10) {
        Locale locale = Locale.CHINA;
        a(webView, "javascript:window.mraidbridge.audioVolumeChange(" + d10 + ");");
    }

    public void a(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void a(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    private void a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
