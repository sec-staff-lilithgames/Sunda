package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f41899a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f41900b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f41901c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    public class RunnableC0299a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41902a;

        public RunnableC0299a(Context context) {
            this.f41902a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f41899a == null) {
                try {
                    Boolean unused = a.f41899a = Boolean.valueOf(a.a(this.f41902a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f41899a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVarB;
        try {
            gVarB = h.b().b(c.m().b());
        } catch (Exception unused) {
            gVarB = null;
        }
        if (gVarB != null) {
            f41901c = Boolean.valueOf(gVarB.C0());
        } else {
            f41901c = Boolean.FALSE;
        }
        Boolean bool = f41901c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f41899a == null) {
                try {
                    f41899a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f41899a = Boolean.FALSE;
                }
            }
            if (f41899a == null) {
                f41899a = new Boolean(false);
            }
            return f41899a.booleanValue();
        }
        if (f41899a == null && f41900b == null) {
            f41900b = new Handler(Looper.getMainLooper());
            f41900b.post(new RunnableC0299a(context));
        }
        if (f41899a == null) {
            return true;
        }
        return f41899a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("MBWebViewChecker", "destroy webview error", e10);
            }
        }
    }
}
