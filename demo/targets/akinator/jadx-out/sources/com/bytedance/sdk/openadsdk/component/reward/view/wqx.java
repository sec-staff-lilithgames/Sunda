package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.sdk.openadsdk.core.zz.jpo {

    /* renamed from: au, reason: collision with root package name */
    private boolean f20048au;
    private int hna;
    private float jpo;

    /* renamed from: jr, reason: collision with root package name */
    private FrameLayout f20049jr;
    private com.bytedance.sdk.openadsdk.core.wqx.my nmd;
    private View opi;
    private int oya;
    private int prr;

    /* renamed from: sq, reason: collision with root package name */
    private View f20050sq;

    public wqx(Context context, String str) {
        super(context, str);
        this.hna = 1;
        this.f21072jd = context;
    }

    private void au() {
        com.bytedance.sdk.openadsdk.oya.zz zzVar = new com.bytedance.sdk.openadsdk.oya.zz(this.f21072jd);
        this.f20050sq = zzVar;
        jd(zzVar);
        cm();
        jj();
    }

    private float getHeightDp() {
        return va.wqx(this.f21072jd, va.m499if(this.f21072jd));
    }

    private float getWidthDp() {
        return va.wqx(this.f21072jd, va.au(this.f21072jd));
    }

    /* renamed from: if, reason: not valid java name */
    private void m447if() {
        com.bytedance.sdk.openadsdk.oya.qk qkVar = new com.bytedance.sdk.openadsdk.oya.qk(this.f21072jd);
        this.f20050sq = qkVar;
        jd(qkVar);
        cm();
    }

    private void ju() {
        View myVar = new com.bytedance.sdk.openadsdk.oya.my(this.f21072jd);
        this.f20050sq = myVar;
        jd(myVar);
        this.f20049jr = (FrameLayout) this.f20050sq.findViewById(hna.kgu);
        ImageView imageView = (ImageView) this.f20050sq.findViewById(hna.jrx);
        TextView textView = (TextView) this.f20050sq.findViewById(hna.f21536lq);
        View viewFindViewById = this.f20050sq.findViewById(520093739);
        jpo(this.f20049jr, imageView);
        textView.setText(getDescription());
        wqx(this.f20049jr);
        wqx(imageView);
        wqx(textView);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.wqx);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.wqx.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.jpo(((com.bytedance.sdk.openadsdk.core.zz.jpo) wqx.this).f21072jd, ((com.bytedance.sdk.openadsdk.core.zz.jpo) wqx.this).wqx, ((com.bytedance.sdk.openadsdk.core.zz.jpo) wqx.this).f21073jj);
                } catch (Throwable th2) {
                    nmd.wqx("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void qk() {
        com.bytedance.sdk.openadsdk.oya.jd jdVar = new com.bytedance.sdk.openadsdk.oya.jd(this.f21072jd);
        this.f20050sq = jdVar;
        jd(jdVar);
        cm();
        jj();
    }

    private void xyk() {
        com.bytedance.sdk.openadsdk.oya.cm cmVar = new com.bytedance.sdk.openadsdk.oya.cm(this.f21072jd);
        this.f20050sq = cmVar;
        jd(cmVar);
        cm();
    }

    private void yd() {
        com.bytedance.sdk.openadsdk.oya.xyk xykVar = new com.bytedance.sdk.openadsdk.oya.xyk(this.f21072jd);
        this.f20050sq = xykVar;
        jd(xykVar);
        cm();
    }

    private void zz() {
        com.bytedance.sdk.openadsdk.oya.jj jjVar = new com.bytedance.sdk.openadsdk.oya.jj(this.f21072jd);
        this.f20050sq = jjVar;
        jd(jjVar);
        cm();
        jj();
    }

    public FrameLayout getVideoContainer() {
        return this.f20049jr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.jpo
    public void jpo(View view, int i10, com.bytedance.sdk.openadsdk.core.model.hna hnaVar) {
    }

    public void setDownloadListener(com.bytedance.sdk.openadsdk.core.wqx.my myVar) {
        this.nmd = myVar;
    }

    public void setIsMute(boolean z10) {
        this.f20048au = z10;
        View view = this.opi;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.au.jd.jj)) {
            ((com.bytedance.sdk.openadsdk.core.au.jd.jj) view).jpo(z10, "interactionStyle");
        }
    }

    private void cm() {
        this.f20049jr = (FrameLayout) this.f20050sq.findViewById(hna.kgu);
        ImageView imageView = (ImageView) this.f20050sq.findViewById(hna.ez);
        sq sqVar = (sq) this.f20050sq.findViewById(hna.ykp);
        TextView textView = (TextView) this.f20050sq.findViewById(hna.vzb);
        TextView textView2 = (TextView) this.f20050sq.findViewById(hna.rzi);
        View viewFindViewById = this.f20050sq.findViewById(520093739);
        if (!TextUtils.isEmpty(this.wqx.clt())) {
            textView2.setText(this.wqx.clt());
        }
        jpo(this.f20049jr, imageView);
        if (this.wqx.ou() != null && !TextUtils.isEmpty(this.wqx.ou().jpo())) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.wqx.ou().jpo(), this.wqx.ou().jd(), this.wqx.ou().wqx(), sqVar, this.wqx);
        }
        textView.setText(getTitle());
        wqx(this.f20049jr);
        wqx(imageView);
        wqx(sqVar);
        wqx(textView);
        wqx(textView2);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.wqx);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.wqx.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.jpo(((com.bytedance.sdk.openadsdk.core.zz.jpo) wqx.this).f21072jd, ((com.bytedance.sdk.openadsdk.core.zz.jpo) wqx.this).wqx, ((com.bytedance.sdk.openadsdk.core.zz.jpo) wqx.this).f21073jj);
                } catch (Throwable th2) {
                    nmd.wqx("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void jd() {
        this.f21075qk = va.jd(this.f21072jd, this.oya);
        this.xyk = va.jd(this.f21072jd, this.prr);
        int i10 = (int) (this.jpo * 1000.0f);
        if (this.hna == 1) {
            if (i10 == 666) {
                my();
                return;
            }
            if (i10 == 1000) {
                wqx();
                return;
            }
            if (i10 == 1500) {
                ju();
                return;
            } else if (i10 == 1777) {
                au();
                return;
            } else {
                jpo(0.562f);
                m447if();
                return;
            }
        }
        if (i10 == 562) {
            zz();
            return;
        }
        if (i10 == 666) {
            qk();
            return;
        }
        if (i10 == 1000) {
            wqx();
        } else if (i10 == 1500) {
            xyk();
        } else {
            jpo(1.777f);
            yd();
        }
    }

    private void jj() {
        TextView textView = (TextView) this.f20050sq.findViewById(hna.f21524gf);
        if (textView != null) {
            textView.setText(getDescription());
            wqx(textView);
        }
    }

    private void my() {
        com.bytedance.sdk.openadsdk.oya.wqx wqxVar = new com.bytedance.sdk.openadsdk.oya.wqx(this.f21072jd);
        this.f20050sq = wqxVar;
        jd(wqxVar);
        cm();
        jj();
    }

    private void wqx() {
        com.bytedance.sdk.openadsdk.oya.jpo jpoVar = new com.bytedance.sdk.openadsdk.oya.jpo(this.f21072jd);
        this.f20050sq = jpoVar;
        jd(jpoVar);
        cm();
        jj();
    }

    public void jpo(dt dtVar, float f10, int i10, int i11, int i12) {
        this.jpo = f10;
        this.hna = i10;
        this.wqx = dtVar;
        this.f21073jj = "fullscreen_interstitial_ad";
        this.oya = i11;
        this.prr = i12;
        jpo(this.zz);
        jd();
    }

    private void wqx(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.wqx.jd jpoVar = this.nmd;
        if (jpoVar == null) {
            Context context = this.f21072jd;
            dt dtVar = this.wqx;
            String str = this.f21073jj;
            jpoVar = new com.bytedance.sdk.openadsdk.core.wqx.jpo(context, dtVar, str, tic.jpo(str));
            jpoVar.jpo(jpo(this.wqx, this.f21072jd));
        }
        view.setOnTouchListener(jpoVar);
        view.setOnClickListener(jpoVar);
    }

    private void jpo(FrameLayout frameLayout, ImageView imageView) {
        dt dtVar = this.wqx;
        if (dtVar == null) {
            return;
        }
        boolean zMy = dt.my(dtVar);
        if (this.wqx.ww() != null && zMy) {
            va.jpo((View) imageView, 8);
            va.jpo((View) frameLayout, 0);
        } else {
            jpo(imageView);
            va.jpo((View) imageView, 0);
            va.jpo((View) frameLayout, 8);
        }
    }

    private void jd(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    private void jpo(ImageView imageView) {
        List<opi> listFri;
        opi opiVar;
        dt dtVar = this.wqx;
        if (dtVar == null || (listFri = dtVar.fri()) == null || listFri.size() <= 0 || (opiVar = listFri.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zz.cm.jpo(opiVar).wqx(1).jpo(com.bytedance.sdk.openadsdk.zz.wqx.jpo(this.wqx, opiVar.jpo(), imageView));
    }

    public View getInteractionStyleRootView() {
        return this;
    }

    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jpo(dt dtVar, Context context) {
        if (dtVar != null && dtVar.pzk() == 4) {
            return new com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm(context, this.f21073jj);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(float r10) {
        /*
            r9 = this;
            float r0 = r9.getHeightDp()
            float r1 = r9.getWidthDp()
            int r2 = r9.hna
            r3 = 2
            if (r2 != r3) goto L16
            float r2 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.min(r0, r1)
            goto L1e
        L16:
            float r2 = java.lang.Math.min(r0, r1)
            float r0 = java.lang.Math.max(r0, r1)
        L1e:
            int r1 = r9.hna
            if (r1 == r3) goto L38
            android.content.Context r1 = r9.f21072jd
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = com.bytedance.sdk.openadsdk.utils.va.wqx(r1)
            if (r1 == 0) goto L38
            android.content.Context r1 = r9.f21072jd
            float r4 = com.bytedance.sdk.openadsdk.utils.va.jpo()
            int r1 = com.bytedance.sdk.openadsdk.utils.va.wqx(r1, r4)
            float r1 = (float) r1
            float r0 = r0 - r1
        L38:
            int r1 = r9.hna
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = 1101004800(0x41a00000, float:20.0)
            r7 = 20
            r8 = 0
            if (r1 == r3) goto L5b
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L71
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 == 0) goto L71
            float r2 = r2 - r6
            float r2 = r2 - r6
            float r2 = r2 / r10
            float r0 = r0 - r2
            float r0 = r0 / r4
            float r10 = java.lang.Math.max(r0, r8)
            int r10 = (int) r10
            r0 = r7
            r1 = r0
            r7 = r10
            goto L75
        L5b:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L71
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 == 0) goto L71
            float r0 = r0 - r6
            float r0 = r0 - r6
            float r0 = r0 * r10
            float r2 = r2 - r0
            float r2 = r2 / r4
            float r10 = java.lang.Math.max(r2, r8)
            int r10 = (int) r10
            r0 = r10
            r1 = r0
            r10 = r7
            goto L75
        L71:
            r7 = 0
            r10 = r7
            r0 = r10
            r1 = r0
        L75:
            android.content.Context r2 = r9.f21072jd
            float r3 = (float) r7
            int r2 = com.bytedance.sdk.openadsdk.utils.va.jd(r2, r3)
            android.content.Context r3 = r9.f21072jd
            float r10 = (float) r10
            int r10 = com.bytedance.sdk.openadsdk.utils.va.jd(r3, r10)
            android.content.Context r3 = r9.f21072jd
            float r0 = (float) r0
            int r0 = com.bytedance.sdk.openadsdk.utils.va.jd(r3, r0)
            android.content.Context r3 = r9.f21072jd
            float r1 = (float) r1
            int r1 = com.bytedance.sdk.openadsdk.utils.va.jd(r3, r1)
            android.content.Context r3 = r9.f21072jd
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.setPadding(r0, r2, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.view.wqx.jpo(float):void");
    }
}
