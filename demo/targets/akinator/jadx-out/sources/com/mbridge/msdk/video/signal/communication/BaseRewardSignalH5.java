package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BaseRewardSignalH5 extends a {

    /* renamed from: a, reason: collision with root package name */
    protected IJSFactory f44886a;

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            p0.b("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) throws JSONException {
        p0.a("JS-Reward-Communication", "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                if (TextUtils.isEmpty(strOptString)) {
                    d.a(obj, "packageName is empty");
                }
                int i10 = u0.c(c.m().d(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", d.f41879b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject.put("data", jSONObject2);
                    f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    d.a(obj, e10.getMessage());
                    p0.a("JS-Reward-Communication", e10.getMessage());
                }
            } catch (Throwable th2) {
                d.a(obj, "exception: " + th2.getLocalizedMessage());
                p0.b("JS-Reward-Communication", "cai", th2);
            }
        } catch (JSONException e11) {
            d.a(obj, "exception: " + e11.getLocalizedMessage());
            p0.b("JS-Reward-Communication", "cai", e11);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        String strEncodeToString;
        try {
            IJSFactory iJSFactory = this.f44886a;
            if (iJSFactory != null) {
                String strB = iJSFactory.getIJSRewardVideoV1().b();
                if (TextUtils.isEmpty(strB)) {
                    strEncodeToString = "";
                    p0.a("JS-Reward-Communication", "getEndScreenInfo failed");
                } else {
                    strEncodeToString = Base64.encodeToString(strB.getBytes(), 2);
                    p0.a("JS-Reward-Communication", "getEndScreenInfo success");
                }
                f.a().b(obj, strEncodeToString);
            }
        } catch (Throwable th2) {
            p0.b("JS-Reward-Communication", "getEndScreenInfo", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f44886a = (IJSFactory) context;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            if (this.f44886a != null) {
                p0.a("JS-Reward-Communication", "install:" + str);
                if (this.f44886a.getJSContainerModule().endCardShowing()) {
                    this.f44886a.getJSCommon().click(3, str);
                } else {
                    this.f44886a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th2) {
            p0.b("JS-Reward-Communication", "install", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f44886a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            p0.a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
            this.f44886a.getIJSRewardVideoV1().notifyCloseBtn(iOptInt);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Communication", "notifyCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        p0.b("JS-Reward-Communication", "openURL:" + str);
        Context contextD = c.m().d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextD == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b) != null) {
                    contextD = windVaneWebView.getContext();
                }
            } catch (Exception e10) {
                p0.b("JS-Reward-Communication", e10.getMessage());
            }
        }
        if (contextD == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextD, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextD, strOptString);
            }
        } catch (JSONException e11) {
            p0.b("JS-Reward-Communication", e11.getMessage());
        } catch (Throwable th2) {
            p0.b("JS-Reward-Communication", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f44886a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            p0.a("JS-Reward-Communication", "setOrientation,state:" + str);
            this.f44886a.getIJSRewardVideoV1().a(strOptString);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Communication", "setOrientation", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f44886a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            p0.a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
            this.f44886a.getIJSRewardVideoV1().toggleCloseBtn(iOptInt);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Communication", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f44886a == null || TextUtils.isEmpty(str)) {
                return;
            }
            f.a().b(obj, a(0));
            this.f44886a.getIJSRewardVideoV1().triggerCloseBtn(new JSONObject(str).optString("state"));
            p0.a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Communication", "triggerCloseBtn", th2);
            f.a().b(obj, a(-1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        String str2 = PtLatqAYjEFT.aqbNV;
        try {
            if (this.f44886a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE);
            p0.a(str2, "handlerPlayableException,msg:" + str);
            this.f44886a.getIJSRewardVideoV1().handlerPlayableException(strOptString);
        } catch (Throwable th2) {
            p0.b(str2, "setOrientation", th2);
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f44886a = (IJSFactory) obj;
        }
    }
}
