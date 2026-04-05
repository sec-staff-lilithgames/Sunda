package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rq;
import com.bytedance.sdk.openadsdk.utils.pdm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.common.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends com.bytedance.sdk.openadsdk.core.jj.wqx {

    /* renamed from: cm, reason: collision with root package name */
    private long f19725cm;

    /* renamed from: jd, reason: collision with root package name */
    protected boolean f19726jd;

    /* renamed from: jj, reason: collision with root package name */
    private Runnable f19727jj;
    protected ju jpo;
    private Runnable my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f19728qk;
    private int wqx;
    private int xyk;

    public Cif(Context context) {
        super(context);
        this.f19725cm = 10L;
        this.f19726jd = true;
        this.f19728qk = false;
        this.xyk = 1;
        wqx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(int i10) {
        ju juVar = this.jpo;
        if (juVar != null) {
            juVar.jpo(i10);
        }
        if (i10 == 100 && this.f19726jd) {
            jd();
        }
    }

    private void wqx() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    public ju getLoadingStyle() {
        return this.jpo;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wqx(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.my;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.my = null;
        }
    }

    public void setOnlyLoading(boolean z10) {
        this.f19728qk = z10;
    }

    private void wqx(int i10) {
        if (this.xyk != i10) {
            this.xyk = i10;
        }
    }

    public void jpo(dt dtVar) {
        rq rqVarNmd;
        if (dtVar != null && (rqVarNmd = dtVar.nmd()) != null) {
            this.f19725cm = rqVarNmd.jpo();
        }
        ju juVar = new ju(getContext());
        this.jpo = juVar;
        View viewJpo = juVar.jpo();
        if (viewJpo.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewJpo.getParent()).removeView(viewJpo);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewJpo.setLayoutParams(layoutParams);
        if (dtVar != null) {
            boolean zZrw = dtVar.zrw();
            com.bytedance.sdk.openadsdk.core.widget.sq sqVarJd = this.jpo.jd();
            if (sqVarJd != null) {
                if (!this.f19728qk && !zZrw) {
                    com.bytedance.sdk.openadsdk.core.model.opi opiVarOu = (dtVar.ou() == null || TextUtils.isEmpty(dtVar.ou().jpo())) ? null : dtVar.ou();
                    if (opiVarOu != null && !TextUtils.isEmpty(opiVarOu.jpo())) {
                        try {
                            com.bytedance.sdk.openadsdk.zz.cm.jpo(opiVarOu).wqx(1).jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, opiVarOu.jpo(), new pdm(sqVarJd)));
                        } catch (Throwable unused) {
                        }
                    } else {
                        sqVarJd.setVisibility(8);
                    }
                } else {
                    sqVarJd.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.jj.xyk xykVarWqx = this.jpo.wqx();
            if (xykVarWqx != null) {
                if (!this.f19728qk && !zZrw) {
                    if (!TextUtils.isEmpty(dtVar.ozw())) {
                        xykVarWqx.setText(dtVar.ozw());
                    } else {
                        xykVarWqx.setVisibility(8);
                    }
                } else {
                    xykVarWqx.setText("Loading");
                }
            }
        }
        addView(viewJpo);
        wqx(getResources().getConfiguration().orientation);
    }

    public void jd() {
        this.wqx = 0;
        ju juVar = this.jpo;
        if (juVar != null) {
            removeView(juVar.jpo);
            this.jpo.cm();
        }
        setVisibility(8);
        this.jpo = null;
        Runnable runnable = this.my;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f19727jj;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f19727jj = null;
        this.my = null;
    }

    public void jpo() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.if.1
            @Override // java.lang.Runnable
            public void run() {
                Cif cif = Cif.this;
                if (cif.jpo != null) {
                    cif.setVisibility(0);
                }
            }
        });
        if (this.my == null) {
            this.my = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.if.2
                @Override // java.lang.Runnable
                public void run() {
                    Cif.this.jd();
                }
            };
        }
        postDelayed(this.my, this.f19725cm * 1000);
    }

    public void jpo(int i10) {
        if (i10 == 100 || Math.abs(i10 - this.wqx) >= 7) {
            this.wqx = i10;
            if (com.bykv.vk.openvk.jpo.jpo.jd.jd.jpo.jpo()) {
                jd(this.wqx);
                return;
            }
            if (this.f19727jj == null) {
                this.f19727jj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.if.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Cif cif = Cif.this;
                        cif.jd(cif.wqx);
                    }
                };
            }
            post(this.f19727jj);
        }
    }
}
