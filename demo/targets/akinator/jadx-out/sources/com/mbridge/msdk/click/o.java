package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class o {

    /* renamed from: r, reason: collision with root package name */
    private static final String f39733r = "o";

    /* renamed from: a, reason: collision with root package name */
    private int f39734a;

    /* renamed from: b, reason: collision with root package name */
    private int f39735b;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f39737d;

    /* renamed from: e, reason: collision with root package name */
    private f f39738e;

    /* renamed from: f, reason: collision with root package name */
    private String f39739f;

    /* renamed from: g, reason: collision with root package name */
    private String f39740g;

    /* renamed from: h, reason: collision with root package name */
    private WebView f39741h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39742i;

    /* renamed from: j, reason: collision with root package name */
    private String f39743j;

    /* renamed from: k, reason: collision with root package name */
    private int f39744k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39746m;

    /* renamed from: n, reason: collision with root package name */
    boolean f39747n;

    /* renamed from: o, reason: collision with root package name */
    boolean f39748o;

    /* renamed from: l, reason: collision with root package name */
    private boolean f39745l = false;

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f39749p = new d();

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f39750q = new e();

    /* renamed from: c, reason: collision with root package name */
    private Handler f39736c = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f39753c;

        public a(String str, String str2, Context context) {
            this.f39751a = str;
            this.f39752b = str2;
            this.f39753c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f39751a, this.f39752b, this.f39753c, oVar.f39739f);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39755a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39756b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f39757c;

        public b(String str, String str2, Context context) {
            this.f39755a = str;
            this.f39756b = str2;
            this.f39757c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (o.this.f39746m) {
                    o.this.f39744k = 0;
                    o.this.f();
                    return;
                }
                o.this.f39748o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f39747n = true;
                }
                synchronized (o.f39733r) {
                    try {
                        o.this.f39739f = str;
                        if (o.this.f39738e == null || !o.this.f39738e.a(str)) {
                            o.this.h();
                        } else {
                            o.this.f39746m = true;
                            o.this.f();
                        }
                    } finally {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f39733r) {
                o.this.f39746m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f39738e != null) {
                o.this.f39738e.a(i10, webView.getUrl(), str, o.this.f39743j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f39755a) || TextUtils.isEmpty(this.f39756b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f39757c).a(this.f39756b, this.f39755a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f39733r) {
                    o.this.f39746m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f39738e != null) {
                    o.this.f39738e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f39743j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th2) {
                p0.b(o.f39733r, th2.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (o.f39733r) {
                try {
                    o oVar = o.this;
                    oVar.f39748o = true;
                    oVar.c();
                    if (o.this.f39746m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f39739f = str;
                    if (o.this.f39738e != null && o.this.f39738e.c(str)) {
                        o.this.f39746m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.f39742i) {
                        HashMap map = new HashMap();
                        if (o.this.f39741h.getUrl() != null) {
                            map.put("Referer", o.this.f39741h.getUrl());
                        }
                        o.this.f39741h.loadUrl(str, map);
                    } else {
                        o.this.f39741h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!o.this.f39746m) {
                        o oVar = o.this;
                        if (!oVar.f39748o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f39738e != null) {
                        o.this.f39738e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f39745l = true;
            o.this.f39744k = 1;
            o.this.e();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f39745l = true;
            o.this.f39744k = 2;
            o.this.e();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.f39734a = 15000;
        this.f39735b = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
        this.f39737d = gVarF;
        if (gVarF == null) {
            this.f39737d = com.mbridge.msdk.setting.h.b().a();
        }
        this.f39742i = this.f39737d.I0();
        this.f39734a = (int) this.f39737d.o0();
        this.f39735b = (int) this.f39737d.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f39736c.removeCallbacks(this.f39749p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f39736c.removeCallbacks(this.f39750q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f39733r) {
            try {
                try {
                    b();
                    this.f39741h.destroy();
                    f fVar = this.f39738e;
                    if (fVar != null) {
                        fVar.a(this.f39739f, this.f39745l, this.f39743j);
                    }
                } catch (Exception e10) {
                    p0.b(f39733r, e10.getMessage());
                } catch (Throwable th2) {
                    p0.b(f39733r, th2.getMessage());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (f39733r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.f39738e;
                        if (fVar != null) {
                            fVar.a(this.f39739f, this.f39745l, this.f39743j);
                        }
                    } finally {
                    }
                } catch (Exception e10) {
                    p0.b(f39733r, e10.getMessage());
                }
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f39736c.postDelayed(this.f39749p, this.f39735b);
    }

    private void j() {
        this.f39736c.postDelayed(this.f39750q, this.f39734a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.f39740g = str4;
            this.f39739f = str3;
            this.f39738e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f39739f = str3;
            this.f39738e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f39739f);
        } else {
            this.f39736c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f39740g)) {
                this.f39741h.getSettings().setDefaultTextEncodingName(G5.N);
                this.f39735b = 2000;
                this.f39734a = 2000;
                p0.c(f39733r, this.f39740g);
                this.f39741h.loadDataWithBaseURL(str3, this.f39740g, "*/*", G5.N, str3);
                return;
            }
            if (this.f39742i) {
                HashMap map = new HashMap();
                if (this.f39741h.getUrl() != null) {
                    map.put("Referer", this.f39741h.getUrl());
                }
                this.f39741h.loadUrl(str3, map);
                return;
            }
            this.f39741h.loadUrl(str3);
        } catch (Throwable th2) {
            try {
                f fVar = this.f39738e;
                if (fVar != null) {
                    fVar.a(0, this.f39739f, th2.getMessage(), this.f39743j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f39741h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f39741h.getSettings().setCacheMode(2);
        this.f39741h.getSettings().setLoadsImagesAutomatically(false);
        this.f39741h.setWebViewClient(new b(str2, str, context));
        this.f39741h.setWebChromeClient(new c());
    }
}
