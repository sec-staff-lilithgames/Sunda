package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* renamed from: a, reason: collision with root package name */
    private int f41837a;

    /* renamed from: b, reason: collision with root package name */
    private int f41838b;

    /* renamed from: c, reason: collision with root package name */
    protected ToolBar f41839c;

    /* renamed from: d, reason: collision with root package name */
    protected ToolBar f41840d;

    /* renamed from: e, reason: collision with root package name */
    protected ProgressBar f41841e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f41842f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnClickListener f41843g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f41844h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f41845i;

    /* renamed from: j, reason: collision with root package name */
    protected BaseWebView f41846j;

    /* renamed from: k, reason: collision with root package name */
    private View.OnClickListener f41847k;

    /* renamed from: l, reason: collision with root package name */
    private View.OnClickListener f41848l;

    /* renamed from: m, reason: collision with root package name */
    private View.OnClickListener f41849m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f41850n;

    /* renamed from: o, reason: collision with root package name */
    private Handler f41851o;

    /* renamed from: p, reason: collision with root package name */
    private int f41852p;

    /* renamed from: q, reason: collision with root package name */
    private WebViewClient f41853q;

    /* renamed from: r, reason: collision with root package name */
    private String f41854r;

    /* renamed from: s, reason: collision with root package name */
    private i f41855s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f41856t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f41857u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f41852p + "ms");
            if (CommonWebView.this.f41855s != null) {
                CommonWebView.this.f41856t = false;
                CommonWebView.this.f41855s.a(CommonWebView.this.f41854r);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            p0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f41841e.setVisible(true);
            CommonWebView.this.f41841e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    p0.b("CommonWebView", th2.getMessage());
                }
            }
            return true;
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
                CommonWebView.this.f41841e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            p0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f41841e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f41846j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f41840d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f41846j.canGoBack()) {
                        CommonWebView.this.f41846j.goBack();
                    }
                    CommonWebView.this.f41840d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f41846j.canGoBack());
                    if (CommonWebView.this.f41847k != null) {
                        CommonWebView.this.f41847k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f41840d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f41846j.canGoForward()) {
                        CommonWebView.this.f41846j.goForward();
                    }
                    CommonWebView.this.f41840d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f41846j.canGoForward());
                    if (CommonWebView.this.f41848l != null) {
                        CommonWebView.this.f41848l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f41840d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f41846j.canGoBack());
                    CommonWebView.this.f41840d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f41846j.canGoForward());
                    CommonWebView.this.f41846j.reload();
                    if (CommonWebView.this.f41849m != null) {
                        CommonWebView.this.f41849m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f41843g != null) {
                        CommonWebView.this.f41843g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f41850n != null) {
                        CommonWebView.this.f41850n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f41846j.getUrl());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f41840d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f41840d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (t0.a.b(str)) {
                t0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g extends WebViewClient {
        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f41856t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f41854r = str;
            if (CommonWebView.this.f41856t) {
                return;
            }
            CommonWebView.this.f41856t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f41856t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f41854r = str;
            if (CommonWebView.this.f41856t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f41856t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface h {
        void a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f41857u = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f41845i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f41844h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f41839c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f41840d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f41846j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f41846j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f41839c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f41840d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f41839c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f41842f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f41842f, layoutParams);
        this.f41837a = u0.a(getContext(), 40.0f);
        this.f41838b = u0.a(getContext(), 40.0f);
        this.f41844h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f41845i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f41846j == null) {
                this.f41846j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f41846j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f41846j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f41844h);
            this.f41846j.setWebChromeClient(this.f41845i);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            p0.b("CommonWebView", "webview is error", th2);
        }
        this.f41842f.addView(this.f41846j);
    }

    public void loadUrl(String str) {
        this.f41846j.loadUrl(str);
        if (this.f41853q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f41847k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f41848l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f41850n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f41849m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f41845i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f41844h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f41839c.getParent()).removeView(this.f41839c);
        this.f41842f.addView(this.f41839c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f41839c.getParent()).removeView(this.f41839c);
        addView(this.f41839c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f41843g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f41852p = i10;
        if (this.f41851o == null) {
            this.f41851o = new Handler(Looper.getMainLooper());
        }
        if (this.f41853q == null) {
            g gVar = new g();
            this.f41853q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f41855s = iVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.f41839c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f41839c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f41840d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f41839c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() throws Resources.NotFoundException {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f41841e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f41841e);
        this.f41841e.initResource(true);
    }

    private void b() {
        if (this.f41840d != null) {
            return;
        }
        this.f41840d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f41838b);
        layoutParams.bottomMargin = 0;
        this.f41840d.setLayoutParams(layoutParams);
        this.f41840d.setBackgroundColor(-1);
        this.f41840d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f41840d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f41851o.postDelayed(this.f41857u, this.f41852p);
    }

    public void setToolBarTitle(String str) {
        this.f41839c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41857u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f41839c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f41839c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f41837a);
            layoutParams.addRule(10);
            this.f41839c.setLayoutParams(layoutParams);
            this.f41842f.addView(this.f41839c);
            return;
        }
        this.f41839c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f41837a));
        addView(this.f41839c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f41857u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th2) {
            p0.b("CommonWebView", th2.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!uri.getScheme().equals("http") && !uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
            if (uri.getScheme().equals("intent")) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    str2 = uri2.getPackage();
                } catch (Throwable th3) {
                    p0.b("CommonWebView", th3.getMessage());
                }
                if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    uri2.setFlags(268435456);
                    getContext().startActivity(uri2);
                    return true;
                }
                try {
                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                } catch (Throwable th4) {
                    p0.b("CommonWebView", th4.getMessage());
                }
                p0.b("CommonWebView", th2.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                p0.b("CommonWebView", "openDeepLink");
                return true;
            }
            if (!TextUtils.isEmpty(str)) {
                return !(str.startsWith("http") || str.startsWith(HttpRequest.DEFAULT_SCHEME));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f41851o.removeCallbacks(this.f41857u);
    }
}
