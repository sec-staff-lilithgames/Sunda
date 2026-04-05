package com.bytedance.sdk.openadsdk.component.xyk;

import android.content.Context;
import android.widget.FrameLayout;
import b0.e2;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.wqx.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements jpo.InterfaceC0135jpo {

    /* renamed from: cm, reason: collision with root package name */
    private jd f20099cm;

    /* renamed from: jd, reason: collision with root package name */
    private FrameLayout f20100jd;
    private Context jpo;
    private boolean my = false;
    private dt wqx;

    public wqx(Context context) {
        this.jpo = context.getApplicationContext();
    }

    public long au() {
        jd jdVar = this.f20099cm;
        if (jdVar != null) {
            return jdVar.jj();
        }
        return 0L;
    }

    public boolean cm() {
        jd jdVar = this.f20099cm;
        return (jdVar == null || jdVar.ju() == null || !this.f20099cm.ju().jd()) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo.InterfaceC0135jpo
    public long getVideoProgress() {
        return au();
    }

    /* renamed from: if, reason: not valid java name */
    public void m450if() {
        jd jdVar = this.f20099cm;
        if (jdVar == null) {
            return;
        }
        this.jpo = null;
        jdVar.cm();
        this.f20099cm = null;
    }

    public jd jd() {
        return this.f20099cm;
    }

    public boolean jj() {
        jd jdVar = this.f20099cm;
        return (jdVar == null || jdVar.ju() == null || !this.f20099cm.ju().qk()) ? false : true;
    }

    public void jpo(FrameLayout frameLayout, dt dtVar) {
        this.f20100jd = frameLayout;
        this.wqx = dtVar;
        this.f20099cm = new jd(this.jpo, frameLayout, dtVar);
    }

    public void ju() {
        jd jdVar = this.f20099cm;
        if (jdVar != null) {
            jdVar.wqx();
        }
    }

    public boolean my() {
        jd jdVar = this.f20099cm;
        return (jdVar == null || jdVar.ju() == null || !this.f20099cm.ju().jj()) ? false : true;
    }

    public long oya() {
        jd jdVar = this.f20099cm;
        if (jdVar != null) {
            return jdVar.qk();
        }
        return 0L;
    }

    public long prr() {
        jd jdVar = this.f20099cm;
        if (jdVar == null) {
            return 0L;
        }
        return this.f20099cm.qk() + jdVar.zz();
    }

    public boolean qk() {
        jd jdVar = this.f20099cm;
        return jdVar != null && jdVar.oya();
    }

    public boolean wqx() {
        return this.my;
    }

    public void xyk() {
        try {
            if (my()) {
                this.f20099cm.jd();
            }
        } catch (Throwable th2) {
            nmd.wqx("TTAppOpenVideoManager", "open_ad", e2.o(th2, new StringBuilder("AppOpenVideoManager onPause throw Exception :")));
        }
    }

    public void yd() {
        jd jdVar = this.f20099cm;
        if (jdVar == null) {
            return;
        }
        jdVar.cm();
        this.f20099cm = null;
    }

    public void zz() {
        try {
            if (jj()) {
                ju();
            }
        } catch (Throwable th2) {
            nmd.wqx("TTAppOpenVideoManager", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public boolean jpo() {
        com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(0).jd(), this.wqx);
        jdVarJpo.jd(this.wqx.fc());
        jdVarJpo.jd(this.f20100jd.getWidth());
        jdVarJpo.wqx(this.f20100jd.getHeight());
        jdVarJpo.wqx(this.wqx.fxd());
        jdVarJpo.jpo(0L);
        jdVarJpo.jpo(true);
        return this.f20099cm.jpo(jdVarJpo);
    }

    public void jpo(boolean z10) {
        this.my = z10;
    }

    public void jpo(wqx.jpo jpoVar) {
        jd jdVar = this.f20099cm;
        if (jdVar != null) {
            jdVar.jpo(jpoVar);
        }
    }

    public boolean jpo(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.jpo jpoVar, dt dtVar) {
        jpo(frameLayout, dtVar);
        jpo(jpoVar);
        try {
            return jpo();
        } catch (Throwable th2) {
            nmd.wqx("TTAppOpenVideoManager", "open_ad", e2.o(th2, new StringBuilder("ttAppOpenAd playVideo error: ")));
            return false;
        }
    }

    public boolean jpo(float f10) {
        try {
            jd jdVar = this.f20099cm;
            if (jdVar != null) {
                return jdVar.jpo(f10);
            }
            return false;
        } catch (Throwable th2) {
            nmd.wqx("TTAppOpenVideoManager", "open_ad", e2.o(th2, new StringBuilder("setPlaybackSpeed error: ")));
            return false;
        }
    }

    public void jpo(int i10) {
        if (this.f20099cm != null) {
            prr.jpo jpoVar = new prr.jpo();
            jpoVar.jd(au());
            jpoVar.cm(prr());
            jpoVar.wqx(oya());
            jpoVar.wqx(i10);
            jpoVar.cm(this.f20099cm.xyk());
            jpoVar.jpo(this.f20099cm.sq());
            this.f20099cm.jpo(jpoVar);
        }
    }
}
