package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzct {
    private static Boolean zza;

    private zzct() {
    }

    public static void zza(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (zzct.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
                zBooleanValue = zza.booleanValue();
            } else {
                zBooleanValue = zza.booleanValue();
            }
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
