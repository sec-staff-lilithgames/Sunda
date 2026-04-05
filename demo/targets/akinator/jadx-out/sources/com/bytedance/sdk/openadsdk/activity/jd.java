package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.openadsdk.component.reward.au;
import com.bytedance.sdk.openadsdk.component.reward.jpo.ju;
import com.bytedance.sdk.openadsdk.component.reward.ju;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hmu;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: jd, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.jpo.my.jpo f19335jd;
    private static com.bytedance.sdk.openadsdk.jpo.wqx.jd wqx;

    /* renamed from: au, reason: collision with root package name */
    private Activity f19336au;

    /* renamed from: cm, reason: collision with root package name */
    private final dt f19337cm;
    private boolean hna;

    /* renamed from: if, reason: not valid java name */
    private final boolean f92if;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.p001if.zz f19338jj;
    public ju jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.activity.wqx f19340ju;
    private boolean nmd;
    private Runnable opi;
    private int oya;
    private Bundle prr;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpo.my.jpo f19341qk;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f19342sq;
    private com.bytedance.sdk.openadsdk.jpo.wqx.jd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final boolean f19343yd;
    private final boolean zz;
    private final Bundle my = new Bundle();

    /* renamed from: jr, reason: collision with root package name */
    private final ju.jd f19339jr = new ju.jd();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class cm extends AbstractC0099jd {

        /* renamed from: ju, reason: collision with root package name */
        private boolean f19351ju;

        /* renamed from: yd, reason: collision with root package name */
        private int f19352yd;
        private final int zz;

        public cm(jd jdVar, dt dtVar, com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar) {
            super(jdVar, dtVar, wqxVar);
            if (dtVar == null) {
                this.zz = 100;
            } else if (dtVar.ota() >= 0) {
                this.zz = Math.min(100, dtVar.ota());
            } else {
                this.zz = sq.cm().nq(String.valueOf(dtVar.jl())).f20868jj;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.jd.AbstractC0099jd, android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (!this.f19351ju && this.f19354cm <= this.f19352yd) {
                this.f19351ju = true;
                xyk xykVarXyk = this.jpo.xyk();
                if (xykVarXyk != null) {
                    xykVarXyk.dn();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.jd.AbstractC0099jd
        public int jpo(dt dtVar) {
            if (dtVar != null) {
                return dtVar.nzp();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.jd.AbstractC0099jd
        public void jpo(int i10, dt dtVar) {
            boolean z10 = this.my == 0;
            int i11 = this.f19354cm;
            super.jpo(i10, dtVar);
            if (!z10) {
                if (this.wqx < i11) {
                    this.f19352yd = (int) ((1.0f - (this.zz / 100.0f)) * this.f19354cm);
                    return;
                }
                return;
            }
            if (this.my == 1) {
                this.f19352yd = 3;
            } else {
                this.f19352yd = (int) ((1.0f - (this.zz / 100.0f)) * this.wqx);
            }
            com.bytedance.sdk.openadsdk.component.reward.ju juVar = this.jpo.jpo;
            if (juVar != null) {
                juVar.jpo(this.f19354cm);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.jd$jd, reason: collision with other inner class name */
    public static abstract class AbstractC0099jd implements Handler.Callback {

        /* renamed from: au, reason: collision with root package name */
        private boolean f19353au;

        /* renamed from: cm, reason: collision with root package name */
        protected int f19354cm;

        /* renamed from: dm, reason: collision with root package name */
        private int f19355dm;

        /* renamed from: dt, reason: collision with root package name */
        private int f19356dt;
        private boolean duq;

        /* renamed from: ef, reason: collision with root package name */
        private boolean f19357ef;
        private boolean hmu;
        private float hna;

        /* renamed from: hx, reason: collision with root package name */
        private boolean f19358hx;

        /* renamed from: jd, reason: collision with root package name */
        protected dt f19359jd;
        protected final jd jpo;

        /* renamed from: jr, reason: collision with root package name */
        private int f19361jr;

        /* renamed from: ju, reason: collision with root package name */
        private final Context f19362ju;
        private int kln;
        protected int my;
        private int nmd;

        /* renamed from: nq, reason: collision with root package name */
        private boolean f19363nq;
        private boolean nzb;
        private int opi;
        private boolean oya;
        private int pdm;

        /* renamed from: pe, reason: collision with root package name */
        private boolean f19364pe;
        private boolean prr;
        private boolean roc;

        /* renamed from: rq, reason: collision with root package name */
        private int f19366rq;

        /* renamed from: se, reason: collision with root package name */
        private int f19368se;
        private int sz;
        private int tic;

        /* renamed from: tu, reason: collision with root package name */
        private int f19370tu;

        /* renamed from: uu, reason: collision with root package name */
        private int f19371uu;

        /* renamed from: va, reason: collision with root package name */
        private int f19372va;
        private boolean vrc;
        protected float wqx;

        /* renamed from: yd, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.component.reward.top.wqx f19373yd;
        private final Handler zz = new Handler(Looper.getMainLooper(), this);

        /* renamed from: if, reason: not valid java name */
        private final int f93if = 1000;

        /* renamed from: jj, reason: collision with root package name */
        protected int f19360jj = -1;

        /* renamed from: sq, reason: collision with root package name */
        private int f19369sq = 1000;

        /* renamed from: rv, reason: collision with root package name */
        private boolean f19367rv = false;

        /* renamed from: qk, reason: collision with root package name */
        boolean f19365qk = false;
        public int xyk = -1;

        public AbstractC0099jd(jd jdVar, dt dtVar, com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar) {
            this.jpo = jdVar;
            this.f19359jd = dtVar;
            this.f19373yd = wqxVar;
            this.f19362ju = wqxVar.getContext();
            this.f19354cm = jpo(dtVar);
        }

        private void au() {
            int i10 = this.sz;
            int i11 = this.f19355dm;
            boolean z10 = this.roc;
            int i12 = this.f19372va;
            int i13 = this.tic;
            if (i10 < i11 || z10) {
                return;
            }
            if (i12 >= i13) {
                this.vrc = false;
            } else {
                this.f19372va = i12 + 1;
                oya();
            }
        }

        private void cm(int i10) {
            if (this.f19360jj > 0 && this.prr && i10 == 3) {
                this.my = i10;
                jpo(i10, 1000);
            }
        }

        /* renamed from: if, reason: not valid java name */
        private void m434if() {
            com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
            if (this.f19358hx || this.f19353au || this.oya || (wqxVar = this.f19373yd) == null) {
                return;
            }
            wqxVar.setShowEndCardNextAd(true, this.f19359jd);
        }

        private void ju() {
            if (this.jpo.hna()) {
                this.f19373yd.showSkipButton();
                this.f19353au = true;
            } else {
                this.oya = true;
                this.f19373yd.showCloseButton();
            }
            this.f19373yd.setShowPlayableNextAd(false, this.f19359jd);
        }

        private void my(int i10) {
            if (this.f19364pe && i10 == 4) {
                this.my = i10;
                jpo(i10, 1000);
            }
        }

        private void oya() {
            xyk xykVarXyk;
            this.roc = true;
            this.sz = 0;
            jd jdVar = this.jpo;
            if (jdVar == null || (xykVarXyk = jdVar.xyk()) == null || xykVarXyk.ii()) {
                return;
            }
            m434if();
        }

        private void yd() {
            int i10 = this.f19360jj;
            if (i10 > 0) {
                this.f19360jj = i10 - 1;
            }
            if (this.f19360jj == 0 && this.prr) {
                this.prr = false;
                jd jdVar = this.jpo;
                if (jdVar == null || jdVar.xyk() == null) {
                    return;
                }
                xyk xykVarXyk = this.jpo.xyk();
                if (xykVarXyk instanceof com.bytedance.sdk.openadsdk.activity.my) {
                    ((com.bytedance.sdk.openadsdk.activity.my) xykVarXyk).yd();
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                jpo(message);
            } else if (i10 == 3) {
                if (this.f19360jj > 0) {
                    yd();
                    if (this.f19360jj >= 0) {
                        jpo(message.what, 1000);
                    }
                }
            } else if (i10 == 4) {
                if (this.f19364pe) {
                    my();
                    if (this.f19364pe && !this.f19358hx) {
                        jpo(message.what, 1000);
                    }
                }
            } else if (i10 == 5 && this.vrc) {
                qk();
                if (this.vrc && !this.f19358hx) {
                    jpo(message.what, 1000);
                }
            }
            return true;
        }

        public void jd() {
            this.f19364pe = false;
            this.vrc = false;
            this.f19365qk = false;
            this.pdm = 0;
            this.xyk = -1;
            this.roc = false;
            this.tic = 0;
            this.sz = 0;
            this.f19371uu = 0;
            this.hmu = false;
            this.f19372va = 0;
            this.f19367rv = false;
            com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.f19373yd;
            if (wqxVar != null) {
                wqxVar.setShowPlayableNextAd(false, this.f19359jd);
            }
        }

        public void jj() {
            this.f19363nq = true;
        }

        public int jpo() {
            return this.f19354cm;
        }

        public abstract int jpo(dt dtVar);

        public void qk() {
            if (this.f19363nq && this.vrc && !this.f19358hx) {
                int i10 = this.f19371uu;
                int i11 = this.sz;
                boolean z10 = this.hmu;
                int i12 = i10 + 1;
                this.f19371uu = i12;
                this.sz = i11 + 1;
                if (z10 && i12 >= this.kln) {
                    m434if();
                }
                if (this.nzb || this.f19357ef) {
                    au();
                }
            }
        }

        public void wqx() {
            this.zz.removeMessages(this.my);
        }

        public void xyk() {
            if (this.vrc) {
                m434if();
                this.roc = false;
            }
        }

        public void zz() {
            if (this.vrc) {
                this.roc = true;
            }
        }

        public void jpo(boolean z10) {
            this.hmu = z10;
            this.sz = 0;
            if (z10) {
                int i10 = this.f19366rq;
                int i11 = this.f19361jr;
                this.opi = i10 - i11;
                this.f19356dt = i11;
                this.f19370tu = i10;
            }
        }

        public void wqx(int i10) {
            this.f19360jj = i10;
            if (i10 > 0) {
                this.prr = true;
                if (this.f19354cm <= 0 || this.f19353au) {
                    cm(3);
                }
            }
        }

        public void cm() {
            if (this.f19353au || this.oya) {
                return;
            }
            jpo(-1);
            this.f19367rv = true;
            com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.f19373yd;
            if (wqxVar != null) {
                wqxVar.setSkipText("");
                this.f19373yd.setShowEndCardNextAd(true, this.f19359jd);
            }
        }

        public void my() {
            if (this.f19363nq && this.f19364pe) {
                if (this.oya) {
                    this.f19364pe = false;
                }
                if (this.f19358hx) {
                    return;
                }
                int i10 = this.f19368se;
                boolean z10 = this.hmu;
                int i11 = i10 + 1;
                this.f19368se = i11;
                if (z10) {
                    this.f19370tu = this.f19366rq;
                } else {
                    this.f19370tu = this.opi + this.f19361jr;
                }
                if (i11 >= this.opi) {
                    if (!this.f19365qk) {
                        this.pdm++;
                        this.f19365qk = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.f19354cm);
                            jSONObject.put("hint_sequence", this.pdm);
                            com.bytedance.sdk.openadsdk.cm.wqx.cm(this.f19359jd, this.jpo.xyk().b_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.wqx wqxVar = this.jpo.f19340ju;
                    int i12 = this.f19356dt;
                    this.f19356dt = i12 - 1;
                    wqxVar.jpo(i12, this.f19354cm);
                } else {
                    this.f19365qk = false;
                    this.jpo.f19340ju.jpo(-1, this.f19354cm);
                }
                if (this.hmu && this.f19368se >= this.nmd) {
                    boolean z11 = this.f19353au;
                    boolean z12 = this.oya;
                    if (!z11 && !z12) {
                        this.f19373yd.setShowPlayableNextAd(true, this.f19359jd);
                    }
                }
                if (this.f19368se < this.f19370tu || this.jpo.xyk() == null) {
                    return;
                }
                xyk xykVarXyk = this.jpo.xyk();
                if (xykVarXyk instanceof com.bytedance.sdk.openadsdk.activity.my) {
                    this.zz.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.my) xykVarXyk).yd();
                }
            }
        }

        public void jpo(int i10) {
            int i11 = this.my;
            if (i10 != -1) {
                this.xyk = i10;
            }
            this.zz.removeMessages(i11);
        }

        private void jpo(Message message) {
            if (this.f19354cm > 0) {
                com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.f19373yd;
                StringBuilder sb2 = new StringBuilder();
                int i10 = this.f19354cm;
                this.f19354cm = i10 - 1;
                sb2.append(i10);
                sb2.append(ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                wqxVar.setSkipText(sb2.toString());
                yd();
                my();
                if (this.f19354cm >= 0) {
                    jpo(message.what, this.f19369sq);
                }
                qk();
                return;
            }
            cm(3);
            my(4);
            jpo(5, true);
            ju();
        }

        public void jd(int i10) {
            if (this.xyk != 2 || i10 == 1) {
                if (i10 != -1) {
                    this.xyk = i10;
                }
                if (this.zz.hasMessages(this.my) || this.f19367rv) {
                    return;
                }
                jd jdVar = this.jpo;
                if (jdVar == null || jdVar.xyk() == null || this.jpo.xyk().se() == null || !this.jpo.xyk().se().f19917ju.get()) {
                    int i11 = this.f19354cm;
                    boolean z10 = this.f19353au;
                    int i12 = this.my;
                    if (i12 == 1 || i12 == 2) {
                        if (i11 < 0 || z10 || this.oya) {
                            return;
                        }
                        this.zz.sendEmptyMessageDelayed(i12, this.f19369sq);
                        return;
                    }
                    if (i12 == 3) {
                        cm(3);
                    } else if (i12 == 4) {
                        my(4);
                    } else if (i12 == 5) {
                        jpo(5, true);
                    }
                }
            }
        }

        private void jpo(int i10, int i11) {
            if (this.f19367rv) {
                return;
            }
            this.zz.removeMessages(i10);
            this.zz.sendEmptyMessageDelayed(i10, i11);
        }

        private void jpo(int i10, boolean z10) {
            if (this.vrc && i10 == 5) {
                this.my = i10;
                if (z10) {
                    jpo(i10, 1000);
                } else {
                    this.zz.sendEmptyMessage(i10);
                }
            }
        }

        public void jd(boolean z10) {
            if (z10) {
                this.f19369sq = (int) (1000.0f / this.hna);
            } else {
                this.f19369sq = 1000;
            }
        }

        public void jpo(dt dtVar, boolean z10) {
            this.opi = rv.nmd(dtVar);
            this.f19361jr = rv.hmu(dtVar);
            this.nmd = rv.nq(dtVar);
            this.f19366rq = rv.se(dtVar);
            this.f19356dt = this.f19361jr;
            this.f19363nq = false;
            this.hmu = false;
            this.f19368se = 0;
            this.f19364pe = true;
            com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.f19373yd;
            if (wqxVar != null) {
                wqxVar.setShowPlayableNextAd(false, dtVar);
            }
            this.f19358hx = z10;
            if (this.f19354cm <= 0 || this.f19353au) {
                my(4);
            }
        }

        public void jpo(int i10, dt dtVar) {
            if (dtVar != null && dtVar.fmg() != null) {
                this.hna = dtVar.fmg().jpo();
                this.f19359jd = dtVar;
            }
            int i11 = this.f19354cm;
            boolean z10 = this.f19353au;
            boolean z11 = this.oya;
            int i12 = this.my;
            if (z10 || z11) {
                return;
            }
            float f10 = i10;
            this.wqx = f10;
            if (f10 <= i11) {
                this.my = 2;
                this.f19354cm = (int) f10;
            } else if (i12 == 0) {
                this.my = 1;
            }
            int i13 = this.my;
            if (i12 == i13 && this.zz.hasMessages(i13)) {
                return;
            }
            this.zz.removeCallbacksAndMessages(null);
            this.zz.sendEmptyMessage(this.my);
        }

        public void jpo(xyk xykVar) {
            dt dtVar;
            hmu hmuVarJpo;
            if (xykVar == null || (dtVar = xykVar.f19412jj) == null || (hmuVarJpo = dtVar.jpo()) == null) {
                return;
            }
            this.kln = hmuVarJpo.wqx();
            this.f19358hx = xykVar.f19416sq;
            this.tic = hmuVarJpo.jpo();
            this.duq = xykVar.hna;
            this.f19355dm = hmuVarJpo.jd();
            this.f19357ef = nmd.jj(xykVar.f19412jj);
            this.nzb = nmd.my(xykVar.f19412jj);
            this.vrc = true;
            if ((this.f19354cm <= 0 || this.f19353au) && !this.zz.hasMessages(5)) {
                jpo(5, false);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends AbstractC0099jd {
        public jpo(jd jdVar, dt dtVar, com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar) {
            super(jdVar, dtVar, wqxVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.jd.AbstractC0099jd
        public int jpo(dt dtVar) {
            if (dtVar != null) {
                return dtVar.axn();
            }
            return 5;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class my {

        /* renamed from: cm, reason: collision with root package name */
        public boolean f19374cm;

        /* renamed from: jd, reason: collision with root package name */
        public final int f19375jd;
        public final Bundle jpo = new Bundle();
        public boolean my;
        public final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo wqx;

        public my(int i10, com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
            this.f19375jd = i10;
            this.wqx = jpoVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx implements Runnable {
        private final dt jpo;

        public wqx(dt dtVar) {
            this.jpo = dtVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.jpo.rf()) {
                return;
            }
            if (this.jpo.jw()) {
                au.jpo(sq.jpo()).jpo(this.jpo.gmx());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.my.jpo(sq.jpo()).jpo(this.jpo.gmx());
            }
        }
    }

    public jd(Activity activity, dt dtVar) {
        this.f19337cm = dtVar;
        this.f19336au = activity;
        this.f19338jj = new com.bytedance.sdk.openadsdk.p001if.zz(activity.getApplicationContext());
        boolean zVa = dtVar.va();
        this.zz = zVa;
        boolean z10 = false;
        this.f19343yd = zVa && 39 == dtVar.jkt();
        if (zVa && 40 == dtVar.jkt()) {
            z10 = true;
        }
        this.f92if = z10;
        int iJkt = dtVar.jkt();
        if (iJkt == 43 || iJkt == 44) {
            this.f19340ju = new com.bytedance.sdk.openadsdk.activity.cm(this.f19336au, dtVar, this);
        } else {
            this.f19340ju = new zz(this.f19336au, dtVar, this);
        }
        this.f19340ju.jpo();
        rv();
    }

    private void rv() {
        if (this.f19337cm.jw()) {
            this.jpo = new com.bytedance.sdk.openadsdk.component.reward.ju(new ju.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.jd.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.ju.jpo
                public void jpo() {
                    xyk xykVarXyk;
                    if (jd.this.zz().getBoolean("reward_verify", false) || jd.this.au() || jd.this.zz().getBoolean("user_has_give_up_reward", false) || (xykVarXyk = jd.this.xyk()) != null) {
                        return;
                    }
                    xykVarXyk.cm(1);
                }
            });
        }
    }

    public boolean au() {
        return this.f19342sq;
    }

    public void cm(TTAdActivity tTAdActivity) {
        this.oya = 5;
        this.f19340ju.xyk();
    }

    public boolean dt() {
        return this.nmd;
    }

    public List<dt> hmu() {
        return this.f19340ju.hna();
    }

    public boolean hna() {
        return this.f19340ju.my();
    }

    public void hx() {
        this.f19340ju.nmd();
    }

    /* renamed from: if, reason: not valid java name */
    public void m433if() {
        if (prr()) {
            return;
        }
        sq();
        com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar = this.f19341qk;
        if (jpoVar != null) {
            jpoVar.jpo();
        } else {
            com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar = this.xyk;
            if (jdVar != null) {
                jdVar.jpo();
            }
        }
        Runnable runnable = this.opi;
        if (runnable != null) {
            runnable.run();
            this.opi = null;
        }
    }

    public void jj() {
        this.f19340ju.yd();
    }

    public boolean jr() {
        return this.f19340ju.jj();
    }

    public void ju() {
        com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar = this.f19341qk;
        if (jpoVar != null) {
            jpoVar.jd();
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar = this.xyk;
        if (jdVar != null) {
            jdVar.jd();
        }
    }

    public void my(TTAdActivity tTAdActivity) {
        this.oya = 6;
        this.f19340ju.cm();
        this.f19339jr.jpo(tTAdActivity);
        this.f19336au = null;
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.wqx nmd() {
        return this.f19340ju.au();
    }

    public void nq() {
        this.f19340ju.opi();
    }

    public com.bytedance.sdk.openadsdk.p001if.zz opi() {
        return this.f19338jj;
    }

    public void oya() {
        this.f19342sq = true;
        com.bytedance.sdk.openadsdk.component.reward.ju juVar = this.jpo;
        if (juVar != null) {
            juVar.wqx();
        }
    }

    public int pdm() {
        return this.f19340ju.zz();
    }

    public boolean prr() {
        return this.hna;
    }

    public int qk() {
        return this.f19340ju.ju();
    }

    public xyk rq() {
        return this.f19340ju.oya();
    }

    public void se() {
        this.f19340ju.jr();
    }

    public void sq() {
        this.hna = true;
        this.f19340ju.sq();
    }

    public boolean tu() {
        return this.f19340ju instanceof com.bytedance.sdk.openadsdk.activity.cm;
    }

    public boolean wqx() {
        return this.zz;
    }

    public xyk xyk() {
        return this.f19340ju.mo432if();
    }

    public void yd() {
        com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar = this.f19341qk;
        if (jpoVar != null) {
            jpoVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar = this.xyk;
        if (jdVar != null) {
            jdVar.onAdClicked();
        }
    }

    public Bundle zz() {
        return this.my;
    }

    public boolean jd() {
        if (this.f19337cm != null && this.zz) {
            return this.f19343yd || this.f92if;
        }
        return false;
    }

    public boolean jpo() {
        return this.f92if;
    }

    public void wqx(TTAdActivity tTAdActivity) {
        this.oya = 4;
        this.f19340ju.wqx();
        com.bytedance.sdk.openadsdk.component.reward.ju juVar = this.jpo;
        if (juVar != null) {
            juVar.jpo();
        }
    }

    public void cm() {
        Activity activity = this.f19336au;
        if (activity != null) {
            activity.finish();
        }
    }

    public boolean jpo(dt dtVar) {
        return (dtVar == null || nmd.m475if(dtVar) || dtVar.by() || dtVar.zx() == null || dtVar.zx().cm() <= 0) ? false : true;
    }

    public void jd(TTAdActivity tTAdActivity) {
        this.oya = 3;
        this.f19340ju.jd();
        com.bytedance.sdk.openadsdk.component.reward.ju juVar = this.jpo;
        if (juVar != null) {
            juVar.jd();
        }
        this.f19339jr.jpo(tTAdActivity, this.f19337cm.ll(), this.f19337cm.sy());
    }

    public Activity my() {
        com.bytedance.sdk.openadsdk.activity.wqx wqxVar = this.f19340ju;
        if (wqxVar == null) {
            return this.f19336au;
        }
        return wqxVar.jpo;
    }

    public void jpo(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar, com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar) {
        this.prr = bundle;
        this.oya = 1;
        this.f19341qk = jpoVar;
        this.xyk = jdVar;
        if (jpoVar == null && bundle != null) {
            this.f19341qk = f19335jd;
            f19335jd = null;
        }
        if (jdVar == null && bundle != null) {
            this.xyk = wqx;
            wqx = null;
        }
        this.f19340ju.jpo(bundle);
    }

    public void jd(xyk xykVar) {
        xykVar.jpo(this.f19336au, this.prr);
        int i10 = this.oya;
        if (i10 == 2) {
            xykVar.au();
            return;
        }
        if (i10 == 3) {
            xykVar.au();
            xykVar.wqx();
            xykVar.wqx(true);
        } else if (i10 == 4) {
            xykVar.wqx(false);
            xykVar.oya();
        } else {
            if (i10 != 5) {
                return;
            }
            xykVar.cm();
        }
    }

    public void jpo(TTAdActivity tTAdActivity) {
        this.oya = 2;
        this.f19340ju.qk();
    }

    public void jpo(boolean z10) {
        this.f19340ju.jpo(z10);
    }

    public void jpo(TTAdActivity tTAdActivity, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(this.f19337cm, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle);
        com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar = this.f19341qk;
        if (jpoVar != null) {
            f19335jd = jpoVar;
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar = this.xyk;
        if (jdVar != null) {
            wqx = jdVar;
        }
    }

    public void jd(xyk xykVar, my myVar) {
        this.f19340ju.jpo(xykVar, myVar);
    }

    public void jd(boolean z10) {
        this.nmd = z10;
    }

    public void jd(xyk xykVar, int i10) {
        this.f19340ju.jd(xykVar, i10);
    }

    public void jpo(xyk xykVar, my myVar) {
        this.f19340ju.jpo(xykVar, null, myVar);
    }

    public void jpo(Activity activity) {
        this.f19340ju.jpo(activity);
    }

    public void jpo(final xyk xykVar, final boolean z10, final int i10, final String str, final int i11, final String str2) {
        Activity activity;
        if (!this.hna) {
            this.opi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.jd.2
                @Override // java.lang.Runnable
                public void run() {
                    jd.this.jpo(xykVar, z10, i10, str, i11, str2);
                }
            };
            return;
        }
        if (au()) {
            return;
        }
        oya();
        if (this.f19341qk == null || (activity = this.f19336au) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.jd.3
            @Override // java.lang.Runnable
            public void run() {
                jd.this.f19341qk.jpo(z10, i10, str, i11, str2);
            }
        });
        if (wqx()) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), xykVar.f19412jj, xykVar.b_(), z10 ? "reward_success" : "reward_fail");
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.activity.jpo jpoVar, boolean z10) {
        this.f19340ju.jpo(jpoVar, z10);
    }

    public void jpo(xyk xykVar) {
        com.bytedance.sdk.openadsdk.activity.wqx wqxVar = this.f19340ju;
        if (wqxVar == null) {
            return;
        }
        wqxVar.jpo(xykVar);
    }

    public void jpo(xyk xykVar, boolean z10) {
        com.bytedance.sdk.openadsdk.activity.wqx wqxVar = this.f19340ju;
        if (wqxVar == null) {
            return;
        }
        wqxVar.jpo(xykVar, z10);
    }

    public void jpo(View view) {
        this.f19340ju.jpo(view);
    }

    public void jpo(View view, boolean z10) {
        this.f19340ju.jpo(view, z10);
    }

    public boolean jpo(xyk xykVar, int i10) {
        return this.f19340ju.jpo(xykVar, i10);
    }

    public void jpo(float f10) {
        this.f19340ju.jpo(f10);
    }

    public void jpo(Map<String, Object> map, xyk xykVar, float f10, float f11) {
        this.f19340ju.jpo(map, xykVar, f10, f11);
    }

    public void jpo(int i10) {
        this.f19340ju.jpo(i10);
    }

    public void jpo(xyk xykVar, boolean z10, boolean z11, boolean z12, int i10) {
        this.f19340ju.jpo(xykVar, z10, z11, z12, i10);
    }
}
