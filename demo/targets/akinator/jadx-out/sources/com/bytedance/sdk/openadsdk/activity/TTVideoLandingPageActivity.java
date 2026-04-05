package com.bytedance.sdk.openadsdk.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.component.utils.se;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.cm.ju;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.common.oya;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tic;
import com.bytedance.sdk.openadsdk.core.widget.jpo.jj;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.bytedance.sdk.openadsdk.utils.va;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.yd.cm {

    /* renamed from: au, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.au.jd.jj f19257au;

    /* renamed from: cm, reason: collision with root package name */
    protected TextView f19258cm;

    /* renamed from: dm, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.multipro.jd.jpo f19259dm;

    /* renamed from: dn, reason: collision with root package name */
    private int f19260dn;

    /* renamed from: dt, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.widget.jpo f19261dt;
    protected int duq;
    private ILoader fy;
    protected TextView hmu;

    /* renamed from: hx, reason: collision with root package name */
    protected Button f19263hx;

    /* renamed from: jd, reason: collision with root package name */
    protected ImageView f19265jd;

    /* renamed from: jj, reason: collision with root package name */
    protected String f19266jj;
    protected com.bytedance.sdk.component.zz.jj jpo;

    /* renamed from: ju, reason: collision with root package name */
    protected FrameLayout f19268ju;
    protected Context my;

    /* renamed from: nq, reason: collision with root package name */
    protected TextView f19269nq;
    protected long oya;
    protected com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj pdm;

    /* renamed from: pe, reason: collision with root package name */
    protected jj.jpo f19270pe;
    protected dt prr;

    /* renamed from: qk, reason: collision with root package name */
    protected String f19271qk;
    protected String roc;

    /* renamed from: rq, reason: collision with root package name */
    protected RelativeLayout f19272rq;
    private int sbx;

    /* renamed from: se, reason: collision with root package name */
    protected oya f19274se;
    protected Cif tic;

    /* renamed from: tu, reason: collision with root package name */
    protected TextView f19276tu;

    /* renamed from: uu, reason: collision with root package name */
    protected String f19277uu;
    protected ImageView wqx;

    /* renamed from: yd, reason: collision with root package name */
    protected int f19280yd;
    protected ef zz;

    /* renamed from: if, reason: not valid java name */
    protected int f90if = -1;
    protected int hna = 0;

    /* renamed from: sq, reason: collision with root package name */
    protected int f19275sq = 0;
    protected int opi = 0;

    /* renamed from: jr, reason: collision with root package name */
    protected int f19267jr = 0;
    protected String nmd = "ダウンロード";

    /* renamed from: rv, reason: collision with root package name */
    protected boolean f19273rv = false;
    protected boolean sz = false;
    protected boolean kln = true;

    /* renamed from: ef, reason: collision with root package name */
    protected boolean f19262ef = false;
    protected String nzb = null;

    /* renamed from: va, reason: collision with root package name */
    protected AtomicBoolean f19278va = new AtomicBoolean(true);
    protected JSONArray vrc = null;
    private final AtomicInteger huv = new AtomicInteger(0);

    /* renamed from: ya, reason: collision with root package name */
    private final AtomicInteger f19279ya = new AtomicInteger(0);
    private final AtomicInteger wcn = new AtomicInteger(0);
    int xk = -1;

    /* renamed from: ic, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.wqx.jpo f19264ic = null;
    private final wqx.jd jkt = new wqx.jd() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jd
        public void jpo(boolean z10) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.f19273rv = z10;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z10) {
                va.jpo((View) TTVideoLandingPageActivity.this.jpo, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f19268ju.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.opi;
                marginLayoutParams.height = tTVideoLandingPageActivity2.f19267jr;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.f19275sq;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.hna;
                tTVideoLandingPageActivity2.f19268ju.setLayoutParams(marginLayoutParams);
                return;
            }
            va.jpo((View) TTVideoLandingPageActivity.this.jpo, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f19268ju.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.f19275sq = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.hna = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.opi = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.f19267jr = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.f19268ju.setLayoutParams(marginLayoutParams2);
        }
    };
    private final se.jpo cgn = new se.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.se.jpo
        public void jpo(Context context, Intent intent, boolean z10, final int i10) {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo(i10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jpo(int i10) {
            com.bytedance.sdk.component.zz.jj jjVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.duq == 0 && i10 != 0 && (jjVar = tTVideoLandingPageActivity.jpo) != null && (str = tTVideoLandingPageActivity.nzb) != null) {
                jjVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar2 = TTVideoLandingPageActivity.this.f19257au;
            if (jjVar2 != null && jjVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.sz && tTVideoLandingPageActivity2.duq != i10) {
                    tTVideoLandingPageActivity2.f19257au.getNativeVideoController().wqx(i10);
                }
            }
            TTVideoLandingPageActivity.this.duq = i10;
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: jd, reason: collision with root package name */
        private final WeakReference<com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd> f19284jd;
        private final Bitmap jpo;

        @Override // android.os.AsyncTask
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapJpo = com.bytedance.sdk.component.adexpress.cm.jpo.jpo(sq.jpo(), this.jpo, 25);
                if (bitmapJpo == null) {
                    return null;
                }
                return new BitmapDrawable(sq.jpo().getResources(), bitmapJpo);
            } catch (Throwable th2) {
                nmd.wqx("TTVideoLandingPage", th2.getMessage());
                return null;
            }
        }

        private jpo(Bitmap bitmap, com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar) {
            this.jpo = bitmap;
            this.f19284jd = new WeakReference<>(jdVar);
        }

        @Override // android.os.AsyncTask
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd> weakReference;
            if (drawable == null || (weakReference = this.f19284jd) == null || weakReference.get() == null) {
                return;
            }
            this.f19284jd.get().jpo(drawable);
        }
    }

    private void hna() throws JSONException {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar;
        if (this.f19273rv && (jjVar = this.f19257au) != null && jjVar.getNativeVideoController() != null) {
            this.f19257au.getNativeVideoController().my(null, null);
            this.f19273rv = false;
        } else if (!nmd() || this.f19278va.getAndSet(true)) {
            super.onBackPressed();
        } else {
            rq();
            jpo(0);
        }
    }

    private boolean jr() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar == null || jjVar.getNativeVideoController() == null) {
            return true;
        }
        return this.f19257au.getNativeVideoController().au();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean nmd() {
        return !TextUtils.isEmpty(this.nzb) && this.nzb.contains("__luban_sdk");
    }

    private void opi() {
        if (this.f19257au == null || jr()) {
            return;
        }
        this.f19257au.oya();
    }

    private void oya() {
        dt dtVar = this.prr;
        if (dtVar == null || dtVar.pzk() != 4) {
            return;
        }
        this.f19274se.setVisibility(0);
        Button button = (Button) findViewById(hna.ux);
        this.f19263hx = button;
        if (button != null) {
            jpo(cm());
            this.f19263hx.setOnClickListener(this.f19264ic);
            this.f19263hx.setOnTouchListener(this.f19264ic);
        }
    }

    private void prr() {
        ef efVar = new ef(this);
        this.zz = efVar;
        efVar.jd(this.jpo).wqx(this.f19266jj).cm(this.f19271qk).jd(this.f19280yd).jpo(this.prr).jpo(this.prr.np()).jpo(this.jpo).jd("landingpage_split_screen").my(this.prr.sd());
    }

    private void rq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.zz.jpo("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void sq() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar == null || jjVar.getNativeVideoController() == null || jr()) {
            return;
        }
        this.f19257au.oya();
    }

    public void au() {
        try {
            se.jpo(this.cgn);
        } catch (Exception unused) {
        }
    }

    /* renamed from: if, reason: not valid java name */
    public void m429if() {
        se.jpo(this.cgn, this.my);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean jpo() {
        return true;
    }

    public void ju() {
        if (this.prr == null) {
            return;
        }
        this.pdm = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this, this.f19277uu);
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.wqx.jpo(this, this.prr, this.f19277uu, this.f19280yd);
        this.f19264ic = jpoVar;
        jpoVar.jpo(false);
        this.f19264ic.wqx(true);
        this.f19269nq.setOnClickListener(this.f19264ic);
        this.f19269nq.setOnTouchListener(this.f19264ic);
        this.f19264ic.jpo(this.pdm);
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        hna();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oya();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strOzw;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.oya.my()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            sq.jd(this);
        } catch (Throwable unused2) {
        }
        this.duq = opi.wqx(getApplicationContext());
        try {
            setContentView(wqx());
            this.my = this;
            Intent intent = getIntent();
            this.f19262ef = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.oya = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra2 != null) {
                    try {
                        this.prr = com.bytedance.sdk.openadsdk.core.jd.jpo(new JSONObject(stringExtra2));
                    } catch (Exception unused3) {
                    }
                }
                dt dtVar = this.prr;
                if (dtVar != null) {
                    this.f90if = dtVar.iqh();
                }
                this.f19266jj = intent.getStringExtra("adid");
                this.f19271qk = intent.getStringExtra("log_extra");
                strOzw = intent.getStringExtra("web_title");
                this.roc = intent.getStringExtra("gecko_id");
                this.f19277uu = intent.getStringExtra("event_tag");
                this.f19280yd = intent.getIntExtra("source", -1);
                this.nzb = intent.getStringExtra("url");
            } else {
                dt dtVarJpo = pdm.jpo().jpo(pdm.jpo(intent));
                this.prr = dtVarJpo;
                if (dtVarJpo != null) {
                    this.f90if = dtVarJpo.iqh();
                    this.f19266jj = this.prr.fc();
                    this.f19271qk = this.prr.fxd();
                    strOzw = this.prr.ozw();
                    this.roc = this.prr.afh();
                    this.nzb = this.prr.zz();
                    this.f19280yd = this.prr.ju();
                    this.f19277uu = this.prr.yd();
                } else {
                    strOzw = null;
                }
            }
            if (this.prr == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.roc)) {
                this.fy = com.bytedance.sdk.openadsdk.qk.jd.jpo().jd();
                int iJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.fy, this.roc);
                this.f19260dn = iJpo;
                this.sbx = iJpo > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.f19259dm = com.bytedance.sdk.openadsdk.multipro.jd.jpo.jpo(new JSONObject(stringExtra));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.jd.jpo jpoVar = this.f19259dm;
                if (jpoVar != null) {
                    this.oya = jpoVar.f21288qk;
                }
            }
            if (bundle != null) {
                this.prr = pdm.jpo().jpo(bundle.getInt("meta_index", -1));
                long j10 = bundle.getLong("video_play_position");
                if (j10 > 0) {
                    this.oya = j10;
                }
            }
            my();
            ju();
            prr();
            jpo(4);
            if (this.jpo != null) {
                com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(this.my).jpo(true).jd(false).jpo(this.jpo.getWebView());
                Cif cifJd = new Cif(this.prr, this.jpo.getWebView(), new ju() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.cm.ju
                    public void jpo(int i10) {
                        wqx.jpo.jpo(TTVideoLandingPageActivity.this.f19260dn, TTVideoLandingPageActivity.this.wcn.get(), TTVideoLandingPageActivity.this.f19279ya.get(), TTVideoLandingPageActivity.this.huv.get() - TTVideoLandingPageActivity.this.f19279ya.get(), TTVideoLandingPageActivity.this.prr, "landingpage_split_screen", i10);
                    }
                }, this.sbx).jd(true);
                this.tic = cifJd;
                this.f19270pe = cifJd.jpo;
                cifJd.jpo("landingpage_split_screen");
            }
            com.bytedance.sdk.component.zz.jj jjVar = this.jpo;
            if (jjVar != null) {
                jjVar.setLandingPage(true);
                this.jpo.setTag("landingpage_split_screen");
                this.jpo.setMaterialMeta(this.prr.eye());
                this.jpo.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.my(this.my, this.zz, this.f19266jj, this.tic, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.roc)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.huv.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(TTVideoLandingPageActivity.this.fy, TTVideoLandingPageActivity.this.roc, str);
                            if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.f19279ya.incrementAndGet();
                                return webResourceResponseModelJpo.getWebResourceResponse();
                            }
                            if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.wcn.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th2) {
                            nmd.jpo("TTVideoLandingPage", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.zz.jj jjVar2 = this.jpo;
                jjVar2.setUserAgentString(jr.jpo(jjVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.zz.jj jjVar3 = this.jpo;
            if (jjVar3 != null) {
                jjVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.prr, "landingpage_split_screen", this.sbx);
            rq.jpo(this.jpo, this.nzb);
            this.jpo.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(this.zz, this.tic) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                }
            });
            this.jpo.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jjVar4 = tTVideoLandingPageActivity.pdm;
                    if (jjVar4 != null) {
                        jjVar4.wqx(tTVideoLandingPageActivity.prr);
                    }
                }
            });
            TextView textView = this.f19258cm;
            if (textView != null) {
                if (TextUtils.isEmpty(strOzw)) {
                    strOzw = com.bytedance.sdk.component.utils.dt.jpo(this, "tt_web_title_default");
                }
                textView.setText(strOzw);
            }
            m429if();
            jj();
            oya();
            wqx.jpo.jpo(SystemClock.elapsedRealtime() - jElapsedRealtime, this.prr, "landingpage_split_screen", this.fy, this.roc);
        } catch (Throwable unused5) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        au();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.prr.yd(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.zz.jj jjVar = this.jpo;
        if (jjVar != null) {
            tic.jpo(jjVar.getWebView());
        }
        this.jpo = null;
        ef efVar = this.zz;
        if (efVar != null) {
            efVar.m457if();
        }
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar2 = this.f19257au;
        if (jjVar2 != null && jjVar2.getNativeVideoController() != null) {
            this.f19257au.getNativeVideoController().my();
        }
        this.f19257au = null;
        this.prr = null;
        Cif cif = this.tic;
        if (cif != null) {
            cif.cm(true);
        }
        if (!TextUtils.isEmpty(this.roc)) {
            wqx.jpo.jpo(this.f19279ya.get(), this.huv.get(), this.prr);
        }
        com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.fy);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        opi();
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar == null || jjVar.getNativeVideoController() == null) {
            return;
        }
        jpo(this.f19257au.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        if (!this.kln) {
            sq();
        }
        this.kln = false;
        ef efVar = this.zz;
        if (efVar != null) {
            efVar.ju();
        }
        Cif cif = this.tic;
        if (cif != null) {
            cif.qk();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iJpo = this.prr != null ? pdm.jpo().jpo(this.prr) : -1;
        this.xk = iJpo;
        bundle.putInt("meta_index", iJpo);
        bundle.putLong("video_play_position", this.oya);
        bundle.putBoolean("is_complete", this.sz);
        long jJj = this.oya;
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar != null && jjVar.getNativeVideoController() != null) {
            jJj = this.f19257au.getNativeVideoController().jj();
        }
        bundle.putLong("video_play_position", jJj);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.xk >= 0) {
            pdm.jpo().wqx(this.xk);
            this.xk = -1;
        }
        com.bytedance.sdk.openadsdk.utils.cm.jpo(this, this.prr);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Cif cif = this.tic;
        if (cif != null) {
            cif.xyk();
        }
    }

    public abstract boolean qk();

    public abstract View wqx();

    public long xyk() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar == null || jjVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.f19257au.getNativeVideoController().zz();
    }

    public void yd() {
        dt dtVar = this.prr;
        if (dtVar == null || dtVar.pzk() != 4) {
            return;
        }
        va.jpo((View) this.f19272rq, 0);
        String strOzw = !TextUtils.isEmpty(this.prr.ozw()) ? this.prr.ozw() : !TextUtils.isEmpty(this.prr.xp()) ? this.prr.xp() : !TextUtils.isEmpty(this.prr.as()) ? this.prr.as() : "";
        if (this.prr.ou() != null && this.prr.ou().jpo() != null) {
            va.jpo((View) this.f19261dt, 0);
            va.jpo((View) this.f19276tu, 4);
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.prr.ou(), this.f19261dt, this.prr);
        } else if (!TextUtils.isEmpty(strOzw)) {
            va.jpo((View) this.f19261dt, 4);
            va.jpo((View) this.f19276tu, 0);
            this.f19276tu.setText(strOzw.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.prr.clt())) {
            this.f19269nq.setText(this.prr.clt());
        }
        if (!TextUtils.isEmpty(strOzw)) {
            this.hmu.setText(strOzw);
        }
        va.jpo((View) this.hmu, 0);
        va.jpo((View) this.f19269nq, 0);
    }

    public int zz() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar == null || jjVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.f19257au.getNativeVideoController().yd();
    }

    public String cm() {
        dt dtVar = this.prr;
        if (dtVar != null && !TextUtils.isEmpty(dtVar.clt())) {
            this.nmd = this.prr.clt();
        }
        return this.nmd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void jd() throws JSONException {
        hna();
    }

    public void jj() {
        if (qk()) {
            try {
                com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = new com.bytedance.sdk.openadsdk.core.au.jd.jj(this.my, this.prr, true, null);
                this.f19257au = jjVar;
                if (jjVar.getNativeVideoController() != null) {
                    this.f19257au.getNativeVideoController().jpo(false);
                }
                if (this.sz) {
                    this.f19268ju.setVisibility(0);
                    this.f19268ju.removeAllViews();
                    this.f19268ju.addView(this.f19257au);
                    this.f19257au.jd(true);
                } else {
                    if (!this.f19262ef) {
                        this.oya = 0L;
                    }
                    if (this.f19259dm != null && this.f19257au.getNativeVideoController() != null) {
                        this.f19257au.getNativeVideoController().wqx(this.f19259dm.f21288qk);
                        this.f19257au.getNativeVideoController().cm(this.f19259dm.my);
                        this.f19257au.jpo(sq.cm().jd(String.valueOf(this.prr.jl())), "landingPageInit");
                    }
                    if (this.f19257au.jpo(this.oya, this.kln, this.sz)) {
                        this.f19268ju.setVisibility(0);
                        this.f19268ju.removeAllViews();
                        this.f19268ju.addView(this.f19257au);
                    }
                    if (this.f19257au.getNativeVideoController() != null) {
                        this.f19257au.getNativeVideoController().jpo(false);
                        this.f19257au.getNativeVideoController().jpo(this.jkt);
                    }
                }
                String strJpo = this.prr.fri().get(0).jpo();
                com.bytedance.sdk.openadsdk.zz.cm.jpo().jpo(strJpo).jpo(this.prr.fri().get(0).jd()).jd(this.prr.fri().get(0).wqx()).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo())).wqx(2).jpo(new com.bytedance.sdk.openadsdk.zz.jd(this.prr, strJpo, new com.bytedance.sdk.component.my.hna() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.my.hna
                    public void jpo(int i10, String str, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.my.hna
                    public void jpo(com.bytedance.sdk.component.my.ju juVar) {
                        try {
                            Object objJd = juVar.jd();
                            if (objJd instanceof Bitmap) {
                                new jpo((Bitmap) objJd, TTVideoLandingPageActivity.this.f19257au.getNativeVideoController().mo374if()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.f19257au.findViewById(520093726).setOnTouchListener(null);
                this.f19257au.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e10) {
                nmd.wqx("TTVideoLandingPage", e10.getMessage());
                if (this.f19257au == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e10);
                }
            }
            if (this.duq == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.dt.jpo(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void my() {
        this.f19274se = (oya) findViewById(hna.jkt);
        this.jpo = (com.bytedance.sdk.component.zz.jj) findViewById(hna.xk);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.f19265jd = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    JSONObject jSONObjectJpo;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.jpo != null) {
                        jj.jpo jpoVar = tTVideoLandingPageActivity.f19270pe;
                        if (jpoVar != null) {
                            jpoVar.jpo();
                        }
                        if (TTVideoLandingPageActivity.this.jpo.zz()) {
                            TTVideoLandingPageActivity.this.jpo.yd();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.nmd()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = TTVideoLandingPageActivity.this.f19257au;
                        if (jjVar == null || jjVar.getNativeVideoController() == null) {
                            jSONObjectJpo = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectJpo = com.bytedance.sdk.openadsdk.utils.tic.jpo(tTVideoLandingPageActivity2.prr, tTVideoLandingPageActivity2.f19257au.getNativeVideoController().qk(), TTVideoLandingPageActivity.this.f19257au.getNativeVideoController().ju());
                        }
                        JSONObject jSONObject = jSONObjectJpo;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(tTVideoLandingPageActivity3.prr, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.xyk(), TTVideoLandingPageActivity.this.zz(), jSONObject, (com.bytedance.sdk.openadsdk.cm.qk) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar != null) {
            jjVar.setIsAutoPlay(this.f19262ef);
        }
        ImageView imageView2 = (ImageView) findViewById(hna.f21516dm);
        this.wqx = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    JSONObject jSONObjectJpo;
                    com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar2 = TTVideoLandingPageActivity.this.f19257au;
                    if (jjVar2 != null) {
                        if (jjVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectJpo = com.bytedance.sdk.openadsdk.utils.tic.jpo(tTVideoLandingPageActivity.prr, tTVideoLandingPageActivity.f19257au.getNativeVideoController().qk(), TTVideoLandingPageActivity.this.f19257au.getNativeVideoController().ju());
                        } else {
                            jSONObjectJpo = null;
                        }
                        JSONObject jSONObject = jSONObjectJpo;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(tTVideoLandingPageActivity2.prr, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.xyk(), TTVideoLandingPageActivity.this.zz(), jSONObject, (com.bytedance.sdk.openadsdk.cm.qk) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.f19258cm = (TextView) findViewById(hna.f21549sg);
        this.f19268ju = (FrameLayout) findViewById(hna.duq);
        this.f19272rq = (RelativeLayout) findViewById(hna.tic);
        this.f19276tu = (TextView) findViewById(hna.vrc);
        this.hmu = (TextView) findViewById(hna.roc);
        this.f19269nq = (TextView) findViewById(hna.f21543pe);
        this.f19261dt = (com.bytedance.sdk.openadsdk.core.widget.jpo) findViewById(hna.f21555va);
        yd();
    }

    private void jpo(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f19263hx) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.f19263hx == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.f19263hx.setText(str);
            }
        });
    }

    private void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar) {
        this.sz = this.sz || wqxVar.au();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.sz));
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(wqxVar.jj()));
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(wqxVar.qk() + wqxVar.zz()));
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_native_video_data", "key_video_duration", Long.valueOf(wqxVar.zz()));
    }

    private void jpo(final int i10) {
        if (this.wqx == null || !nmd()) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                va.jpo((View) TTVideoLandingPageActivity.this.wqx, i10);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.yd.cm
    public void jpo(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.vrc = jSONArray;
    }
}
