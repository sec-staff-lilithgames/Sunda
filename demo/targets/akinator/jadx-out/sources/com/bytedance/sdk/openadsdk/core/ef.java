package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBMetricReport;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.cm.jpo;
import com.bytedance.sdk.openadsdk.core.model.hna;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.ju.jpo.Cif;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.C3191e4;
import com.ironsource.C3352n2;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import io.ktor.client.utils.CacheControl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ef implements com.bytedance.sdk.component.adexpress.my.jd, hx.jpo, com.bytedance.sdk.openadsdk.yd.jd {
    private static final Map<String, Boolean> xyk;

    /* renamed from: au, reason: collision with root package name */
    private int f20310au;

    /* renamed from: cm, reason: collision with root package name */
    private WeakReference<com.bytedance.sdk.component.zz.jj> f20311cm;

    /* renamed from: dm, reason: collision with root package name */
    private String f20312dm;

    /* renamed from: dt, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.p001if.jpo f20313dt;
    private com.bytedance.sdk.openadsdk.p001if.jd duq;

    /* renamed from: ef, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.cm.cm.my f20314ef;
    private se fy;
    private com.bytedance.sdk.openadsdk.p001if.my hmu;
    private jpo huv;

    /* renamed from: hx, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.p001if.wqx f20315hx;

    /* renamed from: ic, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.au.cm.jd f20316ic;

    /* renamed from: if, reason: not valid java name */
    private String f117if;

    /* renamed from: jj, reason: collision with root package name */
    private String f20318jj;
    protected Map<String, Object> jpo;

    /* renamed from: jr, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.ju f20319jr;

    /* renamed from: ju, reason: collision with root package name */
    private WeakReference<View> f20320ju;
    private com.bytedance.sdk.openadsdk.core.zz.prr nmd;

    /* renamed from: nq, reason: collision with root package name */
    private JSONObject f20321nq;
    private com.bytedance.sdk.component.jpo.prr nzb;
    private JSONObject opi;
    private String oya;
    private com.bytedance.sdk.openadsdk.p001if.yd pdm;

    /* renamed from: pe, reason: collision with root package name */
    private boolean f20322pe;
    private int prr;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.my f20323qk;
    private boolean roc;

    /* renamed from: rq, reason: collision with root package name */
    private JSONObject f20324rq;

    /* renamed from: se, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wqx.cm f20326se;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.dt f20327sq;

    /* renamed from: tu, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.yd.cm f20328tu;

    /* renamed from: uu, reason: collision with root package name */
    private HashMap<String, yd> f20329uu;

    /* renamed from: va, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.jpo.jpo f20330va;
    private com.bytedance.sdk.openadsdk.p001if.qk vrc;
    private Context xk;

    /* renamed from: ya, reason: collision with root package name */
    private wqx f20331ya;

    /* renamed from: yd, reason: collision with root package name */
    private String f20332yd;
    private com.bytedance.sdk.openadsdk.yd.wqx zz;
    private boolean hna = true;

    /* renamed from: rv, reason: collision with root package name */
    private boolean f20325rv = true;
    private boolean sz = false;
    private boolean kln = false;

    /* renamed from: jd, reason: collision with root package name */
    boolean f20317jd = false;
    boolean wqx = false;
    private boolean tic = false;
    private final com.bytedance.sdk.component.utils.hx my = new com.bytedance.sdk.component.utils.hx(Looper.getMainLooper(), this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jd {

        /* renamed from: cm, reason: collision with root package name */
        public JSONObject f20342cm;

        /* renamed from: jd, reason: collision with root package name */
        public String f20343jd;
        public String jpo;
        public int my;
        public String wqx;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public interface jpo {
        void jpo();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class wqx implements Runnable {

        /* renamed from: jd, reason: collision with root package name */
        private final JSONObject f20344jd;
        private final com.bytedance.sdk.openadsdk.core.zz.prr jpo;

        public wqx(com.bytedance.sdk.openadsdk.core.zz.prr prrVar, JSONObject jSONObject) {
            this.jpo = prrVar;
            this.f20344jd = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            ef.jd(this.jpo, this.f20344jd);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        xyk = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put(CacheControl.PRIVATE, bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public ef(Context context) {
        this.xk = context;
    }

    private void au(JSONObject jSONObject) throws Exception {
        jpo(jSONObject, this.f20327sq);
    }

    private Context dt() {
        WeakReference<com.bytedance.sdk.component.zz.jj> weakReference = this.f20311cm;
        Activity activityJpo = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.jd.jpo(this.f20311cm.get());
        return activityJpo == null ? this.xk : activityJpo;
    }

    private void hmu() {
        com.bytedance.sdk.openadsdk.p001if.yd ydVar = this.pdm;
        if (ydVar == null) {
            return;
        }
        ydVar.jpo();
    }

    private void hna(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.p001if.wqx wqxVar = this.f20315hx;
        if (wqxVar == null || jSONObject == null) {
            return;
        }
        wqxVar.jpo(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    private void hx() {
        if (this.xk == null || TextUtils.isEmpty(sq.cm().uu())) {
            return;
        }
        TTWebsiteActivity.jpo(this.xk, this.f20327sq, this.f20312dm);
    }

    private void jr(JSONObject jSONObject) {
        int i10;
        double dOptDouble;
        double dOptDouble2;
        boolean z10;
        int i11;
        double d10;
        String strOptString;
        ef efVar = this;
        if (efVar.f20319jr == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = efVar.f20314ef;
        if (myVar != null) {
            myVar.hna();
        }
        com.bytedance.sdk.component.adexpress.jd.oya oyaVar = new com.bytedance.sdk.component.adexpress.jd.oya();
        oyaVar.jpo(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble = 0.0d;
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    z10 = zOptBoolean;
                    i11 = 101;
                    try {
                        double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                        double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                        if (efVar.nmd(jSONObjectOptJSONObject2)) {
                            d10 = dOptDouble2;
                            oyaVar.jpo((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                            oyaVar.jd((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                            oyaVar.wqx((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                            oyaVar.cm((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                        } else {
                            d10 = dOptDouble2;
                        }
                        oyaVar.wqx(dOptDouble3);
                        oyaVar.cm(dOptDouble4);
                        oyaVar.my(dOptDouble5);
                        oyaVar.jj(dOptDouble6);
                    } catch (Exception unused) {
                        efVar = this;
                        i10 = 101;
                        oyaVar.jd(i10);
                        oyaVar.jpo(xyk.jpo(i10));
                        efVar.f20319jr.jpo(oyaVar);
                    }
                } catch (Exception unused2) {
                    i10 = 101;
                    efVar = this;
                    oyaVar.jd(i10);
                    oyaVar.jpo(xyk.jpo(i10));
                    efVar.f20319jr.jpo(oyaVar);
                }
            } else {
                z10 = zOptBoolean;
                d10 = dOptDouble2;
                i11 = 101;
            }
            try {
                strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, xyk.jpo(i11));
                i10 = i11;
            } catch (Exception unused3) {
                efVar = this;
                i10 = 101;
                oyaVar.jd(i10);
                oyaVar.jpo(xyk.jpo(i10));
                efVar.f20319jr.jpo(oyaVar);
            }
        } catch (Exception unused4) {
        }
        try {
            int iOptInt = jSONObject.optInt("code", i10);
            oyaVar.jpo(z10);
            oyaVar.jpo(dOptDouble);
            oyaVar.jd(d10);
            oyaVar.jpo(strOptString);
            oyaVar.jd(iOptInt);
            efVar = this;
            efVar.f20319jr.jpo(oyaVar);
        } catch (Exception unused5) {
            efVar = this;
            oyaVar.jd(i10);
            oyaVar.jpo(xyk.jpo(i10));
            efVar.f20319jr.jpo(oyaVar);
        }
    }

    private WebView nmd() {
        com.bytedance.sdk.component.zz.jj jjVar;
        WeakReference<com.bytedance.sdk.component.zz.jj> weakReference = this.f20311cm;
        if (weakReference == null || (jjVar = weakReference.get()) == null) {
            return null;
        }
        return jjVar.getWebView();
    }

    private void nq() {
        com.bytedance.sdk.openadsdk.p001if.yd ydVar = this.pdm;
        if (ydVar == null) {
            return;
        }
        ydVar.jd();
    }

    private boolean opi(JSONObject jSONObject) throws JSONException {
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null && jSONObject != null) {
            double dWqx = prrVar.wqx();
            double dCm = this.nmd.cm();
            int iMy = this.nmd.my();
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.TopLayoutHelper", "current:", Double.valueOf(dWqx), "state", Integer.valueOf(iMy), "countdownTime", Double.valueOf(dCm));
            try {
                jSONObject.put("currentTime", dWqx / 1000.0d);
                if (dCm > 0.0d) {
                    jSONObject.put("countDownTime", dCm / 1000.0d);
                }
                jSONObject.put("state", iMy);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void oya(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.rv.zz(this.f20327sq))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.rv.zz(this.f20327sq));
    }

    private JSONObject pdm() {
        return jd(this.f20327sq);
    }

    private void prr(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar;
        if (jSONObject == null || (myVar = this.f20314ef) == null) {
            return;
        }
        myVar.jd(jSONObject);
    }

    private JSONObject rq() {
        try {
            View view = this.f20320ju.get();
            com.bytedance.sdk.component.zz.jj jjVar = this.f20311cm.get();
            if (view != null && jjVar != null) {
                int[] iArrJd = va.jd(view);
                int[] iArrJd2 = va.jd((View) jjVar);
                if (iArrJd != null && iArrJd2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", va.wqx(sq.jpo(), iArrJd[0] - iArrJd2[0]));
                    jSONObject.put("y", va.wqx(sq.jpo(), iArrJd[1] - iArrJd2[1]));
                    jSONObject.put("w", va.wqx(sq.jpo(), view.getWidth()));
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, va.wqx(sq.jpo(), view.getHeight()));
                    jSONObject.put("isExist", true);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private boolean rv() {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f20327sq;
        if (dtVar == null || dtVar.gs() == null || com.bytedance.sdk.openadsdk.core.model.rv.jd(this.f20327sq) || this.sz || this.f20327sq.gs().optInt("parent_type") != 2) {
            return false;
        }
        int iCxb = this.f20327sq.cxb();
        if (iCxb != 8 && iCxb != 7) {
            return false;
        }
        this.sz = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void se() {
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null) {
            prrVar.jpo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sq(JSONObject jSONObject) {
        if (this.nmd == null || jSONObject == null) {
            return;
        }
        try {
            this.nmd.jpo(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private static List<String> tu() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    private void uu() {
        if (this.zz == null) {
            this.zz = com.bytedance.sdk.openadsdk.yd.jpo.jpo(this, this.f20327sq);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            au(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jd(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ef.4
                @Override // java.lang.Runnable
                public void run() {
                    ef.this.sq(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ef.5
                @Override // java.lang.Runnable
                public void run() {
                    ef.this.my(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            rq(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public String getCurrentVideoState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        opi(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f20324rq.toString();
        }
        try {
            JSONObject jSONObjectJpo = com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo(this.f20324rq, new JSONObject(str));
            return jSONObjectJpo == null ? this.f20324rq.toString() : jSONObjectJpo.toString();
        } catch (Exception unused) {
            return this.f20324rq.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public String getTemplateInfo() throws JSONException {
        jpo("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.f20324rq;
            if (jSONObject != null) {
                jSONObject.put("setting", pdm());
                com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f20327sq;
                if (dtVar != null && dtVar.sue() != null) {
                    this.f20324rq.put("dynamic_configs", this.f20327sq.sue());
                }
                com.bytedance.sdk.openadsdk.core.model.dt dtVar2 = this.f20327sq;
                if (dtVar2 != null) {
                    this.f20324rq.put("extension", dtVar2.aub());
                }
            }
            jpo("getTemplateInfo", false);
            return this.f20324rq.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: if, reason: not valid java name */
    public void m457if() {
        com.bytedance.sdk.openadsdk.yd.wqx wqxVar = this.zz;
        if (wqxVar != null) {
            wqxVar.jpo();
        }
        wqx wqxVar2 = this.f20331ya;
        if (wqxVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.duq.jd(wqxVar2);
            this.f20331ya = null;
        }
        this.xk = null;
        this.f20316ic = null;
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ef.7
            @Override // java.lang.Runnable
            public void run() {
                if (ef.this.f20330va != null) {
                    ef.this.f20330va.jpo();
                }
            }
        });
    }

    public boolean jj() {
        return this.f20317jd;
    }

    public void ju() {
        rv();
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            wqx wqxVar = this.f20331ya;
            if (wqxVar != null) {
                com.bytedance.sdk.openadsdk.utils.duq.jd(wqxVar);
            }
            wqx wqxVar2 = new wqx(this.nmd, jSONObject);
            this.f20331ya = wqxVar2;
            com.bytedance.sdk.openadsdk.utils.duq.jpo(wqxVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.AndroidObject", "");
        }
    }

    public void qk() {
        com.bytedance.sdk.openadsdk.p001if.wqx wqxVar;
        if (this.f20322pe && (wqxVar = this.f20315hx) != null) {
            wqxVar.jpo();
            return;
        }
        Context context = this.xk;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.tu.jpo((Activity) context)) {
            ((Activity) this.xk).finish();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            jr(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ef.6
            @Override // java.lang.Runnable
            public void run() {
                ef.this.se();
            }
        });
    }

    public void xyk() {
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null) {
            prrVar.jd();
        }
    }

    public boolean yd() {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f20327sq;
        return dtVar != null && dtVar.uhu() == 1;
    }

    public boolean zz() {
        return this.tic;
    }

    private void tu(JSONObject jSONObject) {
        if (jSONObject == null || this.f20328tu == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                this.f20328tu.jpo(false, null);
            } else {
                this.f20328tu.jpo(true, jSONArrayOptJSONArray);
            }
        } catch (Exception unused) {
            this.f20328tu.jpo(false, null);
        }
    }

    private void zz(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewNmd = nmd();
                    if (webViewNmd != null) {
                        com.bytedance.sdk.component.utils.oya.jpo(webViewNmd, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (iIndexOf = str.indexOf(38, 30)) > 0) {
                    String strSubstring = str.substring(30, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    qk(strSubstring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void au() {
        jpo jpoVar = this.huv;
        if (jpoVar != null) {
            jpoVar.jpo();
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.dt cm() {
        return this.f20327sq;
    }

    public void jj(String str) {
        this.f20312dm = str;
    }

    public void ju(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        se seVar = this.fy;
        if (seVar != null) {
            if (iOptInt == 1) {
                seVar.n_();
            } else if (iOptInt == 2) {
                seVar.o_();
            }
        }
    }

    public boolean my() {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f20327sq;
        return dtVar != null && dtVar.voc();
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.vrc == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.jd.oya oyaVar = new com.bytedance.sdk.component.adexpress.jd.oya();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (nmd(jSONObjectOptJSONObject)) {
                    oyaVar.jpo((float) jSONObjectOptJSONObject.optDouble(QFzuMMDfrzagDN.dGeIVnkvTrN));
                    oyaVar.jd((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight"));
                    oyaVar.wqx((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft"));
                    oyaVar.cm((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight"));
                }
                oyaVar.wqx(dOptDouble);
                oyaVar.cm(dOptDouble2);
                oyaVar.my(dOptDouble3);
                oyaVar.jj(dOptDouble4);
            }
            com.bytedance.sdk.openadsdk.p001if.qk qkVar = this.vrc;
            if (qkVar != null) {
                qkVar.jpo(oyaVar);
            }
        } catch (Throwable unused) {
        }
    }

    public ef wqx(String str) {
        this.f20332yd = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject hmu(JSONObject jSONObject) throws JSONException {
        if (this.jpo != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.jpo.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx(e10.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean xyk(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return yd();
        }
        return true;
    }

    public ef cm(String str) {
        this.f117if = str;
        return this;
    }

    public void hna() {
        se seVar = this.fy;
        if (seVar != null) {
            seVar.l_();
        }
    }

    public void jj(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVarJpo = com.bytedance.sdk.openadsdk.core.jd.jpo(jSONObject);
        if (dtVarJpo != null) {
            boolean zQk = com.bytedance.sdk.openadsdk.core.model.nmd.qk(this.f20327sq);
            jpo(dtVarJpo, zQk ? com.bytedance.sdk.openadsdk.utils.tic.jd(this.f20310au) : this.f20312dm, !zQk);
        }
    }

    public ef my(String str) {
        this.oya = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.au.cm.jd oya() {
        return this.f20316ic;
    }

    public void prr() {
        se seVar = this.fy;
        if (seVar != null) {
            seVar.k_();
        }
    }

    public void wqx() {
        com.bytedance.sdk.component.jpo.prr prrVar = this.nzb;
        if (prrVar == null) {
            return;
        }
        prrVar.jpo();
        this.nzb = null;
    }

    public void yd(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarCm;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f20327sq;
        if (dtVar == null || (jpoVarCm = dtVar.cm()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.dt> listCm = jpoVarCm.cm();
        if (iOptInt < 0 || iOptInt >= listCm.size()) {
            return;
        }
        jpo(listCm.get(iOptInt), this.f20312dm, false);
        com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar = this.f20316ic;
        if (jdVar != null) {
            jdVar.et();
        }
    }

    private void dt(JSONObject jSONObject) {
        WebView webViewNmd;
        if (jSONObject == null || (webViewNmd = nmd()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.oya.jpo(webViewNmd, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private boolean nmd(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public void cm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.jd.oya oyaVar = new com.bytedance.sdk.component.adexpress.jd.oya();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            oyaVar.wqx(dOptDouble);
            oyaVar.cm(dOptDouble2);
            oyaVar.my(dOptDouble3);
            oyaVar.jj(dOptDouble4);
        }
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null) {
            prrVar.jpo(iOptInt, oyaVar);
        }
    }

    public ef jd(String str) {
        this.f20318jj = str;
        return this;
    }

    public void my(JSONObject jSONObject) {
        String str;
        double d10;
        double d11;
        double dOptDouble;
        double d12;
        double d13;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString(f.b.f38557c);
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d14 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d13 = dOptDouble6;
                d14 = dOptDouble2;
                d11 = dOptDouble3;
                d12 = dOptDouble5;
                str = strOptString;
                d10 = dOptDouble4;
            } else {
                str = strOptString;
                d10 = 0.0d;
                d11 = 0.0d;
                dOptDouble = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.hna hnaVarJpo = new hna.jpo().cm((float) d14).wqx((float) dOptDouble).jd((float) d11).jpo((float) d10).jd((long) d12).jpo((long) d13).jpo(strOptString2).jpo((SparseArray<wqx.jpo>) null).jpo(true).jd(iOptInt).jpo(jSONObjectOptJSONObject).jpo(jSONObject.optInt("clickAreaCategory", -1)).jd(jSONObjectOptJSONObject2).jpo();
            com.bytedance.sdk.component.adexpress.jd.ju juVar = this.f20319jr;
            if (juVar != null) {
                juVar.jpo(null, iOptInt, hnaVarJpo);
            }
            jpo(str, iOptInt, hnaVarJpo);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.jd.ju juVar2 = this.f20319jr;
            if (juVar2 != null) {
                juVar2.jpo(null, -1, null);
            }
        }
    }

    public JSONObject sq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            se seVar = this.fy;
            if (seVar != null) {
                jSONObject.put("leftTime", seVar.m_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private void qk(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jd jdVar = new jd();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        jdVar.jpo = jSONObjectOptJSONObject.optString("__msg_type", null);
                        jdVar.f20343jd = jSONObjectOptJSONObject.optString("__callback_id", null);
                        jdVar.wqx = jSONObjectOptJSONObject.optString("func");
                        jdVar.f20342cm = jSONObjectOptJSONObject.optJSONObject("params");
                        jdVar.my = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(jdVar.jpo) && !TextUtils.isEmpty(jdVar.wqx)) {
                    Message messageObtainMessage = this.my.obtainMessage(11);
                    messageObtainMessage.obj = jdVar;
                    this.my.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public com.bytedance.sdk.component.jpo.prr jd() {
        return this.nzb;
    }

    public ef jd(com.bytedance.sdk.component.zz.jj jjVar) {
        this.f20311cm = new WeakReference<>(jjVar);
        return this;
    }

    public void wqx(JSONObject jSONObject) {
        opi.jpo(dt(), this.xk instanceof Activity, jSONObject, this.f20327sq, this.f20312dm, this.f20310au, nmd(), this.f20323qk);
    }

    public JSONObject xyk(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null) {
            try {
                jSONObject2.put("state", prrVar.jpo(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public ef jd(int i10) {
        this.f20310au = i10;
        return this;
    }

    public static void jd(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = tu().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.jd.jpo());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.jd.my());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.jd.jd());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.jd.wqx());
        jSONObject.put(C3191e4.i.W, com.bytedance.sdk.openadsdk.common.jd.cm());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.jd.jj());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.jd.jpo(sq.jpo()));
        if (DeviceUtils.jd(sq.jpo())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    /* renamed from: if, reason: not valid java name */
    public void m458if(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(new com.bytedance.sdk.component.xyk.xyk("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.ef.3
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has("tag") && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString("tag");
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong("value");
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", ef.this.prr);
                    } catch (Exception unused) {
                    }
                    new jpo.C0102jpo(System.currentTimeMillis(), ef.this.f20327sq).cm(strOptString).jd(strOptString2).wqx(strOptString3).my(String.valueOf(jOptLong)).jj(String.valueOf(jOptLong2)).jpo(jSONObjectOptJSONObject).jpo((com.bytedance.sdk.openadsdk.cm.jd.jpo) null);
                }
            }
        });
    }

    public ef jpo(com.bytedance.sdk.openadsdk.core.widget.jpo.jpo jpoVar) {
        this.f20330va = jpoVar;
        return this;
    }

    public ef jpo(com.bytedance.sdk.openadsdk.core.widget.my myVar) {
        this.f20323qk = myVar;
        return this;
    }

    public void opi() {
        se seVar = this.fy;
        if (seVar != null) {
            seVar.p_();
        }
    }

    public com.bytedance.sdk.openadsdk.p001if.jd jpo() {
        return this.duq;
    }

    private void rq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.jr.jpo(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    private void wqx(String str, JSONObject jSONObject) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            dt(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.p001if.jd jdVar) {
        this.duq = jdVar;
    }

    public ef jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        WebView webView;
        if (jjVar != null && (webView = jjVar.getWebView()) != null) {
            try {
                this.nzb = com.bytedance.sdk.component.jpo.prr.jpo(webView).jpo(new com.bytedance.sdk.openadsdk.ju.jpo()).jpo("ToutiaoJSBridge").jpo(new com.bytedance.sdk.component.jpo.yd() { // from class: com.bytedance.sdk.openadsdk.core.ef.1
                    @Override // com.bytedance.sdk.component.jpo.yd
                    public <T> T jpo(String str, Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.jpo.yd
                    public <T> String jpo(T t10) {
                        return null;
                    }
                }).jpo(zz.jd().sq()).jd(true).jpo();
                if (com.bytedance.sdk.openadsdk.rq.jpo.qk()) {
                    com.bytedance.sdk.openadsdk.ju.jpo.xyk.jpo(this.nzb, this);
                    com.bytedance.sdk.openadsdk.ju.jpo.yd.jpo(this.nzb, this);
                    com.bytedance.sdk.openadsdk.ju.jpo.nmd.jpo(this.nzb, jjVar, this, this.f20327sq);
                } else {
                    com.bytedance.sdk.openadsdk.ju.jpo.qk.jpo(this.nzb, this);
                    com.bytedance.sdk.openadsdk.ju.jpo.zz.jpo(this.nzb, this);
                    com.bytedance.sdk.openadsdk.ju.jpo.jr.jpo(this.nzb, jjVar, this, this.f20327sq);
                }
                com.bytedance.sdk.openadsdk.ju.jpo.jpo.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.jd.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.wqx.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.jj.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.ju.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.prr.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.au.jpo(this.nzb, jjVar);
                com.bytedance.sdk.openadsdk.ju.jpo.my.jpo(this.nzb, this.f20324rq);
                com.bytedance.sdk.openadsdk.ju.jpo.cm.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.oya.jpo(this.nzb, this, this.f20327sq);
                com.bytedance.sdk.openadsdk.ju.jpo.hna.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.sq.jpo(this.nzb, this);
                Cif.jpo(this.nzb, this);
                com.bytedance.sdk.openadsdk.ju.jpo.opi.jpo(this.nzb, this.f20327sq);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public JSONObject zz(JSONObject jSONObject) throws JSONException {
        List<com.bytedance.sdk.openadsdk.core.model.dt> listHks;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar = this.f20316ic;
            if (jdVar != null && (listHks = jdVar.hks()) != null) {
                for (int i10 = 0; i10 < listHks.size(); i10++) {
                    jSONArray.put(wqx(listHks.get(i10)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void cm(boolean z10) {
        this.f20322pe = z10;
    }

    public void wqx(int i10) {
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null) {
            prrVar.jd(i10);
        }
    }

    public JSONObject qk(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null) {
            try {
                jSONObject2.put("state", prrVar.jd(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public void wqx(boolean z10) {
        this.roc = z10;
    }

    private JSONObject wqx(com.bytedance.sdk.openadsdk.core.model.dt dtVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, dtVar.roc());
        jSONObject2.put("req_id", dtVar.hbg());
        jSONObject2.put("ad_id", dtVar.fc());
        jSONObject2.put("log_extra", dtVar.fxd());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.au.jrx().jkt());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", dtVar.pe());
        jSONObject.put("dynamic_creative", dtVar.kgu());
        jSONObject.put("title", dtVar.ozw());
        com.bytedance.sdk.openadsdk.core.model.dt.jpo(dtVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.dt.jd(dtVar, jSONObject);
        jSONObject.put("source", dtVar.as());
        jSONObject.put("button_text", dtVar.ql());
        com.bytedance.sdk.openadsdk.core.model.au auVarCnl = dtVar.cnl();
        if (auVarCnl != null) {
            jSONObject.put("deeplink_url", auVarCnl.jpo());
        }
        jSONObject.put("app_name", dtVar.czp());
        jSONObject.put("has_show", dtVar.tic() ? 1 : 0);
        jSONObject.put("has_click", dtVar.mc() ? 1 : 0);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(com.bytedance.sdk.openadsdk.core.zz.prr prrVar, JSONObject jSONObject) {
        if (prrVar == null || jSONObject == null) {
            return;
        }
        try {
            prrVar.jpo(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false), !jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    public static JSONObject jd(com.bytedance.sdk.openadsdk.core.model.dt dtVar) throws JSONException {
        int iJl;
        boolean zHna;
        JSONObject jSONObject = new JSONObject();
        if (sq.cm() != null) {
            if (dtVar != null) {
                try {
                    iJl = dtVar.jl();
                } catch (Exception unused) {
                }
            } else {
                iJl = 0;
            }
            int iCxb = dtVar != null ? dtVar.cxb() : 0;
            int iHf = dtVar != null ? dtVar.hf() : 0;
            int iRc = dtVar != null ? dtVar.rc() : 0;
            boolean zMy = sq.cm().my(String.valueOf(iJl));
            boolean z10 = sq.cm().mo479if(String.valueOf(iJl)) == 1;
            if (iCxb != 7 && iCxb != 8) {
                zHna = sq.cm().jd(String.valueOf(iJl));
            } else {
                zHna = sq.cm().hna(String.valueOf(iJl));
            }
            jSONObject.put("voice_control", zHna);
            jSONObject.put("rv_skip_time", iHf);
            jSONObject.put("fv_skip_show", zMy);
            jSONObject.put("iv_skip_time", iRc);
            jSONObject.put("show_dislike", dtVar != null && dtVar.bl());
            jSONObject.put("video_adaptation", dtVar != null ? dtVar.kb() : 0);
            if (dtVar != null && dtVar.sue() != null) {
                jSONObject.put("dynamic_configs", dtVar.sue());
            }
            if (com.bytedance.sdk.openadsdk.core.model.nmd.wqx(dtVar)) {
                jSONObject.put("skip_change_to_close", true);
            } else {
                jSONObject.put("skip_change_to_close", z10);
            }
            jSONObject.put("bar_render_platform", dtVar.va() ? 1 : 0);
        }
        return jSONObject;
    }

    public void jr() {
        com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar = this.f20316ic;
        if (jdVar != null) {
            jdVar.ef();
        }
    }

    public ef jpo(com.bytedance.sdk.openadsdk.cm.cm.my myVar) {
        this.f20314ef = myVar;
        return this;
    }

    public ef jpo(boolean z10) {
        this.kln = z10;
        return this;
    }

    public ef jpo(View view) {
        this.f20320ju = new WeakReference<>(view);
        return this;
    }

    public ef jpo(int i10) {
        this.prr = i10;
        return this;
    }

    public ef jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        this.f20327sq = dtVar;
        if (dtVar != null) {
            this.opi = dtVar.gs();
        }
        return this;
    }

    public ef jpo(com.bytedance.sdk.openadsdk.p001if.wqx wqxVar) {
        this.f20315hx = wqxVar;
        return this;
    }

    public ef jpo(com.bytedance.sdk.openadsdk.p001if.yd ydVar) {
        this.pdm = ydVar;
        return this;
    }

    public ef jpo(Map<String, Object> map) {
        this.jpo = map;
        return this;
    }

    public void jd(boolean z10) {
        this.f20317jd = z10;
    }

    public ef jpo(com.bytedance.sdk.component.adexpress.jd.ju juVar) {
        this.f20319jr = juVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            dt(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public ef jpo(com.bytedance.sdk.openadsdk.core.zz.prr prrVar) {
        this.nmd = prrVar;
        return this;
    }

    public ef jpo(JSONObject jSONObject) {
        this.f20324rq = jSONObject;
        return this;
    }

    public ef jpo(com.bytedance.sdk.openadsdk.p001if.jpo jpoVar) {
        this.f20313dt = jpoVar;
        return this;
    }

    public ef jpo(com.bytedance.sdk.openadsdk.p001if.my myVar) {
        this.hmu = myVar;
        return this;
    }

    public ef jpo(com.bytedance.sdk.openadsdk.p001if.qk qkVar) {
        this.vrc = qkVar;
        return this;
    }

    public static void jpo(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.dt dtVar) throws Exception {
        String strFc = dtVar.fc();
        if (!TextUtils.isEmpty(strFc)) {
            jSONObject.put(BidResponsedEx.KEY_CID, strFc);
        }
        String strFxd = dtVar.fxd();
        if (!TextUtils.isEmpty(strFxd)) {
            jSONObject.put("log_extra", strFxd);
        }
        String strSd = dtVar.sd();
        if (!TextUtils.isEmpty(strSd)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strSd);
        }
        jSONObject.put("dc", TextUtils.isEmpty(sq.cm().ef()) ? sq.cm().ef() : "TX");
        jSONObject.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, Cif.jd());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.au.jrx().jkt());
    }

    public void jd(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if (CacheControl.PRIVATE.equals(host) || "dispatch_message".equals(host)) {
                    zz(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(new com.bytedance.sdk.component.xyk.xyk("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.ef.2
                @Override // java.lang.Runnable
                public void run() throws JSONException, NumberFormatException {
                    long j10;
                    String strJpo;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    ef.this.f20312dm = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (ef.this.xyk(queryParameter3)) {
                        long j11 = 0;
                        try {
                            j10 = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j10 = 0;
                        }
                        try {
                            j11 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j12 = j11;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(ef.this.prr));
                                } catch (Throwable unused3) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused4) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = ef.this.hmu(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strJpo = ef.this.f20318jj;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strJpo = ef.this.jpo(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(ef.this.f20327sq, queryParameter, strJpo, queryParameter3, j10, j12, jSONObject, com.bytedance.sdk.openadsdk.core.model.nmd.qk(ef.this.f20327sq));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0351 A[PHI: r4
      0x0351: PHI (r4v19 org.json.JSONObject) = (r4v14 org.json.JSONObject), (r4v20 org.json.JSONObject) binds: [B:225:0x039c, B:207:0x034f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject jpo(com.bytedance.sdk.openadsdk.core.ef.jd r23, int r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ef.jpo(com.bytedance.sdk.openadsdk.core.ef$jd, int):org.json.JSONObject");
    }

    private void jpo(JSONObject jSONObject, boolean z10, String str) {
        com.bytedance.sdk.openadsdk.core.widget.my myVar;
        if (z10) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (myVar = this.f20323qk) == null) {
                    return;
                }
                myVar.jpo();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.jpo("TTAD.AndroidObject", "callAggClickListener faile", th2);
            }
        }
    }

    private boolean jpo(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.opi.jpo(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.nmd.jpo("TTAD.AndroidObject", "handleUrl, EX1->: ", e10);
                }
                return false;
            }
            return true;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!com.bytedance.sdk.component.utils.opi.jpo(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e11) {
                com.bytedance.sdk.component.utils.nmd.jpo("TTAD.AndroidObject", "handleUrl, EX2->: ", e11);
            }
        }
        return true;
    }

    private void jpo(String str, boolean z10) {
        if (this.f20314ef == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.f20314ef.jpo(str);
        } else {
            this.f20314ef.jd(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jd
    public void jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt(DTBMetricReport.TIME);
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
            if (prrVar != null) {
                prrVar.jpo(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public void jpo(final jd jdVar, final JSONObject jSONObject) {
        if (jdVar == null) {
            return;
        }
        try {
            jpo(jdVar.f20342cm, new com.bytedance.sdk.openadsdk.p001if.cm() { // from class: com.bytedance.sdk.openadsdk.core.ef.8
                @Override // com.bytedance.sdk.openadsdk.p001if.cm
                public void jpo(boolean z10, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) throws JSONException {
                    if (!z10) {
                        ef.this.jd(jdVar.f20343jd, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", ef.jpo(jpoVar));
                        ef.this.jd(jdVar.f20343jd, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean jpo(String str, int i10, com.bytedance.sdk.openadsdk.core.model.hna hnaVar) {
        HashMap<String, yd> map;
        if (TextUtils.isEmpty(str) || (map = this.f20329uu) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    public void jpo(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.p001if.cm cmVar) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (cmVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.p001if.cm cmVar2 = new com.bytedance.sdk.openadsdk.p001if.cm() { // from class: com.bytedance.sdk.openadsdk.core.ef.9
                @Override // com.bytedance.sdk.openadsdk.p001if.cm
                public void jpo(final boolean z10, final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
                    com.bytedance.sdk.openadsdk.utils.duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ef.9.1
                        @Override // java.lang.Runnable
                        public void run() {
                            cmVar.jpo(z10, jpoVar);
                        }
                    });
                }
            };
            if (this.f20327sq != null && !TextUtils.isEmpty(this.f117if)) {
                int iCxb = this.f20327sq.cxb();
                AdSlot adSlotGmx = this.f20327sq.gmx();
                com.bytedance.sdk.openadsdk.core.model.hx hxVar = new com.bytedance.sdk.openadsdk.core.model.hx();
                hxVar.f20667jj = true;
                if (this.f20327sq.vzb() != null || this.f20327sq.jrx() != null) {
                    hxVar.zz = 2;
                }
                JSONObject jSONObject2 = this.opi;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                hxVar.f20669qk = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (hxVar.xyk == null) {
                        hxVar.xyk = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            hxVar.xyk.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
                    sq.wqx().jpo(adSlotGmx, hxVar, iCxb, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.core.ef.10
                        @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                        public void jpo(int i10, String str) {
                            cmVar2.jpo(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                        public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                            ef.this.jpo(jpoVar, wqxVar, cmVar2);
                        }
                    });
                    return;
                } else {
                    sq.wqx().jpo(adSlotGmx, hxVar, iCxb, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.core.ef.11
                        @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                        public void jpo(int i10, String str) {
                            cmVar2.jpo(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                        public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                            ef.this.jpo(jpoVar, wqxVar, cmVar2);
                        }
                    });
                    return;
                }
            }
            cmVar2.jpo(false, null);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.AndroidObject", "get ads error", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar, com.bytedance.sdk.openadsdk.p001if.cm cmVar) {
        if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = jpoVar.cm().get(0);
            if (dtVar != null) {
                this.opi = dtVar.gs();
            }
            cmVar.jpo(true, jpoVar);
            return;
        }
        cmVar.jpo(false, null);
        wqxVar.jpo(-3);
        wqxVar.wqx(7);
        com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
    }

    public static JSONArray jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVarJj;
        if (jpoVar == null || !jpoVar.my() || (dtVarJj = jpoVar.jj()) == null || TextUtils.isEmpty(dtVarJj.kfh())) {
            return null;
        }
        try {
            return new JSONObject(dtVarJj.kfh()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean jpo(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return xyk.containsKey(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String jpo(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.nmd.qk(this.f20327sq)) {
            if (C3352n2.f37928v.equals(str2)) {
                return com.bytedance.sdk.openadsdk.utils.tic.jpo(this.f20310au);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.rv.my(this.f20327sq)) {
            return this.f20318jj;
        }
        if (this.f20315hx != null) {
            return com.bytedance.sdk.openadsdk.utils.tic.jpo(this.f20310au);
        }
        return this.f20319jr == null ? com.bytedance.sdk.openadsdk.utils.tic.jd(this.f20310au) : str;
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof jd) {
                try {
                    jpo((jd) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yd.jd
    public void jpo(String str, JSONObject jSONObject) {
        wqx(str, jSONObject);
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.wqx.jpo(sq.jpo(), dtVar, str, this.f20310au);
        jpoVar.jpo(com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(sq.jpo(), str));
        if (!z10) {
            jpoVar.jpo(false);
        }
        jpoVar.onClick(null);
    }

    public void jpo(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.zz.prr prrVar = this.nmd;
        if (prrVar != null) {
            prrVar.jpo(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar = this.f20316ic;
        if (jdVar != null) {
            jdVar.jpo(str, jSONObject);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        this.f20316ic = jdVar;
    }

    public void jpo(se seVar) {
        this.fy = seVar;
    }

    public void jpo(jpo jpoVar) {
        this.huv = jpoVar;
    }
}
