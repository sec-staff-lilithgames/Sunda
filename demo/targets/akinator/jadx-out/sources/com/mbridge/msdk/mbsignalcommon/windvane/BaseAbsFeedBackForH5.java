package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BaseAbsFeedBackForH5 extends g {

    /* renamed from: e, reason: collision with root package name */
    private static int f41903e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f41904f = 1;

    /* renamed from: d, reason: collision with root package name */
    private String f41905d = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f41904f);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            p0.a(this.f41905d, e10.getMessage());
        }
    }

    public void callbackSuccess(Object obj) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f41903e);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            p0.a(this.f41905d, e10.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f41903e);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONObject2.put("data", jSONObject);
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e10) {
            callbackExcep(obj, e10.getMessage());
            p0.a(this.f41905d, e10.getMessage());
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) throws JSONException {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("width", -1);
                int iOptInt2 = jSONObject.optInt("height", -1);
                int iOptInt3 = jSONObject.optInt(TtmlNode.LEFT, -1);
                int iOptInt4 = jSONObject.optInt("top", -1);
                double dOptDouble = jSONObject.optDouble("opacity", 1.0d);
                int iOptInt5 = jSONObject.optInt("radius", 20);
                String strOptString = jSONObject.optString("fontColor", "");
                String strOptString2 = jSONObject.optString("bgColor", "");
                com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject.optString(C3191e4.h.W, ""), iOptInt, iOptInt2, iOptInt5, iOptInt3, iOptInt4, (float) dOptDouble, strOptString, strOptString2, (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, -1.0d), jSONObject.optJSONArray("padding"));
            }
            callbackSuccess(obj);
        } catch (Throwable th2) {
            callbackExcep(obj, th2.getMessage());
            th2.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) throws JSONException {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject.optString(C3191e4.h.W, ""), iOptInt == 1 ? 8 : 0, aVar.f41924b);
            }
            callbackSuccess(obj);
        } catch (Throwable th2) {
            callbackExcep(obj, th2.getMessage());
            th2.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) throws JSONException {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject.optString(C3191e4.h.W, ""), iOptInt, new a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b));
            }
            callbackSuccess(obj);
        } catch (Throwable th2) {
            callbackExcep(obj, th2.getMessage());
            th2.printStackTrace();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.foundation.feedback.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f41906a;

        public a(WindVaneWebView windVaneWebView) {
            this.f41906a = windVaneWebView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(BaseAbsFeedBackForH5.this.f41905d, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) this.f41906a, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(BaseAbsFeedBackForH5.this.f41905d, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) this.f41906a, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b(BaseAbsFeedBackForH5.this.f41905d, th2.getMessage(), th2);
                string = "";
            }
            f.a().a((WebView) this.f41906a, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }
}
