package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.bt.component.d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeBTLayout extends BTBaseView {

    /* renamed from: p, reason: collision with root package name */
    private WebView f44272p;

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) throws JSONException {
        if (this.f44272p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f44195n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put(C3191e4.h.f36490j0, str);
                jSONObject2.put("data", jSONObject);
                f.a().a(this.f44272p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a(this.f44272p, "broadcast", getInstanceId());
            }
        }
    }

    public WebView getBtWebView() {
        return this.f44272p;
    }

    public void notifyEvent(String str) throws JSONException {
        WebView webView = this.f44272p;
        if (webView != null) {
            BTBaseView.a(webView, str, this.f44200d);
        }
    }

    public void onBackPressed() throws JSONException {
        if (this.f44272p != null) {
            d.c().a(this.f44272p, "onSystemBackPressed", this.f44200d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) throws JSONException {
        if (this.f44272p != null) {
            try {
                CampaignEx campaignEx = this.f44198b;
                if (campaignEx == null || !campaignEx.isDynamicView()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", "landscape");
                    } else {
                        jSONObject.put("orientation", "portrait");
                    }
                    jSONObject.put("instanceId", this.f44200d);
                    f.a().a(this.f44272p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setWebView(WebView webView) {
        this.f44272p = webView;
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
    }
}
