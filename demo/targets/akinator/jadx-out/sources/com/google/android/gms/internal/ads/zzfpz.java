package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.C3191e4;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfpz {
    private static final zzfpz zza = new zzfpz();

    private zzfpz() {
    }

    public static final zzfpz zza() {
        return zza;
    }

    public static final boolean zzk(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                    sb2.append("javascript: ");
                    sb2.append(str);
                    webView.loadUrl(sb2.toString());
                    return true;
                }
            } catch (Exception e10) {
                e10.getMessage();
                zzfor.zza.getClass();
            }
        }
        return false;
    }

    public final void zzb(WebView webView, String str, JSONObject jSONObject) {
        zzj(webView, C3191e4.a.f36368f, jSONObject, str);
    }

    public final void zzc(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzj(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void zzd(WebView webView, String str) {
        zzj(webView, "finishSession", str);
    }

    public final void zze(WebView webView, String str, String str2) {
        zzj(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzf(WebView webView, String str, String str2) {
        zzj(webView, "setState", str2, str);
    }

    public final void zzg(WebView webView, String str, String str2) {
        zzj(webView, "setDeviceLockState", str2);
    }

    public final void zzh(WebView webView, String str, float f10) {
        zzj(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public final void zzi(WebView webView, JSONObject jSONObject) {
        zzj(webView, "setLastActivity", jSONObject);
    }

    public final void zzj(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            zzfor.zza.getClass();
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (obj instanceof String) {
                String string = obj.toString();
                if (string.startsWith("{")) {
                    sb2.append(string);
                } else {
                    sb2.append(AbstractJsonLexerKt.STRING);
                    sb2.append(string);
                    sb2.append(AbstractJsonLexerKt.STRING);
                }
            } else {
                sb2.append(obj);
            }
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
        sb2.append(")}");
        String string2 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            zzk(webView, string2);
        } else {
            handler.post(new zzfpy(this, webView, string2));
        }
    }
}
