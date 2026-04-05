package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.activity.jd;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.jd;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends xyk implements hx.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private static String f19386cm;
    private static String my;
    private static String nmd;

    /* renamed from: rq, reason: collision with root package name */
    private static String f19387rq;

    /* renamed from: tu, reason: collision with root package name */
    private static String f19388tu;

    /* renamed from: dt, reason: collision with root package name */
    private Bundle f19389dt;
    private int hmu;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f19390hx;

    /* renamed from: jd, reason: collision with root package name */
    protected final hx f19391jd;
    public boolean jpo;
    private boolean kln;

    /* renamed from: nq, reason: collision with root package name */
    private jd.my f19392nq;
    private long pdm;

    /* renamed from: rv, reason: collision with root package name */
    private JSONObject f19393rv;

    /* renamed from: se, reason: collision with root package name */
    private boolean f19394se;
    private boolean sz;

    /* renamed from: uu, reason: collision with root package name */
    private int f19395uu;
    protected com.bytedance.sdk.openadsdk.component.reward.jd.jd wqx;

    public my(jd jdVar, dt dtVar, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        super(jdVar, dtVar, i10, i11, z11);
        this.f19391jd = new hx(Looper.getMainLooper(), this);
        boolean z13 = false;
        this.hmu = 0;
        this.kln = true;
        this.hna = z10;
        this.f19410au = jdVar.jd();
        this.sz = z10 && rv.wqx(dtVar);
        this.jpo = z12;
        if (this.hna && rv.wqx(dtVar)) {
            z13 = true;
        }
        this.sz = z13;
        jpo(dtVar, this.f19389dt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kln() {
        jd.my myVar = new jd.my(7, this.zz);
        myVar.f19374cm = this.zz.huv;
        this.f19415qk.jd(this, myVar);
    }

    private void nq() {
        if (this.f19394se) {
            return;
        }
        this.f19394se = true;
        if (com.bytedance.sdk.openadsdk.rq.jpo.jpo("ivrv_new_arch_endcard_view_add_at_first", 0) == 1) {
            if (this.f19410au) {
                this.f19415qk.jpo(jpo(), vrc());
            } else {
                this.f19415qk.jpo(jpo());
            }
        }
        this.wqx.se();
    }

    private void ota() {
        try {
            tu();
        } catch (Throwable unused) {
            fy();
        }
        nq();
        if (!nmd.jj(this.f19412jj) || this.jpo) {
            return;
        }
        cql();
    }

    private void pdm() {
        final View viewYd = this.zz.tic.yd();
        if (viewYd != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.my.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (my.this.zz.f19909ef.nmd()) {
                        boolean zAu = my.this.zz.nzb.au();
                        my.this.zz.f19909ef.jj(zAu);
                        my.this.zz.tic.jj(8);
                        View view2 = viewYd;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.jj.cm) {
                            ((com.bytedance.sdk.openadsdk.core.jj.cm) view2).setImageResource(com.bytedance.sdk.component.utils.dt.cm(my.this.zz.f19920pe, "tt_close_btn"));
                        }
                        my.this.zz.xk.sendEmptyMessageDelayed(600, 5000L);
                        if (!dt.wqx(my.this.zz.f19914jd)) {
                            return;
                        }
                        if (dt.wqx(my.this.zz.f19914jd) && zAu) {
                            return;
                        }
                    }
                    my.this.zz.f19909ef.rq();
                    my.this.zz.nzb.ju();
                    my.this.zz.f19923rv.jj();
                    if (rv.cm(my.this.zz.f19914jd) && my.this.jpo(true, true, (Runnable) null)) {
                        return;
                    }
                    my.this.fy();
                }
            };
            viewYd.setOnClickListener(onClickListener);
            viewYd.setTag(viewYd.getId(), onClickListener);
        }
        this.zz.duq.jpo(new com.bytedance.sdk.openadsdk.component.reward.top.jd() { // from class: com.bytedance.sdk.openadsdk.activity.my.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void cm(View view) {
                Log.e("TTAD.EndCardScene", "onPlayableChangeNext: click");
                my myVar = my.this;
                myVar.jpo(myVar.zz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jd(View view) {
                my.this.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view) {
                my myVar = my.this;
                if (myVar.jpo(rv.wqx(myVar.zz.f19914jd), false, (Runnable) null) || my.this.rv()) {
                    return;
                }
                if (!rv.my(my.this.zz.f19914jd)) {
                    if (!nmd.jpo(my.this.zz.f19914jd) || my.this.zz.hna.get()) {
                        my.this.fy();
                        return;
                    } else {
                        my.this.fy();
                        return;
                    }
                }
                if (rv.xyk(my.this.zz.f19914jd)) {
                    my.this.zz.f19924se.xyk();
                    return;
                }
                View view2 = viewYd;
                if (view2 != null) {
                    view2.performClick();
                } else {
                    my.this.fy();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void wqx(View view) {
                View view2 = viewYd;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view, String str) {
                my.this.jpo(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean rv() {
        jd jdVar;
        if (this.jpo || (jdVar = this.f19415qk) == null || !jdVar.hna()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), this.f19412jj, this.zz.my, "skip", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.my.3
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject jd() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, my.this.pdm);
                        jSONObject.put("percent", my.this.f19395uu);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject jpo() {
                    if (my.this.f19393rv != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", my.this.zz.jpo);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
        }
        this.f19415qk.jpo(this, true, false, false, 4);
        return true;
    }

    private boolean sz() {
        if (this.zz.f19934yd.get() && this.zz.f19921qk) {
            return false;
        }
        if (this.f19412jj.jj()) {
            return this.zz.f19934yd.get();
        }
        return true;
    }

    private void tu() {
        if (this.f19390hx) {
            return;
        }
        this.f19390hx = true;
        if (!this.jpo) {
            this.zz.f19918kb = this.f19415qk.nmd();
        }
        this.zz.f19930va.jpo(this.wqx);
        this.wqx.jpo(this, this.f19391jd);
        this.wqx.ju();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean a_() {
        return this.zz.f19905cm;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public final void au() {
        super.au();
        if (this.zz == null || com.bytedance.sdk.component.utils.jd.jpo(ic())) {
            return;
        }
        this.zz.f19909ef.se();
        com.bytedance.sdk.openadsdk.utils.cm.jpo(ic(), this.zz.f19914jd);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public String b_() {
        return this.zz.my;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void c_() {
        this.zz.sz.jpo(this.wqx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void cm(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean d_() {
        return this.zz.huv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean dt() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        return jpoVar != null && jpoVar.hmu.sz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public String hmu() {
        return this.zz.fy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final View hna() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jj() {
        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.f19417yd + ",scene = " + this);
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jpo(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public boolean jpo(long j10, boolean z10) {
        return false;
    }

    public boolean jr() {
        return this.zz.f19909ef.pdm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void nmd() {
        super.nmd();
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.rq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void opi() {
        dn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public final void oya() {
        super.oya();
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.jr();
    }

    public final void qk() {
        if (this.f19415qk == null) {
            return;
        }
        this.zz.f19906dm.jpo(this.f19392nq.jpo.getBoolean("isSkip", false), this.f19392nq.jpo.getBoolean("force", false), this.f19392nq.jpo.getBoolean("isFromLandingPage", false), this.wqx, this.f19392nq.f19375jd);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void rq() {
        super.rq();
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar != null) {
            jdVar.tu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public com.bytedance.sdk.openadsdk.component.reward.jpo.jpo se() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final void sq() {
        if (this.zz.oya.getAndSet(true)) {
            return;
        }
        this.zz.f19923rv.jpo();
    }

    public void yd() {
        if (vrc()) {
            return;
        }
        jd.my myVar = new jd.my(8, this.zz);
        myVar.f19374cm = this.zz.huv;
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jpo(this, myVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(boolean z10) {
        if (!z10 || this.zz.f19927tl) {
            return;
        }
        dn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public final void wqx() {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar;
        super.wqx();
        if (this.zz == null || (jdVar = this.wqx) == null) {
            return;
        }
        jdVar.sq();
        this.zz.f19933ya = true;
        if (sz()) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
            jpoVar.duq.jpo(jpoVar.f19914jd.bl());
        }
        this.zz.tic.prr();
        this.zz.f19909ef.sq();
        this.zz.f19924se.cm();
        if (this.wqx.jd()) {
            this.zz.hmu.jpo(this.wqx);
            this.zz.hmu.jpo(false, this, this.hmu != 0);
        }
        this.hmu++;
        yd ydVar = this.zz.f19911hx;
        if (ydVar != null) {
            ydVar.qk();
        }
        this.zz.pdm.jpo(this.f19391jd);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void cm() {
        super.cm();
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.nmd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public final void jpo(Activity activity, Bundle bundle) {
        this.f19389dt = bundle;
        super.jpo(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public final com.bytedance.sdk.openadsdk.component.reward.view.zz jpo() {
        return this.zz.f19930va;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(Activity activity, jd.my myVar) {
        jd jdVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        this.f19392nq = myVar;
        Intent intent = activity.getIntent();
        this.prr = intent.getStringExtra("media_extra");
        this.oya = intent.getStringExtra("user_id");
        try {
            if (f19387rq == null) {
                f19387rq = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_reward_msg");
                f19386cm = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_msgPlayable");
                nmd = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_negtiveBtnBtnText");
                f19388tu = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_postiveBtnText");
                my = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.EndCardScene", th2.getMessage());
        }
        if (myVar != null && (jpoVar = myVar.wqx) != null) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
            jpoVar2.cql = jpoVar.cql;
            jpoVar2.huv = jpoVar.huv;
            if ((this.f19410au || this.hna) && !vrc()) {
                this.zz.f107if.set(jpoVar.f107if.get());
            }
            if (!this.sz) {
                this.zz.f19904au.set(jpoVar.f19904au.get());
                this.zz.oya.set(jpoVar.oya.get());
            }
            this.zz.hmu.jpo(jpoVar.hmu.my());
            jpo(this.zz, jpoVar);
        }
        if (this.f19410au || this.hna) {
            try {
                tu();
            } catch (Throwable unused) {
                fy();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.zz;
        if (jpoVar3 != null && (jdVar = this.f19415qk) != null) {
            jpoVar3.f19932wu = jdVar.jpo;
        }
        nq();
        pdm();
        qk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void wqx(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.yd ydVar;
        long j10 = this.kln ? this.zz.cql : 0L;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar != null && (ydVar = jpoVar.f19923rv) != null) {
            ydVar.jd(z10);
            this.zz.f19923rv.wqx(z10);
            if (z10 && j10 > 0) {
                this.zz.cql = j10;
            }
        }
        if (z10) {
            this.kln = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void ef() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    /* renamed from: if */
    public void mo426if() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final void prr() {
    }

    private void jpo(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar, com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2) {
        if (!this.f19410au || vrc() || jpoVar == null || jpoVar2 == null) {
            return;
        }
        try {
            this.pdm = jpoVar2.hmu.au();
            if (this.f19412jj.ic()) {
                this.pdm = jpoVar2.wqx();
            }
            this.f19395uu = jpoVar2.hmu.dt();
            this.f19393rv = tic.jpo(this.f19412jj, jpoVar2.hmu.hna(), jpoVar2.hmu.sq());
        } catch (Throwable unused) {
        }
    }

    private void jpo(dt dtVar, Bundle bundle) {
        Activity activityIc = ic();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = new com.bytedance.sdk.openadsdk.component.reward.jpo.jpo(activityIc, this.f19391jd, dtVar, this, 2);
        this.zz = jpoVar;
        jpoVar.f19925sg = this.hna;
        boolean z10 = this.jpo;
        jpoVar.cz = z10;
        jpoVar.umr = jpoVar.f19927tl && !z10;
        jpoVar.f19927tl = this.f19415qk.wqx();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
        jpoVar2.erj = this.f19410au;
        jpoVar2.f19931vk = this.f19415qk.jpo();
        if (!this.jpo) {
            this.zz.f19918kb = this.f19415qk.nmd();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.zz;
        jpoVar3.ux = this;
        jpoVar3.kln = this.f19415qk.opi();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(this.zz, activityIc.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVarJpo = com.bytedance.sdk.openadsdk.component.reward.jd.jj.jpo(this.zz);
        this.wqx = jdVarJpo;
        this.zz.ree = jdVarJpo;
        Objects.toString(jdVarJpo);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(String str) {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar != null && jdVar.cm() != null) {
            this.wqx.cm().jpo(this.zz.huv);
        }
        this.zz.huv = !r0.huv;
        StringBuilder sb2 = new StringBuilder("will set is Mute ");
        sb2.append(this.zz.huv);
        sb2.append(" mLastVolume=");
        sb2.append(this.zz.kln.jpo());
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        jpoVar.hmu.jpo(jpoVar.huv, str);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
        jpoVar2.f19909ef.my(jpoVar2.huv);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.zz;
        jpoVar3.f19924se.jd(jpoVar3.huv);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(Activity activity) {
        super.jpo(activity);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null) {
            return;
        }
        jpoVar.pdm.jpo();
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public final void jpo(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.jpo(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.f19415qk == null || vrc()) {
            return;
        }
        if (this.f19415qk.rq() == null && jpo(rv.wqx(this.zz.f19914jd), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.my.4
            @Override // java.lang.Runnable
            public void run() {
                my.this.kln();
            }
        })) {
            return;
        }
        kln();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(boolean z10) {
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jpo(this, z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(xyk xykVar, xyk xykVar2, jd.my myVar) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        super.jpo(xykVar, xykVar2, myVar);
        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.f19417yd + ",scene = " + this + ",newScene = " + xykVar2 + ",oldScene = " + xykVar + ",isPlayable = " + this.hna);
        boolean z10 = this.f19417yd == xykVar2.f19417yd + 1;
        if (xykVar != null && (jpoVar = this.zz) != null) {
            jpoVar.huv = myVar.f19374cm;
        }
        if (z10) {
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.EndCardScene", "preload index =" + this.f19417yd + ",new index =" + xykVar2.f19417yd + ",isPlayableProxy = " + this.hna);
            ota();
        }
        if (xykVar == null && this.jpo) {
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.EndCardScene", "preload agg-endcard =" + this.f19417yd + ",new index =" + xykVar2.f19417yd + ",isPlayableProxy = " + this.hna);
            ota();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(final boolean z10, boolean z11, final Runnable runnable) {
        if (!this.zz.f19905cm || this.f19415qk.zz().getBoolean("reward_verify", false) || this.f19415qk.au()) {
            return false;
        }
        if (!z11 && this.f19415qk.zz().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if (!sq.cm().qk(String.valueOf(this.zz.f19915jj))) {
            if (!z11) {
                return false;
            }
            if (runnable == null && z10) {
                fy();
                return true;
            }
        }
        this.zz.nmd.set(true);
        if (z10) {
            this.zz.f19924se.my();
        }
        final com.bytedance.sdk.openadsdk.core.widget.jd jdVar = new com.bytedance.sdk.openadsdk.core.widget.jd(this.zz.vrc);
        this.wqx.f19839au = jdVar;
        if (z10) {
            jdVar.jpo(f19386cm).jd(my).wqx(nmd);
        } else {
            jdVar.jpo(f19387rq).jd(f19388tu).wqx(nmd);
        }
        this.wqx.f19839au.jpo(new jd.InterfaceC0134jd() { // from class: com.bytedance.sdk.openadsdk.activity.my.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.jd.InterfaceC0134jd
            public void jd() {
                jdVar.dismiss();
                my.this.f19415qk.zz().putBoolean("user_has_give_up_reward", true);
                my.this.zz.nmd.set(false);
                my.this.zz.f19924se.wqx(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z10) {
                    my.this.rv();
                } else {
                    my.this.zz.f19923rv.jj();
                    my.this.fy();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jd.InterfaceC0134jd
            public void jpo() {
                if (z10) {
                    my.this.zz.f19924se.jd(1000);
                }
                jdVar.dismiss();
                my.this.zz.nmd.set(false);
            }
        }).show();
        return true;
    }
}
