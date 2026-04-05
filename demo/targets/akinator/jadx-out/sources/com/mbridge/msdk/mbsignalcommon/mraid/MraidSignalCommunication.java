package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.MraidExpandCommand;
import com.amazon.device.ads.MraidUnloadCommand;
import com.amazon.device.ads.MraidUseCustomCloseCommand;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f41886h = 0;

    /* renamed from: g, reason: collision with root package name */
    private b f41887g;

    public void close(Object obj, String str) throws UnsupportedEncodingException {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b, "close");
        }
        try {
            p0.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.f41887g;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th2) {
            p0.b("MraidSignalCommunication", "MRAID close", th2);
        }
    }

    public void expand(Object obj, String str) throws UnsupportedEncodingException {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f41924b;
            a.a().b(aVar.f41924b, MraidExpandCommand.NAME);
        } else {
            windVaneWebView = null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            p0.b("MraidSignalCommunication", "MRAID expand " + strOptString + " " + strOptString2);
            if ((windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f39821d && com.mbridge.msdk.click.utils.a.a(this.f41887g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f39820c)) || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f41887g == null) {
                return;
            }
            this.f41887g.expand(strOptString, strOptString2.toLowerCase().equals("true"));
        } catch (Throwable th2) {
            p0.b("MraidSignalCommunication", "MRAID expand", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.f41887g = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.f41887g = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof b)) {
                return;
            }
            this.f41887g = (b) windVaneWebView.getMraidObject();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) throws UnsupportedEncodingException {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f41924b;
            a.a().b(aVar.f41924b, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            p0.b("MraidSignalCommunication", "MRAID Open " + strOptString);
            if (this.f41887g == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.mbridge.msdk.click.utils.a.f39821d || !com.mbridge.msdk.click.utils.a.a(this.f41887g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f39818a)) {
                this.f41887g.open(strOptString);
            }
        } catch (Throwable th2) {
            p0.b("MraidSignalCommunication", "MRAID Open", th2);
        }
    }

    public void setOrientationProperties(Object obj, String str) throws UnsupportedEncodingException {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            p0.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f41887g == null) {
                return;
            }
            strOptString.toLowerCase().equals("true");
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = "portrait";
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = "landscape";
            }
            lowerCase.equals(str2);
        } catch (Throwable th2) {
            p0.b("MraidSignalCommunication", "MRAID setOrientationProperties", th2);
        }
    }

    public void unload(Object obj, String str) throws UnsupportedEncodingException {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b, MraidUnloadCommand.NAME);
        }
        try {
            p0.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.f41887g;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th2) {
            p0.b("MraidSignalCommunication", "MRAID unload", th2);
        }
    }

    public void useCustomClose(Object obj, String str) throws UnsupportedEncodingException {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b, MraidUseCustomCloseCommand.NAME);
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            p0.b("MraidSignalCommunication", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString) || this.f41887g == null) {
                return;
            }
            this.f41887g.useCustomClose(strOptString.toLowerCase().equals("true"));
        } catch (Throwable th2) {
            p0.b("MraidSignalCommunication", "MRAID useCustomClose", th2);
        }
    }
}
