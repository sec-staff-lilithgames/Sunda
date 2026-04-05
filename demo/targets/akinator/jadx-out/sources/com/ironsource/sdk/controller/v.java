package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import be.nVUQ.UupKET;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.impl.aa;
import com.applovin.impl.d9;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.ironsource.A8;
import com.ironsource.B4;
import com.ironsource.B7;
import com.ironsource.C1;
import com.ironsource.C3119a4;
import com.ironsource.C3137b4;
import com.ironsource.C3156c5;
import com.ironsource.C3182dd;
import com.ironsource.C3191e4;
import com.ironsource.C3197ea;
import com.ironsource.C3200ed;
import com.ironsource.C3219fe;
import com.ironsource.C3227g4;
import com.ironsource.C3237ge;
import com.ironsource.C3245h4;
import com.ironsource.C3251ha;
import com.ironsource.C3257hg;
import com.ironsource.C3276j0;
import com.ironsource.C3281j5;
import com.ironsource.C3302k8;
import com.ironsource.C3316l4;
import com.ironsource.C3372o4;
import com.ironsource.C3410q8;
import com.ironsource.C3419r1;
import com.ironsource.C3422r4;
import com.ironsource.C3460t8;
import com.ironsource.C3477u8;
import com.ironsource.C3494v8;
import com.ironsource.C3545y8;
import com.ironsource.C8;
import com.ironsource.G5;
import com.ironsource.InterfaceC3140b7;
import com.ironsource.InterfaceC3194e7;
import com.ironsource.InterfaceC3298k4;
import com.ironsource.InterfaceC3378oa;
import com.ironsource.InterfaceC3445sa;
import com.ironsource.InterfaceC3453t1;
import com.ironsource.InterfaceC3456t4;
import com.ironsource.InterfaceC3490v4;
import com.ironsource.InterfaceC3507w4;
import com.ironsource.InterfaceC3524x4;
import com.ironsource.InterfaceC3541y4;
import com.ironsource.Je;
import com.ironsource.K8;
import com.ironsource.L;
import com.ironsource.Mb;
import com.ironsource.Mg;
import com.ironsource.Ng;
import com.ironsource.Ob;
import com.ironsource.Pc;
import com.ironsource.Q6;
import com.ironsource.Sc;
import com.ironsource.Tc;
import com.ironsource.Uc;
import com.ironsource.V7;
import com.ironsource.Y0;
import com.ironsource.Y1;
import com.ironsource.Y3;
import com.ironsource.Y4;
import com.ironsource.Z0;
import com.ironsource.Z4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.og;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.m;
import com.ironsource.sdk.controller.p;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.model.AdPayload;
import j1.o2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class v implements com.ironsource.sdk.controller.l, Pc, DownloadListener {

    /* renamed from: b0, reason: collision with root package name */
    private static final String f38695b0 = "about:blank";

    /* renamed from: c0, reason: collision with root package name */
    public static int f38696c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public static String f38697d0 = "is_store";

    /* renamed from: e0, reason: collision with root package name */
    public static String f38698e0 = "external_url";

    /* renamed from: f0, reason: collision with root package name */
    public static String f38699f0 = "secondary_web_view";

    /* renamed from: g0, reason: collision with root package name */
    private static String f38700g0 = "success";

    /* renamed from: h0, reason: collision with root package name */
    private static String f38701h0 = "fail";
    private String A;
    private com.ironsource.sdk.controller.d B;
    private og C;
    private Z0 D;
    private Z4 G;
    private com.ironsource.sdk.controller.o H;
    private com.ironsource.sdk.controller.q I;
    private com.ironsource.sdk.controller.u J;
    private com.ironsource.sdk.controller.i K;
    private com.ironsource.sdk.controller.a L;
    private com.ironsource.sdk.controller.j M;
    private C3419r1 N;
    private B4 O;
    private Mg P;
    private com.ironsource.sdk.controller.c Q;
    private Y3 R;
    private JSONObject S;
    private l.a T;
    private l.b U;
    private C3372o4 V;
    private boolean W;
    C3245h4 Y;
    final C3251ha Z;

    /* renamed from: a, reason: collision with root package name */
    private final V7 f38702a;

    /* renamed from: a0, reason: collision with root package name */
    private Sc f38703a0;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3298k4 f38704b;

    /* renamed from: f, reason: collision with root package name */
    private String f38708f;

    /* renamed from: g, reason: collision with root package name */
    private String f38709g;

    /* renamed from: h, reason: collision with root package name */
    private final C3281j5 f38710h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f38711i;

    /* renamed from: j, reason: collision with root package name */
    private p f38712j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38713k;

    /* renamed from: l, reason: collision with root package name */
    private CountDownTimer f38714l;

    /* renamed from: m, reason: collision with root package name */
    public CountDownTimer f38715m;

    /* renamed from: q, reason: collision with root package name */
    private final o f38719q;

    /* renamed from: r, reason: collision with root package name */
    private View f38720r;

    /* renamed from: s, reason: collision with root package name */
    private FrameLayout f38721s;

    /* renamed from: t, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f38722t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f38723u;

    /* renamed from: v, reason: collision with root package name */
    private u f38724v;

    /* renamed from: w, reason: collision with root package name */
    private String f38725w;

    /* renamed from: x, reason: collision with root package name */
    private InterfaceC3541y4 f38726x;

    /* renamed from: y, reason: collision with root package name */
    private InterfaceC3524x4 f38727y;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC3507w4 f38728z;

    /* renamed from: c, reason: collision with root package name */
    private String f38705c = ApsMetricsDataMap.APSMETRICS_FIELD_VERSION;

    /* renamed from: d, reason: collision with root package name */
    private String f38706d = "IronSource";

    /* renamed from: e, reason: collision with root package name */
    private final String f38707e = "We're sorry, some error occurred. we will investigate it";

    /* renamed from: n, reason: collision with root package name */
    private int f38716n = 50;

    /* renamed from: o, reason: collision with root package name */
    private int f38717o = 50;

    /* renamed from: p, reason: collision with root package name */
    private String f38718p = C3191e4.e.f36429b;
    private Object E = new Object();
    private boolean F = false;
    private final B7 X = Mb.U().i();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3477u8 f38730a;

        public b(C3477u8 c3477u8) {
            this.f38730a = c3477u8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.Q.c("controller html - failed to download - " + this.f38730a.b());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38732a;

        public c(Context context) {
            this.f38732a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f38732a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38734a;

        public d(Context context) {
            this.f38734a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f38734a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3460t8.e f38736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38737b;

        public e(C3460t8.e eVar, String str) {
            this.f38736a = eVar;
            this.f38737b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3490v4 interfaceC3490v4A;
            C3460t8.e eVar = this.f38736a;
            if ((eVar == C3460t8.e.RewardedVideo || eVar == C3460t8.e.Interstitial) && (interfaceC3490v4A = v.this.a(eVar)) != null) {
                interfaceC3490v4A.b(this.f38736a, this.f38737b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Mg {
        public g() {
        }

        @Override // com.ironsource.Mg
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f38741a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f38742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38743c;

        public h(JSONObject jSONObject, WebView webView, String str) {
            this.f38741a = jSONObject;
            this.f38742b = webView;
            this.f38743c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f38741a, this.f38742b);
            v.this.l("about:blank");
            v.this.l(this.f38743c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38745a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Q.c(C3191e4.c.f36398j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j10, long j11, int i10) {
            super(j10, j11);
            this.f38745a = i10;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f38705c, "Loading Controller Timer Finish");
            int i10 = this.f38745a;
            if (i10 == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i10 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(v.this.f38705c, "Loading Controller Timer Tick " + j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements s {
        public j() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C3460t8.e eVar, Y4 y42) {
            v.this.a(str, eVar, y42);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements s {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C3460t8.e eVar, Y4 y42) {
            v.this.a(str, eVar, y42);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements s {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, C3460t8.e eVar, Y4 y42) {
            v.this.a(str, eVar, y42);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3460t8.e f38751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y4 f38752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38753c;

        public m(C3460t8.e eVar, Y4 y42, String str) {
            this.f38751a = eVar;
            this.f38752b = y42;
            this.f38753c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Y4 y42;
            C3460t8.e eVar = C3460t8.e.RewardedVideo;
            C3460t8.e eVar2 = this.f38751a;
            if ((eVar != eVar2 && C3460t8.e.Interstitial != eVar2 && C3460t8.e.Banner != eVar2) || (y42 = this.f38752b) == null || TextUtils.isEmpty(y42.h())) {
                return;
            }
            InterfaceC3490v4 interfaceC3490v4A = v.this.a(this.f38751a);
            Log.d(v.this.f38705c, "onAdProductInitFailed (message:" + this.f38753c + ")(" + this.f38751a + ")");
            if (interfaceC3490v4A != null) {
                interfaceC3490v4A.a(this.f38751a, this.f38752b.h(), this.f38753c);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o extends WebChromeClient {
        public /* synthetic */ o(v vVar, int i10) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new q(v.this, 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = v.this.f38720r;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            v vVar = v.this;
            vVar.f38721s.removeView(vVar.f38720r);
            v vVar2 = v.this;
            vVar2.f38720r = null;
            vVar2.f38721s.setVisibility(8);
            v.this.f38722t.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.f38720r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.f38721s.addView(view);
            v vVar = v.this;
            vVar.f38720r = view;
            vVar.f38722t = customViewCallback;
            vVar.f38721s.setVisibility(0);
        }

        private o() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        C3460t8.e f38757a;

        /* renamed from: b, reason: collision with root package name */
        String f38758b;

        public p(C3460t8.e eVar, String str) {
            this.f38757a = eVar;
            this.f38758b = str;
        }

        public String a() {
            return this.f38758b;
        }

        public C3460t8.e b() {
            return this.f38757a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class q extends WebViewClient {
        public /* synthetic */ q(v vVar, int i10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.f38705c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextP = v.this.p();
            contextP.startActivity(new OpenUrlActivity.e(new k.b()).a(str).b(false).a(contextP));
            return true;
        }

        private q() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class r {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38761a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38762b;

            public a(String str, String str2) {
                this.f38761a = str;
                this.f38762b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f38761a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f38705c, "onRVShowFail(message:" + this.f38761a + ")");
                v.this.f38726x.b(this.f38762b, str);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38764a;

            public b(String str) {
                this.f38764a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f38705c, "onInterstitialInitSuccess()");
                v.this.f38727y.a(C3460t8.e.Interstitial, this.f38764a, (Y0) null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38766a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38767b;

            public c(String str, String str2) {
                this.f38766a = str;
                this.f38767b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f38766a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f38705c, "onInterstitialInitFail(message:" + str + ")");
                v.this.f38727y.a(C3460t8.e.Interstitial, this.f38767b, str);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3490v4 f38769a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3460t8.e f38770b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f38771c;

            public d(InterfaceC3490v4 interfaceC3490v4, C3460t8.e eVar, String str) {
                this.f38769a = interfaceC3490v4;
                this.f38770b = eVar;
                this.f38771c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f38769a.a(this.f38770b, this.f38771c);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38773a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ JSONObject f38774b;

            public e(String str, JSONObject jSONObject) {
                this.f38773a = str;
                this.f38774b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f38727y.a(this.f38773a, this.f38774b);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38776a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38777b;

            public f(String str, String str2) {
                this.f38776a = str;
                this.f38777b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f38776a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f38727y.a(this.f38777b, str);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38779a;

            public g(String str) {
                this.f38779a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f38705c, "onBannerInitSuccess()");
                v.this.f38728z.a(C3460t8.e.Banner, this.f38779a, (Y0) null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class h implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38781a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38782b;

            public h(String str, String str2) {
                this.f38781a = str;
                this.f38782b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f38781a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f38705c, "onBannerInitFail(message:" + str + ")");
                v.this.f38728z.a(C3460t8.e.Banner, this.f38782b, str);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class i implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38784a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3302k8 f38785b;

            public i(String str, C3302k8 c3302k8) {
                this.f38784a = str;
                this.f38785b = c3302k8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f38705c, "onBannerLoadSuccess()");
                v.this.f38728z.a(this.f38784a, this.f38785b);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class j implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38787a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38788b;

            public j(String str, String str2) {
                this.f38787a = str;
                this.f38788b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f38705c, "onLoadBannerFail()");
                String str = this.f38787a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f38728z.c(this.f38788b, str);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.E();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class l implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38791a;

            public l(String str) {
                this.f38791a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f38791a).has(f.b.f38556b)) {
                        v.this.T.a(f.a.a(this.f38791a));
                    } else {
                        v.this.U.a(Ob.a(this.f38791a));
                    }
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    Logger.e(v.this.f38705c, "failed to parse received message");
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class m implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3460t8.e f38793a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38794b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f38795c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ JSONObject f38796d;

            public m(C3460t8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f38793a = eVar;
                this.f38794b = str;
                this.f38795c = str2;
                this.f38796d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC3490v4 interfaceC3490v4A;
                C3460t8.e eVar = this.f38793a;
                if ((eVar == C3460t8.e.Interstitial || eVar == C3460t8.e.RewardedVideo || eVar == C3460t8.e.Banner) && (interfaceC3490v4A = v.this.a(eVar)) != null) {
                    interfaceC3490v4A.a(this.f38793a, this.f38794b, this.f38795c, this.f38796d);
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class n implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38798a;

            public n(String str) {
                this.f38798a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.f38705c, "omidAPI(" + this.f38798a + ")");
                    v.this.H.a(new C3237ge(this.f38798a).toString(), r.this.new w());
                } catch (Exception e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f38705c, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.A();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(C3191e4.f36343e);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.getSettings().setMixedContentMode(0);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.sdk.controller.v$r$r, reason: collision with other inner class name */
        public class RunnableC0243r implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f38803a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38804b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Y0 f38805c;

            public RunnableC0243r(int i10, String str, Y0 y02) {
                this.f38803a = i10;
                this.f38804b = str;
                this.f38805c = y02;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f38803a <= 0) {
                    v.this.f38726x.c(this.f38804b);
                } else {
                    Log.d(v.this.f38705c, "onRVInitSuccess()");
                    v.this.f38726x.a(C3460t8.e.RewardedVideo, this.f38804b, this.f38805c);
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class s implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38807a;

            public s(String str) {
                this.f38807a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.M.a(new JSONObject(this.f38807a), r.this.new w());
                } catch (Exception e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f38705c, "fileSystemAPI failed with exception " + e10.getMessage());
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class t implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38809a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38810b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f38811c;

            public t(String str, String str2, int i10) {
                this.f38809a = str;
                this.f38810b = str2;
                this.f38811c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f38809a.equalsIgnoreCase(C3460t8.e.RewardedVideo.toString())) {
                    v.this.f38726x.a(this.f38810b, this.f38811c);
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class u implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38813a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f38814b;

            public u(String str, int i10) {
                this.f38813a = str;
                this.f38814b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f38727y.onInterstitialAdRewarded(this.f38813a, this.f38814b);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.sdk.controller.v$r$v, reason: collision with other inner class name */
        public class RunnableC0244v implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38816a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f38817b;

            public RunnableC0244v(String str, String str2) {
                this.f38816a = str;
                this.f38817b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f38816a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f38705c, "onRVInitFail(message:" + str + ")");
                v.this.f38726x.a(C3460t8.e.RewardedVideo, this.f38817b, str);
            }
        }

        public r() {
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.f38705c, "adClicked(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d(C3191e4.h.f36495m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C3460t8.e eVarG = v.this.g(strD);
            InterfaceC3490v4 interfaceC3490v4A = v.this.a(eVarG);
            if (eVarG == null || interfaceC3490v4A == null) {
                return;
            }
            v.this.b(new d(interfaceC3490v4A, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.f38706d, "adCredited(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d(C3191e4.h.f36491k);
            int i10 = strD != null ? Integer.parseInt(strD) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            String strD2 = c3237ge.d(C3191e4.h.f36495m);
            if (TextUtils.isEmpty(strD2)) {
                Log.d(v.this.f38706d, "adCredited | product type is missing");
            }
            if (C3460t8.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i10);
            } else if (v.this.q(strD2)) {
                v.this.b(new t(strD2, strFetchDemandSourceId, i10));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) throws NumberFormatException {
            Logger.i(v.this.f38705c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3237ge(str));
            Y0 y02 = new Y0(str);
            if (!y02.g()) {
                v.this.a(str, false, C3191e4.c.f36406r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = y02.d();
            if (C3460t8.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.q(strD)) {
                v.this.b(new RunnableC0243r(Integer.parseInt(y02.c()), strFetchDemandSourceId, y02));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.f38705c, "adViewAPI(" + str + ")");
                v.this.L.a(new C3237ge(str).toString(), new w());
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f38705c, "adViewAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(String str) {
            V7.f35633a.b(new com.ironsource.environment.thread.a(2, this, str));
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f38705c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C3460t8.e eVarG;
            try {
                Logger.i(v.this.f38705c, "cleanAdInstance(" + str + ")");
                C3237ge c3237ge = new C3237ge(str);
                String strD = c3237ge.d(C3191e4.h.f36495m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.G.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = C3197ea.e().a();
                C3237ge c3237ge = new C3237ge(str);
                if (!arrayListA.isEmpty()) {
                    c3237ge.b(C3191e4.h.f36518x0, arrayListA.toString());
                }
                v.this.a(c3237ge.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        public void d(String str) {
            v.this.i(v.this.a(C3191e4.g.f36446e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                Logger.i(v.this.f38705c, "deleteFile(" + str + ")");
                C3237ge c3237ge = new C3237ge(str);
                String strD = c3237ge.d(C3191e4.h.f36473b);
                String strD2 = c3237ge.d("path");
                if (strD2 != null && !TextUtils.isEmpty(strD)) {
                    C8 c82 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(c82, v.this.A);
                    if (!c82.exists()) {
                        v.this.a(str, false, C3191e4.c.f36394f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c82), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, C3191e4.c.f36395g, "1");
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                Logger.i(v.this.f38705c, "deleteFolder(" + str + ")");
                String strD = new C3237ge(str).d("path");
                if (strD == null) {
                    v.this.a(str, false, C3191e4.c.f36395g, "1");
                    return;
                }
                C8 c82 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD));
                IronSourceStorageUtils.ensurePathSafety(c82, v.this.A);
                if (!c82.exists()) {
                    v.this.a(str, false, C3191e4.c.f36393e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c82.getPath()), (String) null, (String) null);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.f38705c, "deviceDataAPI(" + str + ")");
                v.this.K.a(new C3237ge(str).toString(), new w());
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f38705c, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            com.google.android.gms.internal.play_billing.a.w("displayWebView(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
            C3237ge c3237ge = new C3237ge(str);
            boolean zBooleanValue = ((Boolean) c3237ge.b("display")).booleanValue();
            String strD = c3237ge.d(C3191e4.h.f36495m);
            boolean zC = c3237ge.c(C3191e4.h.f36511u);
            String strD2 = c3237ge.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            boolean zC2 = c3237ge.c(C3191e4.h.f36522z0);
            if (!zBooleanValue) {
                v.this.a(u.Gone);
                v.this.n();
                return;
            }
            v.this.F = c3237ge.c(C3191e4.h.f36513v);
            boolean zC3 = c3237ge.c(C3191e4.h.f36519y);
            u uVarU = v.this.u();
            u uVar = u.Display;
            if (uVarU == uVar) {
                Logger.i(v.this.f38705c, "State: " + v.this.f38724v);
                return;
            }
            v.this.a(uVar);
            Logger.i(v.this.f38705c, "State: " + v.this.f38724v);
            Context contextP = v.this.p();
            String strS = v.this.s();
            int iK = v.this.X.K(contextP);
            if (zC) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(contextP);
                hVar.addView(v.this.f38723u);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextP, (Class<?>) InterstitialActivity.class) : new Intent(contextP, (Class<?>) ControllerActivity.class);
            C3460t8.e eVar = C3460t8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strS)) {
                    strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                }
                intent.putExtra(C3191e4.h.f36495m, eVar.toString());
                v.this.D.a(eVar.ordinal());
                v.this.D.f(strFetchDemandSourceId);
                if (v.this.q(eVar.toString())) {
                    v.this.f38726x.c(eVar, strFetchDemandSourceId);
                }
            } else {
                C3460t8.e eVar2 = C3460t8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strS)) {
                        strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                    }
                    intent.putExtra(C3191e4.h.f36495m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(C3191e4.h.f36522z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra(C3191e4.h.f36513v, v.this.F);
            intent.putExtra(C3191e4.h.A, strS);
            intent.putExtra(C3191e4.h.B, iK);
            v vVar = v.this;
            vVar.f38712j = new p(vVar.g(strD), strFetchDemandSourceId);
            contextP.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.i(v.this.f38705c, "dsSharedSignalsAPI(" + str + ")");
                v.this.O.a(new C3237ge(str).toString(), new w());
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f38705c, "dsSharedSignalsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            com.google.android.gms.internal.play_billing.a.w("fileSystemAPI(", str, ")", v.this.f38705c);
            v.this.a(new s(str));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getApplicationInfo(java.lang.String r5) throws org.json.JSONException {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.B(r0)
                java.lang.String r1 = "getApplicationInfo("
                java.lang.String r2 = ")"
                com.google.android.gms.internal.play_billing.a.w(r1, r5, r2, r0)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.f0(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = com.ironsource.sdk.controller.v.d0(r1, r5)
                com.ironsource.ge r2 = new com.ironsource.ge
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.v r3 = com.ironsource.sdk.controller.v.this
                java.lang.Object[] r5 = com.ironsource.sdk.controller.v.j0(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L46
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L4d
                r0 = r1
                goto L4e
            L46:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L4d
                goto L4e
            L4d:
                r0 = 0
            L4e:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L63
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.Y(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.l0(r0, r5)
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.r.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            com.google.android.gms.internal.play_billing.a.w("getCachedFilesMap(", str, ")", v.this.f38705c);
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            C3237ge c3237ge = new C3237ge(str);
            if (!c3237ge.a("path")) {
                v.this.a(str, false, C3191e4.c.f36407s, (String) null);
                return;
            }
            String str2 = (String) c3237ge.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.A, str2)) {
                v.this.a(str, false, C3191e4.c.f36408t, (String) null);
                return;
            }
            v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.A, str2), C3191e4.g.f36461s, C3191e4.g.f36460r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strE;
            Logger.i(v.this.f38705c, "getConnectivityInfo(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d(v.f38700g0);
            String strD2 = c3237ge.d(v.f38701h0);
            JSONObject jSONObject = new JSONObject();
            v vVar = v.this;
            Y3 y32 = vVar.R;
            if (y32 != null) {
                jSONObject = y32.a(vVar.Z.getContext());
            }
            if (jSONObject.length() > 0) {
                strE = v.this.e(strD, jSONObject.toString());
            } else {
                strE = v.this.e(strD2, v.Z(v.this, "errMsg", C3191e4.c.A, null, null, null, null, null, null));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) throws JSONException {
            Logger.i(v.this.f38705c, "getControllerConfig(" + str + ")");
            String strD = new C3237ge(str).d(v.f38700g0);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) throws JSONException {
            String strD;
            Logger.i(v.this.f38705c, "getMediationState(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD2 = c3237ge.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            String strD3 = c3237ge.d(C3191e4.h.f36495m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                C3460t8.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    Y4 y4A = v.this.G.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3191e4.h.f36495m, strD3);
                    jSONObject.put("demandSourceName", strD2);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (y4A == null || y4A.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObject.put("state", y4A.j());
                    }
                    a(strD, jSONObject.toString());
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDeviceStatus(java.lang.String r5) throws org.json.JSONException {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.B(r0)
                java.lang.String r1 = "getDeviceStatus("
                java.lang.String r2 = ")"
                com.google.android.gms.internal.play_billing.a.w(r1, r5, r2, r0)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.f0(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r5 = com.ironsource.sdk.controller.v.d0(r1, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                com.ironsource.ha r2 = r1.Z
                android.content.Context r2 = r2.getContext()
                java.lang.Object[] r1 = com.ironsource.sdk.controller.v.e0(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L3d
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L44
                r0 = r5
                goto L45
            L3d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L44
                goto L45
            L44:
                r0 = 0
            L45:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5a
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.Y(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.l0(r0, r5)
            L5a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.r.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            com.google.android.gms.internal.play_billing.a.w("getDeviceVolume(", str, ")", v.this.f38705c);
            try {
                Context context = v.this.Z.getContext();
                float fA = C3156c5.b(context).a(context);
                C3237ge c3237ge = new C3237ge(str);
                c3237ge.b(C3191e4.i.P, String.valueOf(fA));
                v.this.a(c3237ge.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) throws JSONException {
            Logger.i(v.this.f38705c, "getInitSummery(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            c3237ge.a(C3191e4.i.f36558r0, v.this.S);
            v.this.a(c3237ge.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            A8.a(C3219fe.f36723z, new C3494v8().a(G5.f34451y, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, C3191e4.g.X, C3191e4.g.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.f38705c, "getUserData(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            if (!c3237ge.a(C3191e4.h.W)) {
                v.this.a(str, false, C3191e4.c.F, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = c3237ge.d(C3191e4.h.W);
            v.this.i(v.this.e(strE, v.Z(v.this, strD, C3197ea.e().a(strD), null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.f38705c, "iabTokenAPI(" + str + ")");
                v.this.J.a(new C3237ge(str).toString(), new w());
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f38705c, "iabTokenAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.f38705c, "initController(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            CountDownTimer countDownTimer = v.this.f38715m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.f38715m = null;
            }
            if (c3237ge.a(C3191e4.h.f36503q)) {
                String strD = c3237ge.d(C3191e4.h.f36503q);
                if (C3191e4.h.f36507s.equalsIgnoreCase(strD)) {
                    v vVar = v.this;
                    vVar.f38711i = true;
                    vVar.Q.d();
                } else if (C3191e4.h.f36505r.equalsIgnoreCase(strD)) {
                    v.this.Q.c();
                } else if (!C3191e4.h.f36509t.equalsIgnoreCase(strD)) {
                    Logger.i(v.this.f38705c, "No STAGE mentioned! should not get here!");
                } else {
                    v.this.Q.c(a.b.k("controller js failed to initialize : ", c3237ge.d("errMsg")));
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            com.google.android.gms.internal.play_billing.a.w("onAdWindowsClosed(", str, ")", v.this.f38705c);
            v.this.D.a();
            v.this.D.f(null);
            v.this.f38712j = null;
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d(C3191e4.h.f36495m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            C3460t8.e eVarG = v.this.g(strD);
            Log.d(v.this.f38706d, "onAdClosed() with type " + eVarG);
            if (v.this.q(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.f38705c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            com.google.android.gms.internal.play_billing.a.w("onGetApplicationInfoFail(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            com.google.android.gms.internal.play_billing.a.w("onGetApplicationInfoSuccess(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            com.google.android.gms.internal.play_billing.a.w("onGetCachedFilesMapFail(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            com.google.android.gms.internal.play_billing.a.w("onGetCachedFilesMapSuccess(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            com.google.android.gms.internal.play_billing.a.w("onGetDeviceStatusFail(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            com.google.android.gms.internal.play_billing.a.w("onGetDeviceStatusSuccess(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.f38705c, "onInitBannerFail(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f38705c, "onInitBannerFail failed with no demand source");
                return;
            }
            Z4 z42 = v.this.G;
            C3460t8.e eVar = C3460t8.e.Banner;
            Y4 y4A = z42.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new h(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f38705c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3237ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f38705c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.q(C3460t8.e.Banner.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.f38705c, "onInitInterstitialFail(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f38705c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            Z4 z42 = v.this.G;
            C3460t8.e eVar = C3460t8.e.Interstitial;
            Y4 y4A = z42.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new c(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f38705c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3237ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f38705c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.q(C3460t8.e.Interstitial.toString())) {
                v.this.b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.f38705c, "onInitRewardedVideoFail(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            Z4 z42 = v.this.G;
            C3460t8.e eVar = C3460t8.e.RewardedVideo;
            Y4 y4A = z42.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new RunnableC0244v(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f38705c, "onLoadBannerFail()");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.q(C3460t8.e.Banner.toString())) {
                v.this.b(new j(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f38705c, "onLoadBannerSuccess()");
            C3237ge c3237ge = new C3237ge(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            String strD = c3237ge.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            K8 k8A = C3410q8.a().a(strD);
            if (k8A == null) {
                v.this.f38728z.c(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
                return;
            }
            if (k8A instanceof C3302k8) {
                C3302k8 c3302k8 = (C3302k8) k8A;
                if (v.this.q(C3460t8.e.Banner.toString())) {
                    v.this.b(new i(strFetchDemandSourceId, c3302k8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.f38705c, "onLoadInterstitialFail(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.q(C3460t8.e.Interstitial.toString())) {
                v.this.b(new f(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.f38705c, "onLoadInterstitialSuccess(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            JSONObject jSONObjectA = c3237ge.a();
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.q(C3460t8.e.Interstitial.toString())) {
                v.this.b(new e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            com.google.android.gms.internal.play_billing.a.w("onReceivedMessage(", str, ")", v.this.f38705c);
            V7.f35633a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.f38705c, "onShowInterstitialFail(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            v.this.b(new aa(this, v.this.q(C3460t8.e.Interstitial.toString()), strD, strFetchDemandSourceId, 7));
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            com.google.android.gms.internal.play_billing.a.w("onShowInterstitialSuccess(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3237ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f38705c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            Z0 z02 = v.this.D;
            C3460t8.e eVar = C3460t8.e.Interstitial;
            z02.a(eVar.ordinal());
            v.this.D.f(strFetchDemandSourceId);
            v.this.b(new d9(this, v.this.q(eVar.toString()), strFetchDemandSourceId, 5));
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.f38705c, "onShowRewardedVideoFail(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
            if (v.this.q(C3460t8.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            com.google.android.gms.internal.play_billing.a.w("onShowRewardedVideoSuccess(", str, ")", v.this.f38705c);
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.f38705c, "openUrl(" + str + ")");
                C3237ge c3237ge = new C3237ge(str);
                p.c cVarA = new p.a(c3237ge.d("method"), new Uc(v.this.F, 805306368)).a(c3237ge.c(C3191e4.h.L0) ? v.this.Z.getContext() : v.this.p(), new Tc(c3237ge.d("url"), c3237ge.d("package_name")));
                if (cVarA instanceof p.c.a) {
                    v.this.a(str, false, ((p.c.a) cVarA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.f38705c, "permissionsAPI(" + str + ")");
                v.this.I.a(new C3237ge(str).toString(), new w());
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f38705c, "permissionsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            C3237ge c3237ge;
            String strD;
            String str2;
            try {
                Logger.i(v.this.f38705c, "postAdEventNotification(" + str + ")");
                c3237ge = new C3237ge(str);
                strD = c3237ge.d(C3191e4.h.f36490j0);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (TextUtils.isEmpty(strD)) {
                    v.this.a(str, false, C3191e4.c.f36411w, (String) null);
                    return;
                }
                String strD2 = c3237ge.d(C3191e4.h.f36492k0);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3237ge);
                String str3 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                JSONObject jSONObject = (JSONObject) c3237ge.b(C3191e4.h.f36494l0);
                String strD3 = c3237ge.d(C3191e4.h.f36495m);
                C3460t8.e eVarG = v.this.g(strD3);
                try {
                    if (!v.this.q(strD3)) {
                        v.this.a(str, false, C3191e4.c.f36410v, (String) null);
                        return;
                    }
                    String strE = v.this.e(str);
                    if (TextUtils.isEmpty(strE)) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        v.this.i(v.this.a(strE, v.Z(v.this, C3191e4.h.f36495m, strD3, C3191e4.h.f36490j0, strD, "demandSourceName", strD2, "demandSourceId", str2), C3191e4.g.f36443c0, C3191e4.g.f36445d0));
                    }
                    try {
                        v.this.b(new m(eVarG, str2, strD, jSONObject));
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        C3422r4.d().a(exc);
                        IronLog.INTERNAL.error(exc.toString());
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                exc = e13;
                C3422r4.d().a(exc);
                IronLog.INTERNAL.error(exc.toString());
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            com.google.android.gms.internal.play_billing.a.w("removeCloseEventHandler(", str, ")", v.this.f38705c);
            CountDownTimer countDownTimer = v.this.f38714l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            v.this.f38713k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.f38705c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.f38705c, "setBackButtonState(" + str + ")");
            C3197ea.e().c(new C3237ge(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.f38705c, "setForceClose(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d("width");
            String strD2 = c3237ge.d("height");
            v.this.f38716n = Integer.parseInt(strD);
            v.this.f38717o = Integer.parseInt(strD2);
            v.this.f38718p = c3237ge.d(C3191e4.h.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            com.google.android.gms.internal.play_billing.a.w("setMixedContentAlwaysAllow(", str, ")", v.this.f38705c);
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.f38705c, "setOrientation(" + str + ")");
                String strD = new C3237ge(str).d("orientation");
                v.this.n(strD);
                v vVar = v.this;
                if (vVar.f38703a0 != null) {
                    v.this.f38703a0.onOrientationChanged(strD, vVar.X.K(vVar.Z.getContext()));
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.f38705c, "setStoreSearchKeys(" + str + ")");
            C3197ea.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.f38705c, "setUserData(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            if (!c3237ge.a(C3191e4.h.W)) {
                v.this.a(str, false, C3191e4.c.F, (String) null);
                return;
            }
            if (!c3237ge.a("value")) {
                v.this.a(str, false, C3191e4.c.G, (String) null);
                return;
            }
            String strD = c3237ge.d(C3191e4.h.W);
            String strD2 = c3237ge.d("value");
            C3197ea.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.Z(v.this, strD, strD2, null, null, null, null, null, null)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            com.google.android.gms.internal.play_billing.a.w("setWebviewBackgroundColor(", str, ")", v.this.f38705c);
            v.this.p(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            com.google.android.gms.internal.play_billing.a.w("stillAlive(", str, ")", v.this.f38705c);
            v.this.f38704b.a();
        }

        private void a(JSONObject jSONObject) throws JSONException {
            try {
                jSONObject.put("controllerSourceData", v.this.B.f());
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                Logger.d(v.this.f38705c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void b(JSONObject jSONObject) throws JSONException {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(C3191e4.a.f36370h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                A8.a(C3219fe.f36713p, new C3494v8().a(G5.A, e10.getMessage()).a());
                Logger.d(v.this.f38705c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) throws JSONException {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.f38705c, "onVideoStatusChanged(" + str + ")");
            C3237ge c3237ge = new C3237ge(str);
            String strD = c3237ge.d(C3191e4.h.f36495m);
            if (v.this.C == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = c3237ge.d("status");
            if (C3191e4.h.f36478d0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStarted();
                return;
            }
            if (C3191e4.h.f36480e0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoPaused();
                return;
            }
            if (C3191e4.h.f36482f0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoResumed();
                return;
            }
            if (C3191e4.h.f36484g0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoEnded();
                return;
            }
            if (OcvDtWCQ.vBr.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStopped();
                return;
            }
            Logger.i(v.this.f38705c, "onVideoStatusChanged: unknown status: " + strD2);
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.f38705c, "saveFile(" + str + ")");
                C3237ge c3237ge = new C3237ge(str);
                String strD = c3237ge.d("path");
                String strD2 = c3237ge.d(C3191e4.h.f36473b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, C3191e4.c.f36395g, UupKET.CaSHWkZ);
                    return;
                }
                C8 c82 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(c82, v.this.A);
                v vVar = v.this;
                if (vVar.X.a(vVar.A) <= 0) {
                    v.this.a(str, false, C3227g4.A, (String) null);
                    return;
                }
                if (c82.exists()) {
                    v.this.a(str, false, C3227g4.f36772z, (String) null);
                    return;
                }
                if (!C3119a4.h(v.this.Z.getContext())) {
                    v.this.a(str, false, C3227g4.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.f38710h.a(c82, strD2, c3237ge.a("connectionTimeout", 0), c3237ge.a("readTimeout", 0));
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class w implements InterfaceC3378oa {
            public w() {
            }

            @Override // com.ironsource.InterfaceC3378oa
            public void a(boolean z10, String str, String str2) throws JSONException {
                C3237ge c3237ge = new C3237ge();
                c3237ge.b(z10 ? v.f38700g0 : v.f38701h0, str);
                c3237ge.b("data", str2);
                v.this.a(c3237ge.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC3378oa
            public void a(boolean z10, String str, C3237ge c3237ge) throws JSONException {
                c3237ge.b(z10 ? v.f38700g0 : v.f38701h0, str);
                v.this.a(c3237ge.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC3378oa
            public void a(boolean z10, String str, JSONObject jSONObject) throws JSONException {
                try {
                    jSONObject.put(z10 ? v.f38700g0 : v.f38701h0, str);
                    v.this.a(jSONObject.toString(), z10, (String) null, (String) null);
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        private void a(JSONObject jSONObject, String str) throws JSONException {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    Logger.d(v.this.f38705c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        public void c(String str) {
            v.this.i(v.this.a(C3191e4.g.f36444d, str, (String) null, (String) null));
        }

        public boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains(Y1.f35726f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                InterfaceC3453t1 interfaceC3453t1A = InterfaceC3453t1.a(str);
                v vVar = v.this;
                C3419r1.a aVarA = vVar.N.a(vVar.Z.getContext(), interfaceC3453t1A);
                v.this.i(v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, int i10) {
            Y4 y4A;
            v vVar = v.this;
            C3460t8.e eVar = C3460t8.e.Interstitial;
            if (vVar.q(eVar.toString()) && (y4A = v.this.G.a(eVar, str)) != null && y4A.k()) {
                v.this.b(new u(str, i10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str) {
            if (z10) {
                v.this.f38727y.c(C3460t8.e.Interstitial, str);
                v.this.f38727y.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z10) {
            Y4 y4A = v.this.G.a(C3460t8.e.Interstitial, str);
            if (y4A != null) {
                y4A.a(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str, String str2) {
            if (z10) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f38727y.d(str2, str);
            }
            a(str2, false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface s {
        void a(String str, C3460t8.e eVar, Y4 y42);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class t {

        /* renamed from: a, reason: collision with root package name */
        String f38820a;

        /* renamed from: b, reason: collision with root package name */
        String f38821b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum u {
        Display,
        Gone
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public class C0245v extends WebViewClient {
        public /* synthetic */ C0245v(v vVar, int i10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.z();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(C3191e4.f36344f) && (cVar = v.this.Q) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.f38705c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = v.this.Q;
            if (cVar != null) {
                cVar.b(str);
            }
            v.this.v();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean zContains;
            Logger.i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e10) {
                C3422r4.d().a(e10);
                zContains = false;
            }
            if (zContains) {
                StringBuilder sb2 = new StringBuilder(AdPayload.FILE_SCHEME);
                sb2.append(v.this.A);
                String strO = o2.o(sb2, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(strO));
                    return new WebResourceResponse("text/javascript", C.UTF8_NAME, getClass().getResourceAsStream(strO));
                } catch (FileNotFoundException e11) {
                    C3422r4.d().a(e11);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.y();
                    return true;
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        private C0245v() {
        }
    }

    public v(Context context, Z4 z42, C3245h4 c3245h4, com.ironsource.sdk.controller.c cVar, V7 v72, int i10, C3281j5 c3281j5, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        int i11 = 0;
        C3251ha c3251ha = new C3251ha(context, new InterfaceC3445sa.a());
        this.Z = c3251ha;
        Logger.i(this.f38705c, "C'tor");
        this.Y = c3245h4;
        this.Q = cVar;
        this.f38702a = v72;
        this.G = z42;
        a(context, c3251ha);
        this.A = str;
        this.D = new Z0();
        this.S = new JSONObject();
        this.f38710h = c3281j5;
        this.T = aVar;
        this.U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(C3191e4.a.f36371i, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.V = new C3372o4(new C3316l4(SDKUtils.getControllerUrl(), this.A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C3200ed(SDKUtils.getControllerUrl())), new aw.f(this, 2), c3281j5, new InterfaceC3456t4.a());
        } else {
            c3281j5.a(this);
            this.B = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.A, SDKUtils.getControllerUrl(), c3281j5);
        }
        o oVar = new o(this, i11);
        this.f38719q = oVar;
        c3251ha.setWebViewClient(new C0245v(this, i11));
        c3251ha.setWebChromeClient(oVar);
        Ng.a(c3251ha);
        a(c3251ha);
        c3251ha.setDownloadListener(this);
        this.R = c(context);
        b(context);
        b(i10);
        this.f38708f = str2;
        this.f38709g = str3;
        this.f38704b = InterfaceC3298k4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    public static /* bridge */ /* synthetic */ String Z(v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return vVar.a(str, str2, str3, str4, str5, str6, str7, str8, null, false);
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        Logger.i(this.f38705c, str + " " + str4);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends Y3 {
        public f(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.Y3, com.ironsource.InterfaceC3510w7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.f38711i) {
                vVar.m(str);
            }
        }

        @Override // com.ironsource.Y3, com.ironsource.InterfaceC3510w7
        public void b(String str, JSONObject jSONObject) throws JSONException {
            if (jSONObject == null || !v.this.f38711i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.e(jSONObject);
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Y3, com.ironsource.InterfaceC3510w7
        public void a() {
            v vVar = v.this;
            if (vVar.f38711i) {
                vVar.m("none");
            }
        }
    }

    private void F() {
    }

    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), "Android");
        webView.addJavascriptInterface(b(sVar), C3191e4.f36343e);
    }

    private Y3 c(Context context) {
        return new f(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) throws JSONException {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        boolean z11 = true;
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z10 = true;
        } else {
            Y4 y4A = this.G.a(g(str), str2);
            if (y4A != null) {
                mapG = y4A.g();
                mapG.put("demandSourceName", y4A.f());
                mapG.put("demandSourceId", y4A.h());
            }
            try {
                jSONObject.put(C3191e4.h.f36495m, str);
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            z10 = false;
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e11) {
                C3422r4.d().a(e11);
                IronLog.INTERNAL.error(e11.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f38709g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36533f), SDKUtils.encodeString(this.f38709g));
            } catch (JSONException e12) {
                C3422r4.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f38708f)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36535g), SDKUtils.encodeString(this.f38708f));
            } catch (JSONException e13) {
                C3422r4.d().a(e13);
                IronLog.INTERNAL.error(e13.toString());
            }
            z11 = z10;
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    o(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e14) {
                    C3422r4.d().a(e14);
                    IronLog.INTERNAL.error(e14.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z11)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new com.ironsource.environment.thread.a(1, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str) {
        this.Z.a(new m.b(str, q()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        try {
            Logger.i(this.f38705c, "load(): " + str);
            this.Z.loadUrl(str);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            Logger.e(this.f38705c, "WebViewController::load: " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        C3237ge c3237ge = new C3237ge(str);
        String strD = c3237ge.d("color");
        String strD2 = c3237ge.d("adViewId");
        int color = !C3191e4.h.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 == null) {
            this.Z.setBackgroundColor(color);
            return;
        }
        WebView presentingView = C3410q8.a().a(strD2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    public void A() {
        try {
            this.Z.onPause();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            Logger.i(this.f38705c, "WebViewController: onPause() - " + th2);
        }
    }

    public void B() {
        this.C = null;
    }

    public void C() {
        this.Z.a();
        this.f38703a0 = null;
    }

    public void D() {
        this.Z.requestFocus();
    }

    public void E() {
        try {
            this.Z.onResume();
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            Logger.i(this.f38705c, "WebViewController: onResume() - " + th2);
        }
    }

    public com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C3191e4.c.f36414z;
        }
        i(e(C3191e4.g.f36441a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(C3191e4.g.f36462t));
    }

    public void g(String str, String str2) {
        i(e(C3191e4.g.W, a(C3191e4.h.f36501p, str2, C3191e4.h.f36495m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public C3460t8.c h() {
        return C3460t8.c.Web;
    }

    public void k(String str) {
        i(e(C3191e4.g.f36465w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void m(String str) {
        String strD;
        try {
            strD = C3137b4.d(this.Z.getContext());
            Logger.i(this.f38705c, "device status changed, connection type " + str);
            C3545y8.a(str);
            C3545y8.b(strD);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            i(e(C3191e4.g.f36466x, a("connectionType", str, "rawConnectionType", strD, null, null, null, null, null, false)));
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            C3422r4.d().a(exc);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
        }
    }

    public void n(String str) {
        this.f38725w = str;
    }

    public Mg o() {
        if (this.P == null) {
            this.P = new g();
        }
        return this.P;
    }

    public int q() {
        return f38696c0;
    }

    public FrameLayout r() {
        return this.f38723u;
    }

    public String s() {
        return this.f38725w;
    }

    public Z0 t() {
        return this.D;
    }

    public u u() {
        return this.f38724v;
    }

    public void v() {
        if (this.f38712j == null) {
            return;
        }
        n();
        C3460t8.e eVarB = this.f38712j.b();
        String strA = this.f38712j.a();
        if (q(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void w() {
        this.f38719q.onHideCustomView();
    }

    public boolean x() {
        return this.f38720r != null;
    }

    public void y() {
        i(f(C3191e4.g.Z));
    }

    public void z() {
        i(f(C3191e4.g.A));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Sc sc2 = this.f38703a0;
        if (sc2 != null) {
            sc2.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f38705c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C3460t8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C3460t8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C3460t8.e.Banner.toString()) || this.f38728z == null : this.f38726x == null) : this.f38727y != null) {
            z10 = true;
        }
        if (!z10) {
            Logger.d(this.f38705c, "Trying to trigger a listener - no listener was found for product ".concat(str));
        }
        return z10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.W) {
            this.V.b();
            return;
        }
        this.B.a(new C3494v8());
        if (this.B.k()) {
            a(1);
        }
    }

    public void c(String str, String str2) {
        String str3;
        try {
            str3 = str;
            try {
                i(e(C3191e4.g.f36458p, a(C3191e4.h.f36473b, str3, "path", b(str2), null, null, null, null, null, false)));
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C3422r4.d().a(exc);
                b(str3, str2, exc.getMessage());
            }
        } catch (Exception e11) {
            e = e11;
            str3 = str;
        }
    }

    public boolean h(String str) {
        try {
            if (!new Je(str, C3197ea.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            C3257hg.a(p(), str);
            return true;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new C3237ge(str).d(f38700g0);
    }

    private String d(JSONObject jSONObject) {
        C3156c5 c3156c5B = C3156c5.b(this.Z.getContext());
        StringBuilder sb2 = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            w0.i.h(sb2, "SDKVersion=", sDKVersion, C3191e4.i.f36527c);
        }
        String strE = c3156c5B.e();
        if (!TextUtils.isEmpty(strE)) {
            sb2.append("deviceOs=");
            sb2.append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + ":";
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = o2.g(port, host, ":");
            }
            com.google.android.gms.internal.play_billing.a.B(sb2, "&protocol=", str, "&domain=", host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{C3191e4.i.Z, C3191e4.i.f36535g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb2.append(C3191e4.i.f36527c);
                        sb2.append("controllerConfig");
                        sb2.append(C3191e4.i.f36525b);
                        sb2.append(string);
                    }
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
            sb2.append("&debug=");
            sb2.append(q());
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3460t8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C3460t8.e eVar = C3460t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C3460t8.e eVar2 = C3460t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C3460t8.e eVar3 = C3460t8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    private void o(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.Z.getSettings().setCacheMode(2);
        } else {
            this.Z.getSettings().setCacheMode(-1);
        }
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.f38705c, "device connection info changed: " + jSONObject.toString());
        i(e(C3191e4.g.f36467y, a(C3191e4.i.f36538h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    public com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new r()), sVar);
    }

    public void b(int i10) {
        f38696c0 = i10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(C3191e4.g.f36463u));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), C3182dd.d(this.Z.getContext()));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4) {
        a(y42, map);
    }

    public Context p() {
        return this.Y.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            Y3 y32 = this.R;
            if (y32 == null) {
                return;
            }
            y32.b(context);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.H = oVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42) {
        Map<String, String> mapB = y42.b();
        if (mapB != null) {
            i(e(C3191e4.g.T, SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.G.b(C3460t8.e.Interstitial, y42.h());
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.I = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(C8 c82) {
        this.f38710h.a(this);
        if (c82 != null && c82.exists()) {
            a(c82);
            return null;
        }
        a(new C8(C3191e4.f36344f), new C3477u8(1, "Unable to download Html file"));
        return null;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.J = uVar;
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.K = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(o());
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(C3191e4.g.f36447e0, jSONObject != null ? jSONObject.toString() : null));
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.M = jVar;
    }

    public void c(String str) {
        if (str.equals(C3191e4.h.f36487i)) {
            n();
        }
        i(e(C3191e4.g.f36468z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void a(C3419r1 c3419r1) {
        this.N = c3419r1;
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f38723u = new FrameLayout(context);
        this.f38721s = new FrameLayout(context);
        this.f38721s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f38721s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f38723u.addView(this.f38721s, layoutParams);
        this.f38723u.addView(frameLayout);
    }

    private String b(String str) {
        String str2 = this.A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    public void b(String str, String str2, String str3) {
        try {
            try {
                i(e(C3191e4.g.f36459q, a(C3191e4.h.f36473b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
            } catch (Exception e10) {
                e = e10;
                C3422r4.d().a(e);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void c(Runnable runnable) {
        V7 v72 = this.f38702a;
        if (v72 != null) {
            v72.d(runnable);
        }
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new c(context));
    }

    public void b(Runnable runnable) {
        V7 v72 = this.f38702a;
        if (v72 != null) {
            v72.c(runnable);
        }
    }

    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    public void a(B4 b42) {
        this.O = b42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC3490v4 a(C3460t8.e eVar) {
        if (eVar == C3460t8.e.Interstitial) {
            return this.f38727y;
        }
        if (eVar == C3460t8.e.RewardedVideo) {
            return this.f38726x;
        }
        if (eVar == C3460t8.e.Banner) {
            return this.f38728z;
        }
        return null;
    }

    public void a(og ogVar) {
        this.C = ogVar;
    }

    public void a(int i10) {
        String string;
        if (!this.W && !this.B.m()) {
            Logger.i(this.f38705c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strD = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        if (this.W) {
            string = this.V.c().toURI().toString();
        } else {
            string = this.B.g().toURI().toString();
        }
        String strD2 = w0.i.d(string, "?", strD);
        this.f38702a.d(new h(controllerConfigAsJSONObject, this.Z, strD2));
        this.f38715m = new i(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i10).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            Y3 y32 = this.R;
            if (y32 == null) {
                return;
            }
            y32.c(context);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new C3237ge(str).d(f38701h0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) throws JSONException {
        C3156c5 c3156c5B = C3156c5.b(context);
        JSONObject jSONObject = new JSONObject();
        boolean z10 = false;
        try {
            jSONObject.put(C3191e4.i.f36566z, "none");
            jSONObject.put(C3191e4.i.A, SDKUtils.translateDeviceOrientation(this.X.z(context)));
            String strD = c3156c5B.d();
            if (strD != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = c3156c5B.c();
            if (strC != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            } else {
                z10 = true;
            }
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.f38705c, "add AID");
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String limitAdTracking = SDKUtils.getLimitAdTracking();
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(this.f38705c, "add LAT");
                jSONObject.put(C3191e4.i.M, Boolean.parseBoolean(limitAdTracking));
            }
            String strE = c3156c5B.e();
            if (strE != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36547m), SDKUtils.encodeString(strE));
            } else {
                z10 = true;
            }
            String strF = c3156c5B.f();
            if (strF != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36549n), strF.replaceAll("[^0-9/.]", ""));
            } else {
                z10 = true;
            }
            String strF2 = c3156c5B.f();
            if (strF2 != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36551o), SDKUtils.encodeString(strF2));
            }
            String strValueOf = String.valueOf(c3156c5B.a());
            if (strValueOf != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36553p), strValueOf);
            } else {
                z10 = true;
            }
            jSONObject.put(Q6.f35267i0, String.valueOf(C3276j0.a()));
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36555q), SDKUtils.encodeString(sDKVersion));
            }
            if (c3156c5B.b() != null && c3156c5B.b().length() > 0) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36557r), SDKUtils.encodeString(c3156c5B.b()));
            }
            String strB = C3137b4.b(context);
            if (strB.equals("none")) {
                z10 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            String strD2 = C3137b4.d(context);
            if (strD2 != null) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD2));
            } else {
                z10 = true;
            }
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36562v), C3137b4.e(context));
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36564x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            jSONObject.put(C3191e4.i.f36565y, SDKUtils.encodeString(String.valueOf(this.X.a(this.A))));
            String strValueOf2 = String.valueOf(this.X.o());
            if (TextUtils.isEmpty(strValueOf2)) {
                z10 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.G) + C3191e4.i.f36529d + SDKUtils.encodeString("width") + C3191e4.i.f36531e, SDKUtils.encodeString(strValueOf2));
            }
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.G) + C3191e4.i.f36529d + SDKUtils.encodeString("height") + C3191e4.i.f36531e, SDKUtils.encodeString(String.valueOf(this.X.b())));
            String strG = C1.g(this.Z.getContext());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf3 = String.valueOf(this.X.r());
            if (!TextUtils.isEmpty(strValueOf3)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.K), SDKUtils.encodeString(strValueOf3));
            }
            String strValueOf4 = String.valueOf(this.X.p());
            if (!TextUtils.isEmpty(strValueOf4)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.O), SDKUtils.encodeString(strValueOf4));
            }
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.P), C3156c5.b(context).a(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.Y), this.X.k(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), C3119a4.b(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), C3119a4.c(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.S), C3119a4.f(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.R), SDKUtils.encodeString(C3119a4.g(context)));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.V), C1.f(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.X), C1.d(context));
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.W), SDKUtils.encodeString(C1.b(context)));
            String strE2 = C1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36528c0), SDKUtils.encodeString(strE2));
            }
            c(jSONObject);
            jSONObject.put(SDKUtils.encodeString(C3191e4.i.f36554p0), this.X.t(context));
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    private void a(String str, C3460t8.e eVar, Y4 y42, s sVar) {
        if (TextUtils.isEmpty(str)) {
            sVar.a("Application key are missing", eVar, y42);
        } else {
            i(a(eVar, y42).f38821b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3541y4 interfaceC3541y4) {
        this.f38708f = str;
        this.f38709g = str2;
        this.f38726x = interfaceC3541y4;
        this.D.i(str);
        this.D.j(str2);
        a(str, C3460t8.e.RewardedVideo, y42, new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3524x4 interfaceC3524x4) {
        this.f38708f = str;
        this.f38709g = str2;
        this.f38727y = interfaceC3524x4;
        this.D.g(str);
        this.D.h(this.f38709g);
        a(this.f38708f, C3460t8.e.Interstitial, y42, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC3524x4 interfaceC3524x4) throws JSONException {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.D.d(str, true);
        i(a(C3191e4.g.E, strFlatMapToJsonAsString, C3191e4.g.F, C3191e4.g.G));
    }

    private void a(Y4 y42, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, y42.b()});
        if (map.containsKey("adm")) {
            this.f38704b.a(new z(this));
        }
        this.D.d(y42.h(), true);
        i(a(C3191e4.g.E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3191e4.g.F, C3191e4.g.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC3194e7 interfaceC3194e7) {
        interfaceC3194e7.a(new z(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC3140b7 interfaceC3140b7) {
        try {
            this.Q.a(interfaceC3140b7);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Logger.e(this.f38705c, "handleLoadAd: " + e10);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3524x4 interfaceC3524x4) {
        i(a(C3460t8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4) {
        i(a(C3460t8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, y42.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        Y4 y4A = this.G.a(C3460t8.e.Interstitial, str);
        return y4A != null && y4A.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3507w4 interfaceC3507w4) {
        this.f38708f = str;
        this.f38709g = str2;
        this.f38728z = interfaceC3507w4;
        a(str, C3460t8.e.Banner, y42, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC3507w4 interfaceC3507w4) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, y42.b()});
        if (map != null) {
            i(a(C3191e4.g.N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3191e4.g.O, C3191e4.g.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42) {
        Map<String, String> mapB = y42.b();
        if (mapB != null) {
            i(a(C3191e4.g.S, SDKUtils.flatMapToJsonAsString(mapB), C3191e4.g.P, C3191e4.g.Q));
        }
        this.G.b(C3460t8.e.Banner, y42.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3507w4 interfaceC3507w4) {
        i(a(C3191e4.g.N, jSONObject.toString(), C3191e4.g.O, C3191e4.g.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), C3191e4.g.U, C3191e4.g.U));
    }

    private t a(C3460t8.e eVar, Y4 y42) throws JSONException {
        t tVar = new t();
        if (eVar != C3460t8.e.RewardedVideo && eVar != C3460t8.e.Interstitial && eVar != C3460t8.e.Banner) {
            return tVar;
        }
        HashMap map = new HashMap();
        map.put(C3191e4.i.f36535g, this.f38708f);
        if (!TextUtils.isEmpty(this.f38709g)) {
            map.put(C3191e4.i.f36533f, this.f38709g);
        }
        if (y42 != null) {
            if (y42.g() != null) {
                map.putAll(y42.g());
                map.put(C3191e4.h.f36520y0, String.valueOf(L.f34778a.c(y42.h())));
            }
            map.put("demandSourceName", y42.f());
            map.put("demandSourceId", y42.h());
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C3191e4.g gVarA = C3191e4.g.a(eVar);
        String strA = a(gVarA.f36469a, strFlatMapToJsonAsString, gVarA.f36470b, gVarA.f36471c);
        tVar.f38820a = gVarA.f36469a;
        tVar.f38821b = strA;
        return tVar;
    }

    private String a(C3460t8.e eVar, JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        Y4 y4A = this.G.a(eVar, strFetchDemandSourceId);
        if (y4A != null) {
            if (y4A.g() != null) {
                map.putAll(y4A.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C3191e4.g gVarB = C3191e4.g.b(eVar);
        return a(gVarB.f36469a, strFlatMapToJsonAsString, gVarB.f36470b, gVarB.f36471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C3460t8.e eVar, Y4 y42) {
        if (q(eVar.toString())) {
            b(new m(eVar, y42, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3541y4 interfaceC3541y4) {
        i(a(C3460t8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    public void a(boolean z10, String str) {
        i(e(C3191e4.g.V, a(C3191e4.h.K, str, null, null, null, null, null, null, C3191e4.h.f36499o, z10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z10, String str2, String str3) {
        String strD = new C3237ge(str).d(z10 ? f38700g0 : f38701h0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    private String a(String str, String str2) {
        return a(str, str2, C3191e4.h.f36483g);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
            }
        }
        return str;
    }

    private String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z10);
            }
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.Pc
    public void a(C8 c82) {
        if (this.W && this.V.a(c82)) {
            a(1);
        } else if (c82.getName().contains(C3191e4.f36344f)) {
            this.B.a(new n());
        } else {
            c(c82.getName(), c82.getParent());
        }
    }

    @Override // com.ironsource.Pc
    public void a(C8 c82, C3477u8 c3477u8) {
        if (this.W && this.V.a(c82)) {
            this.Q.c("controller html - failed to download - " + c3477u8.b());
            return;
        }
        if (c82.getName().contains(C3191e4.f36344f)) {
            this.B.a(new a(), new b(c3477u8));
        } else {
            b(c82.getName(), c82.getParent(), c3477u8.b());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new d(context));
    }

    public void a(Sc sc2) {
        this.f38703a0 = sc2;
        this.Z.a(sc2);
    }

    public void a(u uVar) {
        this.f38724v = uVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        this.Z.destroy();
        C3281j5 c3281j5 = this.f38710h;
        if (c3281j5 != null) {
            c3281j5.d();
        }
        Y3 y32 = this.R;
        if (y32 != null) {
            y32.b();
        }
        CountDownTimer countDownTimer = this.f38715m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new m.a(str, str2, str3, str4).a();
    }

    public void a(C3460t8.e eVar, String str) {
        b(new e(eVar, str));
    }

    public void a(Z0 z02) {
        synchronized (this.E) {
            try {
                if (z02.j() && this.f38711i) {
                    Log.d(this.f38705c, "restoreState(state:" + z02 + ")");
                    int iC = z02.c();
                    if (iC != -1) {
                        C3460t8.e eVar = C3460t8.e.RewardedVideo;
                        if (iC == eVar.ordinal()) {
                            Log.d(this.f38705c, "onRVAdClosed()");
                            String strB = z02.b();
                            InterfaceC3490v4 interfaceC3490v4A = a(eVar);
                            if (interfaceC3490v4A != null && !TextUtils.isEmpty(strB)) {
                                interfaceC3490v4A.b(eVar, strB);
                            }
                        } else {
                            C3460t8.e eVar2 = C3460t8.e.Interstitial;
                            if (iC == eVar2.ordinal()) {
                                Log.d(this.f38705c, "onInterstitialAdClosed()");
                                String strB2 = z02.b();
                                InterfaceC3490v4 interfaceC3490v4A2 = a(eVar2);
                                if (interfaceC3490v4A2 != null && !TextUtils.isEmpty(strB2)) {
                                    interfaceC3490v4A2.b(eVar2, strB2);
                                }
                            }
                        }
                        z02.a(-1);
                        z02.f(null);
                    } else {
                        Log.d(this.f38705c, "No ad was opened");
                    }
                    String strD = z02.d();
                    String strF = z02.f();
                    for (Y4 y42 : this.G.a(C3460t8.e.Interstitial)) {
                        if (y42.e() == 2) {
                            Log.d(this.f38705c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + y42.f() + ")");
                            a(strD, strF, y42, this.f38727y);
                        }
                    }
                    String strG = z02.g();
                    String strH = z02.h();
                    for (Y4 y43 : this.G.a(C3460t8.e.RewardedVideo)) {
                        if (y43.e() == 2) {
                            String strF2 = y43.f();
                            Log.d(this.f38705c, "onRVNoMoreOffers()");
                            this.f38726x.c(strF2);
                            Log.d(this.f38705c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                            a(strG, strH, y43, this.f38726x);
                        }
                    }
                    z02.a(false);
                }
                this.D = z02;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(Runnable runnable) {
        V7 v72 = this.f38702a;
        if (v72 != null) {
            v72.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.Y.a(activity);
    }
}
