package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.cm.jd;
import com.bytedance.sdk.openadsdk.component.reward.au;
import com.bytedance.sdk.openadsdk.component.reward.jpo.ju;
import com.bytedance.sdk.openadsdk.component.reward.jpo.prr;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import com.bytedance.sdk.openadsdk.core.dm;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.model.uu;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.sz;
import com.bytedance.sdk.openadsdk.utils.va;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements hx.jpo, com.bytedance.sdk.openadsdk.core.au.cm.jd {

    /* renamed from: au, reason: collision with root package name */
    private boolean f19170au;

    /* renamed from: cm, reason: collision with root package name */
    final hx f19171cm;
    private final AtomicBoolean hna;

    /* renamed from: if, reason: not valid java name */
    private final AtomicBoolean f85if;

    /* renamed from: jd, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo f19172jd;

    /* renamed from: jj, reason: collision with root package name */
    int f19173jj;
    public final String jpo;

    /* renamed from: ju, reason: collision with root package name */
    protected boolean f19174ju;
    protected IListenerManager my;
    private int oya;
    private final ju.jd prr;

    /* renamed from: qk, reason: collision with root package name */
    boolean f19175qk;
    protected com.bytedance.sdk.openadsdk.component.reward.jd.jd wqx;

    /* renamed from: yd, reason: collision with root package name */
    int f19176yd;
    protected sz zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo implements Runnable {

        /* renamed from: jd, reason: collision with root package name */
        AdSlot f19177jd;
        boolean jpo;

        public jpo(boolean z10, AdSlot adSlot) {
            this.jpo = z10;
            this.f19177jd = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.jpo) {
                au.jpo(sq.jpo()).jpo(this.f19177jd);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.my.jpo(sq.jpo()).jpo(this.f19177jd);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.jpo = nmd() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.f85if = new AtomicBoolean(false);
        this.f19171cm = new hx(Looper.getMainLooper(), this);
        this.f19170au = false;
        this.oya = 0;
        this.f19176yd = 1;
        this.prr = new ju.jd();
        this.f19174ju = false;
        this.hna = new AtomicBoolean(false);
    }

    private void rv() {
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        this.wqx.se();
        this.f19173jj = (int) this.f19172jd.hmu.duq();
        jr();
        qk();
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = this.f19172jd.f19914jd.kc();
        if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        cmVarJpo.jpo(0L);
    }

    private boolean sz() {
        if (this.f19172jd.f19934yd.get() && this.f19172jd.f19921qk) {
            return false;
        }
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f19172jd.f19934yd.get();
        }
        return true;
    }

    private void uu() {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar;
        if (this.f19172jd == null || (jdVar = this.wqx) == null) {
            super.onBackPressed();
        } else {
            jdVar.tu();
        }
    }

    public void au() {
        Message message = new Message();
        message.what = 400;
        if (nmd()) {
            jd(10000);
        }
        this.f19171cm.sendMessageDelayed(message, 2000L);
    }

    public abstract void cm();

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void cm(boolean z10) {
    }

    public void dt() {
        dt dtVar;
        uu uuVarFmg;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || (dtVar = jpoVar.f19914jd) == null || (uuVarFmg = dtVar.fmg()) == null) {
            return;
        }
        if (uuVarFmg.jd() == 1 || uuVarFmg.jd() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.f19172jd;
            sz szVar = new sz(jpoVar2, jpoVar2.f19914jd);
            this.zz = szVar;
            prr prrVar = this.f19172jd.hmu;
            if (prrVar != null) {
                prrVar.jpo(szVar);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void ef() {
        this.f19174ju = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f19172jd == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.hx.my()) {
            va.jd((Activity) this);
        }
        if (!rv.my(this.f19172jd.f19914jd) || this.f19172jd.f19924se.my(com.bytedance.sdk.openadsdk.component.reward.jpo.xyk.f19977jd)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public List<dt> hks() {
        return this.f19172jd.f19914jd.dsh();
    }

    public void hmu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public View hna() {
        return this.f19172jd.hmu.tic();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    /* renamed from: if, reason: not valid java name */
    public void mo426if() {
        my();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void jd() {
        uu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jj() {
    }

    public abstract void jpo(long j10, long j11);

    public void jpo(Intent intent) {
    }

    public abstract void jr();

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final void ju() {
        if (this.hna.compareAndSet(false, true)) {
            nmd.jpo("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            xyk();
        }
    }

    public void my() {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.au();
    }

    public abstract boolean nmd();

    public void nq() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null) {
            return;
        }
        jpoVar.pdm.jpo();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        uu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        super.onCreate(bundle);
        nmd.jpo("BVA", "onCreate ".concat(String.valueOf(this)));
        sq.jd(getApplicationContext());
        if (!oya.my()) {
            finish();
            return;
        }
        dt dtVarJpo = com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(getIntent(), bundle, this);
        if (dtVarJpo == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.jd.jpo(dtVarJpo);
        dtVarJpo.duq(String.valueOf(hashCode()));
        this.f19176yd = dtVarJpo.ll();
        jpo(dtVarJpo, bundle);
        if (bundle != null) {
            if (dtVarJpo.ef()) {
                this.hna.set(true);
            }
            if (dtVarJpo.tic() && (jpoVar = this.f19172jd) != null) {
                jpoVar.f19904au.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.f19172jd;
            if (jpoVar2 != null) {
                jpoVar2.f19923rv.qk();
            }
        }
        try {
            wqx();
            rv();
        } catch (Throwable th2) {
            nmd.jpo("TTAD.BVA", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.prr.wqx.jd();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        nmd.jpo("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || this.wqx == null) {
            return;
        }
        if (jpoVar.cql > 0 && jpoVar.f19904au.get()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.f19172jd.cql);
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.f19172jd;
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(strValueOf, jpoVar2.f19914jd, this.jpo, jpoVar2.hmu.my());
            this.f19172jd.cql = 0L;
        }
        this.f19172jd.sz.jd();
        this.f19171cm.removeCallbacksAndMessages(null);
        this.wqx.rq();
        com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.f19172jd.f19914jd);
        com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jd(this.f19172jd.f19914jd);
        AdSlot adSlotGmx = this.f19172jd.f19914jd.gmx();
        if (!this.f19172jd.hmu.sz() && adSlotGmx != null && TextUtils.isEmpty(adSlotGmx.getBidAdm()) && !this.f19172jd.f19914jd.rf()) {
            oya.jd().post(new jpo(nmd(), adSlotGmx));
        }
        com.bytedance.sdk.openadsdk.utils.prr.jpo();
        sz szVar = this.zz;
        if (szVar != null) {
            szVar.my();
            this.zz = null;
        }
        this.prr.jpo(this);
        dm.jpo().jpo(String.valueOf(hashCode()));
    }

    @Override // android.app.Activity
    public void onRestart() {
        dt dtVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || (dtVar = jpoVar.f19914jd) == null) {
            return;
        }
        if (this.xyk && !dtVar.yn() && !TextUtils.isEmpty(dt.jpo(this, dtVar))) {
            finish();
        }
        if (dtVar.yn()) {
            dtVar.ju(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar;
        super.onResume();
        nmd.jpo("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.f19172jd == null || (jdVar = this.wqx) == null) {
            return;
        }
        jdVar.sq();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        jpoVar.f19933ya = true;
        this.prr.jpo(this, jpoVar.sbx, jpoVar.jkt);
        if (sz()) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.f19172jd;
            jpoVar2.duq.jpo(jpoVar2.f19914jd.bl());
        }
        this.f19172jd.tic.prr();
        this.f19172jd.f19909ef.sq();
        this.f19172jd.f19924se.cm();
        if (this.wqx.jd()) {
            this.f19172jd.hmu.jpo(this.wqx);
            this.f19172jd.hmu.jpo(false, this, this.oya != 0);
        }
        this.oya++;
        zz();
        yd ydVar = this.f19172jd.f19911hx;
        if (ydVar != null) {
            ydVar.qk();
        }
        this.f19172jd.pdm.jpo(this.f19171cm);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (jpoVar.f19904au.get()) {
            this.f19172jd.f19914jd.qk(true);
        }
        if (this.hna.get()) {
            this.f19172jd.f19914jd.kln();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(this.f19172jd, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        nmd.jpo("BVA", "onStart ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null) {
            return;
        }
        jpoVar.f19909ef.se();
        com.bytedance.sdk.openadsdk.utils.cm.jpo(this, this.f19172jd.f19914jd);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        nmd.jpo("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.nmd();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.yd ydVar;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || (ydVar = jpoVar.f19923rv) == null) {
            return;
        }
        ydVar.jd(z10);
        this.f19172jd.f19923rv.wqx(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void opi() {
    }

    public void oya() {
        this.f19171cm.removeMessages(400);
    }

    public Map<String, Object> pdm() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void prr() {
        this.f19172jd.hmu.dm();
    }

    public void qk() {
        if (rv.wqx(this.f19172jd.f19914jd)) {
            jpo(false, jd.C0101jd.wqx);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar != null) {
            jdVar.jpo(this.f19172jd.tic.jj());
            this.wqx.nq();
        }
    }

    public abstract boolean rq();

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void rxq() {
    }

    public abstract FrameLayout se();

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void sq() {
        if (!this.f19172jd.oya.getAndSet(true) || rv.wqx(this.f19172jd.f19914jd)) {
            this.f19172jd.f19923rv.jpo();
        }
    }

    public boolean tu() {
        return false;
    }

    public void wqx() {
        setContentView(this.f19172jd.f19930va);
        this.f19172jd.f19930va.jpo(this.wqx);
        this.wqx.jpo(this, this.f19171cm);
        this.wqx.ju();
    }

    public abstract void xyk();

    public void yd() {
    }

    public void zz() {
        if (tu() && !this.f19170au) {
            this.f19170au = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = tTBaseVideoActivity.f19172jd;
                    jpoVar.f19929uu.jpo(jpoVar.pdm.jpo(tTBaseVideoActivity.f19176yd));
                    TTBaseVideoActivity.this.yd();
                }
            });
        }
    }

    public void hx() {
        if (!this.f19172jd.f19914jd.ic()) {
            if (!dt.my(this.f19172jd.f19914jd)) {
                this.f19172jd.hmu.jpo(SUvoXnn.qHIBxoZnVktk, true);
            }
            finish();
        } else if (!this.f19172jd.f19914jd.jj()) {
            this.f19172jd.duq.wqx();
        } else if (this.f19172jd.f19911hx.ju() == 1) {
            this.f19172jd.duq.wqx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        nmd.jpo(SFPXhf.kSbWygNTbQWx, "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.jr();
    }

    public void jpo(boolean z10, boolean z11) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean jpo() {
        return true;
    }

    private void jpo(dt dtVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = new com.bytedance.sdk.openadsdk.component.reward.jpo.jpo(this, this.f19171cm, dtVar, this, 0);
        this.f19172jd = jpoVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(jpoVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            jpo(intent);
            dtVar.jpo(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.f19172jd.f19910et) {
            cm();
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVarJpo = com.bytedance.sdk.openadsdk.component.reward.jd.jj.jpo(this.f19172jd);
        this.wqx = jdVarJpo;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.f19172jd;
        jpoVar2.ree = jdVarJpo;
        com.bytedance.sdk.openadsdk.utils.prr.jpo(jpoVar2);
        Objects.toString(this.wqx);
    }

    public void jpo(boolean z10, int i10) {
        jpo(z10, false, i10);
    }

    public void jpo(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.jpo(z10, z11, false, i10);
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.jpo(message);
    }

    public IListenerManager jpo(int i10) {
        if (this.my == null) {
            this.my = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo().jpo(i10));
        }
        return this.my;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public boolean jpo(long j10, boolean z10) {
        Cif cif;
        com.bytedance.sdk.openadsdk.core.model.nmd nmdVar;
        if (this.f19172jd == null) {
            return false;
        }
        this.f85if.set(false);
        com.bytedance.sdk.openadsdk.cm.qk qkVarMy = this.f19172jd.my();
        FrameLayout frameLayoutSe = se();
        if (frameLayoutSe == null) {
            return false;
        }
        this.f19172jd.hmu.jpo(frameLayoutSe, qkVarMy);
        Map<String, Object> mapPdm = pdm();
        wqx.jpo jpoVar = new wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jd(long j11, int i10) {
                com.bytedance.sdk.openadsdk.core.model.nmd nmdVar2;
                TTBaseVideoActivity.this.f19171cm.removeMessages(300);
                Cif cif2 = TTBaseVideoActivity.this.f19172jd.tic;
                if (cif2 != null && (nmdVar2 = cif2.prr) != null) {
                    nmdVar2.yd();
                }
                if (TTBaseVideoActivity.this.f19172jd.hmu.jj()) {
                    TTBaseVideoActivity.this.au();
                    return;
                }
                TTBaseVideoActivity.this.f19172jd.hmu.jr();
                TTBaseVideoActivity.this.hmu();
                if (TTBaseVideoActivity.this.f19172jd.f19914jd.jj()) {
                    TTBaseVideoActivity.this.f19172jd.f19911hx.jpo(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity.f19172jd.wqx) {
                    tTBaseVideoActivity.finish();
                    return;
                }
                tTBaseVideoActivity.jpo(false, true, 3);
                prr prrVar = TTBaseVideoActivity.this.f19172jd.hmu;
                prrVar.jpo(1 ^ (prrVar.nzb() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jpo(long j11, int i10) {
                com.bytedance.sdk.openadsdk.utils.oya oyaVar;
                com.bytedance.sdk.openadsdk.utils.oya oyaVar2;
                nmd.jpo("TTAD.BVA", "onComplete() called with: totalPlayTime = [" + j11 + "], percent = [" + i10 + "], mVideoHasCompleted=" + TTBaseVideoActivity.this.f85if.get());
                if (TTBaseVideoActivity.this.f85if.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.f85if.set(true);
                TTBaseVideoActivity.this.f19171cm.removeMessages(300);
                TTBaseVideoActivity.this.oya();
                TTBaseVideoActivity.this.hmu();
                TTBaseVideoActivity.this.f19172jd.hmu.jpo(j11, j11);
                boolean zJj = TTBaseVideoActivity.this.f19172jd.f19914jd.jj();
                if (zJj) {
                    TTBaseVideoActivity.this.f19172jd.f19911hx.jd(true);
                } else {
                    TTBaseVideoActivity.this.f19172jd.f19916jr.set(true);
                }
                TTBaseVideoActivity.this.nq();
                if (TTBaseVideoActivity.this.f19172jd.f19914jd.jkt() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = TTBaseVideoActivity.this.f19172jd;
                    if (jpoVar2.wqx) {
                        jpoVar2.f19919nq.wqx().wqx(TTBaseVideoActivity.this.f19172jd.f19914jd);
                        com.bytedance.sdk.openadsdk.utils.prr.jd();
                    }
                }
                if (zJj && TTBaseVideoActivity.this.f19172jd.f19914jd.tf()) {
                    TTBaseVideoActivity.this.f19172jd.f19914jd.pe(1);
                    TTBaseVideoActivity.this.f19172jd.tic.sq();
                }
                if (TTBaseVideoActivity.this.f19172jd.f19914jd.jkt() == 21 && !TTBaseVideoActivity.this.f19172jd.f19914jd.prr()) {
                    TTBaseVideoActivity.this.f19172jd.f19914jd.cm(true);
                    TTBaseVideoActivity.this.f19172jd.tic.sq();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.f19174ju && tTBaseVideoActivity.f19172jd.f19911hx.m448if()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.tu()) {
                    if (com.bytedance.sdk.openadsdk.core.model.nmd.cm(TTBaseVideoActivity.this.f19172jd.f19914jd) || com.bytedance.sdk.openadsdk.core.model.nmd.jd(TTBaseVideoActivity.this.f19172jd.f19914jd) || com.bytedance.sdk.openadsdk.core.model.nmd.qk(TTBaseVideoActivity.this.f19172jd.f19914jd)) {
                        TTBaseVideoActivity.this.jpo(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.nmd.jd(TTBaseVideoActivity.this.f19172jd.f19914jd) || (oyaVar2 = TTBaseVideoActivity.this.f19172jd.aix) == null) {
                            return;
                        }
                        oyaVar2.jpo(0L);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.nmd.jpo(TTBaseVideoActivity.this.f19172jd.f19914jd) && !TTBaseVideoActivity.this.f19172jd.hna.get()) {
                        TTBaseVideoActivity.this.f19172jd.jpo(true);
                        TTBaseVideoActivity.this.f19172jd.duq.my(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = tTBaseVideoActivity2.f19172jd;
                if (!jpoVar3.wqx) {
                    tTBaseVideoActivity2.hx();
                    return;
                }
                if (jpoVar3.f19914jd.ic()) {
                    if (!zJj) {
                        TTBaseVideoActivity.this.f19172jd.duq.wqx();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.f19172jd.f19911hx.ju() == 1) {
                            TTBaseVideoActivity.this.f19172jd.duq.wqx();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.jpo(false, 5);
                if (!zJj && com.bytedance.sdk.openadsdk.core.model.nmd.jd(TTBaseVideoActivity.this.f19172jd.f19914jd) && (oyaVar = TTBaseVideoActivity.this.f19172jd.aix) != null) {
                    oyaVar.jpo(0L);
                }
                if (dt.my(TTBaseVideoActivity.this.f19172jd.f19914jd)) {
                    return;
                }
                TTBaseVideoActivity.this.f19172jd.hmu.jpo("skip", true);
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jpo() {
                TTBaseVideoActivity.this.f19171cm.removeMessages(300);
                TTBaseVideoActivity.this.oya();
                TTBaseVideoActivity.this.hmu();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.f19172jd.wqx) {
                    tTBaseVideoActivity.jpo(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                prr prrVar = TTBaseVideoActivity.this.f19172jd.hmu;
                prrVar.jpo(!prrVar.nzb() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.f19172jd.hmu.nzb() ? 1 : 0));
                TTBaseVideoActivity.this.f19172jd.hmu.jr();
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
            public void jpo(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = TTBaseVideoActivity.this.f19172jd;
                if (!jpoVar2.f19933ya && jpoVar2.hmu.jj()) {
                    TTBaseVideoActivity.this.f19172jd.hmu.rq();
                }
                if (TTBaseVideoActivity.this.f19172jd.f19934yd.get()) {
                    return;
                }
                TTBaseVideoActivity.this.f19171cm.removeMessages(300);
                if (j11 != TTBaseVideoActivity.this.f19172jd.hmu.au()) {
                    TTBaseVideoActivity.this.oya();
                }
                if (!TTBaseVideoActivity.this.tu() || TTBaseVideoActivity.this.f19172jd.hmu.jj()) {
                    TTBaseVideoActivity.this.f19172jd.hmu.jpo(j11, j12);
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    long j13 = j11 / 1000;
                    tTBaseVideoActivity.f19173jj = (int) (tTBaseVideoActivity.f19172jd.hmu.duq() - j13);
                    int i10 = (int) j13;
                    if ((TTBaseVideoActivity.this.f19172jd.nmd.get() || TTBaseVideoActivity.this.f19172jd.f19917ju.get()) && TTBaseVideoActivity.this.f19172jd.hmu.jj()) {
                        TTBaseVideoActivity.this.f19172jd.hmu.rq();
                    }
                    if (TTBaseVideoActivity.this.nmd()) {
                        TTBaseVideoActivity.this.f19172jd.tic.my(i10);
                    }
                    if (TTBaseVideoActivity.this.rq()) {
                        if (TTBaseVideoActivity.this.f19172jd.hmu.cm()) {
                            sz szVar = TTBaseVideoActivity.this.zz;
                            if (szVar != null) {
                                szVar.jpo(j11);
                                return;
                            }
                            return;
                        }
                        sz szVar2 = TTBaseVideoActivity.this.zz;
                        if (szVar2 == null || !szVar2.jpo()) {
                            TTBaseVideoActivity.this.jpo(j11, j12);
                            return;
                        }
                        return;
                    }
                    TTBaseVideoActivity.this.jpo(j11, j12);
                }
            }
        };
        this.f19172jd.hmu.jpo(jpoVar);
        if (!this.f19172jd.f19914jd.jj() && (cif = this.f19172jd.tic) != null && (nmdVar = cif.prr) != null) {
            nmdVar.jpo(jpoVar);
        }
        boolean zJpo = this.f19172jd.hmu.jpo(j10, z10, mapPdm, this.wqx);
        jpo(zJpo, z10);
        return zJpo;
    }
}
