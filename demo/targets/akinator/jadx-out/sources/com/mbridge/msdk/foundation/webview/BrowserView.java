package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BrowserView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private CampaignEx f41217a;

    /* renamed from: b, reason: collision with root package name */
    private String f41218b;

    /* renamed from: c, reason: collision with root package name */
    private e f41219c;

    /* renamed from: d, reason: collision with root package name */
    private WebView f41220d;

    /* renamed from: e, reason: collision with root package name */
    private ProgressBar f41221e;

    /* renamed from: f, reason: collision with root package name */
    private ToolBar f41222f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BrowserView.this.f41220d != null) {
                BrowserView.this.f41220d.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z10 = false;
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                if (BrowserView.this.f41220d != null && BrowserView.this.f41220d.canGoBack()) {
                    BrowserView.this.f41220d.goBack();
                }
                View item = BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                if (BrowserView.this.f41220d != null && BrowserView.this.f41220d.canGoBack()) {
                    z10 = true;
                }
                item.setEnabled(z10);
                return;
            }
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD)) {
                BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                if (BrowserView.this.f41220d != null && BrowserView.this.f41220d.canGoForward()) {
                    BrowserView.this.f41220d.goForward();
                }
                View item2 = BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                if (BrowserView.this.f41220d != null && BrowserView.this.f41220d.canGoForward()) {
                    z10 = true;
                }
                item2.setEnabled(z10);
                return;
            }
            if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH)) {
                if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS) || BrowserView.this.f41219c == null) {
                    return;
                }
                BrowserView.this.f41219c.a();
                return;
            }
            BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(BrowserView.this.f41220d != null && BrowserView.this.f41220d.canGoBack());
            View item3 = BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            if (BrowserView.this.f41220d != null && BrowserView.this.f41220d.canGoForward()) {
                z10 = true;
            }
            item3.setEnabled(z10);
            if (BrowserView.this.f41220d != null) {
                BrowserView.this.f41220d.loadUrl(BrowserView.this.f41218b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            p0.c("BrowserView", "onLoadResource 开始! = " + str);
            if (BrowserView.this.f41219c != null) {
                BrowserView.this.f41219c.c(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (BrowserView.this.f41219c != null) {
                BrowserView.this.f41219c.a(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            p0.c("BrowserView", "开始! = " + str);
            BrowserView.this.f41218b = str;
            if (BrowserView.this.f41219c != null) {
                BrowserView.this.f41219c.a(webView, str, bitmap);
            }
            BrowserView.this.f41221e.setVisible(true);
            BrowserView.this.f41221e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (BrowserView.this.f41219c != null) {
                BrowserView.this.f41219c.a(webView, i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                } catch (Throwable th2) {
                    p0.b("BrowserView", th2.getMessage());
                    return true;
                }
            }
            if (BrowserView.this.f41219c != null) {
                BrowserView.this.f41219c.a();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            p0.c("BrowserView", "js大跳! = " + str);
            BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
            BrowserView.this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
            if (BrowserView.this.f41219c != null) {
                return BrowserView.this.f41219c.b(webView, str);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends WebChromeClient {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f41221e.setVisible(false);
            }
        }

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
                BrowserView.this.f41221e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends WebChromeClient {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f41221e.setVisible(false);
            }
        }

        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                BrowserView.this.f41221e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        void a();

        void a(WebView webView, int i10, String str, String str2);

        void a(WebView webView, String str);

        void a(WebView webView, String str, Bitmap bitmap);

        boolean b(WebView webView, String str);

        void c(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) throws Resources.NotFoundException {
        super(context);
        this.f41217a = campaignEx;
        init();
    }

    private WebView getWebView() {
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th2) {
                    p0.b("BrowserView", th2.getMessage());
                }
            }
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            try {
                settings.setMixedContentMode(0);
            } catch (Exception e10) {
                p0.b("BrowserView", e10.getMessage());
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, Boolean.FALSE);
            } catch (Exception e11) {
                p0.b("BrowserView", e11.getMessage());
            }
        } catch (Throwable th3) {
            p0.b("BrowserView", th3.getMessage());
        }
        webView.setDownloadListener(new com.mbridge.msdk.foundation.same.webview.a(this.f41217a));
        webView.setWebViewClient(new b());
        webView.setWebChromeClient(l0.r() <= 10 ? new c() : new d());
        return webView;
    }

    public void destroy() {
        try {
            WebView webView = this.f41220d;
            if (webView != null) {
                webView.setWebViewClient(null);
                this.f41220d.destroy();
                this.f41220d = null;
                removeAllViews();
            }
        } catch (Throwable th2) {
            p0.b("BrowserView", th2.getMessage());
        }
    }

    public void init() throws Resources.NotFoundException {
        setOrientation(1);
        setGravity(17);
        a();
        this.f41221e.initResource(true);
        this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f41222f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f41222f.setOnItemClickListener(new a());
    }

    public void loadUrl(String str) {
        WebView webView = this.f41220d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(e eVar) {
        this.f41219c = eVar;
    }

    public void setWebView(WebView webView) {
        this.f41220d = webView;
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f41221e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f41220d == null) {
                this.f41220d = getWebView();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f41220d.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            p0.b("BrowserView", "webview is error", th2);
        }
        this.f41222f = new ToolBar(getContext());
        this.f41222f.setLayoutParams(new LinearLayout.LayoutParams(-1, u0.a(getContext(), 40.0f)));
        this.f41222f.setBackgroundColor(-1);
        addView(this.f41221e);
        WebView webView = this.f41220d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f41222f);
    }

    public BrowserView(Context context) throws Resources.NotFoundException {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        init();
    }
}
