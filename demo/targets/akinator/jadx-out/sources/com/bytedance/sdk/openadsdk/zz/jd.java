package com.bytedance.sdk.openadsdk.zz;

import android.os.SystemClock;
import android.text.TextUtils;
import bp.oM.DwaEpyvxz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.ju;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.ironsource.Y1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd<T> implements hna<T> {

    /* renamed from: cm, reason: collision with root package name */
    private final dt f21667cm;

    /* renamed from: jd, reason: collision with root package name */
    private final String f21668jd;
    private final long jpo = SystemClock.elapsedRealtime();
    private final hna<T> wqx;

    public jd(final dt dtVar, String str, hna<T> hnaVar) {
        this.wqx = hnaVar;
        this.f21667cm = dtVar;
        this.f21668jd = str;
        if (cm.jd()) {
            com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.zz.jd.1
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h("load_img");
                    dt dtVar2 = dtVar;
                    if (dtVar2 != null) {
                        jpoVarH.wqx(dtVar2.sz(Y1.f35726f));
                        jpoVarH.cm(tic.wqx(dtVar.jp()));
                    }
                    jpoVarH.jpo(BuildConfig.VERSION_NAME);
                    return jpoVarH;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.my.hna
    public void jpo(ju<T> juVar) {
        hna<T> hnaVar = this.wqx;
        if (hnaVar != null) {
            hnaVar.jpo(juVar);
        }
        if (this.f21667cm != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.jpo;
            final int iQk = juVar.qk() / 1024;
            final int i10 = juVar.jj() ? 1 : 0;
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("load_image_success", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.zz.jd.2
                @Override // com.bytedance.sdk.openadsdk.prr.jd
                public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime);
                    jSONObject.put("url", jd.this.f21668jd);
                    jSONObject.put("preload_size", iQk);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", jd.this.f21667cm.iqh());
                    jSONObject.put("use_new_img", cm.jd() ? 1 : 0);
                    return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("load_image_success").jpo(jd.this.f21667cm.jp()).jd(jSONObject.toString());
                }
            });
            if (cm.jd()) {
                com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.zz.jd.3
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h("load_img");
                        if (jd.this.f21667cm != null) {
                            jpoVarH.wqx(jd.this.f21667cm.sz(Y1.f35726f));
                            jpoVarH.cm(tic.wqx(jd.this.f21667cm.jp()));
                        }
                        jpoVarH.jpo(BuildConfig.VERSION_NAME);
                        return jpoVarH;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.my.hna
    public void jpo(final int i10, final String str, final Throwable th2) {
        hna<T> hnaVar = this.wqx;
        if (hnaVar != null) {
            hnaVar.jpo(i10, str, th2);
        }
        dt dtVar = this.f21667cm;
        if (dtVar != null) {
            if (!TextUtils.isEmpty(tic.jpo(dtVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.jpo;
                com.bytedance.sdk.openadsdk.prr.wqx.jpo("load_image_error", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.zz.jd.4
                    @Override // com.bytedance.sdk.openadsdk.prr.jd
                    public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(DwaEpyvxz.rBOfxBvPZuHgQtt, jElapsedRealtime);
                        jSONObject.put("url", jd.this.f21668jd);
                        jSONObject.put("error_code", i10);
                        Throwable th3 = th2;
                        if (th3 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th3);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put(duhsDlGWdBkekB.RhNK, jd.this.f21667cm.iqh());
                        jSONObject.put("use_new_img", cm.jd() ? 1 : 0);
                        return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("load_image_error").jpo(jd.this.f21667cm.jp()).jd(jSONObject.toString());
                    }
                });
            }
            if (cm.jd()) {
                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.zz.jd.5
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h("load_img");
                        if (jd.this.f21667cm != null) {
                            jpoVarH.wqx(jd.this.f21667cm.sz(Y1.f35726f));
                            jpoVarH.cm(tic.wqx(jd.this.f21667cm.jp()));
                        }
                        jpoVarH.jpo(BuildConfig.VERSION_NAME);
                        return jpoVarH;
                    }
                });
            }
        }
    }
}
