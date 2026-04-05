package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.cm.jd;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.tu;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.view.xyk f19942jd;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpo;
    private jpo wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar, int i10);
    }

    public my(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.jpo = jpoVar;
        this.f19942jd = new com.bytedance.sdk.openadsdk.component.reward.view.xyk(jpoVar);
    }

    private int jj() {
        int iCmw = this.jpo.f19914jd.cmw();
        if (iCmw <= 5000 && iCmw >= 0) {
            if (iCmw < 1000) {
                iCmw += 1000;
            }
            int iJpo = com.bytedance.sdk.openadsdk.core.sq.cm().jpo(this.jpo.f19914jd.jl());
            if (iJpo <= 5000 && iJpo >= 0) {
                if (iJpo < 1000) {
                    iJpo += 1000;
                }
                return Math.min(iCmw, iJpo);
            }
        }
        return -1;
    }

    public void cm() {
        jpo(true);
    }

    public void jd() {
        this.f19942jd.wqx();
    }

    public void jpo() {
        this.f19942jd.jpo();
    }

    public boolean my() {
        return this.f19942jd.my();
    }

    public void wqx() {
        this.f19942jd.cm();
    }

    public boolean jd(com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) {
        boolean z10;
        this.jpo.xyk = jj();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        int i10 = jpoVar.xyk;
        if (jpoVar.f19914jd.hna()) {
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
        int i11 = jpoVar2.xyk;
        if (i11 != -1) {
            if (i11 >= 0) {
                jpoVar2.f19922rq.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.jpo;
                messageObtain.arg1 = jpoVar3.xyk;
                jpoVar3.xk.sendMessage(messageObtain);
                if (!rv.qk(this.jpo.f19914jd)) {
                    z10 = true;
                }
            }
            z10 = false;
        } else if (jpoVar2.ux == null && rv.xyk(jpoVar2.f19914jd) && this.jpo.f19909ef.au()) {
            jdVar.dt();
            z10 = false;
        } else {
            jdVar.prr();
            z10 = true;
        }
        if (this.jpo.f19909ef.nmd() ? false : z10) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = this.jpo;
            if (jpoVar4.aix == null || !jpoVar4.cm()) {
                return true;
            }
            this.jpo.aix.jpo(r6.xyk);
        }
        return true;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.my myVar) {
        this.f19942jd.jpo(myVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(boolean r11, boolean r12, boolean r13, com.bytedance.sdk.openadsdk.component.reward.jd.jd r14, int r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jpo.my.jpo(boolean, boolean, boolean, com.bytedance.sdk.openadsdk.component.reward.jd.jd, int):void");
    }

    private boolean jd(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.view.cm cmVarJpo;
        if (!nmd.wqx(this.jpo.f19914jd) || (cmVarJpo = this.jpo.f19911hx.jpo()) == null || cmVarJpo.f20015cm != 0 || z10) {
            return true;
        }
        this.jpo.duq.wqx(false);
        return false;
    }

    private void jpo(boolean z10, boolean z11, boolean z12, int i10) {
        int i11;
        HashMap map = new HashMap();
        if (this.jpo.f19909ef.pdm()) {
            i11 = 1;
        } else {
            i11 = !this.jpo.f19909ef.oya() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(jpoVar.f19914jd, jpoVar.my, z10, z11, z12, jpoVar.vrc.isFinishing(), i10, map);
    }

    public void jpo(boolean z10, com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) throws JSONException {
        au auVar;
        this.jpo.opi.set(z10);
        jdVar.oya();
        this.jpo.f19914jd.ig();
        this.jpo.duq.cm(false);
        this.jpo.duq.wqx(false);
        this.jpo.f19909ef.dt();
        nmd nmdVar = this.jpo.tic.prr;
        if (nmdVar != null) {
            nmdVar.my();
        }
        this.jpo.tic.wqx();
        com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar = this.jpo.f19911hx;
        if (ydVar != null) {
            ydVar.jj();
        }
        xyk xykVar = this.jpo.f19924se;
        if (xykVar != null) {
            xykVar.cm(xyk.f19977jd);
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        if (!TextUtils.isEmpty(dt.jpo(jpoVar.f19920pe, jpoVar.f19914jd))) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
            tu.jpo(jpoVar2.vrc, rv.ju(jpoVar2.f19914jd), this.jpo.f19914jd, jd.jpo.wqx);
            return;
        }
        if (dt.wqx(this.jpo.f19914jd) && (auVar = this.jpo.nzb) != null) {
            auVar.jj();
        }
        if (!dt.jpo(this.jpo.f19914jd) && (dt.wqx(this.jpo.f19914jd) || !this.jpo.f19909ef.uu())) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.jpo;
            if (dt.jpo(jpoVar3.f19914jd, jpoVar3.f19909ef.au(), this.jpo.f19909ef.ef(), this.jpo.nzb.m439if(), this.jpo.f19909ef.hmu())) {
                if (!dt.cm(this.jpo.f19914jd) && !dt.wqx(this.jpo.f19914jd)) {
                    this.jpo.f19909ef.jpo(true, 0, (String) null);
                }
                jd(jdVar);
                jpo(jdVar);
                return;
            }
        }
        cm();
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) throws JSONException {
        if (!dt.wqx(this.jpo.f19914jd)) {
            this.jpo.nzb.jpo(8);
            this.jpo.f19909ef.jpo(0);
            this.jpo.f19909ef.sz();
        } else {
            this.jpo.f19909ef.jpo(8);
            this.jpo.nzb.jpo(0);
            this.jpo.nzb.qk();
        }
        if (this.jpo.f19921qk) {
            va.jpo((View) jdVar.oya, 0);
            this.jpo.tic.jj(8);
        }
        this.jpo.tic.cm(8);
        this.jpo.tic.qk();
        if (dt.wqx(this.jpo.f19914jd)) {
            this.jpo.xk.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        jpoVar.f19909ef.jpo(jpoVar.huv, true);
        this.jpo.f19909ef.wqx(true);
        this.jpo.f19909ef.jd(true);
        ef efVarZz = this.jpo.f19909ef.zz();
        if (efVarZz != null) {
            efVarZz.jpo("prerender_page_show", (JSONObject) null);
        }
        if (!rv.jd(this.jpo.f19914jd)) {
            this.jpo.duq.wqx(false);
        }
        com.bytedance.sdk.component.zz.jj jjVarXyk = this.jpo.f19909ef.xyk();
        if (jjVarXyk == null || jjVarXyk.getWebView() == null) {
            return;
        }
        jjVarXyk.au();
        jjVarXyk.getWebView().resumeTimers();
    }

    public void jpo(boolean z10) {
        if (!dt.cm(this.jpo.f19914jd)) {
            this.jpo.f19909ef.jpo(false, 408, "end_card_timeout");
        }
        this.jpo.f19909ef.nq();
        this.jpo.f19909ef.jpo(8);
        this.jpo.nzb.jpo(8);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        if (jpoVar.f19921qk) {
            va.jpo((View) jpoVar.ree.oya, 8);
            this.jpo.tic.jj(0);
        }
        this.jpo.tic.cm(8);
        if (this.jpo.f19914jd.ig()) {
            if (!this.f19942jd.jpo(this.jpo.hmu)) {
                this.jpo.vrc.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.jpo.ux;
            if (xykVar != null) {
                this.f19942jd.jpo(xykVar.xk().qk());
            }
            this.f19942jd.jd();
        }
        this.jpo.tic.qk();
        if (z10) {
            jd(this.jpo.ree);
        }
        this.jpo.duq.wqx(false);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
        jpoVar2.f19923rv.jpo(jpoVar2.f19914jd.jw());
    }

    public void jpo(jpo jpoVar) {
        this.wqx = jpoVar;
    }
}
