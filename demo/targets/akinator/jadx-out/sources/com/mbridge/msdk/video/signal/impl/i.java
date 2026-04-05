package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class i extends b {

    /* renamed from: a, reason: collision with root package name */
    private WebView f45220a;

    /* renamed from: b, reason: collision with root package name */
    private int f45221b = 0;

    public i(WebView webView) {
        this.f45220a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) throws JSONException {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45220a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void b() {
        super.b();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45220a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void d() {
        super.d();
        this.f45221b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45220a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void e() {
        super.e();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45220a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void g() {
        super.g();
        this.f45221b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45220a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(int i10) {
        super.a(i10);
        this.f45221b = i10;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public int a() {
        return this.f45221b;
    }
}
