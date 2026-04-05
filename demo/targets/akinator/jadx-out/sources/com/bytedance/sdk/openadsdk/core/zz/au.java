package com.bytedance.sdk.openadsdk.core.zz;

import com.bytedance.sdk.openadsdk.utils.duq;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au implements com.bytedance.adsdk.ugeno.core.opi, com.bytedance.sdk.component.adexpress.jd.zz {

    /* renamed from: cm, reason: collision with root package name */
    private final String f21045cm;

    /* renamed from: jd, reason: collision with root package name */
    private final String f21046jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f21047jj;
    private final com.bytedance.sdk.openadsdk.cm.cm.my jpo;
    private long my;
    private final com.bytedance.sdk.openadsdk.core.model.dt wqx;

    public au(com.bytedance.sdk.openadsdk.cm.cm.my myVar, String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str2, boolean z10) {
        this.jpo = myVar;
        this.f21046jd = str;
        this.f21045cm = str2;
        this.wqx = dtVar;
        this.f21047jj = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void cm() {
        this.jpo.jpo();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void jj(int i10) {
        final String str;
        System.currentTimeMillis();
        if (i10 == 3) {
            this.jpo.qk("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.jpo.qk("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.jpo.jpo(true);
        duq.jd(new com.bytedance.sdk.component.xyk.xyk("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.zz.au.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.cm.wqx.jd(au.this.wqx, au.this.f21046jd, str, (JSONObject) null);
            }
        }, 10);
    }

    public void ju() {
        this.jpo.ju();
        this.jpo.mo435if();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void my() {
        this.jpo.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void qk() {
        this.jpo.jpo(true);
        this.jpo.au();
        duq.jd(new com.bytedance.sdk.component.xyk.xyk("native_success") { // from class: com.bytedance.sdk.openadsdk.core.zz.au.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.cm.wqx.jd(au.this.wqx, au.this.f21046jd, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void wqx(int i10) {
        if (i10 == 3) {
            this.jpo.cm("dynamic_sub_analysis2_end");
        } else {
            this.jpo.cm("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void xyk() {
        this.jpo.oya();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void yd() {
        this.jpo.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void zz() {
        this.jpo.prr();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void cm(int i10) {
        if (i10 == 3) {
            this.jpo.cm("dynamic_sub_render2_start");
        } else {
            this.jpo.cm("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void jd(int i10) {
        if (i10 == 3) {
            this.jpo.cm("dynamic_sub_analysis2_start");
        } else {
            this.jpo.cm("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void jpo(boolean z10) {
        this.jpo.jpo(z10 ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void my(int i10) {
        if (i10 == 3) {
            this.jpo.cm("dynamic_sub_render2_end");
        } else {
            this.jpo.cm("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void jpo(int i10, String str) throws JSONException {
        this.jpo.jpo(i10, str);
        ju.jpo("Web", i10, str, this.f21046jd, this.f21045cm, this.wqx);
    }

    @Override // com.bytedance.adsdk.ugeno.core.opi
    public void wqx() {
        this.jpo.my("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.opi
    public void jd() {
        this.jpo.my("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void jpo(int i10) {
        this.my = System.currentTimeMillis();
        if (i10 == 3) {
            this.jpo.wqx("dynamic_render2_start");
        } else {
            this.jpo.wqx("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void jj() {
        this.jpo.wqx();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.zz
    public void jpo(int i10, int i11, String str, boolean z10) throws JSONException {
        if (!z10) {
            this.jpo.jpo(true);
        }
        if (i10 == 3) {
            this.jpo.jd(i11, "dynamic_render2_error");
        } else {
            this.jpo.jd(i11, "dynamic_render_error");
        }
        ju.jpo("NDR", i11, str, this.f21046jd, this.f21045cm, this.wqx);
    }

    @Override // com.bytedance.adsdk.ugeno.core.opi
    public void jpo() {
        this.jpo.jpo("ugen_render_start", this.f21047jj);
        this.jpo.my("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.opi
    public void jpo(com.bytedance.adsdk.ugeno.core.sq sqVar) throws JSONException {
        if (sqVar.jpo() == 0) {
            this.jpo.my("ugen_sub_render_end");
            this.jpo.jj("ugen_render_success");
        } else {
            this.jpo.wqx(sqVar.jpo(), "ugen_render_error");
            ju.jpo("UGen", sqVar.jpo(), sqVar.jd(), this.f21046jd, this.f21045cm, this.wqx);
        }
        this.jpo.jpo(true);
    }
}
