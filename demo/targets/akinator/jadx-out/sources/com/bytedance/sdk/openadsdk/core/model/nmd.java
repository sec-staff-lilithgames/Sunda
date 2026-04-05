package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.adsdk.ugeno.zz.cm.a;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.common.Cif;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd implements Handler.Callback {
    private ValueAnimator aix;

    /* renamed from: au, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.wqx.jpo f20715au;
    private com.bytedance.sdk.openadsdk.core.zz.nmd cgn;

    /* renamed from: cm, reason: collision with root package name */
    FrameLayout f20716cm;
    private com.bytedance.sdk.openadsdk.core.jj.xyk cql;

    /* renamed from: dm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj f20717dm;

    /* renamed from: dn, reason: collision with root package name */
    private int f20718dn;

    /* renamed from: dt, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jj f20719dt;
    private int duq;

    /* renamed from: ef, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.au.cm.jd f20720ef;

    /* renamed from: et, reason: collision with root package name */
    private AtomicBoolean f20721et;
    private FrameLayout hks;
    private FrameLayout hmu;
    private View hna;

    /* renamed from: hx, reason: collision with root package name */
    private ImageView f20722hx;

    /* renamed from: ic, reason: collision with root package name */
    private ILoader f20723ic;

    /* renamed from: if, reason: not valid java name */
    wqx.jpo f133if;

    /* renamed from: ii, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.sq f20724ii;

    /* renamed from: jd, reason: collision with root package name */
    FrameLayout f20725jd;

    /* renamed from: jj, reason: collision with root package name */
    RelativeLayout f20726jj;
    private com.bytedance.sdk.openadsdk.core.jj.cm jkt;
    ImageView jpo;

    /* renamed from: jr, reason: collision with root package name */
    private TextView f20727jr;

    /* renamed from: ju, reason: collision with root package name */
    ObjectAnimator f20728ju;
    private String kln;
    View my;
    private com.bytedance.sdk.openadsdk.core.widget.sq nmd;

    /* renamed from: nq, reason: collision with root package name */
    private Cif f20729nq;
    private final View nzb;
    private TextView opi;
    private LinearLayout.LayoutParams ota;
    com.bytedance.sdk.openadsdk.core.wqx.jd oya;
    private View pdm;

    /* renamed from: pe, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.jpo.my f20730pe;
    private Handler prr;

    /* renamed from: qk, reason: collision with root package name */
    final dt f20731qk;
    private boolean roc;

    /* renamed from: rq, reason: collision with root package name */
    private TextView f20732rq;

    /* renamed from: rv, reason: collision with root package name */
    private long f20733rv;
    private com.bytedance.sdk.openadsdk.common.cm sbx;

    /* renamed from: se, reason: collision with root package name */
    private View f20734se;

    /* renamed from: sq, reason: collision with root package name */
    private View f20735sq;
    private final Activity sz;
    private com.bytedance.sdk.openadsdk.cm.Cif tic;

    /* renamed from: tu, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ef f20737tu;

    /* renamed from: va, reason: collision with root package name */
    private boolean f20739va;

    /* renamed from: vk, reason: collision with root package name */
    private final boolean f20740vk;
    private jd voc;
    private int wcn;
    TextView wqx;
    private String xk;
    FrameLayout xyk;

    /* renamed from: yd, reason: collision with root package name */
    ValueAnimator f20742yd;
    ObjectAnimator zz;

    /* renamed from: uu, reason: collision with root package name */
    private final AtomicBoolean f20738uu = new AtomicBoolean(false);
    private final AtomicBoolean vrc = new AtomicBoolean(false);
    private volatile int fy = 0;
    private volatile int huv = 0;

    /* renamed from: ya, reason: collision with root package name */
    private volatile int f20741ya = 0;
    private float rxq = -1.0f;
    private final AtomicBoolean wad = new AtomicBoolean(false);
    private long ree = -1;

    /* renamed from: tl, reason: collision with root package name */
    private final AtomicBoolean f20736tl = new AtomicBoolean(false);
    private long erj = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements com.bytedance.sdk.openadsdk.cm.ju {

        /* renamed from: cm, reason: collision with root package name */
        private final WeakReference<nmd> f20751cm;

        /* renamed from: jd, reason: collision with root package name */
        private final dt f20752jd;
        private final int jpo;
        private final String wqx;

        public jd(int i10, dt dtVar, String str, nmd nmdVar) {
            this.jpo = i10;
            this.f20752jd = dtVar;
            this.wqx = str;
            this.f20751cm = new WeakReference<>(nmdVar);
        }

        @Override // com.bytedance.sdk.openadsdk.cm.ju
        public void jpo(int i10) {
            nmd nmdVar = this.f20751cm.get();
            if (nmdVar != null) {
                wqx.jpo.jpo(this.jpo, nmdVar.f20741ya, nmdVar.huv, nmdVar.fy - nmdVar.huv, this.f20752jd, this.wqx, i10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements com.bytedance.sdk.component.my.xyk {
        @Override // com.bytedance.sdk.component.my.xyk
        public Bitmap jpo(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.cm.jpo.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), bitmap, 25);
        }
    }

    public nmd(Activity activity, final dt dtVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar, View view) {
        this.sz = activity;
        this.f20731qk = dtVar;
        this.kln = str;
        this.f20720ef = jdVar;
        this.nzb = view;
        this.duq = tic.jpo(str);
        if (dtVar != null) {
            this.xk = dtVar.afh();
        }
        this.f20740vk = dtVar.va() && my(dtVar);
        if (!TextUtils.isEmpty(this.xk)) {
            this.f20723ic = com.bytedance.sdk.openadsdk.qk.jd.jpo().jd();
            int iJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.f20723ic, this.xk);
            this.wcn = iJpo;
            this.f20718dn = iJpo > 0 ? 2 : 0;
        }
        boolean zCm = cm(dtVar);
        boolean zQk = qk(dtVar);
        boolean zJd = jd(dtVar);
        if (zJd) {
            this.kln = "landingpage_split_screen";
        } else if (zCm) {
            this.kln = "landingpage_direct";
        } else if (zQk) {
            this.kln = "aggregate_page";
        } else if (wqx(dtVar)) {
            this.kln = "landingpage_split_ceiling";
        }
        this.f20715au = new com.bytedance.sdk.openadsdk.core.wqx.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), dtVar, this.kln, tic.jpo(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.f20715au.jpo(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.f20715au.jpo(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.wqx.jd jdVar2 = new com.bytedance.sdk.openadsdk.core.wqx.jd(activity, dtVar, this.kln, tic.jpo(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.1
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd
            public boolean jpo(Cif cif, Map<String, Object> map2) {
                if (nmd.yd(dtVar) && nmd.this.f20730pe != null) {
                    nmd.this.f20730pe.jpo(cif);
                    nmd.this.f20730pe.jpo(map2);
                    if (nmd.zz(nmd.this.f20731qk) || nmd.this.roc) {
                        return true;
                    }
                }
                return super.jpo(cif, map2);
            }
        };
        this.oya = jdVar2;
        jdVar2.jpo(map);
        this.oya.jpo(viewFindViewById);
        this.xyk = frameLayout;
        if (zJd || zCm || zQk) {
            try {
                this.prr = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e10) {
                Log.e("LandingPageModel", "LandingPageModel: ", e10);
                return;
            }
        }
        if (dtVar.va()) {
            return;
        }
        if (zCm || zQk) {
            Handler handler = this.prr;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    /* renamed from: if, reason: not valid java name */
    public static /* synthetic */ int m473if(nmd nmdVar) {
        int i10 = nmdVar.fy;
        nmdVar.fy = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int oya(nmd nmdVar) {
        int i10 = nmdVar.huv;
        nmdVar.huv = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int prr(nmd nmdVar) {
        int i10 = nmdVar.f20741ya;
        nmdVar.f20741ya = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean wqx(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        dt dtVar;
        dt dtVar2;
        int i10 = message.what;
        if (i10 == 100) {
            int i11 = message.arg1;
            long jCm = (!cm(this.f20731qk) || (dtVar2 = this.f20731qk) == null || dtVar2.nmd() == null) ? (!qk(this.f20731qk) || (dtVar = this.f20731qk) == null || dtVar.nmd() == null) ? 20L : this.f20731qk.nmd().cm() : this.f20731qk.nmd().jd();
            wqx.jpo jpoVar = this.f133if;
            if (jpoVar != null) {
                jpoVar.jpo(i11 * 1000, jCm * 1000);
            }
            long j10 = i11;
            if (j10 >= jCm) {
                wqx.jpo jpoVar2 = this.f133if;
                if (jpoVar2 != null) {
                    jpoVar2.jpo(jCm * 1000, 100);
                }
            } else if (j10 < jCm && this.prr != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i11 + 1;
                this.prr.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i10 == 101) {
            yd();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void au() {
        this.f20738uu.get();
        this.vrc.get();
        if (this.f20738uu.get() || this.vrc.get()) {
            return;
        }
        this.f20738uu.set(true);
        jpo(0);
        long jElapsedRealtime = this.ree == -1 ? 0L : SystemClock.elapsedRealtime() - this.ree;
        if (wqx(this.f20731qk)) {
            com.bytedance.sdk.openadsdk.cm.wqx.wqx(this.f20731qk, this.kln, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.f20731qk, this.kln, System.currentTimeMillis() - this.f20733rv, true);
        oya();
    }

    private void hna() {
        if ((cm(this.f20731qk) || qk(this.f20731qk)) && (this.sz instanceof com.bytedance.sdk.openadsdk.core.au.cm.jd)) {
            this.f20720ef.sq();
            this.f20720ef.opi();
        }
    }

    /* renamed from: if, reason: not valid java name */
    private void m474if() {
        com.bytedance.sdk.openadsdk.core.ef efVar = new com.bytedance.sdk.openadsdk.core.ef(this.sz);
        this.f20737tu = efVar;
        efVar.jpo(this.f20720ef);
        this.f20737tu.jd(this.f20719dt).jpo(com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo(this.f20731qk)).wqx(this.f20731qk.fc()).cm(this.f20731qk.fxd()).jpo(this.f20731qk).jd(qk(this.f20731qk) ? this.duq : -1).jpo(this.f20731qk.np()).jd(this.kln).my(this.f20731qk.sd()).jpo(this.f20719dt).jpo(new com.bytedance.sdk.openadsdk.core.widget.my() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.my
            public void jpo() {
                if (nmd.qk(nmd.this.f20731qk) && (nmd.this.sz instanceof com.bytedance.sdk.openadsdk.core.au.cm.jd)) {
                    ((com.bytedance.sdk.openadsdk.core.au.cm.jd) nmd.this.sz).dm();
                } else if (nmd.this.f20730pe != null) {
                    nmd.this.f20730pe.wqx();
                }
            }
        });
    }

    public static boolean jj(dt dtVar) {
        se seVarZx;
        return (dtVar == null || (seVarZx = dtVar.zx()) == null || seVarZx.jpo() != 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jr() {
        return dt.my(this.f20731qk);
    }

    private void ju() {
        nmd nmdVar;
        com.bytedance.sdk.component.zz.jj jjVar = this.f20719dt;
        if (jjVar == null || jjVar.getWebView() == null) {
            nmdVar = this;
        } else {
            com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo()).jpo(false).jd(false).jpo(this.f20719dt.getWebView());
            com.bytedance.sdk.component.zz.jj jjVar2 = this.f20719dt;
            if (jjVar2 != null && jjVar2.getWebView() != null) {
                this.voc = new jd(this.wcn, this.f20731qk, this.kln, this);
                if (this.f20719dt.i_() && (this.f20719dt.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.jpo.my)) {
                    com.bytedance.sdk.openadsdk.cm.Cif cifJd = ((com.bytedance.sdk.openadsdk.core.widget.jpo.my) this.f20719dt.getWebViewClient()).jd();
                    this.tic = cifJd;
                    if (cifJd != null) {
                        cifJd.jpo(this.voc);
                        this.tic.jd(true);
                    }
                } else {
                    this.tic = new com.bytedance.sdk.openadsdk.cm.Cif(this.f20731qk, this.f20719dt.getWebView(), this.voc, this.f20718dn).jd(true);
                }
                this.tic.jpo(this.kln);
                com.bytedance.sdk.openadsdk.common.cm cmVarJpo = tic.jpo(this.f20731qk, this.f20719dt, this.sz, this.kln);
                this.sbx = cmVarJpo;
                if (cmVarJpo != null) {
                    cmVarJpo.jpo(this.kln);
                }
                tic.jpo(this.f20731qk, this.f20719dt);
            }
            m474if();
            if (this.f20719dt.i_()) {
                nmd();
            }
            this.f20719dt.setLandingPage(true);
            this.f20719dt.setTag(this.kln);
            this.f20719dt.setMaterialMeta(this.f20731qk.eye());
            nmdVar = this;
            com.bytedance.sdk.openadsdk.core.widget.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.widget.jpo.my(com.bytedance.sdk.openadsdk.core.sq.jpo(), this.f20737tu, this.f20731qk.fc(), this.sbx, this.tic, true) { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    nmd.this.au();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    nmd.this.f20720ef.sq();
                    nmd.this.f20733rv = System.currentTimeMillis();
                    if (!nmd.jd(nmd.this.f20731qk) || nmd.this.prr == null || dt.my(nmd.this.f20731qk)) {
                        return;
                    }
                    nmd.this.prr.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    String strCm = com.bytedance.sdk.openadsdk.core.widget.jpo.my.cm(str2);
                    boolean z10 = false;
                    if (this.f20925jj != null) {
                        this.f20925jj.jpo(webView, i10, str, str2, com.bytedance.sdk.openadsdk.core.widget.jpo.my.cm(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z11 = strCm != null && strCm.startsWith("image");
                    if (strCm != null && strCm.startsWith("mp4")) {
                        z10 = true;
                    }
                    if (z11 || z10 || nmd.this.f20738uu.get()) {
                        return;
                    }
                    nmd.this.prr();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        nmd.this.prr();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(nmd.this.xk)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        nmd.m473if(nmd.this);
                        WebResourceResponseModel webResourceResponseModelJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(nmd.this.f20723ic, nmd.this.xk, str);
                        if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getWebResourceResponse() != null) {
                            nmd.oya(nmd.this);
                            return webResourceResponseModelJpo.getWebResourceResponse();
                        }
                        if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getMsg() == 2) {
                            nmd.prr(nmd.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.nmd.jpo("LandingPageModel", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!nmd.wqx(nmd.this.f20731qk) || tic.jpo(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(nmd.this.sz, (Class<?>) TTCeilingLandingPageActivity.class);
                    nmd.this.f20731qk.my(str);
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.pdm.jpo().jpo(nmd.this.f20731qk));
                    com.bytedance.sdk.component.utils.jd.jpo(this.f20923cm, intent, null);
                    return true;
                }
            };
            nmdVar.f20730pe = myVar;
            nmdVar.f20719dt.setWebViewClient(myVar);
            nmdVar.f20730pe.jpo(nmdVar.f20731qk);
            nmdVar.f20730pe.jpo(nmdVar.kln);
            nmdVar.f20730pe.jpo(nmdVar.f20720ef);
            nmdVar.f20719dt.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(nmdVar.f20737tu, nmdVar.tic, nmdVar.sbx) { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (nmd.this.sz != null && !nmd.this.sz.isFinishing() && i10 == 100) {
                        nmd.this.au();
                    }
                    if (nmd.this.f20729nq != null) {
                        nmd.this.f20729nq.jpo(i10);
                    }
                }
            });
            if (nmdVar.f20717dm == null) {
                nmdVar.f20717dm = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), nmdVar.kln);
            }
            nmdVar.f20719dt.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                    if (nmd.this.f20717dm != null) {
                        nmd.this.f20717dm.wqx(nmd.this.f20731qk);
                    }
                }
            });
            com.bytedance.sdk.component.zz.jj jjVar3 = nmdVar.f20719dt;
            jjVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.jr.jpo(jjVar3.getWebView(), BuildConfig.VERSION_CODE));
            nmdVar.f20719dt.setMixedContentMode(0);
            nmdVar.f20719dt.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    if (nmd.this.tic != null) {
                        nmd.this.tic.jd(i11);
                    }
                }
            });
            nmdVar.f20719dt.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (nmd.this.zz()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            nmd.this.rxq = motionEvent.getY();
                        } else if (action == 1) {
                            if (va.jpo(nmd.this.rxq, motionEvent.getY(), nmd.this.sz)) {
                                nmd.this.jd(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (nmd.this.f20740vk && motionEvent.getAction() == 1 && nmd.this.f20720ef != null) {
                        nmd.this.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                nmd.this.f20720ef.rxq();
                            }
                        });
                    }
                    if ((!nmd.this.roc || nmd.yd(nmd.this.f20731qk)) && !nmd.qk(nmd.this.f20731qk)) {
                        nmd.this.oya.onTouch(view, motionEvent);
                    }
                    if ((!nmd.this.roc || nmd.yd(nmd.this.f20731qk)) && !nmd.qk(nmd.this.f20731qk) && motionEvent.getAction() == 1 && nmd.this.oya.jj()) {
                        nmd.this.f20719dt.getWebView().performClick();
                        nmd.this.roc = true;
                    }
                    if (nmd.this.tic != null) {
                        nmd.this.tic.jpo(motionEvent);
                    }
                    if (nmd.this.sbx == null) {
                        return false;
                    }
                    nmd.this.sbx.jpo(motionEvent);
                    return false;
                }
            });
            nmdVar.f20719dt.getWebView().setOnClickListener(nmdVar.oya);
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(nmdVar.f20731qk, nmdVar.kln, nmdVar.f20718dn);
            if (!nmdVar.f20719dt.i_()) {
                com.bytedance.sdk.component.utils.nmd.jpo("LandingPageModel", "loadUrlWithRefer url  = " + nmdVar.f20731qk.iwg());
                com.bytedance.sdk.openadsdk.utils.rq.jpo(nmdVar.f20719dt, nmdVar.f20731qk.iwg());
            }
            nmdVar.f20739va = true;
        }
        com.bytedance.sdk.component.zz.jj jjVar4 = nmdVar.f20719dt;
        if (jjVar4 == null || nmdVar.f20729nq == null || jjVar4.wqx()) {
            return;
        }
        nmdVar.f20729nq.jpo();
    }

    public static boolean my(dt dtVar) {
        se seVarZx;
        return dtVar != null && dtVar.pzk() == 3 && !rv.jd(dtVar) && (dtVar.sy() == 0.0f || dtVar.sy() == 100.0f) && (seVarZx = dtVar.zx()) != null && seVarZx.jpo() == 1;
    }

    private void nmd() {
        com.bytedance.sdk.component.zz.jj jjVar = this.f20719dt;
        if (jjVar == null || jjVar.getWebView() == null) {
            return;
        }
        this.fy = this.f20719dt.jpo;
        this.huv = this.f20719dt.f19072jd;
        this.f20741ya = this.f20719dt.wqx;
        if (this.f20719dt.jd()) {
            this.f20720ef.sq();
            this.f20733rv = System.currentTimeMillis();
        }
        if (this.f20719dt.cm()) {
            au();
        }
        if (this.f20719dt.wqx()) {
            au();
            int iJpo = tic.jpo(this.f20719dt.getWebView());
            jd jdVar = this.voc;
            if (jdVar != null) {
                jdVar.jpo(iJpo != 1 ? 0 : 1);
            }
        }
    }

    private void opi() {
        if (cm()) {
            this.f20734se.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f20722hx, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.zz = duration;
            duration.setRepeatMode(2);
            this.zz.setRepeatCount(-1);
            this.zz.start();
            this.f20734se.setClickable(true);
            this.f20734se.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!nmd.this.roc) {
                        nmd.this.oya.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    nmd.this.f20742yd = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    nmd.this.f20742yd.setDuration(200L);
                    nmd.this.f20742yd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nmd.this.hmu.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            nmd.this.jpo((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            nmd.this.hmu.setLayoutParams(layoutParams);
                        }
                    });
                    if (nmd.this.oya.jj()) {
                        nmd.this.f20734se.performClick();
                        nmd.this.roc = true;
                    }
                    nmd.this.f20742yd.start();
                    nmd.this.f20734se.setVisibility(8);
                    return true;
                }
            });
            this.f20734se.setOnClickListener(this.oya);
        }
        if (!jr()) {
            this.xyk.setVisibility(8);
            this.f20725jd.setVisibility(0);
            this.jpo.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.jpo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    nmd nmdVar = nmd.this;
                    com.bytedance.sdk.openadsdk.cm.wqx.jd(nmdVar.f20731qk, nmdVar.kln);
                }
            });
            dt dtVar = this.f20731qk;
            if (dtVar != null && dtVar.fri() != null && this.f20731qk.fri().size() > 0 && this.f20731qk.fri().get(0) != null && !TextUtils.isEmpty(this.f20731qk.fri().get(0).jpo())) {
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20731qk.fri().get(0), this.jpo, this.f20731qk, new com.bytedance.sdk.component.my.hna() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.7
                    @Override // com.bytedance.sdk.component.my.hna
                    public void jpo(com.bytedance.sdk.component.my.ju juVar) {
                        if (nmd.this.prr != null) {
                            nmd.this.prr.removeMessages(101);
                        }
                    }

                    @Override // com.bytedance.sdk.component.my.hna
                    public void jpo(int i10, String str, Throwable th2) {
                        if (nmd.this.prr != null) {
                            nmd.this.prr.removeMessages(101);
                        }
                        nmd.this.yd();
                    }
                });
            }
        }
        try {
            String strJpo = this.f20731qk.fri().get(0).jpo();
            com.bytedance.sdk.openadsdk.zz.cm.jpo().jpo(strJpo).jpo(this.f20731qk.fri().get(0).jd()).jd(this.f20731qk.fri().get(0).wqx()).my(va.my(com.bytedance.sdk.openadsdk.core.sq.jpo())).cm(va.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo())).wqx(1).jpo(new jpo()).jpo(new com.bytedance.sdk.openadsdk.zz.jd(this.f20731qk, strJpo, new com.bytedance.sdk.component.my.hna() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.8
                @Override // com.bytedance.sdk.component.my.hna
                public void jpo(int i10, String str, Throwable th2) {
                }

                @Override // com.bytedance.sdk.component.my.hna
                public void jpo(com.bytedance.sdk.component.my.ju juVar) {
                    Drawable bitmapDrawable;
                    try {
                        Object objJd = juVar.jd();
                        if (objJd != null && juVar.wqx() != null) {
                            if (objJd instanceof Bitmap) {
                                bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.sq.jpo().getResources(), (Bitmap) objJd);
                            } else if (objJd instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && a.d(objJd)) {
                                    a.b(objJd).start();
                                }
                                bitmapDrawable = (Drawable) objJd;
                            } else {
                                bitmapDrawable = null;
                            }
                            if (!nmd.this.jr()) {
                                nmd.this.f20725jd.setBackground(bitmapDrawable);
                                return;
                            }
                            nmd.this.f20716cm.setBackground(bitmapDrawable);
                            View viewHna = nmd.this.f20720ef.hna();
                            if (viewHna == null || !(viewHna.getParent() instanceof View)) {
                                return;
                            }
                            ((View) viewHna.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    private void oya() {
        this.f20726jj.setVisibility(8);
        if (cm(this.f20731qk) || qk(this.f20731qk) || !cm() || wqx(this.f20731qk)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.f20728ju = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.f20728ju.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nmd.this.hmu.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                nmd.this.jpo((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                nmd.this.hmu.setLayoutParams(layoutParams);
            }
        });
        this.f20728ju.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prr() {
        LinearLayout.LayoutParams layoutParams;
        if (this.f20738uu.get()) {
            return;
        }
        hna();
        this.vrc.set(true);
        jpo(-1);
        this.f20720ef.mo426if();
        Cif cif = this.f20729nq;
        if (cif != null) {
            cif.jd();
        }
        if (qk(this.f20731qk)) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), this.f20731qk, this.kln, "show_agg_backup");
            View view = this.f20735sq;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f20735sq.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.f20735sq.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.f20726jj;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.hna.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.hna.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.hna.setLayoutParams(layoutParams3);
        if (this.f20731qk.ou() != null && !TextUtils.isEmpty(this.f20731qk.ou().jpo())) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20731qk.ou().jpo(), this.f20731qk.ou().jd(), this.f20731qk.ou().wqx(), this.nmd, this.f20731qk);
        }
        this.opi.setText(this.f20731qk.as());
        this.f20727jr.setText(this.f20731qk.xp());
        if (this.f20732rq != null) {
            jd();
            this.f20732rq.setClickable(true);
            this.f20732rq.setOnClickListener(this.f20715au);
            this.f20732rq.setOnTouchListener(this.f20715au);
        }
        if (!wqx(this.f20731qk) || (layoutParams = this.ota) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            cm(8);
        } else {
            cm(0);
        }
    }

    public static boolean qk(dt dtVar) {
        return dtVar != null && dtVar.jkt() == 33;
    }

    private void sq() {
        com.bytedance.sdk.openadsdk.common.ju loadingStyle;
        Cif cif = this.f20729nq;
        if (cif != null && (loadingStyle = cif.getLoadingStyle()) != null) {
            this.f20724ii = loadingStyle.jd();
            this.cql = loadingStyle.wqx();
        }
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = this.jkt;
        if (cmVar != null) {
            cmVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (nmd.this.jkt.getTag() != null) {
                        if (nmd.this.jkt.getTag().equals(1)) {
                            nmd.this.jd(3);
                        } else if (nmd.this.jkt.getTag().equals(2)) {
                            nmd.this.jd(4);
                        }
                    }
                }
            });
        }
    }

    public static boolean xyk(dt dtVar) {
        return cm(dtVar) && !ju(dtVar);
    }

    public static boolean yd(dt dtVar) {
        if (dtVar != null) {
            return dtVar.jkt() == 19 || dtVar.jkt() == 20;
        }
        return false;
    }

    public static boolean zz(dt dtVar) {
        return (dtVar == null || dtVar.kn() == 1 || !yd(dtVar)) ? false : true;
    }

    public boolean cm() {
        return this.f20731qk.iqh() == 15 || this.f20731qk.iqh() == 16;
    }

    public void jd() {
        dt dtVar = this.f20731qk;
        if (dtVar == null || TextUtils.isEmpty(dtVar.clt())) {
            return;
        }
        this.f20732rq.setText(this.f20731qk.clt());
    }

    public void qk() {
        com.bytedance.sdk.openadsdk.core.ef efVar = this.f20737tu;
        if (efVar != null) {
            efVar.ju();
        }
        com.bytedance.sdk.openadsdk.cm.Cif cif = this.tic;
        if (cif != null) {
            cif.qk();
        }
    }

    public void wqx() {
        if (jr()) {
            try {
                String strYd = this.f20731qk.ww().yd();
                com.bytedance.sdk.openadsdk.zz.cm.jpo().jpo(strYd).jpo(this.f20731qk.ww().wqx()).jd(this.f20731qk.ww().jd()).my(va.my(com.bytedance.sdk.openadsdk.core.sq.jpo())).cm(va.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo())).wqx(2).jpo(new jpo()).jpo(new com.bytedance.sdk.openadsdk.zz.jd(this.f20731qk, strYd, new com.bytedance.sdk.component.my.hna() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.4
                    @Override // com.bytedance.sdk.component.my.hna
                    public void jpo(int i10, String str, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.my.hna
                    public void jpo(com.bytedance.sdk.component.my.ju juVar) {
                        try {
                            Object objJd = juVar.jd();
                            if (objJd != null && juVar.wqx() != null) {
                                BitmapDrawable bitmapDrawable = objJd instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.sq.jpo().getResources(), (Bitmap) objJd) : null;
                                View viewHna = nmd.this.f20720ef.hna();
                                if (bitmapDrawable == null || viewHna == null || !(viewHna.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewHna.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.nmd.wqx("LandingPageModel", th2.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public void xyk() {
        com.bytedance.sdk.openadsdk.cm.Cif cif = this.tic;
        if (cif != null) {
            cif.xyk();
        }
    }

    public static boolean cm(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        if (ju(dtVar)) {
            return true;
        }
        return dtVar.pzk() == 3 && (dtVar.jkt() == 5 || my(dtVar)) && !rv.jd(dtVar) && (dtVar.sy() == 0.0f || dtVar.sy() == 100.0f);
    }

    public void jj() {
        com.bytedance.sdk.component.zz.jj jjVar;
        com.bytedance.sdk.openadsdk.cm.Cif cif = this.tic;
        if (cif != null && (jjVar = this.f20719dt) != null) {
            cif.jpo(jjVar);
        }
        Handler handler = this.prr;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.aix;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.aix.cancel();
        }
        ValueAnimator valueAnimator2 = this.f20742yd;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.f20742yd.cancel();
        }
        ObjectAnimator objectAnimator = this.f20728ju;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f20728ju.cancel();
        }
        Cif cif2 = this.f20729nq;
        if (cif2 != null) {
            cif2.jd();
        }
        ObjectAnimator objectAnimator2 = this.zz;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.zz.jj jjVar2 = this.f20719dt;
        if (jjVar2 != null) {
            com.bytedance.sdk.openadsdk.core.tic.jpo(jjVar2.getWebView());
        }
        this.f20719dt = null;
        com.bytedance.sdk.openadsdk.core.ef efVar = this.f20737tu;
        if (efVar != null) {
            efVar.m457if();
        }
        com.bytedance.sdk.openadsdk.cm.Cif cif3 = this.tic;
        if (cif3 != null) {
            cif3.cm(true);
        }
        if (!TextUtils.isEmpty(this.xk) && this.f20739va) {
            wqx.jpo.jpo(this.huv, this.fy, this.f20731qk);
        }
        com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.f20723ic);
    }

    public void yd() {
        if ("landingpage_split_screen".equals(this.kln) && com.bytedance.sdk.openadsdk.rq.jpo.jpo("default_split_style", false) && this.f20736tl.compareAndSet(false, true)) {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.10
                @Override // java.lang.Runnable
                public void run() {
                    nmd.this.aix = ValueAnimator.ofFloat(1.0f, 0.0f);
                    nmd.this.aix.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (nmd.this.pdm != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nmd.this.pdm.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                nmd.this.pdm.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    nmd.this.aix.setDuration(500L);
                    nmd.this.aix.start();
                    if (nmd.this.f20734se != null) {
                        nmd.this.f20734se.setVisibility(8);
                    }
                }
            });
        }
    }

    public boolean zz() {
        AtomicBoolean atomicBoolean;
        return (!wqx(this.f20731qk) || (atomicBoolean = this.f20721et) == null || atomicBoolean.get()) ? false : true;
    }

    public static boolean jd(dt dtVar) {
        return dtVar != null && dtVar.pzk() == 3 && dtVar.jkt() == 6 && !rv.jd(dtVar) && dtVar.ll() == 1 && (dtVar.sy() == 0.0f || dtVar.sy() == 100.0f);
    }

    public void my() {
        FrameLayout frameLayout = this.hmu;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.pdm;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm(int i10) {
        va.jpo((View) this.f20724ii, i10);
        va.jpo((View) this.cql, i10);
        if (this.vrc.get()) {
            va.jpo((View) this.opi, i10);
            va.jpo((View) this.f20727jr, i10);
            va.jpo((View) this.nmd, i10);
            va.jpo((View) this.f20732rq, 0);
        }
    }

    public void jpo(wqx.jpo jpoVar) {
        this.f133if = jpoVar;
    }

    public void jd(int i10) {
        com.bytedance.sdk.openadsdk.core.zz.nmd nmdVar = this.cgn;
        if (nmdVar != null) {
            nmdVar.my(i10);
        }
    }

    public void jpo() {
        long jJpo;
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.zz.jj jjVar = (com.bytedance.sdk.component.zz.jj) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.nmd);
        this.f20719dt = jjVar;
        if (jjVar != null && !dt.jpo(this.f20731qk)) {
            if (!this.f20719dt.i_()) {
                this.f20719dt.my();
            }
        } else {
            va.jpo((View) this.f20719dt, 8);
        }
        this.hmu = (FrameLayout) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21532jr);
        this.f20729nq = (Cif) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.hmu);
        this.f20734se = this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21546rq);
        this.f20722hx = (ImageView) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21553tu);
        this.pdm = this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.kln);
        this.f20725jd = (FrameLayout) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21551sq);
        this.jpo = (ImageView) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.opi);
        this.f20726jj = (RelativeLayout) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21518dt);
        this.wqx = (TextView) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.woc);
        this.f20716cm = (FrameLayout) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21562yd);
        View viewFindViewById = this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21539nq);
        this.hna = viewFindViewById;
        if (viewFindViewById == null) {
            this.hna = this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.nzb);
        }
        this.f20735sq = this.sz.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21548se);
        this.opi = (TextView) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.pdm);
        this.f20727jr = (TextView) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21547rv);
        this.nmd = (com.bytedance.sdk.openadsdk.core.widget.sq) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21526hx);
        this.f20732rq = (TextView) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21554uu);
        if (this.wqx != null && this.f20731qk.nmd() != null) {
            this.wqx.setText(this.f20731qk.nmd().my());
        }
        this.my = this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.sz);
        this.jkt = (com.bytedance.sdk.openadsdk.core.jj.cm) this.nzb.findViewById(com.bytedance.sdk.openadsdk.utils.hna.jfy);
        if ((cm(this.f20731qk) || jd(this.f20731qk) || qk(this.f20731qk) || wqx(this.f20731qk)) && this.f20731qk.nmd() != null) {
            View view2 = this.my;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (qk(this.f20731qk)) {
                jJpo = this.f20731qk.nmd().wqx();
            } else {
                jJpo = this.f20731qk.nmd().jpo();
            }
            com.bytedance.sdk.openadsdk.core.oya.wqx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.11
                @Override // java.lang.Runnable
                public void run() {
                    if (nmd.this.f20738uu.get()) {
                        return;
                    }
                    nmd nmdVar = nmd.this;
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(nmdVar.f20731qk, nmdVar.kln, System.currentTimeMillis() - nmd.this.f20733rv, false);
                    nmd.this.prr();
                }
            }, jJpo * 1000);
        }
        ju();
        if (jd(this.f20731qk)) {
            opi();
            if (!cm()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.hmu.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.hmu.setLayoutParams(layoutParams);
            }
        }
        if ((cm(this.f20731qk) || qk(this.f20731qk)) && (view = this.pdm) != null) {
            view.setVisibility(8);
        }
        Cif cif = this.f20729nq;
        if (cif != null) {
            cif.jpo(this.f20731qk);
        }
        if (wqx(this.f20731qk)) {
            sq();
        }
        wqx.jpo.jpo(SystemClock.elapsedRealtime() - jElapsedRealtime, this.f20731qk, this.kln, this.f20723ic, this.xk);
    }

    public static boolean wqx(dt dtVar) {
        return dtVar != null && dtVar.pzk() == 3 && dtVar.cgn() == 38 && dtVar.ll() == 1;
    }

    public static boolean au(dt dtVar) {
        return (dtVar == null || !com.bytedance.sdk.openadsdk.core.sq.cm().jr() || !dtVar.eq() || jd(dtVar) || cm(dtVar) || qk(dtVar)) ? false : true;
    }

    /* renamed from: if, reason: not valid java name */
    public static boolean m475if(dt dtVar) {
        if (dtVar != null) {
            return my(dtVar) || jj(dtVar);
        }
        return false;
    }

    public static boolean ju(dt dtVar) {
        return dtVar != null && dtVar.jkt() == 19;
    }

    public static boolean jpo(dt dtVar) {
        if (dtVar == null || ju(dtVar) || jj(dtVar) || my(dtVar)) {
            return false;
        }
        return cm(dtVar) || jd(dtVar) || qk(dtVar);
    }

    public void jpo(int i10) {
        com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar = this.f20720ef;
        if (jdVar != null) {
            jdVar.jj();
        }
    }

    public void jpo(float f10) {
        try {
            this.f20720ef.prr();
        } catch (Throwable unused) {
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.zz.nmd nmdVar, FrameLayout frameLayout) {
        this.cgn = nmdVar;
        this.hks = frameLayout;
    }

    public void jpo(final int i10, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        float f10;
        int iJj;
        if ((i10 != 3 && !wqx(i10)) || this.hks == null || oyaVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f20721et;
        if (atomicBoolean != null) {
            if (i10 == 1) {
                return;
            }
            if (i10 == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.pdm.getLayoutParams();
        this.ota = (LinearLayout.LayoutParams) this.hmu.getLayoutParams();
        final float f11 = layoutParams.weight;
        jr jrVarTu = this.f20731qk.tu();
        if (wqx(i10)) {
            if (jrVarTu != null) {
                iJj = jrVarTu.my();
                f10 = iJj;
            } else {
                f10 = 30.0f;
            }
        } else if (jrVarTu != null) {
            iJj = jrVarTu.jj();
            f10 = iJj;
        } else {
            f10 = 70.0f;
        }
        final float f12 = f10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.hks.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        final int i11 = layoutParams3.height;
        final int i12 = layoutParams3.width;
        final int i13 = layoutParams3.leftMargin;
        final int i14 = layoutParams3.topMargin;
        final int iJd = va.jd(this.sz, (float) oyaVar.qk());
        final int iJd2 = va.jd(this.sz, (float) oyaVar.xyk());
        final int iJd3 = va.jd(this.sz, (float) oyaVar.my());
        final int iJd4 = va.jd(this.sz, (float) oyaVar.jj());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f20742yd = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f20742yd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.nmd.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                float f13 = f11;
                layoutParams4.weight = o2.a(f12, f13, fFloatValue, f13);
                nmd.this.ota.weight = 100.0f - layoutParams.weight;
                if (nmd.this.pdm != null) {
                    nmd.this.pdm.setLayoutParams(layoutParams);
                }
                if (nmd.this.hmu != null) {
                    nmd.this.hmu.setLayoutParams(nmd.this.ota);
                }
                if (nmd.this.ota.weight < 30.0f) {
                    nmd.this.cm(8);
                } else {
                    nmd.this.cm(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                layoutParams5.width = i12 + ((int) ((iJd - r2) * fFloatValue));
                layoutParams5.height = i11 + ((int) ((iJd2 - r2) * fFloatValue));
                layoutParams5.leftMargin = i13 + ((int) ((iJd3 - r2) * fFloatValue));
                layoutParams5.topMargin = i14 + ((int) ((iJd4 - r2) * fFloatValue));
                if (nmd.this.hks != null) {
                    nmd.this.hks.setLayoutParams(layoutParams3);
                }
                nmd.this.jpo(0.0f);
                if (fFloatValue == 1.0f) {
                    if (nmd.this.jkt != null) {
                        va.jpo((View) nmd.this.jkt, 0);
                        if (nmd.this.wqx(i10)) {
                            nmd.this.jkt.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(nmd.this.sz, "tt_ad_zoom_down"));
                            nmd.this.jkt.setTag(1);
                        } else {
                            nmd.this.jkt.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(nmd.this.sz, "tt_ad_zoom_up"));
                            nmd.this.jkt.setTag(2);
                        }
                    }
                    if (nmd.this.f20721et == null) {
                        nmd.this.f20721et = new AtomicBoolean();
                    }
                    nmd.this.f20721et.set(nmd.this.wqx(i10));
                }
            }
        });
        com.bytedance.sdk.openadsdk.cm.wqx.cm(this.f20731qk, this.kln, i10);
        this.f20742yd.start();
        if (this.wad.compareAndSet(false, true)) {
            this.ree = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.cm.Cif cif = this.tic;
        if (cif != null) {
            cif.jpo(true, SystemClock.elapsedRealtime());
        }
        va.jpo((View) this.jkt, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.erj < 100) {
            return false;
        }
        this.erj = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
