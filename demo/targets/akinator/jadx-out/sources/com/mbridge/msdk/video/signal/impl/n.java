package com.mbridge.msdk.video.signal.impl;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricReport;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class n extends f {

    /* renamed from: a, reason: collision with root package name */
    private WebView f45239a;

    public n(WebView webView) {
        this.f45239a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10) throws JSONException {
        super.a(i10);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i10);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45239a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10, String str) throws JSONException {
        super.a(i10, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i10);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45239a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.v vVar) throws JSONException {
        super.a(vVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, a(vVar.f44815a, vVar.f44816b));
            jSONObject.put(DTBMetricReport.TIME, String.valueOf(vVar.f44815a));
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, String.valueOf(vVar.f44816b));
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45239a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return u0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return o2.j(i11, "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        String strEncodeToString;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            strEncodeToString = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            strEncodeToString = "";
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45239a, "webviewshow", strEncodeToString);
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10, int i11, int i12, int i13) throws JSONException {
        super.a(i10, i11, i12, i13);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i10 != 2 ? i11 != 2 : i11 == 1) {
                str = "portrait";
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i12);
            jSONObject2.put("screen_height", i13);
            jSONObject.put("data", jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f45239a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
