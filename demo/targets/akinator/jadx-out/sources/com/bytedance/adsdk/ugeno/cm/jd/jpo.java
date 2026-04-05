package com.bytedance.adsdk.ugeno.cm.jd;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.bytedance.adsdk.ugeno.cm.jj;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class jpo {
    public static final HashSet<String> jpo = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", RnJusJ.dAL, "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));

    /* renamed from: cm, reason: collision with root package name */
    protected String f17691cm;

    /* renamed from: jd, reason: collision with root package name */
    protected jj.jpo f17692jd;

    /* renamed from: jj, reason: collision with root package name */
    protected Map<String, String> f17693jj;
    protected String my;

    /* renamed from: qk, reason: collision with root package name */
    protected String f17694qk;
    protected com.bytedance.adsdk.ugeno.jd.wqx wqx;
    protected String xyk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.cm.jd.jpo$jpo, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0060jpo {
        public static jpo jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
            if (jpoVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.cm.jd jdVarJpo = com.bytedance.adsdk.ugeno.cm.cm.jpo(jpoVar.jd());
            if (jdVarJpo == null) {
                return new wqx(wqxVar, str, jpoVar);
            }
            jpo jpoVarJpo = jdVarJpo.jpo(wqxVar, str, jpoVar);
            return jpoVarJpo == null ? new wqx(wqxVar, str, jpoVar) : jpoVarJpo;
        }
    }

    public jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
        this.wqx = wqxVar;
        this.f17692jd = jpoVar;
        this.f17694qk = str;
        my();
    }

    private void my() {
        jj.jpo jpoVar = this.f17692jd;
        if (jpoVar == null) {
            return;
        }
        this.f17691cm = jpoVar.jpo();
        this.my = this.f17692jd.jd();
        Map<String, String> mapWqx = this.f17692jd.wqx();
        this.f17693jj = mapWqx;
        if (mapWqx == null || mapWqx.isEmpty() || !this.f17693jj.containsKey("emitCustomEvent")) {
            return;
        }
        this.xyk = this.f17693jj.get("emitCustomEvent");
    }

    public boolean cm() {
        return !TextUtils.isEmpty(this.xyk);
    }

    public void jd() {
        wqx();
    }

    public abstract void jpo();

    public void wqx() {
        if (cm()) {
            jj.jpo jpoVar = new jj.jpo();
            jpoVar.jpo(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM);
            jpoVar.jd("emit");
            HashMap map = new HashMap();
            map.put("name", this.xyk);
            jpoVar.jpo(map);
            new jd(this.wqx, this.my, jpoVar).jpo();
        }
    }
}
