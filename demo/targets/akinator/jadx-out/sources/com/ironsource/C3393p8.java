package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.C3191e4;
import com.ironsource.K8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3393p8 implements K8 {

    /* renamed from: g, reason: collision with root package name */
    private static final String f38138g = "loadWithUrl | webView is not null";

    /* renamed from: h, reason: collision with root package name */
    private static final String f38139h = "p8";

    /* renamed from: i, reason: collision with root package name */
    private static final String f38140i = "file://";

    /* renamed from: a, reason: collision with root package name */
    private final String f38141a;

    /* renamed from: b, reason: collision with root package name */
    private String f38142b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f38143c;

    /* renamed from: d, reason: collision with root package name */
    private C3358n8 f38144d;

    /* renamed from: e, reason: collision with root package name */
    private C3267i8 f38145e;

    /* renamed from: f, reason: collision with root package name */
    private Context f38146f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p8$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38147a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f38148b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38149c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.f38147a = str;
            this.f38148b = jSONObject;
            this.f38149c = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (C3393p8.this.f38143c != null) {
                A8.a(C3219fe.f36714q, new C3494v8().a(G5.A, C3393p8.f38138g).a());
            }
            try {
                C3393p8.this.b(this.f38147a);
                C3393p8.this.f38143c.loadUrl(C3393p8.this.a(this.f38148b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C3393p8.this.f38141a);
                C3393p8.this.f38144d.a(this.f38149c, jSONObject);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                C3393p8.this.b(this.f38147a, e10.getMessage());
                A8.a(C3219fe.f36714q, new C3494v8().a(G5.A, e10.getMessage()).a());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p8$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38152b;

        public b(String str, String str2) {
            this.f38151a = str;
            this.f38152b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                WebView webView = C3393p8.this.f38143c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C3393p8.this.f38141a);
                C3358n8 c3358n8 = C3393p8.this.f38144d;
                if (c3358n8 != null) {
                    c3358n8.a(this.f38151a, jSONObject);
                    C3393p8.this.f38144d.b();
                }
                C3393p8 c3393p8 = C3393p8.this;
                c3393p8.f38144d = null;
                c3393p8.f38146f = null;
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                Log.e(C3393p8.f38139h, "performCleanup | could not destroy ISNAdView webView ID: " + C3393p8.this.f38141a);
                A8.a(C3219fe.f36715r, new C3494v8().a(G5.A, e10.getMessage()).a());
                C3393p8.this.b(this.f38152b, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p8$c */
    public class c implements K8.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38154a;

        public c(String str) {
            this.f38154a = str;
        }

        @Override // com.ironsource.K8.a
        public void a(String str) {
            Logger.i(C3393p8.f38139h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C3393p8.this.b(this.f38154a, str);
        }

        @Override // com.ironsource.K8.a
        public void b(String str) {
            Logger.i(C3393p8.f38139h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C3393p8.this.f38143c.getParent()).removeView(C3393p8.this.f38143c);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C3393p8.this.d();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p8$d */
    public class d extends WebChromeClient {
        public /* synthetic */ d(C3393p8 c3393p8, int i10) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C3393p8.this.new d());
            webView2.setWebViewClient(new e(C3393p8.this, 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        private d() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p8$e */
    public class e extends WebViewClient {
        public /* synthetic */ e(C3393p8 c3393p8, int i10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C3393p8.f38139h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentA = new OpenUrlActivity.e(new k.b()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            context.startActivity(intentA);
            return true;
        }

        private e() {
        }
    }

    public C3393p8(InterfaceC3320l8 interfaceC3320l8, Context context, String str, C3267i8 c3267i8) {
        this.f38146f = context;
        C3358n8 c3358n8 = new C3358n8();
        this.f38144d = c3358n8;
        c3358n8.g(str);
        this.f38141a = str;
        this.f38144d.a(interfaceC3320l8);
        this.f38145e = c3267i8;
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f38143c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f38144d.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.f38141a;
    }

    public C3358n8 b() {
        return this.f38144d;
    }

    public C3267i8 c() {
        return this.f38145e;
    }

    public void e(String str) {
        this.f38142b = str;
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f38144d.e(str);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Logger.i(f38139h, "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        V7.f35633a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f38144d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Logger.i(f38139h, "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(f38139h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f38146f);
        this.f38143c = webView;
        webView.addJavascriptInterface(new C3338m8(this), C3284j8.f37004e);
        this.f38143c.setWebViewClient(new C3376o8(new c(str)));
        this.f38143c.setWebChromeClient(new d(this, 0));
        Ng.a(this.f38143c);
        this.f38144d.a(this.f38143c);
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        if (this.f38146f == null) {
            return;
        }
        Logger.i(f38139h, "performCleanup");
        V7.f35633a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, C3191e4.c.D);
            return;
        }
        Logger.i(f38139h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C3191e4.h.f36510t0)) {
                this.f38143c.onPause();
                this.f38144d.f(str2);
            } else if (str.equals(C3191e4.h.f36512u0)) {
                this.f38143c.onResume();
                this.f38144d.f(str2);
            } else {
                b(str3, C3191e4.c.C);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            b(str3, C3191e4.c.E);
        }
    }

    public void b(String str, String str2) {
        C3358n8 c3358n8 = this.f38144d;
        if (c3358n8 != null) {
            c3358n8.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.f38142b + d(str);
    }
}
