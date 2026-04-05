package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.impl.k;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BaseRewardSignal extends BaseRewardSignalDiff {

    /* renamed from: g, reason: collision with root package name */
    protected BaseIRewardCommunication f44885g;

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            p0.b("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
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
                    p0.a("JS-Reward-Brigde", e10.getMessage());
                }
            } catch (JSONException e11) {
                d.a(obj, "exception: " + e11.getLocalizedMessage());
                p0.b("JS-Reward-Brigde", "cai", e11);
            }
        } catch (Throwable th2) {
            d.a(obj, "exception: " + th2.getLocalizedMessage());
            p0.b("JS-Reward-Brigde", "cai", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.f44885g;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.getEndScreenInfo(obj, str);
                p0.b("JS-Reward-Brigde", "getEndScreenInfo factory is true");
                return;
            }
            p0.b("JS-Reward-Brigde", "getEndScreenInfo factory is null");
            if (obj == null || (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b) == null || windVaneWebView.getWebViewListener() == null) {
                return;
            }
            ((com.mbridge.msdk.mbsignalcommon.listener.a) windVaneWebView.getWebViewListener()).a(obj);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", "getEndScreenInfo", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f44885g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f44885g.handlerPlayableException(obj, str);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", "handlerPlayableException", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInstance;
        super.initialize(context, windVaneWebView);
        try {
            zIsInstance = IJSFactory.class.isInstance(context);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                this.f44885g = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Context.class, WindVaneWebView.class).invoke(this.f44885g, context, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.f44885g = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.f44885g;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (obj != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.f41924b.getObject() instanceof k) {
                    ((k) aVar.f41924b.getObject()).click(1, str);
                    p0.b("JS-Reward-Brigde", "JSCommon install jump success");
                }
            }
            p0.b("JS-Reward-Brigde", "JSCommon install failed");
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", "install", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f44885g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f44885g.notifyCloseBtn(obj, str);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", "notifyCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) throws JSONException {
        p0.b("JS-Reward-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(this.f41947a, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(this.f41947a, strOptString);
            }
        } catch (JSONException e10) {
            p0.b("JS-Reward-Brigde", e10.getMessage());
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f44885g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f44885g.setOrientation(obj, str);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", "setOrientation", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f44885g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f44885g.toggleCloseBtn(obj, str);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f44885g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f44885g.triggerCloseBtn(obj, str);
        } catch (Throwable th2) {
            p0.b("JS-Reward-Brigde", "triggerCloseBtn", th2);
            f.a().b(obj, a(-1));
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Object obj, WindVaneWebView windVaneWebView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInstance;
        super.initialize(obj, windVaneWebView);
        try {
            zIsInstance = IJSFactory.class.isInstance(obj);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                this.f44885g = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Object.class, WindVaneWebView.class).invoke(this.f44885g, obj, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.f44885g = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
    }
}
