package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.activity.jd;
import com.bytedance.sdk.openadsdk.cm.jd;
import com.bytedance.sdk.openadsdk.component.reward.jpo.my;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import com.bytedance.sdk.openadsdk.core.au.cm.jpo;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.prr;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo extends xyk implements hx.jpo, my.jpo {

    /* renamed from: cm, reason: collision with root package name */
    protected boolean f19377cm;

    /* renamed from: dt, reason: collision with root package name */
    private boolean f19378dt;
    private boolean hmu;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f19379hx;

    /* renamed from: jd, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.jd.jd f19380jd;
    protected final hx jpo;
    protected boolean my;
    private int nmd;

    /* renamed from: nq, reason: collision with root package name */
    private long f19381nq;
    private CountDownTimer pdm;

    /* renamed from: rq, reason: collision with root package name */
    private Bundle f19382rq;

    /* renamed from: rv, reason: collision with root package name */
    private boolean f19383rv;

    /* renamed from: se, reason: collision with root package name */
    private long f19384se;

    /* renamed from: tu, reason: collision with root package name */
    private int f19385tu;
    protected int wqx;

    public jpo(jd jdVar, dt dtVar, int i10, int i11, boolean z10) {
        super(jdVar, dtVar, i10, i11, z10);
        this.jpo = new hx(Looper.getMainLooper(), this);
        this.nmd = 1;
        this.f19385tu = 0;
        this.f19378dt = false;
        this.f19377cm = false;
        ota();
    }

    private void aix() {
        if (this.f19412jj.jj() && !this.f19378dt) {
            this.f19378dt = true;
            jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.jpo.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] fArrJpo;
                    if (jpo.this.f19415qk.tu()) {
                        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = jpo.this.zz;
                        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = jpo.this.zz;
                        fArrJpo = new float[]{va.wqx(jpoVar.vrc, jpoVar.f19930va.getWidth()), va.wqx(jpoVar2.vrc, jpoVar2.f19930va.getHeight())};
                    } else {
                        jpo jpoVar3 = jpo.this;
                        fArrJpo = jpoVar3.zz.pdm.jpo(jpoVar3.nmd);
                    }
                    if (!jpo.this.zz.f19929uu.jpo()) {
                        jpo.this.zz.f19929uu.jpo(fArrJpo);
                    } else {
                        jpo jpoVar4 = jpo.this;
                        jpoVar4.zz.f19929uu.jpo(jpoVar4.f19412jj);
                    }
                }
            });
        }
    }

    private void ota() {
        this.f19379hx = rv.wqx(this.f19412jj) && this.f19412jj.ci();
        nmd.jpo("TTAD.AdScene", "current scene is isOnlyPlayable -> " + this.f19379hx);
        if (this.f19379hx) {
            this.f19384se = this.f19412jj.gox() * 1000;
        }
    }

    private void ree() {
        this.f19380jd.se();
        this.wqx = (int) this.zz.hmu.duq();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar.f19927tl) {
            jpo(jpoVar.f19923rv.my());
            jpo(this.zz.f19923rv.cm());
        }
        my();
        tl();
    }

    private void tl() {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar;
        if (this.f19412jj.jj() || (jdVar = this.f19380jd) == null) {
            return;
        }
        jdVar.jpo(this.zz.tic.jj());
        this.f19380jd.nq();
    }

    private boolean voc() {
        if (this.zz.f19934yd.get() && this.zz.f19921qk) {
            return false;
        }
        if (this.f19412jj.jj()) {
            return this.zz.f19934yd.get();
        }
        return true;
    }

    private void wad() {
        this.zz.f19930va.jpo(this.f19380jd);
        this.f19380jd.jpo(this, this.jpo);
        this.f19380jd.ju();
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
    public void cm() {
        super.cm();
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.f19380jd;
        if (jdVar == null) {
            return;
        }
        jdVar.nmd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean dt() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        return jpoVar != null && jpoVar.hmu.sz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean duq() {
        return this.zz.f19911hx.yd() && !hx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void ef() {
        this.f19377cm = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public String hmu() {
        return this.zz.fy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final View hna() {
        return this.zz.hmu.tic();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean hx() {
        return this.zz.f19911hx.zz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    /* renamed from: if */
    public void mo426if() {
        jd jdVar = this.f19415qk;
        if (jdVar == null) {
            return;
        }
        jdVar.jd(this, jpo(10));
    }

    public abstract void jd();

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jj() {
        nmd.jpo("TTAD.AdScene", "onPlayableLoadingDismiss()---" + this.f19417yd);
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jpo(this);
        }
    }

    public final void jr() {
        this.jpo.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void ju() {
        super.ju();
        if (this.f19412jj.jj()) {
            this.zz.f19911hx.au();
        }
    }

    public void kln() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar != null && jpoVar.hmu.zz()) {
            this.zz.hmu.nmd();
        }
    }

    public abstract void my();

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void nmd() {
        super.nmd();
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.f19380jd;
        if (jdVar == null) {
            return;
        }
        jdVar.jd(this.f19413jr);
    }

    public void nq() {
        this.f19415qk.jpo(this, jpo(jd.C0101jd.f19525jd));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean nzb() {
        return this.f19412jj.tl() == 10 && !hx();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void oya() {
        super.oya();
        if (this.f19379hx) {
            this.f19381nq = System.currentTimeMillis();
            nmd.jpo("TTAD.AdScene", "onPause: remainingTime = " + this.f19384se);
            CountDownTimer countDownTimer = this.pdm;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.f19380jd;
        if (jdVar == null) {
            return;
        }
        jdVar.jr();
        yd ydVar = this.zz.f19911hx;
        if (ydVar != null) {
            ydVar.xyk();
        }
        if (this.f19415qk.tu()) {
            this.zz.f19911hx.jpo(8, false);
        }
    }

    public void pdm() {
        this.zz.f19923rv.jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final void prr() {
        this.zz.hmu.dm();
    }

    public final void qk() {
        Message message = new Message();
        message.what = 400;
        if (this.f19412jj.jw()) {
            jd(10000);
        }
        this.jpo.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void rq() {
        super.rq();
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.f19380jd;
        if (jdVar != null) {
            jdVar.tu();
        }
    }

    public void rv() {
        aix();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public com.bytedance.sdk.openadsdk.component.reward.jpo.jpo se() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final void sq() {
        if (!this.zz.oya.getAndSet(true) || rv.wqx(this.zz.f19914jd)) {
            this.zz.f19923rv.jpo();
        }
    }

    public void sz() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null) {
            return;
        }
        jpoVar.hmu.prr();
    }

    public void tu() {
        if (this.hmu) {
            nmd.jpo("TTAD.AdScene", "tryPreloadNextAdVideo: Already tried preloading the video");
        } else {
            this.hmu = true;
            jkt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void uu() {
        com.bytedance.sdk.openadsdk.component.reward.view.cm cmVarJpo;
        super.uu();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null || (cmVarJpo = jpoVar.f19911hx.jpo()) == null || !cmVarJpo.dt()) {
            return;
        }
        pdm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void wqx() {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar;
        super.wqx();
        if (this.zz == null || (jdVar = this.f19380jd) == null) {
            return;
        }
        jdVar.sq();
        this.zz.f19933ya = true;
        if (voc()) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
            jpoVar.duq.jpo(jpoVar.f19914jd.bl());
        }
        this.zz.tic.prr();
        this.zz.f19909ef.sq();
        this.zz.f19924se.cm();
        if (this.f19380jd.jd()) {
            this.zz.hmu.jpo(this.f19380jd);
            if (this.zz.hmu.xk()) {
                jpo(this.zz.hmu.oya(), true);
            } else if (this.zz.hmu.qk() && this.f19415qk.tu()) {
                va();
            } else {
                this.zz.hmu.jpo(false, this, this.f19385tu != 0);
            }
        }
        this.f19385tu++;
        aix();
        yd ydVar = this.zz.f19911hx;
        if (ydVar != null) {
            ydVar.qk();
        }
        this.zz.pdm.jpo(this.jpo);
        if (this.f19415qk.tu()) {
            this.zz.f19911hx.jpo(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f19379hx) {
            long j10 = this.f19381nq;
            if (j10 != 0 && jCurrentTimeMillis - j10 > this.f19384se) {
                nmd.jpo("TTAD.AdScene", "onResume: Exceed playable_duration_time, switch to next ad");
                xk().jpo(this, jpo(8));
                return;
            }
            if (j10 != 0) {
                this.f19384se -= jCurrentTimeMillis - j10;
            }
            nmd.jpo("TTAD.AdScene", "onResume: The playable display time has not yet arrived, continue the countdown -> remainingTime = " + this.f19384se);
            jpo(this.f19384se);
        }
    }

    public abstract FrameLayout xyk();

    public com.bytedance.sdk.openadsdk.cm.qk yd() {
        yd ydVar;
        if (!this.f19412jj.jj()) {
            com.bytedance.sdk.openadsdk.cm.qk qkVar = new com.bytedance.sdk.openadsdk.cm.qk();
            qkVar.jpo(System.currentTimeMillis(), 1.0f);
            return qkVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar != null && (ydVar = jpoVar.f19911hx) != null && ydVar.jpo() != null) {
            return this.zz.f19911hx.jpo().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.cm.qk qkVar2 = new com.bytedance.sdk.openadsdk.cm.qk();
        qkVar2.jpo(System.currentTimeMillis(), 1.0f);
        return qkVar2;
    }

    public Map<String, Object> zz() {
        yd ydVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar != null && (ydVar = jpoVar.f19911hx) != null) {
            map.put("dynamic_show_type", Integer.valueOf(ydVar.ju()));
            JSONObject jSONObjectJpo = this.zz.f19911hx.jpo((JSONObject) null);
            if (jSONObjectJpo != null) {
                Iterator<String> itKeys = jSONObjectJpo.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectJpo.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public final void jpo(Activity activity, Bundle bundle) {
        this.f19382rq = bundle;
        super.jpo(activity, bundle);
        jpo(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void cm(boolean z10) {
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jpo(this, z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public final com.bytedance.sdk.openadsdk.component.reward.view.zz jpo() {
        return this.zz.f19930va;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(Activity activity, jd.my myVar) {
        try {
            this.nmd = this.f19412jj.ll();
            jpo(activity, this.f19412jj, this.f19382rq);
            if (this.zz.f19927tl && this.f19412jj.ci()) {
                this.zz.huv = myVar.f19374cm;
            }
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
            if (jpoVar.f19927tl && this.f19417yd > 0) {
                jpoVar.huv = myVar.f19374cm;
            }
            wad();
            ree();
            if (com.bytedance.sdk.openadsdk.core.model.nmd.my(this.f19412jj)) {
                cql();
            }
        } catch (Throwable th2) {
            nmd.jpo("TTAD.AdScene", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.prr.wqx.jd();
            fy();
        }
    }

    private void jpo(Activity activity, dt dtVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = new com.bytedance.sdk.openadsdk.component.reward.jpo.jpo(activity, this.jpo, dtVar, this, 1, this.zz);
        this.zz = jpoVar;
        jpoVar.f19927tl = this.f19415qk.wqx();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
        jpoVar2.erj = this.f19410au;
        jpoVar2.umr = jpoVar2.f19927tl && com.bytedance.sdk.openadsdk.core.model.nmd.my(dtVar);
        this.zz.f19931vk = this.f19415qk.jpo();
        this.zz.f19918kb = this.f19415qk.nmd();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.zz;
        jpoVar3.ux = this;
        jpoVar3.kln = this.f19415qk.opi();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(this.zz, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(intent, this.zz);
            dtVar.jpo(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.zz.f19910et) {
            jd();
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVarJpo = com.bytedance.sdk.openadsdk.component.reward.jd.jj.jpo(this.zz);
        this.f19380jd = jdVarJpo;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = this.zz;
        jpoVar4.ree = jdVarJpo;
        jpoVar4.f19906dm.jpo(this);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar5 = this.zz;
        if (jpoVar5.f19927tl) {
            jpoVar5.hmu.jpo(new jpo.InterfaceC0111jpo() { // from class: com.bytedance.sdk.openadsdk.activity.jpo.1
                @Override // com.bytedance.sdk.openadsdk.core.au.cm.jpo.InterfaceC0111jpo
                public void jpo(int i10) {
                    jpo jpoVar6 = jpo.this;
                    jd jdVar = jpoVar6.f19415qk;
                    if (jdVar == null) {
                        return;
                    }
                    jdVar.jd(jpoVar6, i10);
                }
            });
            if (!this.f19415qk.tu()) {
                this.f19415qk.nmd().setShowSound(dt.my(dtVar));
            }
        }
        prr.jpo(this.zz);
        Objects.toString(this.f19380jd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void opi() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void wqx(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.yd ydVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null || (ydVar = jpoVar.f19923rv) == null) {
            return;
        }
        ydVar.jd(z10);
        this.zz.f19923rv.wqx(z10);
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.wqx.jd jdVar) {
        if (jdVar != null) {
            HashMap map = new HashMap();
            try {
                int i10 = this.f19414ju + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            jdVar.jpo(map);
        }
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

    private void jpo(long j10) {
        this.pdm = new CountDownTimer(j10, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.jpo.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                nmd.jpo("TTAD.AdScene", "onFinish: remainingTime = " + jpo.this.f19384se);
                jd jdVarXk = jpo.this.xk();
                jpo jpoVar = jpo.this;
                jdVarXk.jpo(jpoVar, jpoVar.jpo(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
                jpo.this.f19384se = j11;
                nmd.jpo("TTAD.AdScene", "onTick: remainingTime = " + jpo.this.f19384se);
            }
        }.start();
    }

    public final void jpo(boolean z10, int i10) {
        jpo(z10, false, i10);
    }

    public final void jpo(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        jpoVar.f19906dm.jpo(z10, z11, false, jpoVar.ree, i10);
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.f19380jd;
        if (jdVar == null) {
            return;
        }
        jdVar.jpo(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(boolean z10) {
        nmd.jpo("TTAD.AdScene", "onPlayableHappenInteraction()---" + this.f19417yd + " isHappenInteraction:" + z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(String str, JSONObject jSONObject) {
        jd jdVar;
        if (str == null || !"skipToNextAd".equals(str) || (jdVar = this.f19415qk) == null) {
            return;
        }
        jdVar.jd(this, jpo(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public boolean jpo(long j10, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.nmd nmdVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null) {
            return false;
        }
        jpoVar.f19911hx.jd(false);
        this.my = false;
        com.bytedance.sdk.openadsdk.cm.qk qkVarYd = yd();
        if (xyk() == null) {
            return false;
        }
        this.zz.hmu.jpo(xyk(), qkVarYd);
        Map<String, Object> mapZz = this.f19412jj.jj() ? zz() : null;
        wqx.jpo jpoVar2 = new wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.jpo.4
            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jd(long j11, int i10) {
                nmd.jpo("TTAD.AdScene", "onError() called with: totalPlayTime = [" + j11 + "], percent = [" + i10 + C3191e4.i.f36531e);
                jpo.this.jpo.removeMessages(300);
                com.bytedance.sdk.openadsdk.core.model.nmd nmdVar2 = jpo.this.zz.tic.prr;
                if (nmdVar2 != null) {
                    nmdVar2.yd();
                }
                if (jpo.this.zz.hmu.jj()) {
                    jpo.this.qk();
                    return;
                }
                jpo.this.zz.hmu.jr();
                if (jpo.this.f19412jj.jj()) {
                    jpo.this.zz.f19911hx.jpo(true);
                }
                jpo jpoVar3 = jpo.this;
                jpoVar3.f19415qk.jpo(jpoVar3, jpoVar3.jpo(3));
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jpo(long j11, int i10) {
                nmd.jpo("TTAD.AdScene", "onComplete() called with: totalPlayTime = [" + j11 + "], percent = [" + i10 + "], mVideoHasCompleted=" + jpo.this.my);
                jpo jpoVar3 = jpo.this;
                if (jpoVar3.my) {
                    return;
                }
                jpoVar3.my = true;
                boolean zJj = jpoVar3.f19412jj.jj();
                jpo.this.jpo.removeMessages(300);
                jpo.this.jr();
                jpo.this.zz.hmu.jpo(j11, j11);
                if (zJj) {
                    jpo.this.zz.f19911hx.jd(true);
                } else {
                    jpo.this.zz.f19916jr.set(true);
                }
                if (jpo.this.zz.f19914jd.jkt() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = jpo.this.zz;
                    if (jpoVar4.wqx) {
                        jpoVar4.f19919nq.wqx().wqx(jpo.this.zz.f19914jd);
                        prr.jd();
                    }
                }
                if (!zJj && jpo.this.zz.f19914jd.tf()) {
                    jpo.this.zz.f19914jd.pe(1);
                    jpo.this.zz.tic.sq();
                }
                if (jpo.this.zz.f19914jd.jkt() == 21 && !jpo.this.zz.f19914jd.prr()) {
                    jpo.this.zz.f19914jd.cm(true);
                    jpo.this.zz.tic.sq();
                }
                jd.my myVarJpo = jpo.this.jpo(5);
                myVarJpo.my = true;
                jpo jpoVar5 = jpo.this;
                jpoVar5.f19415qk.jpo(jpoVar5, myVarJpo);
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jpo() {
                nmd.jpo("TTAD.AdScene", "onTimeOut() called with: ");
                jpo.this.jpo.removeMessages(300);
                jpo.this.jr();
                jpo jpoVar3 = jpo.this;
                jpoVar3.f19415qk.jpo(jpoVar3, jpoVar3.jpo(6));
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jpo(long j11, long j12) throws NumberFormatException {
                yd ydVar;
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = jpo.this.zz;
                if (!jpoVar3.f19933ya && jpoVar3.hmu.jj()) {
                    jpo.this.zz.hmu.jd(true);
                }
                if (jpo.this.zz.f19934yd.get()) {
                    return;
                }
                jpo.this.jpo.removeMessages(300);
                if (j11 != jpo.this.zz.hmu.au()) {
                    jpo.this.jr();
                }
                if (jpo.this.zz.hmu.jj()) {
                    jpo.this.zz.hmu.jpo(j11, j12);
                    int i10 = (int) (j11 / 1000);
                    if ((jpo.this.zz.nmd.get() || jpo.this.zz.f19917ju.get()) && jpo.this.zz.hmu.jj()) {
                        jpo.this.zz.hmu.rq();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = jpo.this.zz;
                    if (jpoVar4.f19905cm) {
                        jpoVar4.tic.my(i10);
                    }
                    if (jpo.this.f19412jj.jj() && (ydVar = jpo.this.zz.f19911hx) != null && ydVar.jpo() != null) {
                        jpo.this.zz.f19911hx.jpo().setTime(String.valueOf(jpo.this.wqx), i10, 0, false);
                        jpo.this.zz.f19911hx.jpo().jpo(j11, j12);
                    }
                    jpo.this.jpo((j11 * 1.0f) / j12);
                    jpo.this.zz.jpo(true);
                }
            }
        };
        this.zz.hmu.jpo(jpoVar2);
        if (!this.f19412jj.jj() && (nmdVar = this.zz.tic.prr) != null) {
            nmdVar.jpo(jpoVar2);
        }
        return this.zz.hmu.jpo(j10, z10, mapZz, this.f19380jd);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.my.jpo
    public void jpo(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar, int i10) {
        jpo(z10, z11, z12, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(xyk xykVar, xyk xykVar2, jd.my myVar) {
        super.jpo(xykVar, xykVar2, myVar);
        if (xykVar == this && (xykVar2 instanceof my)) {
            int i10 = myVar.f19375jd;
            if (i10 == 3) {
                com.bytedance.sdk.openadsdk.component.reward.jpo.prr prrVar = this.zz.hmu;
                prrVar.jpo(!prrVar.nzb() ? 1 : 0, 2);
            } else if (i10 == 6) {
                com.bytedance.sdk.openadsdk.component.reward.jpo.prr prrVar2 = this.zz.hmu;
                prrVar2.jpo(!prrVar2.nzb() ? 1 : 0, !this.zz.hmu.nzb() ? 1 : 0);
            } else if (i10 == 5 && !dt.my(this.zz.f19914jd) && myVar.my) {
                this.zz.hmu.jpo("skip", true);
            }
            this.zz.duq.jpo(false);
            this.zz.duq.cm(false);
        }
    }

    public void jpo(float f10) {
        jd jdVar = this.f19415qk;
        if (jdVar == null) {
            return;
        }
        jdVar.jpo(f10);
        if (this.hmu || this.f19412jj.jkt() == 43 || f10 < this.f19412jj.vrc() / 100.0f) {
            return;
        }
        xyk xykVarRq = this.f19415qk.rq();
        if (xykVarRq instanceof jpo) {
            ((jpo) xykVarRq).tu();
        }
    }

    public jd.my jpo(int i10) {
        jd.my myVar = new jd.my(i10, this.zz);
        myVar.f19374cm = this.zz.huv;
        return myVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(Map<String, Object> map, float f10, float f11) {
        super.jpo(map, f10, f11);
        this.f19415qk.jpo(map, this, f10, f11);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(dt dtVar, int i10, int i11) {
        super.jpo(dtVar, i10, i11);
        ota();
        this.f19378dt = false;
        this.f19383rv = true;
    }
}
