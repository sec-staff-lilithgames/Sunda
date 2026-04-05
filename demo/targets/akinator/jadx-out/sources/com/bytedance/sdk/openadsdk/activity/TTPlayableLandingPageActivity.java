package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tic;
import com.bytedance.sdk.openadsdk.core.widget.yd;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.nmd.qk;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements hx.jpo, com.bytedance.sdk.openadsdk.core.au.cm.jd, com.bytedance.sdk.openadsdk.core.wqx.cm {
    private static final qk.jpo vrc = new qk.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
    };

    /* renamed from: au, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f19217au;
    private ILoader duq;
    private dt hmu;
    private String hna;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f19222hx;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f88if;

    /* renamed from: jd, reason: collision with root package name */
    TTAdDislikeToast f19223jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jj f19224jj;
    rv jpo;

    /* renamed from: jr, reason: collision with root package name */
    private ef f19225jr;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f19226ju;
    private int nmd;
    private com.bytedance.sdk.openadsdk.nmd.xyk nzb;
    private ef opi;
    private Context oya;
    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj pdm;

    /* renamed from: pe, reason: collision with root package name */
    private boolean f19228pe;
    private yd prr;

    /* renamed from: rq, reason: collision with root package name */
    private String f19230rq;

    /* renamed from: se, reason: collision with root package name */
    private boolean f19232se;

    /* renamed from: sq, reason: collision with root package name */
    private String f19233sq;
    private com.bytedance.sdk.openadsdk.cm.cm.my tic;

    /* renamed from: tu, reason: collision with root package name */
    private String f19234tu;

    /* renamed from: uu, reason: collision with root package name */
    private String f19235uu;

    /* renamed from: va, reason: collision with root package name */
    private Cif f19236va;
    private com.bytedance.sdk.openadsdk.nmd.jpo.jpo xk;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f19229qk = true;
    private boolean zz = false;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f19237yd = true;
    final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: dt, reason: collision with root package name */
    private final String f19220dt = "embeded_ad";

    /* renamed from: nq, reason: collision with root package name */
    private final hx f19227nq = new hx(Looper.getMainLooper(), this);

    /* renamed from: rv, reason: collision with root package name */
    private final AtomicBoolean f19231rv = new AtomicBoolean(false);
    private final AtomicInteger sz = new AtomicInteger(0);
    private final AtomicInteger kln = new AtomicInteger(0);

    /* renamed from: ef, reason: collision with root package name */
    private final AtomicInteger f19221ef = new AtomicInteger(0);

    /* renamed from: dm, reason: collision with root package name */
    private boolean f19219dm = false;

    /* renamed from: cm, reason: collision with root package name */
    int f19218cm = -1;
    protected com.bytedance.sdk.openadsdk.p001if.my my = new com.bytedance.sdk.openadsdk.p001if.my() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.p001if.my
        public void jpo() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && com.bytedance.sdk.openadsdk.core.model.rv.m477if(TTPlayableLandingPageActivity.this.hmu) && com.bytedance.sdk.openadsdk.core.model.rv.au(TTPlayableLandingPageActivity.this.hmu)) {
                TTPlayableLandingPageActivity.this.f19227nq.removeMessages(2);
                TTPlayableLandingPageActivity.this.f19227nq.sendMessage(TTPlayableLandingPageActivity.this.jpo(1, 0));
            }
        }
    };
    private int roc = 1;

    private void au() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.tic;
        if (myVar != null) {
            myVar.xyk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jr() {
        TTAdDislikeToast tTAdDislikeToast = this.f19223jd;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void nmd() {
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.wqx.jpo(this, this.hmu, "embeded_ad", this.nmd) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo, com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
            public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) throws JSONException {
                dt dtVar = ((com.bytedance.sdk.openadsdk.core.wqx.jd) this).f20986jj;
                if (dtVar == null || dtVar.rxq() != 1 || z10) {
                    super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
                    TTPlayableLandingPageActivity.this.rq();
                    TTPlayableLandingPageActivity.this.f19232se = true;
                    TTPlayableLandingPageActivity.this.f19222hx = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.f19230rq);
                    } catch (JSONException e10) {
                        nmd.jpo("TTPWPActivity", "onClick JSON ERROR", e10);
                    }
                    com.bytedance.sdk.openadsdk.cm.wqx.jd(TTPlayableLandingPageActivity.this.hmu, ((com.bytedance.sdk.openadsdk.core.wqx.jd) this).f20989qk, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        jpoVar.jpo(this.pdm);
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar2 = this.xk;
        if (jpoVar2 != null) {
            jpoVar2.jpo(jpoVar);
        }
    }

    private void oya() {
        TTAdDislikeToast tTAdDislikeToast = this.f19223jd;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rq() {
        pdm.jpo().jd(this.hmu);
    }

    private void yd() {
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = this.f19226ju;
        if (cmVar != null) {
            cmVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.tic != null) {
                        TTPlayableLandingPageActivity.this.tic.xyk();
                    }
                    TTPlayableLandingPageActivity.this.f19227nq.sendMessage(TTPlayableLandingPageActivity.this.jpo(4, 0));
                    TTPlayableLandingPageActivity.this.jpo("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = this.f88if;
        if (cmVar2 != null) {
            cmVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.wqx();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar3 = this.f19217au;
        if (cmVar3 != null) {
            cmVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.f19219dm = !r2.f19219dm;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.jj(tTPlayableLandingPageActivity.f19219dm);
                    if (TTPlayableLandingPageActivity.this.nzb != null) {
                        TTPlayableLandingPageActivity.this.nzb.jpo(TTPlayableLandingPageActivity.this.f19219dm);
                    }
                }
            });
        }
    }

    private void zz() {
        int i10 = sq.cm().nq(String.valueOf(this.hmu.jl())).f20876sq;
        if (i10 >= 0) {
            this.f19227nq.sendEmptyMessageDelayed(1, i10 * 1000);
        } else {
            va.jpo((View) this.f19226ju, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void cm(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void et() {
        rq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public List<dt> hks() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public View hna() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        au();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (!oya.my()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            sq.jd(this);
            my();
        } catch (Throwable unused) {
        }
        jd(bundle);
        dt dtVar = this.hmu;
        if (dtVar == null) {
            return;
        }
        this.f19228pe = dtVar.cgk();
        int iOya = com.bytedance.sdk.openadsdk.core.model.rv.oya(this.hmu);
        if (iOya == 0) {
            setRequestedOrientation(14);
        } else if (iOya == 1) {
            setRequestedOrientation(1);
        } else if (iOya == 2) {
            setRequestedOrientation(0);
            this.roc = 2;
        }
        this.oya = this;
        try {
            setContentView(qk());
            yd();
            xyk();
            nmd();
            this.xk.jpo(this);
            this.xk.jpo(false, (com.bytedance.sdk.openadsdk.p001if.jj) null);
            zz();
            wqx.jpo.jpo(SystemClock.elapsedRealtime() - jElapsedRealtime, this.hmu, "embeded_ad", this.duq, this.f19235uu);
            com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.xk;
            if (jpoVar != null) {
                jpoVar.jpo();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pdm.jpo().wqx(this.hmu);
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.xk;
        if (jpoVar != null) {
            jpoVar.cm();
        }
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.tic;
        if (myVar != null) {
            myVar.jpo(true);
            this.tic.mo435if();
        }
        this.f19227nq.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.f19235uu)) {
            wqx.jpo.jpo(this.kln.get(), this.sz.get(), this.hmu);
        }
        com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.duq);
        com.bytedance.sdk.component.zz.jj jjVar = this.f19224jj;
        if (jjVar != null) {
            tic.jpo(jjVar.getWebView());
            this.f19224jj.hna();
        }
        this.f19224jj = null;
        ef efVar = this.opi;
        if (efVar != null) {
            efVar.m457if();
        }
        ef efVar2 = this.f19225jr;
        if (efVar2 != null) {
            efVar2.m457if();
        }
        com.bytedance.sdk.openadsdk.nmd.xyk xykVar = this.nzb;
        if (xykVar != null) {
            xykVar.duq();
        }
        Cif cif = this.f19236va;
        if (cif != null) {
            cif.cm(true);
        }
        rv rvVar = this.jpo;
        if (rvVar != null) {
            rvVar.jd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        ef efVar = this.opi;
        if (efVar != null) {
            efVar.jpo(false);
        }
        com.bytedance.sdk.openadsdk.nmd.xyk xykVar = this.nzb;
        if (xykVar != null) {
            xykVar.jpo(true);
            this.nzb.wqx(false);
        }
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.xk;
        if (jpoVar != null) {
            jpoVar.wqx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        ef efVar = this.opi;
        if (efVar != null) {
            efVar.ju();
            com.bytedance.sdk.component.zz.jj jjVar = this.f19224jj;
            if (jjVar != null) {
                this.opi.jpo(jjVar.getVisibility() == 0);
            }
        }
        ef efVar2 = this.f19225jr;
        if (efVar2 != null) {
            efVar2.ju();
        }
        com.bytedance.sdk.openadsdk.nmd.xyk xykVar = this.nzb;
        if (xykVar != null) {
            xykVar.wqx(true);
        }
        Cif cif = this.f19236va;
        if (cif != null) {
            cif.qk();
        }
        if (DeviceUtils.qk() == 0) {
            this.f19219dm = true;
        }
        jj(this.f19219dm);
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.xk;
        if (jpoVar != null) {
            jpoVar.jd();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iJpo = this.hmu != null ? pdm.jpo().jpo(this.hmu) : -1;
            this.f19218cm = iJpo;
            bundle.putInt("meta_index", iJpo);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f19218cm >= 0) {
            pdm.jpo().wqx(this.f19218cm);
            this.f19218cm = -1;
        }
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.tic;
        if (myVar != null) {
            myVar.yd();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.tic;
        if (myVar != null) {
            myVar.zz();
        }
        Cif cif = this.f19236va;
        if (cif != null) {
            cif.xyk();
        }
    }

    private View qk() {
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(this);
        wqxVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.xk = new com.bytedance.sdk.openadsdk.nmd.jpo.jpo(this.oya, this.hmu, this.roc, this.f19219dm, wqxVar, true);
        int iJd = va.jd(this, 5.0f);
        this.f19217au = new com.bytedance.sdk.openadsdk.core.jj.cm(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(va.jd(this, 28.0f), va.jd(this, 28.0f));
        layoutParams.rightMargin = va.jd(this, 56.0f);
        layoutParams.topMargin = va.jd(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.f19217au.setLayoutParams(layoutParams);
        this.f19217au.setPadding(iJd, iJd, iJd, iJd);
        this.f19217au.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = this.f19217au;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        cmVar.setScaleType(scaleType);
        this.f19217au.setImageDrawable(ju.jpo(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(this);
        this.f88if = cmVar2;
        cmVar2.setPadding(iJd, iJd, iJd, iJd);
        this.f88if.setScaleType(scaleType);
        this.f88if.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
        this.f88if.setImageResource(com.bytedance.sdk.component.utils.dt.cm(sq.jpo(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(va.jd(this, 28.0f), va.jd(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = va.jd(this, 16.0f);
        layoutParams2.topMargin = va.jd(this, 20.0f);
        this.f88if.setLayoutParams(layoutParams2);
        this.f19226ju = new com.bytedance.sdk.openadsdk.core.jj.cm(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(va.jd(this, 28.0f), va.jd(this, 28.0f));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = va.jd(this, 20.0f);
        layoutParams3.leftMargin = va.jd(this, 16.0f);
        this.f19226ju.setLayoutParams(layoutParams3);
        this.f19226ju.setPadding(iJd, iJd, iJd, iJd);
        this.f19226ju.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f19226ju.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
        this.f19226ju.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this, "tt_white_lefterbackicon_titlebar"));
        this.f19226ju.setVisibility(0);
        wqxVar.addView(this.f19217au);
        wqxVar.addView(this.f88if);
        wqxVar.addView(this.f19226ju);
        return wqxVar;
    }

    private void xyk() {
        if (this.hmu.pzk() == 4) {
            this.pdm = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this.oya, "interaction");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.cm
    public void my(boolean z10) {
        com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jjVar;
        this.f19232se = true;
        this.f19222hx = z10;
        if (!z10) {
            try {
                Toast.makeText(this.oya, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.f19222hx || (jjVar = this.pdm) == null) {
            return;
        }
        jjVar.wqx(this.hmu);
    }

    public void cm() {
        TTPlayableLandingPageActivity tTPlayableLandingPageActivity;
        dt dtVar = this.hmu;
        if (dtVar != null) {
            tTPlayableLandingPageActivity = this;
            tTPlayableLandingPageActivity.jpo = new com.bytedance.sdk.openadsdk.wqx.wqx(tTPlayableLandingPageActivity, dtVar.fxd(), this.hmu.pve(), "", this.hmu);
        } else {
            tTPlayableLandingPageActivity = this;
        }
        if (tTPlayableLandingPageActivity.f19223jd == null) {
            tTPlayableLandingPageActivity.f19223jd = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(tTPlayableLandingPageActivity.f19223jd);
        }
    }

    public void jj(boolean z10) {
        Drawable drawableJpo;
        try {
            this.f19219dm = z10;
            if (z10) {
                drawableJpo = ju.jpo(this.oya, "tt_mute_wrapper");
            } else {
                drawableJpo = ju.jpo(this.oya, "tt_unmute_wrapper");
            }
            this.f19217au.setImageDrawable(drawableJpo);
            com.bytedance.sdk.openadsdk.nmd.xyk xykVar = this.nzb;
            if (xykVar != null) {
                xykVar.jpo(z10);
            }
            com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.xk;
            if (jpoVar != null) {
                jpoVar.jpo(z10);
            }
        } catch (Exception e10) {
            nmd.wqx("TTPWPActivity", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(boolean z10) {
    }

    public void wqx() {
        if (this.hmu == null || isFinishing()) {
            return;
        }
        if (this.wqx.get()) {
            oya();
            return;
        }
        if (this.jpo == null) {
            cm();
        }
        this.jpo.jpo(new rv.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.rv.jpo
            public void jpo() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.rv.jpo
            public void jpo(int i10, String str) {
                if (TTPlayableLandingPageActivity.this.wqx.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.wqx.set(true);
                TTPlayableLandingPageActivity.this.jr();
            }
        });
        rv rvVar = this.jpo;
        if (rvVar != null) {
            rvVar.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean jpo() {
        return true;
    }

    private void jd(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                this.f19230rq = intent.getStringExtra("url");
                this.nmd = intent.getIntExtra("source", -1);
                this.f19232se = intent.getBooleanExtra("ad_pending_download", false);
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.hmu = com.bytedance.sdk.openadsdk.core.jd.jpo(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        nmd.jpo("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e10);
                    }
                }
                this.hna = intent.getStringExtra("adid");
                this.f19233sq = intent.getStringExtra("log_extra");
                this.f19235uu = intent.getStringExtra("gecko_id");
                this.f19234tu = intent.getStringExtra("web_title");
            } else {
                dt dtVarJpo = pdm.jpo().jpo(pdm.jpo(intent));
                this.hmu = dtVarJpo;
                if (dtVarJpo != null) {
                    this.f19230rq = dtVarJpo.zz();
                    this.nmd = this.hmu.ju();
                    this.f19232se = this.hmu.au();
                    this.hna = this.hmu.fc();
                    this.f19233sq = this.hmu.fxd();
                    this.f19235uu = this.hmu.afh();
                    this.f19234tu = this.hmu.ozw();
                }
            }
        }
        if (bundle != null) {
            try {
                dt dtVarJpo2 = pdm.jpo().jpo(bundle.getInt("meta_index", -1));
                this.hmu = dtVarJpo2;
                if (dtVarJpo2 != null) {
                    this.hna = dtVarJpo2.fc();
                    this.f19233sq = this.hmu.fxd();
                    this.f19235uu = this.hmu.afh();
                    this.f19234tu = this.hmu.ozw();
                    this.f19230rq = this.hmu.zz();
                    this.nmd = this.hmu.ju();
                    this.f19232se = this.hmu.au();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.hmu == null) {
            finish();
            return;
        }
        try {
            this.f19219dm = sq.cm().hna(this.hmu.gmx().getCodeId());
        } catch (Throwable th2) {
            nmd.wqx("TTPWPActivity", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public boolean jpo(long j10, boolean z10) {
        return false;
    }

    public void my() {
        va.jpo((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                va.jpo((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        nmd.wqx("TTPWPActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message jpo(int i10, int i11) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i10;
        if (i10 == 3) {
            messageObtain.arg2 = i11;
        }
        return messageObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str) {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), this.hmu, "embeded_ad", str);
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) throws JSONException {
        int i10 = message.what;
        if (i10 == 1) {
            va.jpo((View) this.f19226ju, 0);
            return;
        }
        if (i10 != 2) {
            return;
        }
        yd ydVar = this.prr;
        if (ydVar == null || !ydVar.cm()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i11 = message.arg2;
                if (i11 != 0) {
                    jSONObject.put("remove_loading_page_reason", i11);
                }
                jSONObject.put("playable_url", this.f19230rq);
                yd ydVar2 = this.prr;
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, ydVar2 != null ? ydVar2.getDisplayDuration() : 0L);
            } catch (JSONException e10) {
                nmd.jpo("TTPWPActivity", "handleMsg json error", e10);
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jd(this.hmu, "embeded_ad", "remove_loading_page", jSONObject);
            this.f19227nq.removeMessages(2);
            yd ydVar3 = this.prr;
            if (ydVar3 != null) {
                ydVar3.wqx();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void dm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void ef() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    /* renamed from: if */
    public void mo426if() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void ju() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void opi() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void prr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void rxq() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void sq() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void tic() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void jd() {
        au();
    }
}
