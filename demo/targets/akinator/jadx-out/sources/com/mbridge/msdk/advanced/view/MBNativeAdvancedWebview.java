package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {

    /* renamed from: t, reason: collision with root package name */
    private static final String f39627t = "MBNativeAdvancedWebview";

    /* renamed from: r, reason: collision with root package name */
    private AdSession f39628r;

    /* renamed from: s, reason: collision with root package name */
    private NetWorkStateReceiver f39629s;

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f39628r;
            if (adSession != null) {
                adSession.finish();
                this.f39628r = null;
                p0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            p0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f39628r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f39629s == null) {
                this.f39629s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f39629s, intentFilter);
        } catch (Throwable th2) {
            p0.a(f39627t, th2.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f39628r = adSession;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.f39629s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.f39629s);
            }
        } catch (Throwable th2) {
            p0.a(f39627t, th2.getMessage());
        }
    }
}
