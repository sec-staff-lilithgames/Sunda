package com.bytedance.sdk.openadsdk.component.reward.jd;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.component.reward.jpo.hna;
import com.bytedance.sdk.openadsdk.component.reward.jpo.prr;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    protected int f19842cm;

    /* renamed from: jd, reason: collision with root package name */
    protected dt f19843jd;

    /* renamed from: jj, reason: collision with root package name */
    protected final Cif f19844jj;
    protected com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpo;
    protected final prr my;

    /* renamed from: qk, reason: collision with root package name */
    protected final hna f19845qk;
    protected int wqx;
    protected final com.bytedance.sdk.openadsdk.component.reward.jpo.Cif xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected hx f19846yd;
    protected com.bytedance.sdk.openadsdk.core.au.cm.jd zz;

    public jpo(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.jpo = jpoVar;
        this.f19843jd = jpoVar.f19914jd;
        this.wqx = jpoVar.cgn;
        this.f19842cm = jpoVar.hks;
        this.my = jpoVar.hmu;
        this.f19844jj = jpoVar.tic;
        this.f19845qk = jpoVar.f19909ef;
        this.xyk = jpoVar.duq;
    }

    public boolean jd() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        if (jpoVar.ux == null && jpoVar.hmu.qk() && (nmd.wqx(this.jpo.f19914jd) || !dt.my(this.jpo.f19914jd))) {
            return false;
        }
        if (!nmd.jd(this.jpo.f19914jd) || !this.jpo.f19916jr.get()) {
            return (this.jpo.f19934yd.get() || this.jpo.f19917ju.get()) ? false : true;
        }
        FrameLayout frameLayoutJj = this.jpo.tic.jj();
        frameLayoutJj.setVisibility(4);
        frameLayoutJj.setVisibility(0);
        return false;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar, hx hxVar) {
        this.zz = jdVar;
        this.f19846yd = hxVar;
    }

    public void wqx() {
        if (rv.jd(this.jpo.f19914jd) && DeviceUtils.qk() == 0) {
            this.jpo.huv = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        jpoVar.duq.jd(jpoVar.huv);
    }

    public boolean jpo() {
        return this.jpo.f19914jd.ig() || this.jpo.f19914jd.iqh() == 15 || this.jpo.f19914jd.iqh() == 5 || this.jpo.f19914jd.iqh() == 50;
    }

    public void jpo(boolean z10) {
        if (this.jpo.f19934yd.get()) {
            return;
        }
        dt dtVar = this.f19843jd;
        if (dtVar != null && dtVar.aul()) {
            this.xyk.wqx(false);
            this.xyk.jpo(true);
            this.jpo.tic.jd(8);
            this.jpo.tic.cm(8);
            return;
        }
        if (!z10) {
            this.xyk.wqx(false);
            this.xyk.jpo(false);
            this.xyk.cm(false);
            this.jpo.tic.jj(8);
        } else {
            this.xyk.jpo(this.jpo.f19914jd.bl());
            if (jpo()) {
                this.xyk.wqx(true);
            }
            if (!jpo() && (!(this instanceof qk) || !this.jpo.f19914jd.jj())) {
                this.xyk.my();
                this.jpo.tic.jj(0);
            } else {
                this.xyk.cm(true);
            }
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
            if (jpoVar.jkt != com.bytedance.sdk.openadsdk.component.reward.view.cm.jpo) {
                jpoVar.tic.jd(8);
                this.jpo.tic.cm(8);
                return;
            } else {
                jpoVar.tic.jd(0);
                this.jpo.tic.wqx(0);
                this.jpo.tic.cm(0);
                return;
            }
        }
        this.jpo.tic.jd(4);
        this.jpo.tic.wqx(8);
        this.jpo.tic.cm(8);
    }
}
