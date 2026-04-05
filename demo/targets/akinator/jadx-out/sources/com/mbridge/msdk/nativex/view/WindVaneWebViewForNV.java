package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.nativex.listener.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class WindVaneWebViewForNV extends WindVaneWebView {

    /* renamed from: r, reason: collision with root package name */
    private b f42078r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f42079s;

    public WindVaneWebViewForNV(Context context) {
        super(context);
        this.f42079s = false;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        b bVar;
        if (i10 != 4 || (bVar = this.f42078r) == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        bVar.a();
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f42079s) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void orientation(boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            f.a().a((WebView) this, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setBackListener(b bVar) {
        this.f42078r = bVar;
    }

    public void setInterceptTouch(boolean z10) {
        this.f42079s = z10;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        try {
            f.a().a((WebView) this, "webviewshow", "");
            n nVar = new n();
            nVar.n(campaignEx.getRequestId());
            nVar.o(campaignEx.getRequestIdNotice());
            if (getContext() != null && getContext().getApplicationContext() != null) {
                nVar.b(campaignEx.getId());
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                g.d(nVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42079s = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42079s = false;
    }
}
