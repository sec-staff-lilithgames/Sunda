package com.bytedance.sdk.openadsdk.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.jr;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.widget.jpo.jj;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {

    /* renamed from: cm, reason: collision with root package name */
    private String f19178cm;

    /* renamed from: jd, reason: collision with root package name */
    private dt f19179jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f19180jj;
    jpo jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jj f19181ju;
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private String f19182qk;
    private ef wqx;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.cm f19183yd;
    private Cif zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo();
    }

    private void wqx() {
        ef efVar = new ef(this);
        this.wqx = efVar;
        efVar.jd(this.f19181ju).wqx(this.f19178cm).cm(this.my).jpo(this.f19179jd).jd(this.f19180jj).jpo(this.f19179jd.np()).my(this.f19179jd.sd()).jpo(this.f19181ju).jd("landingpage_split_ceiling");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!oya.my()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.f19180jj = intent.getIntExtra("source", -1);
        dt dtVarJpo = pdm.jpo().jpo(pdm.jpo(intent));
        this.f19179jd = dtVarJpo;
        if (dtVarJpo == null) {
            finish();
            return;
        }
        this.f19182qk = dtVarJpo.zz();
        this.f19178cm = this.f19179jd.fc();
        this.my = this.f19179jd.fxd();
        this.f19180jj = this.f19179jd.gmx().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(this);
        jpo(this, wqxVar);
        setContentView(wqxVar);
        wqx();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Cif cif = this.zz;
        if (cif != null) {
            cif.xyk();
        }
    }

    private void jpo(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar;
        this.f19181ju = new com.bytedance.sdk.component.zz.jj(context);
        frameLayout.addView(this.f19181ju, new FrameLayout.LayoutParams(-1, -1));
        View viewJd = com.bytedance.sdk.openadsdk.core.widget.jj.jd(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = va.jd(context, 18.0f);
        layoutParams.rightMargin = va.jd(context, 18.0f);
        frameLayout.addView(viewJd, layoutParams);
        final int iQk = this.f19179jd.tu().qk();
        if (iQk != 3) {
            cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(va.jd(context, 28.0f), va.jd(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = va.jd(context, 18.0f);
            layoutParams2.leftMargin = va.jd(context, 18.0f);
            int iJd = va.jd(context, 5.0f);
            cmVar.setPadding(iJd, iJd, iJd, iJd);
            cmVar.setScaleType(ImageView.ScaleType.FIT_XY);
            cmVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
            cmVar.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(cmVar, layoutParams2);
        } else {
            cmVar = null;
        }
        rq.jpo(this.f19181ju, this.f19182qk);
        final WebView webView = this.f19181ju.getWebView();
        viewJd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        Cif cif = new Cif(this.f19179jd, webView, true);
        this.zz = cif;
        cif.jpo("landingpage_split_ceiling");
        final jj.jpo jpoVar = this.zz.jpo;
        if (cmVar != null) {
            cmVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i10 = iQk;
                    if (i10 == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i10 != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    jj.jpo jpoVar2 = jpoVar;
                    if (jpoVar2 != null) {
                        jpoVar2.jpo();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.cm cmVarJpo = tic.jpo(this.f19179jd, this.f19181ju, this, "landingpage_split_ceiling");
        this.f19183yd = cmVarJpo;
        if (cmVarJpo != null) {
            cmVarJpo.jpo("landingpage_split_ceiling");
            this.f19183yd.jpo();
        }
        tic.jpo(this.f19179jd, this.f19181ju, true);
        this.jpo = new jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.jpo
            public void jpo() {
                if (TTCeilingLandingPageActivity.this.f19179jd.tu().xyk() == jr.f20700jd) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.widget.jpo.my(this, this.wqx, this.f19178cm, this.f19183yd, this.zz, true, true, this.jpo) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        myVar.jpo(this.f19179jd);
        com.bytedance.sdk.openadsdk.core.widget.jpo.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(this.wqx, this.zz, this.f19183yd) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i10) {
                super.onProgressChanged(webView2, i10);
            }
        };
        com.bytedance.sdk.component.zz.jj jjVar = this.f19181ju;
        if (jjVar != null) {
            jjVar.setWebViewClient(myVar);
            this.f19181ju.setWebChromeClient(cmVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.zz == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.zz.jpo(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    if (TTCeilingLandingPageActivity.this.zz != null) {
                        TTCeilingLandingPageActivity.this.zz.jd(i11);
                    }
                }
            });
        }
    }
}
