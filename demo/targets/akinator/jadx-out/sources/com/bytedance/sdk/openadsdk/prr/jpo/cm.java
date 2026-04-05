package com.bytedance.sdk.openadsdk.prr.jpo;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.prr.jpo.cm;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class cm<T extends cm> implements wqx {

    /* renamed from: au, reason: collision with root package name */
    private String f21425au;

    /* renamed from: if, reason: not valid java name */
    private String f160if;

    /* renamed from: jd, reason: collision with root package name */
    private String f21427jd;
    private String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private String f21429ju;

    /* renamed from: qk, reason: collision with root package name */
    private String f21430qk;
    private String wqx;

    /* renamed from: yd, reason: collision with root package name */
    private String f21431yd;
    private String zz;

    /* renamed from: cm, reason: collision with root package name */
    private final String f21426cm = BuildConfig.VERSION_NAME;
    private long my = System.currentTimeMillis() / 1000;

    /* renamed from: jj, reason: collision with root package name */
    private int f21428jj = 0;
    private int xyk = 0;

    private cm() {
        try {
            this.f21425au = nq.jpo();
        } catch (Throwable unused) {
            this.f21425au = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    private T hna() {
        return this;
    }

    public static cm<cm> jd() {
        return new cm<>();
    }

    private JSONObject prr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", tic.jj());
            jSONObject.put(Q6.f35252d0, tic.cm());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String au() {
        return this.f21431yd;
    }

    public String cm() {
        return this.f21429ju;
    }

    /* renamed from: if, reason: not valid java name */
    public String m490if() {
        return this.zz;
    }

    public String jj() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.openadsdk.prr.jpo.wqx
    public JSONObject jpo() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", qk());
            jSONObject2.put("app_version", tic.xyk());
            jSONObject2.put("timestamp", xyk());
            jSONObject2.put("conn_type", opi.jd(sq.jpo()));
            jSONObject2.put("appid", TextUtils.isEmpty(zz.jd().cm()) ? "" : zz.jd().cm());
            jSONObject2.put("device_info", prr());
            if (!TextUtils.isEmpty(wqx())) {
                jSONObject2.put("type", wqx());
            }
            jSONObject2.put("error_code", ju());
            if (!TextUtils.isEmpty(m490if())) {
                jSONObject2.put("error_msg", m490if());
            }
            if (!TextUtils.isEmpty(my())) {
                jSONObject2.put("rit", my());
            }
            if (!TextUtils.isEmpty(jj())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, jj());
            }
            if (zz() > 0) {
                jSONObject2.put("adtype", zz());
            }
            if (!TextUtils.isEmpty(yd())) {
                jSONObject2.put("req_id", yd());
            }
            if (!TextUtils.isEmpty(au())) {
                jSONObject2.put("extra", au());
            }
            String strCm = cm();
            if (TextUtils.isEmpty(strCm)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strCm);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.f21425au + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strCm)) {
                jSONObject2.put("event_extra", strCm);
            }
            if (!TextUtils.isEmpty(oya())) {
                jSONObject2.put(IronSourceConstants.EVENTS_DURATION, oya());
            }
        } catch (Throwable th2) {
            nmd.wqx(QGjYBESwAiCc.NlGjtPSj, th2.getMessage());
        }
        return jSONObject2;
    }

    public int ju() {
        return this.xyk;
    }

    public String my() {
        return this.f21427jd;
    }

    public String oya() {
        return this.f160if;
    }

    public String qk() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String wqx() {
        return this.jpo;
    }

    public long xyk() {
        return this.my;
    }

    public String yd() {
        return this.f21430qk;
    }

    public int zz() {
        return this.f21428jj;
    }

    public T cm(String str) {
        this.wqx = str;
        return (T) hna();
    }

    public T jd(String str) {
        this.f21429ju = str;
        return (T) hna();
    }

    public T jj(String str) {
        this.zz = str;
        return (T) hna();
    }

    public T my(String str) {
        this.f21430qk = str;
        return (T) hna();
    }

    public T qk(String str) {
        this.f21431yd = str;
        return (T) hna();
    }

    public T wqx(String str) {
        this.f21427jd = str;
        return (T) hna();
    }

    public T xyk(String str) {
        this.f160if = str;
        return (T) hna();
    }

    public T jd(int i10) {
        this.xyk = i10;
        return (T) hna();
    }

    public T jpo(String str) {
        this.jpo = str;
        return (T) hna();
    }

    public T jpo(int i10) {
        this.f21428jj = i10;
        return (T) hna();
    }
}
