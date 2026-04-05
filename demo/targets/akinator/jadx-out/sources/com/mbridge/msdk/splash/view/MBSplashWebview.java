package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* renamed from: r, reason: collision with root package name */
    private String f43101r;

    /* renamed from: s, reason: collision with root package name */
    private AdSession f43102s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f43102s;
            if (adSession != null) {
                adSession.finish();
                this.f43102s = null;
                p0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            p0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f43102s;
    }

    public String getRequestId() {
        return this.f43101r;
    }

    public void setAdSession(AdSession adSession) {
        this.f43102s = adSession;
    }

    public void setRequestId(String str) {
        this.f43101r = str;
    }
}
