package com.mbridge.msdk.advanced.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    private static final String f39412c = "NetWorkStateReceiver";

    /* renamed from: a, reason: collision with root package name */
    private WebView f39413a;

    /* renamed from: b, reason: collision with root package name */
    private int f39414b;

    public NetWorkStateReceiver(WebView webView) {
        this.f39413a = webView;
    }

    public void a() {
        this.f39413a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f39413a, 0);
                return;
            }
            if (!com.mbridge.msdk.foundation.same.a.f40729z) {
                a(this.f39413a, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f39413a, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f39413a, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f39413a, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f39414b = networkType;
                int iC = l0.c(networkType);
                this.f39414b = iC;
                a(this.f39413a, iC);
            }
        } catch (Throwable th2) {
            p0.a(f39412c, th2.getMessage());
        }
    }

    public void a(WebView webView, int i10) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a(webView, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th2) {
                p0.a(f39412c, th2.getMessage());
            }
        }
    }
}
