package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class SplashSignal extends AbsFeedBackForH5 {

    /* renamed from: h, reason: collision with root package name */
    private static String f42986h = "SplashSignal";

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f42987i = 0;

    /* renamed from: g, reason: collision with root package name */
    private b f42988g;

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c.a(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().a(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
            } catch (Throwable th2) {
                p0.b(f42986h, "handlerH5Exception", th2);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            c.b(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        com.google.android.gms.internal.play_billing.a.v(MobileAdsBridgeBase.initializeMethodName, str, f42986h);
        b bVar = this.f42988g;
        if (bVar != null) {
            bVar.init(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof b)) {
                return;
            }
            this.f42988g = (b) windVaneWebView.getObject();
        } catch (Throwable th2) {
            p0.b(f42986h, MobileAdsBridgeBase.initializeMethodName, th2);
        }
    }

    public void install(Object obj, String str) {
        b bVar = this.f42988g;
        if (bVar != null) {
            bVar.install(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            p0.b(f42986h, "onSignalCommunication");
            b bVar = this.f42988g;
            if (bVar != null) {
                bVar.c(obj, str);
            }
        } catch (Throwable th2) {
            p0.b(f42986h, "onSignalCommunication", th2);
        }
    }

    public void openURL(Object obj, String str) throws JSONException {
        com.google.android.gms.internal.play_billing.a.v("openURL", str, f42986h);
        b bVar = this.f42988g;
        if (bVar != null) {
            bVar.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            p0.b(f42986h, "pauseCountDown");
            b bVar = this.f42988g;
            if (bVar != null) {
                bVar.e(obj, str);
            }
        } catch (Throwable th2) {
            p0.b(f42986h, "pauseCountDown", th2);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().a(windVaneWebView, iOptInt);
            } catch (Throwable th2) {
                p0.b(f42986h, "readyStatus", th2);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            p0.b(f42986h, "reportUrls");
            b bVar = this.f42988g;
            if (bVar != null) {
                bVar.reportUrls(obj, str);
            }
        } catch (Throwable th2) {
            p0.b(f42986h, "reportUrls", th2);
        }
    }

    public void resetCountdown(Object obj, String str) throws JSONException {
        com.google.android.gms.internal.play_billing.a.v("resetCountdown", str, f42986h);
        b bVar = this.f42988g;
        if (bVar != null) {
            bVar.a(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            p0.b(f42986h, "resumeCountDown");
            b bVar = this.f42988g;
            if (bVar != null) {
                bVar.f(obj, str);
            }
        } catch (Throwable th2) {
            p0.b(f42986h, "resumeCountDown", th2);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            p0.b(f42986h, "sendImpressions");
            b bVar = this.f42988g;
            if (bVar != null) {
                bVar.d(obj, str);
            }
        } catch (Throwable th2) {
            p0.b(f42986h, "sendImpressions", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        com.google.android.gms.internal.play_billing.a.v("toggleCloseBtn", str, f42986h);
        b bVar = this.f42988g;
        if (bVar != null) {
            bVar.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        com.google.android.gms.internal.play_billing.a.v("triggerCloseBtn", str, f42986h);
        b bVar = this.f42988g;
        if (bVar != null) {
            bVar.triggerCloseBtn(obj, str);
        }
    }
}
