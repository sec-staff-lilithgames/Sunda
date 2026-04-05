package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.cm.ju;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.oya;
import com.bytedance.sdk.openadsdk.common.prr;
import com.bytedance.sdk.openadsdk.common.yd;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.jpo.jj;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.utils.zz;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {

    /* renamed from: au, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.jj f19193au;

    /* renamed from: dm, reason: collision with root package name */
    private boolean f19195dm;

    /* renamed from: dt, reason: collision with root package name */
    private String f19196dt;
    private com.bytedance.sdk.openadsdk.core.widget.jpo.my duq;

    /* renamed from: ef, reason: collision with root package name */
    private jj.jpo f19197ef;
    private ILoader hmu;
    private ef hna;

    /* renamed from: hx, reason: collision with root package name */
    private int f19198hx;

    /* renamed from: if, reason: not valid java name */
    private Button f87if;

    /* renamed from: jd, reason: collision with root package name */
    prr f19199jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jj f19200jj;
    Cif jpo;

    /* renamed from: jr, reason: collision with root package name */
    private dt f19201jr;

    /* renamed from: ju, reason: collision with root package name */
    private oya f19202ju;
    private com.bytedance.sdk.openadsdk.utils.oya kln;
    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj nmd;
    private com.bytedance.sdk.openadsdk.common.cm nzb;
    private String opi;
    private String oya;
    private int pdm;
    private String prr;

    /* renamed from: qk, reason: collision with root package name */
    private ImageView f19204qk;

    /* renamed from: rq, reason: collision with root package name */
    private String f19205rq;

    /* renamed from: sq, reason: collision with root package name */
    private int f19208sq;
    private boolean sz;

    /* renamed from: uu, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.Cif f19210uu;
    TTAdDislikeToast wqx;

    /* renamed from: yd, reason: collision with root package name */
    private Context f19211yd;
    private TextView zz;

    /* renamed from: tu, reason: collision with root package name */
    private final AtomicBoolean f19209tu = new AtomicBoolean(true);

    /* renamed from: nq, reason: collision with root package name */
    private final AtomicInteger f19203nq = new AtomicInteger(0);

    /* renamed from: se, reason: collision with root package name */
    private final AtomicInteger f19207se = new AtomicInteger(0);

    /* renamed from: rv, reason: collision with root package name */
    private final AtomicInteger f19206rv = new AtomicInteger(0);

    /* renamed from: cm, reason: collision with root package name */
    final AtomicBoolean f19194cm = new AtomicBoolean(false);
    final AtomicBoolean my = new AtomicBoolean(false);
    private String tic = "ダウンロード";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jd implements View.OnScrollChangeListener {
        private final WeakReference<Cif> jpo;

        public jd(Cif cif) {
            this.jpo = new WeakReference<>(cif);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
            Cif cif = this.jpo.get();
            if (cif != null) {
                cif.jd(i11);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo implements ju {

        /* renamed from: cm, reason: collision with root package name */
        private final WeakReference<TTLandingPageActivity> f19214cm;

        /* renamed from: jd, reason: collision with root package name */
        private final dt f19215jd;
        private final int jpo;
        private final String wqx;

        public jpo(int i10, dt dtVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.jpo = i10;
            this.f19215jd = dtVar;
            this.wqx = str;
            this.f19214cm = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.cm.ju
        public void jpo(int i10) {
            TTLandingPageActivity tTLandingPageActivity = this.f19214cm.get();
            if (tTLandingPageActivity != null) {
                wqx.jpo.jpo(this.jpo, tTLandingPageActivity.f19207se.get(), tTLandingPageActivity.f19206rv.get(), tTLandingPageActivity.f19203nq.get() - tTLandingPageActivity.f19206rv.get(), this.f19215jd, this.wqx, i10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class wqx implements View.OnTouchListener {

        /* renamed from: jd, reason: collision with root package name */
        private final WeakReference<com.bytedance.sdk.openadsdk.common.cm> f19216jd;
        private final WeakReference<Cif> jpo;

        public wqx(Cif cif, com.bytedance.sdk.openadsdk.common.cm cmVar) {
            this.jpo = new WeakReference<>(cif);
            this.f19216jd = new WeakReference<>(cmVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Cif cif = this.jpo.get();
            if (cif != null) {
                cif.jpo(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.cm cmVar = this.f19216jd.get();
            if (cmVar == null) {
                return false;
            }
            cmVar.jpo(motionEvent);
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean jpo() {
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        zz();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        my();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        jpo(3);
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.oya.my()) {
            finish();
            return;
        }
        try {
            sq.jd(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            this.f19195dm = intent.getBooleanExtra("only_loading", false);
        } else {
            dt dtVarJpo = pdm.jpo().jpo(pdm.jpo(intent));
            this.f19201jr = dtVarJpo;
            if (dtVarJpo != null) {
                this.f19195dm = dtVarJpo.m467if();
            }
        }
        try {
            setContentView(cm());
            this.f19205rq = "";
            jd(4);
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f19201jr = com.bytedance.sdk.openadsdk.core.jd.jpo(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        nmd.jpo("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e10);
                    }
                }
                this.f19205rq = intent.getStringExtra("url");
                this.opi = intent.getStringExtra("event_tag");
                this.f19208sq = intent.getIntExtra("source", -1);
                this.oya = intent.getStringExtra("adid");
                this.prr = intent.getStringExtra("log_extra");
                this.f19196dt = intent.getStringExtra("gecko_id");
            } else {
                dt dtVar = this.f19201jr;
                if (dtVar != null) {
                    this.oya = dtVar.fc();
                    this.prr = this.f19201jr.fxd();
                    this.f19196dt = this.f19201jr.afh();
                    this.f19205rq = this.f19201jr.zz();
                    this.f19208sq = this.f19201jr.ju();
                    this.opi = this.f19201jr.yd();
                }
            }
            if (this.f19201jr == null) {
                finish();
                return;
            }
            qk();
            if (!TextUtils.isEmpty(this.f19196dt)) {
                this.hmu = com.bytedance.sdk.openadsdk.qk.jd.jpo().jd();
                int iJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.hmu, this.f19196dt);
                this.f19198hx = iJpo;
                this.pdm = iJpo > 0 ? 2 : 0;
            }
            this.f19211yd = this;
            if (this.f19200jj != null) {
                com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(this).jpo(false).jd(false).jpo(this.f19200jj.getWebView());
            }
            com.bytedance.sdk.component.zz.jj jjVar = this.f19200jj;
            if (jjVar != null && jjVar.getWebView() != null) {
                Cif cifJd = new Cif(this.f19201jr, this.f19200jj.getWebView(), new jpo(this.f19198hx, this.f19201jr, "landingpage", this), this.pdm).jd(true);
                this.jpo = cifJd;
                this.f19197ef = cifJd.jpo;
                this.nzb = tic.jpo(this.f19201jr, this.f19200jj, this.f19211yd, this.opi);
            }
            xyk();
            com.bytedance.sdk.component.zz.jj jjVar2 = this.f19200jj;
            if (jjVar2 != null) {
                jjVar2.setLandingPage(true);
                this.f19200jj.setTag("landingpage");
                this.f19200jj.setMaterialMeta(this.f19201jr.eye());
            }
            com.bytedance.sdk.openadsdk.core.widget.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.widget.jpo.my(this.f19211yd, this.hna, this.oya, this.nzb, this.jpo, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.f19193au != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.f19193au.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.f19210uu != null) {
                        TTLandingPageActivity.this.f19210uu.jd();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.f19196dt)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.f19203nq.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(TTLandingPageActivity.this.hmu, TTLandingPageActivity.this.f19196dt, str);
                        if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.f19206rv.incrementAndGet();
                            return webResourceResponseModelJpo.getWebResourceResponse();
                        }
                        if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getMsg() == 2) {
                            TTLandingPageActivity.this.f19207se.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        nmd.jpo("TTAD.LandingPageAct", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.duq = myVar;
            myVar.jpo(this.f19201jr);
            this.duq.jpo("landingpage");
            com.bytedance.sdk.component.zz.jj jjVar3 = this.f19200jj;
            if (jjVar3 != null) {
                jjVar3.setWebViewClient(this.duq);
                com.bytedance.sdk.component.zz.jj jjVar4 = this.f19200jj;
                if (jjVar4 != null) {
                    jjVar4.setUserAgentString(jr.jpo(jjVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.zz.jj jjVar5 = this.f19200jj;
                if (jjVar5 != null) {
                    jjVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.f19201jr, "landingpage", this.pdm);
            com.bytedance.sdk.component.zz.jj jjVar6 = this.f19200jj;
            if (jjVar6 != null) {
                rq.jpo(jjVar6, this.f19205rq);
                this.f19200jj.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(this.hna, this.jpo, this.nzb) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i10) {
                        super.onProgressChanged(webView, i10);
                        if (TTLandingPageActivity.this.f19210uu != null) {
                            TTLandingPageActivity.this.f19210uu.jpo(i10);
                        }
                        if (TTLandingPageActivity.this.f19193au == null || TTLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        if (i10 == 100 && TTLandingPageActivity.this.f19193au.isShown()) {
                            TTLandingPageActivity.this.f19193au.setVisibility(8);
                        } else {
                            TTLandingPageActivity.this.f19193au.setProgress(i10);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.zz != null) {
                            TextView textView = TTLandingPageActivity.this.zz;
                            if (TextUtils.isEmpty(str)) {
                                str = com.bytedance.sdk.component.utils.dt.jpo(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }
                });
                if (this.f19200jj.getWebView() != null) {
                    this.f19200jj.getWebView().setOnScrollChangeListener(new jd(this.jpo));
                    this.f19200jj.getWebView().setOnTouchListener(new wqx(this.jpo, this.nzb));
                }
                this.f19200jj.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                        if (TTLandingPageActivity.this.nmd != null) {
                            TTLandingPageActivity.this.nmd.wqx(TTLandingPageActivity.this.f19201jr);
                        }
                    }
                });
            }
            my();
            com.bytedance.sdk.openadsdk.utils.oya oyaVarJpo = com.bytedance.sdk.openadsdk.utils.zz.jpo(this, new zz.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // com.bytedance.sdk.openadsdk.utils.zz.jpo
                public View jpo() {
                    return TTLandingPageActivity.this.f19204qk;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.zz.jpo
                public void jd() {
                }
            });
            this.kln = oyaVarJpo;
            oyaVarJpo.jpo(0L);
            wqx.jpo.jpo(SystemClock.elapsedRealtime() - jElapsedRealtime, this.f19201jr, "landingpage", this.hmu, this.f19196dt);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.zz.jj jjVar;
        super.onDestroy();
        Cif cif = this.jpo;
        if (cif != null && (jjVar = this.f19200jj) != null) {
            cif.jpo(jjVar);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.zz.jj jjVar2 = this.f19200jj;
        if (jjVar2 != null) {
            com.bytedance.sdk.openadsdk.core.tic.jpo(jjVar2.getWebView());
        }
        this.f19200jj = null;
        ef efVar = this.hna;
        if (efVar != null) {
            efVar.m457if();
        }
        Cif cif2 = this.jpo;
        if (cif2 != null) {
            cif2.cm(true);
        }
        if (!TextUtils.isEmpty(this.f19196dt)) {
            wqx.jpo.jpo(this.f19206rv.get(), this.f19203nq.get(), this.f19201jr);
        }
        com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.hmu);
        com.bytedance.sdk.openadsdk.utils.oya oyaVar = this.kln;
        if (oyaVar != null) {
            oyaVar.wqx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        com.bytedance.sdk.openadsdk.utils.oya oyaVar = this.kln;
        if (oyaVar != null) {
            oyaVar.jd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        ef efVar = this.hna;
        if (efVar != null) {
            efVar.ju();
        }
        Cif cif = this.jpo;
        if (cif != null) {
            cif.qk();
        }
        if (!this.sz) {
            this.sz = true;
            jpo(4);
        }
        com.bytedance.sdk.openadsdk.utils.oya oyaVar = this.kln;
        if (oyaVar != null) {
            oyaVar.jpo();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.cm.jpo(this, this.f19201jr);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Cif cif = this.jpo;
        if (cif != null) {
            cif.xyk();
        }
    }

    private void au() {
        TTAdDislikeToast tTAdDislikeToast = this.wqx;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private View cm() {
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(this);
        if (Build.VERSION.SDK_INT >= 35) {
            wqxVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(this);
        myVar.setOrientation(1);
        wqxVar.addView(myVar, new FrameLayout.LayoutParams(-1, -1));
        View oyaVar = new oya(this, new oya.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.common.oya.jpo
            public View jpo(Context context) {
                return new yd(context);
            }
        });
        oyaVar.setId(hna.hks);
        myVar.addView(oyaVar, new LinearLayout.LayoutParams(-1, va.jd(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        myVar.addView(wqxVar2, layoutParams);
        com.bytedance.sdk.component.zz.jj jjVar = new com.bytedance.sdk.component.zz.jj(this);
        jjVar.setId(hna.xk);
        wqxVar2.addView(jjVar, new FrameLayout.LayoutParams(-1, -1));
        oya oyaVar2 = new oya(this, new oya.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.common.oya.jpo
            public View jpo(Context context) {
                return new com.bytedance.sdk.openadsdk.common.qk(context);
            }
        });
        oyaVar2.setId(hna.jkt);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        wqxVar2.addView(oyaVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.jj jjVar2 = new com.bytedance.sdk.openadsdk.core.jj.jj(this, null, R.style.Widget.ProgressBar.Horizontal);
        jjVar2.setId(hna.f21529ii);
        jjVar2.setProgress(1);
        jjVar2.setVisibility(8);
        jjVar2.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, va.jd(this, 3.0f));
        layoutParams3.gravity = 49;
        wqxVar2.addView(jjVar2, layoutParams3);
        com.bytedance.sdk.openadsdk.common.Cif cif = new com.bytedance.sdk.openadsdk.common.Cif(this);
        cif.setOnlyLoading(this.f19195dm);
        cif.setId(520093721);
        wqxVar.addView(cif, new FrameLayout.LayoutParams(-1, -1));
        return wqxVar;
    }

    /* renamed from: if, reason: not valid java name */
    private void m428if() {
        try {
            if (this.f19199jd == null) {
                prr prrVar = new prr(this.f19211yd, this.f19201jr);
                this.f19199jd = prrVar;
                prrVar.setDislikeSource(QpyI.NcmgjQZwfo);
                this.f19199jd.setCallback(new prr.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jd(View view) {
                        TTLandingPageActivity.this.f19194cm.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jpo(View view) {
                        TTLandingPageActivity.this.f19194cm.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jpo(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.my.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.my.set(true);
                        TTLandingPageActivity.this.oya();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f19199jd);
            if (this.wqx == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f19211yd);
                this.wqx = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th2);
        }
    }

    private String jj() {
        dt dtVar = this.f19201jr;
        if (dtVar != null && !TextUtils.isEmpty(dtVar.clt())) {
            this.tic = this.f19201jr.clt();
        }
        return this.tic;
    }

    private void ju() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.hna.jpo("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void my() {
        dt dtVar = this.f19201jr;
        if (dtVar == null || dtVar.pzk() != 4) {
            return;
        }
        oya oyaVar = this.f19202ju;
        if (oyaVar != null) {
            oyaVar.setVisibility(0);
        }
        Button button = (Button) findViewById(hna.ux);
        this.f87if = button;
        if (button != null) {
            jpo(jj());
            if (this.nmd == null) {
                this.nmd = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this, TextUtils.isEmpty(this.opi) ? tic.jd(this.f19208sq) : this.opi);
            }
            com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.wqx.jpo(this, this.f19201jr, this.opi, this.f19208sq);
            jpoVar.jpo(false);
            this.f87if.setOnClickListener(jpoVar);
            this.f87if.setOnTouchListener(jpoVar);
            jpoVar.wqx(true);
            jpoVar.jpo(this.nmd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oya() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.wqx) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void qk() {
        com.bytedance.sdk.component.zz.jj jjVar = (com.bytedance.sdk.component.zz.jj) findViewById(hna.xk);
        this.f19200jj = jjVar;
        tic.jpo(this.f19201jr, jjVar);
        this.f19202ju = (oya) findViewById(hna.jkt);
        oya oyaVar = (oya) findViewById(hna.hks);
        com.bytedance.sdk.openadsdk.common.Cif cif = (com.bytedance.sdk.openadsdk.common.Cif) findViewById(520093721);
        this.f19210uu = cif;
        if (cif != null) {
            cif.jpo(this.f19201jr);
            this.f19210uu.jpo();
        }
        if (oyaVar != null) {
            oyaVar.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    if (TTLandingPageActivity.this.f19200jj != null) {
                        if (TTLandingPageActivity.this.f19197ef != null) {
                            TTLandingPageActivity.this.f19197ef.jpo();
                        }
                        if (TTLandingPageActivity.this.f19200jj.zz()) {
                            TTLandingPageActivity.this.f19200jj.yd();
                        } else if (TTLandingPageActivity.this.yd()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(520093716);
        this.f19204qk = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.zz = (TextView) findViewById(hna.f21549sg);
        com.bytedance.sdk.openadsdk.core.jj.jj jjVar2 = (com.bytedance.sdk.openadsdk.core.jj.jj) findViewById(hna.f21529ii);
        this.f19193au = jjVar2;
        if (jjVar2 != null) {
            jjVar2.setVisibility(0);
        }
        View viewFindViewById = findViewById(hna.f21558wu);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.wqx();
                }
            });
        }
    }

    private void xyk() {
        ef efVar = new ef(this);
        this.hna = efVar;
        efVar.jd(this.f19200jj).wqx(this.oya).cm(this.prr).jpo(this.f19201jr).jd(this.f19208sq).jpo(this.f19201jr.np()).my(this.f19201jr.sd()).jpo(this.f19200jj).jd("landingpage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yd() {
        return !TextUtils.isEmpty(this.f19205rq) && this.f19205rq.contains("__luban_sdk");
    }

    private void zz() throws JSONException {
        if (yd() && !this.f19209tu.getAndSet(true)) {
            ju();
            jd(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th2) {
                nmd.wqx("TTAD.LandingPageAct", "onBackPressed: ", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void jd() throws JSONException {
        zz();
    }

    public void wqx() {
        if (isFinishing()) {
            return;
        }
        if (this.my.get()) {
            au();
            return;
        }
        if (this.f19199jd == null) {
            m428if();
        }
        prr prrVar = this.f19199jd;
        if (prrVar != null) {
            prrVar.jpo();
        }
    }

    private void jd(final int i10) {
        if (this.f19204qk == null || !yd()) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                va.jpo((View) TTLandingPageActivity.this.f19204qk, i10);
            }
        });
    }

    private void jpo(int i10) {
        int i11;
        if (i10 == 1 || (i11 = Build.VERSION.SDK_INT) == 26) {
            return;
        }
        if (i11 == 27) {
            try {
                setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        } else {
            setRequestedOrientation(i10);
        }
    }

    private void jpo(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f87if) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.f87if == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.f87if.setText(str);
            }
        });
    }
}
