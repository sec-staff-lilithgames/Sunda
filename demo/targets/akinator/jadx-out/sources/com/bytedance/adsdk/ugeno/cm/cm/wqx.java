package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx {

    /* renamed from: cm, reason: collision with root package name */
    protected jj.jpo f17680cm;

    /* renamed from: jd, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.jd.wqx f17681jd;

    /* renamed from: jj, reason: collision with root package name */
    protected String f17682jj;
    protected com.bytedance.adsdk.ugeno.cm.ju jpo;
    protected Map<String, String> my;

    /* renamed from: qk, reason: collision with root package name */
    protected String f17683qk;
    protected com.bytedance.adsdk.ugeno.cm.jj wqx;
    protected String xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected Context f17684yd;
    protected String zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        public static wqx jpo(Context context, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.cm.jj jjVarJpo;
            jj.jpo jpoVarJpo;
            if (wqxVar == null || jSONObject == null || (jjVarJpo = com.bytedance.adsdk.ugeno.cm.jj.jpo(jSONObject, jSONObject2)) == null || (jpoVarJpo = jjVarJpo.jpo()) == null) {
                return null;
            }
            String strJpo = jpoVarJpo.jpo();
            if (TextUtils.equals(strJpo, ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM)) {
                cm cmVar = new cm(context);
                cmVar.jpo(wqxVar);
                cmVar.jpo(jjVarJpo);
                cmVar.wqx();
                return cmVar;
            }
            com.bytedance.adsdk.ugeno.cm.qk qkVarJpo = (TextUtils.isEmpty(strJpo) || TextUtils.equals(strJpo, "global")) ? com.bytedance.adsdk.ugeno.cm.yd.jpo(jpoVarJpo.jd()) : com.bytedance.adsdk.ugeno.cm.yd.jpo(jpoVarJpo.my());
            if (qkVarJpo == null) {
                return null;
            }
            wqx wqxVarJpo = qkVarJpo.jpo(context);
            wqxVarJpo.jpo(wqxVar);
            wqxVarJpo.jpo(jjVarJpo);
            wqxVarJpo.wqx();
            return wqxVarJpo;
        }
    }

    public wqx(Context context) {
        this.f17684yd = context;
    }

    public String cm() {
        return this.f17682jj;
    }

    public com.bytedance.adsdk.ugeno.cm.jj jj() {
        return this.wqx;
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        this.f17681jd = wqxVar;
    }

    public abstract boolean jpo(Object... objArr);

    public String my() {
        return this.xyk;
    }

    public void wqx() {
        this.f17680cm = this.wqx.jpo();
        com.bytedance.adsdk.ugeno.cm.jj jjVar = this.wqx;
        if (jjVar == null) {
            return;
        }
        jj.jpo jpoVarJpo = jjVar.jpo();
        this.f17680cm = jpoVarJpo;
        if (jpoVarJpo == null) {
            return;
        }
        this.my = jpoVarJpo.wqx();
        this.f17682jj = this.f17680cm.jd();
        this.f17683qk = this.f17680cm.jpo();
        this.xyk = this.f17680cm.cm();
        this.zz = this.f17680cm.my();
    }

    public void jpo(com.bytedance.adsdk.ugeno.cm.jj jjVar) {
        this.wqx = jjVar;
    }

    public void jpo(com.bytedance.adsdk.ugeno.cm.ju juVar) {
        this.jpo = juVar;
    }
}
