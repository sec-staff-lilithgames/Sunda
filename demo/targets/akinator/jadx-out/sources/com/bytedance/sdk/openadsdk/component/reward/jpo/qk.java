package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends zz implements Handler.Callback {

    /* renamed from: cm, reason: collision with root package name */
    int f19963cm;

    /* renamed from: jd, reason: collision with root package name */
    long f19964jd;

    /* renamed from: jj, reason: collision with root package name */
    boolean f19965jj;
    boolean jpo;

    /* renamed from: jr, reason: collision with root package name */
    private final Handler f19966jr;
    int my;
    private int nmd;
    int wqx;

    public qk(jpo jpoVar) {
        super(jpoVar);
        this.f19966jr = new Handler(this);
        this.jpo = false;
        this.f19964jd = 0L;
        this.wqx = 0;
        this.f19963cm = 0;
        this.my = 0;
        this.f19965jj = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hna() {
        boolean z10 = false;
        boolean z11 = (1.0f - (((float) this.wqx) / ((float) this.f19963cm))) * 100.0f >= ((float) com.bytedance.sdk.openadsdk.core.sq.cm().nq(String.valueOf(this.f19984ju.f19915jj)).f20868jj);
        int iJpo = com.bytedance.sdk.openadsdk.core.sq.cm().jpo(String.valueOf(this.f19984ju.f19915jj));
        if (iJpo == 0) {
            com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f19986sq;
            boolean zJj = jpoVar != null ? jpoVar.jj() : false;
            if (this.oya) {
                zJj = true;
            }
            if (z11 && zJj) {
                z10 = true;
            }
        } else if (iJpo == 1) {
            z10 = z11;
        }
        if (z10) {
            this.f19984ju.roc.jd(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void cm() {
        com.bytedance.sdk.openadsdk.core.widget.jd jdVar;
        if (this.f19982au) {
            super.cm();
            if (DeviceUtils.qk() == 0) {
                this.f19984ju.huv = true;
            }
            jpo jpoVar = this.f19984ju;
            if (jpoVar.huv) {
                jpoVar.duq.jd(true);
                wqx(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar2 = this.f19984ju.ree;
            if ((jdVar2 == null || (jdVar = jdVar2.f19839au) == null || !jdVar.isShowing()) && ju() && qk() > 0) {
                jpo(0L);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 900 && this.f19985qk && rv.wqx(this.f19984ju.f19914jd) && !this.opi.get()) {
            int i10 = message.arg1;
            if (i10 > 0) {
                this.f19984ju.duq.cm(true);
                int i11 = this.my - (this.f19963cm - i10);
                if (i11 == i10) {
                    this.f19984ju.duq.jpo(String.valueOf(i10), null);
                } else if (i11 > 0) {
                    this.f19984ju.duq.jpo(String.valueOf(i10), String.format(dt.jpo(this.f19984ju.vrc.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(i11)));
                } else {
                    this.f19965jj = true;
                    if (rv.xyk(this.f19984ju.f19914jd)) {
                        this.f19984ju.duq.wqx();
                        this.f19984ju.duq.my(true);
                    } else {
                        this.f19984ju.f19916jr.set(true);
                        this.f19984ju.ree.prr();
                    }
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 900;
                int i12 = i10 - 1;
                messageObtain.arg1 = i12;
                this.f19966jr.sendMessageDelayed(messageObtain, 1000L);
                this.wqx = i12;
                this.nmd = i10;
            } else {
                this.f19965jj = true;
                if (!rv.xyk(this.zz) || (rv.jr(this.zz) && this.f19986sq.my())) {
                    this.f19984ju.duq.cm(false);
                    this.f19984ju.f19916jr.set(true);
                    this.f19984ju.ree.prr();
                } else {
                    this.f19984ju.duq.wqx();
                    this.f19984ju.duq.my(true);
                }
                com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f19986sq;
                if (jpoVar == null || jpoVar.my()) {
                    this.oya = true;
                }
                this.nmd = 0;
            }
            hna();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public com.bytedance.sdk.openadsdk.p001if.jj jd() {
        return new com.bytedance.sdk.openadsdk.p001if.jj() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.qk.1
            @Override // com.bytedance.sdk.openadsdk.p001if.jj
            public void jpo() {
                qk.this.hna();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void jj() {
        if (this.f19982au && !this.prr) {
            super.jj();
            this.f19966jr.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void my() {
        if (this.f19982au) {
            super.my();
            if (rv.wqx(this.f19984ju.f19914jd)) {
                this.f19984ju.xk.removeMessages(600);
            }
            this.f19966jr.removeMessages(900);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public int qk() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void wqx() throws JSONException {
        if (this.f19982au) {
            this.f19985qk = true;
            this.f19986sq.jpo();
            if (rv.xyk(this.zz)) {
                this.f19984ju.f19909ef.jj();
            }
            this.f19963cm = this.zz.gox();
            this.my = this.zz.ow();
            this.f19964jd = System.currentTimeMillis();
            if (!this.f19984ju.f19927tl) {
                Handler handler = this.f19966jr;
                handler.sendMessage(handler.obtainMessage(900, this.f19963cm, 0));
            }
            this.f19984ju.roc.sq();
            com.bytedance.sdk.openadsdk.component.reward.ju juVar = this.f19984ju.f19932wu;
            if (juVar != null) {
                juVar.jpo(this.f19963cm);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public int xyk() {
        return this.nmd;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public boolean yd() {
        return this.f19965jj;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void zz() {
        if (this.f19982au) {
            this.f19966jr.removeMessages(900);
            this.f19966jr.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void jpo() {
        if (this.f19982au && !this.f109if) {
            super.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void jpo(boolean z10) {
        if (this.hna != null) {
            try {
                com.bytedance.sdk.openadsdk.nmd.jpo.jd jdVarJpo = com.bytedance.sdk.openadsdk.nmd.jpo.cm.jpo().jpo(this.zz, this.hna, jd());
                this.f19986sq = jdVarJpo;
                jdVarJpo.jpo(this.f19984ju.roc);
            } catch (Throwable th2) {
                nmd.wqx("RVIVPlayableNewManager", "PreRender injection exception" + th2.getMessage());
            }
            if (this.f19986sq == null) {
                super.jpo(z10);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void jpo(int i10) {
        this.wqx = i10;
        this.nmd = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.zz
    public void jpo(long j10) {
        if (this.f19982au && this.f19985qk && !this.f19984ju.f19917ju.get()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = qk();
            this.f19966jr.sendMessageDelayed(messageObtain, j10);
        }
    }
}
