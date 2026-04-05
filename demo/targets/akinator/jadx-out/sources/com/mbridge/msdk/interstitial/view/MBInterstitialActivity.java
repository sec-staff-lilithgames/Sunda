package com.mbridge.msdk.interstitial.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import b0.e2;
import bp.oM.DwaEpyvxz;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.interstitial.controller.a;
import com.mbridge.msdk.mbsignalcommon.mraid.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBInterstitialActivity extends MBBaseActivity implements com.mbridge.msdk.mbsignalcommon.mraid.b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* renamed from: h, reason: collision with root package name */
    private CampaignEx f41336h;

    /* renamed from: i, reason: collision with root package name */
    private WindVaneWebView f41337i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f41338j;

    /* renamed from: k, reason: collision with root package name */
    private a.d f41339k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41340l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.d f41341m;
    public ProgressBar mProgressBar;
    public String mUnitid;

    /* renamed from: n, reason: collision with root package name */
    private long f41342n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f41343o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f41344p;

    /* renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.click.a f41348t;

    /* renamed from: f, reason: collision with root package name */
    private boolean f41334f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f41335g = false;
    public boolean mIsMBPage = false;

    /* renamed from: q, reason: collision with root package name */
    private Handler f41345q = new f();

    /* renamed from: r, reason: collision with root package name */
    Runnable f41346r = new j();

    /* renamed from: s, reason: collision with root package name */
    Runnable f41347s = new k();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(MBInterstitialActivity.this.f41337i, MBInterstitialActivity.this.f41337i.getLeft(), MBInterstitialActivity.this.f41337i.getTop(), MBInterstitialActivity.this.f41337i.getWidth(), MBInterstitialActivity.this.f41337i.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f41337i, MBInterstitialActivity.this.f41337i.getLeft(), MBInterstitialActivity.this.f41337i.getTop(), MBInterstitialActivity.this.f41337i.getWidth(), MBInterstitialActivity.this.f41337i.getHeight());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(MBInterstitialActivity.this)).b(MBInterstitialActivity.this.f41336h.getId());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBInterstitialActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public boolean b(WebView webView, String str) {
            return true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MBInterstitialActivity.this.f41340l = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            try {
                MBInterstitialActivity.this.f41340l = true;
                if (MBInterstitialActivity.this.f41339k != null) {
                    MBInterstitialActivity.this.f41339k.a(str);
                }
                MBInterstitialActivity.this.a(3, str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            try {
                if (MBInterstitialActivity.this.f41340l) {
                    return;
                }
                MBInterstitialActivity.this.a(1, "");
                MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
                if (mBInterstitialActivity.f41346r != null && mBInterstitialActivity.f41345q != null) {
                    MBInterstitialActivity.this.f41345q.removeCallbacks(MBInterstitialActivity.this.f41346r);
                }
                if (MBInterstitialActivity.this.f41339k != null) {
                    MBInterstitialActivity.this.f41339k.c();
                }
                MBInterstitialActivity mBInterstitialActivity2 = MBInterstitialActivity.this;
                if (!mBInterstitialActivity2.mIsMBPage) {
                    mBInterstitialActivity2.f41345q.postDelayed(MBInterstitialActivity.this.f41347s, 2000L);
                }
                MBInterstitialActivity.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
                if (MBInterstitialActivity.this.f41339k != null) {
                    MBInterstitialActivity.this.f41339k.a("load page failed");
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void c(WebView webView, int i10) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f41335g) {
                return;
            }
            MBInterstitialActivity.this.f41334f = true;
            if (MBInterstitialActivity.this.f41339k != null) {
                MBInterstitialActivity.this.f41339k.a("load page timeout");
                if (MBInterstitialActivity.this.f41337i != null) {
                    MBInterstitialActivity.this.f41337i.setVisibility(8);
                    MBInterstitialActivity.this.f41337i.setWebViewListener(null);
                    MBInterstitialActivity.this.f41337i.release();
                }
                MBInterstitialActivity.this.hideLoading();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
            if (mBInterstitialActivity.mIsMBPage) {
                return;
            }
            if (mBInterstitialActivity.f41336h != null && MBInterstitialActivity.this.f41336h.isMraid()) {
                MBInterstitialActivity.this.m();
            }
            com.mbridge.msdk.interstitial.cache.a.a().a(MBInterstitialActivity.this.f41336h, MBInterstitialActivity.this.mUnitid);
            if (MBInterstitialActivity.this.f41334f) {
                return;
            }
            MBInterstitialActivity.this.f41335g = true;
            MBInterstitialActivity.this.hideLoading();
            MBInterstitialActivity.this.showWebView();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements d.b {
        public l() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f41337i, d10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MBInterstitialActivity.this.f41337i != null && MBInterstitialActivity.this.f41336h != null) {
                    MBInterstitialActivity.this.f41337i.setVisibility(0);
                    if (MBInterstitialActivity.this.f41336h.isMraid()) {
                        MBInterstitialActivity.this.k();
                    }
                    MBInterstitialActivity.this.j();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f41337i != null) {
                MBInterstitialActivity.this.f41337i.setVisibility(8);
            }
        }
    }

    private void l() throws JSONException {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getApplicationContext());
        CampaignEx campaignEx = this.f41336h;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f41336h.getRequestIdNotice(), this.f41336h.getId(), this.mUnitid, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f41336h.getId()), this.f41336h.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f41336h.getId());
            this.f41343o = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        List<String> pv_urls;
        try {
            com.mbridge.msdk.foundation.controller.c.m().a(this);
            if (!TextUtils.isEmpty(this.f41336h.getImpressionURL())) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                CampaignEx campaignEx = this.f41336h;
                com.mbridge.msdk.click.a.a(contextD, campaignEx, this.mUnitid, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39792m);
            }
            if (!TextUtils.isEmpty(this.f41336h.getOnlyImpressionURL())) {
                Context contextD2 = com.mbridge.msdk.foundation.controller.c.m().d();
                CampaignEx campaignEx2 = this.f41336h;
                com.mbridge.msdk.click.a.a(contextD2, campaignEx2, this.mUnitid, campaignEx2.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39793n);
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.mUnitid, this.f41336h, "interstitial");
            e eVar = new e();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(eVar);
            } else {
                eVar.run();
            }
            CampaignEx campaignEx3 = this.f41336h;
            if (campaignEx3 == null || (pv_urls = campaignEx3.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f41336h, this.mUnitid, it.next(), false, true);
            }
        } catch (Throwable th2) {
            p0.a("MBInterstitialActivity", th2.getMessage());
        }
    }

    private void n() {
        CampaignEx campaignEx;
        this.f41338j.setOnClickListener(new h());
        if (this.f41337i == null || (campaignEx = this.f41336h) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(campaignEx);
        aVar.a(this.f41336h.getAppName());
        this.f41337i.setCampaignId(this.f41336h.getId());
        this.f41337i.setDownloadListener(aVar);
    }

    public void clickTracking() {
        try {
            if (this.f41336h != null && !z0.a(this.mUnitid)) {
                onIntersClick();
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getApplicationContext(), this.mUnitid);
                this.f41348t = aVar;
                aVar.a(new c());
                this.f41348t.a(this.f41336h);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() throws JSONException {
        finish();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    @Override // android.app.Activity
    public void finish() throws JSONException {
        super.finish();
        if (!this.f41343o) {
            l();
        }
        if (this.f41344p) {
            return;
        }
        reportPlayableClosed();
    }

    public com.mbridge.msdk.setting.l getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), this.mUnitid);
            return lVarE == null ? com.mbridge.msdk.setting.l.h(this.mUnitid) : lVarE;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f41336h;
    }

    public void goneWebView() {
        try {
            runOnUiThread(new n());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new b());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void initView() {
        this.f41337i = (WindVaneWebView) findViewById(h0.a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(h0.a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f41338j = (ImageView) findViewById(h0.a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int iA;
        super.onCreate(bundle);
        try {
            iA = h0.a(getApplicationContext(), "mbridge_interstitial_activity", TtmlNode.TAG_LAYOUT);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (!h0.a(iA)) {
                g();
                f();
                a.d dVar = this.f41339k;
                if (dVar != null) {
                    dVar.a("not found resource");
                }
                finish();
                return;
            }
            setContentView(iA);
            initView();
            e();
            com.mbridge.msdk.foundation.controller.c.m().a(this);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new g());
            this.f41336h.setCampaignUnitId(this.mUnitid);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this.f41336h);
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            a.d dVar = this.f41339k;
            if (dVar != null) {
                dVar.b();
            }
            com.mbridge.msdk.click.a aVar = this.f41348t;
            if (aVar != null) {
                aVar.a(false);
                this.f41348t.a((NativeListener.NativeTrackingListener) null);
                this.f41348t.c();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar2 = this.f41341m;
            if (dVar2 != null) {
                dVar2.d();
            }
            if (!this.f41343o) {
                l();
            }
            if (com.mbridge.msdk.interstitial.controller.a.f41303r != null && !TextUtils.isEmpty(this.mUnitid)) {
                com.mbridge.msdk.interstitial.controller.a.f41303r.remove(this.mUnitid);
            }
            this.f41339k = null;
            com.mbridge.msdk.foundation.feedback.b.b().d(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void onIntersClick() {
        try {
            a.d dVar = this.f41339k;
            if (dVar != null) {
                dVar.a();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f41336h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f41337i, "false");
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f41336h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f41337i, "true");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f41336h.setClickURL(str);
            a(str);
        }
        this.f41336h.setClickTempSource(2);
        this.f41336h.setClickType(2);
        this.f41336h.setTriggerClickSource(2);
        clickTracking();
    }

    public void reportPlayableClosed() {
        if (this.f41336h != null) {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f41336h.getId(), this.f41336h.getRequestId(), this.f41336h.getRequestIdNotice(), this.mUnitid, l0.s(com.mbridge.msdk.foundation.controller.c.m().d()));
            nVar.b(this.f41336h.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.m().d(), this.mUnitid);
            this.f41344p = true;
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        int iA = u0.a(this, 10.0f);
        if (i11 <= 0) {
            i11 = iA;
        }
        if (i12 <= 0) {
            i12 = iA;
        }
        if (i13 <= 0) {
            i13 = iA;
        }
        if (i14 <= 0) {
            i14 = iA;
        }
        if (this.f41338j != null) {
            int iA2 = u0.a(this, 25.0f);
            RelativeLayout.LayoutParams layoutParamsE = e2.e(iA2, iA2, 11);
            layoutParamsE.setMargins(i11, i13, i12, i14);
            this.f41338j.setLayoutParams(layoutParamsE);
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void showWebView() {
        runOnUiThread(new m());
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() throws JSONException {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        if (z10) {
            this.f41338j.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f41338j.setImageResource(h0.a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    private void e() {
        g();
        n();
        f();
        h();
    }

    private void f() {
        try {
            if (com.mbridge.msdk.interstitial.controller.a.f41303r == null || TextUtils.isEmpty(this.mUnitid) || !com.mbridge.msdk.interstitial.controller.a.f41303r.containsKey(this.mUnitid)) {
                return;
            }
            this.f41339k = com.mbridge.msdk.interstitial.controller.a.f41303r.get(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f41336h = (CampaignEx) intent.getSerializableExtra(INTENT_CAMAPIGN);
        }
        CampaignEx campaignEx = this.f41336h;
        if (campaignEx != null && campaignEx.isMraid()) {
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(this);
            this.f41341m = dVar;
            dVar.c();
            this.f41341m.a(new l());
        }
        CampaignEx campaignEx2 = this.f41336h;
        if (campaignEx2 != null) {
            com.mbridge.msdk.click.c.a(this, campaignEx2.getMaitve(), this.f41336h.getMaitve_src());
        }
    }

    private void h() {
        try {
            CampaignEx campaignEx = this.f41336h;
            if (campaignEx == null || (TextUtils.isEmpty(campaignEx.getHtmlUrl()) && !this.f41336h.isMraid())) {
                a.d dVar = this.f41339k;
                if (dVar != null) {
                    dVar.a("htmlurl is null");
                    return;
                }
                return;
            }
            p0.c("MBInterstitialActivity", "url:" + this.f41336h.getHtmlUrl());
            goneWebView();
            this.f41337i.setWebViewListener(new i());
            String htmlUrl = this.f41336h.getHtmlUrl();
            if (this.f41336h.isMraid()) {
                File file = new File(this.f41336h.getMraid());
                if (file.exists() && file.isFile() && file.canRead()) {
                    htmlUrl = "file:////" + this.f41336h.getMraid();
                }
            }
            this.f41342n = System.currentTimeMillis();
            this.f41337i.loadUrl(htmlUrl);
            this.f41345q.postDelayed(this.f41346r, WEB_LOAD_TIME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws JSONException {
        CampaignEx campaignEx = this.f41336h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = i10 != 0 ? i10 != 1 ? i10 != 2 ? "UNDEFINED" : "landscape" : DwaEpyvxz.otPs : AdError.UNDEFINED_DOMAIN;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        float fN = l0.n(this);
        float fM = l0.m(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.heightPixels;
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", BuildConfig.FLAVOR);
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f41337i, fN, fM);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41337i, f10, f11);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41337i, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41337i, this.f41341m.a());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41337i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.f41336h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        this.f41337i.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.n(this.f41336h.getRequestId());
            nVar.o(this.f41336h.getRequestIdNotice());
            nVar.b(this.f41336h.getId());
            nVar.b(this.f41336h.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.d(nVar, getApplicationContext(), this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        CampaignEx campaignEx = this.f41336h;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
        nVar.n(this.f41336h.getRequestId());
        nVar.o(this.f41336h.getRequestIdNotice());
        nVar.b(this.f41336h.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.f41342n));
        nVar.g("");
        nVar.m(str);
        nVar.a(CampaignEx.CLICKMODE_ON);
        nVar.b(this.f41336h.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.mUnitid, this.f41336h);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements com.mbridge.msdk.foundation.feedback.a {
        public g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            MBInterstitialActivity.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f41337i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f41337i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                p0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f41337i, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    private void a(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getApplicationContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements NativeListener.NativeTrackingListener {
        public c() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.hideLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MBInterstitialActivity.this.hideLoading();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.showLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends Handler {
        public f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }
}
