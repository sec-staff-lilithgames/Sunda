package com.ironsource.sdk.controller;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import b0.e2;
import com.ironsource.C3191e4;
import com.ironsource.C3197ea;
import com.ironsource.C3257hg;
import com.ironsource.C3422r4;
import com.ironsource.InterfaceC3240h;
import com.ironsource.Je;
import com.ironsource.Q9;
import com.ironsource.R3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import io.ktor.util.cio.ByteBufferPoolKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class OpenUrlActivity extends Activity {

    /* renamed from: j, reason: collision with root package name */
    private static final String f38414j = "OpenUrlActivity";

    /* renamed from: k, reason: collision with root package name */
    private static final int f38415k = SDKUtils.generateViewId();

    /* renamed from: l, reason: collision with root package name */
    private static final int f38416l = SDKUtils.generateViewId();

    /* renamed from: b, reason: collision with root package name */
    private v f38418b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f38419c;

    /* renamed from: d, reason: collision with root package name */
    boolean f38420d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f38421e;

    /* renamed from: f, reason: collision with root package name */
    private String f38422f;

    /* renamed from: a, reason: collision with root package name */
    private WebView f38417a = null;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f38423g = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    private boolean f38424h = false;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f38425i = new b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & ByteBufferPoolKt.DEFAULT_BUFFER_SIZE) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.f38423g.removeCallbacks(openUrlActivity.f38425i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.f38423g.postDelayed(openUrlActivity2.f38425i, 500L);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f38424h));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends WebViewClient {
        public /* synthetic */ c(OpenUrlActivity openUrlActivity, int i10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f38419c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f38419c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            v vVar;
            super.onReceivedError(webView, i10, str, str2);
            try {
                R3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.f38418b) != null) {
                        vVar.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(OpenUrlActivity.f38414j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new Je(str, C3197ea.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                C3257hg.a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f38418b.y();
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                StringBuilder sb2 = new StringBuilder();
                if (e10 instanceof ActivityNotFoundException) {
                    sb2.append(C3191e4.c.f36412x);
                } else {
                    sb2.append(C3191e4.c.f36413y);
                }
                v vVar = OpenUrlActivity.this.f38418b;
                if (vVar != null) {
                    vVar.d(sb2.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        private c() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        static final String f38429a = "is_store";

        /* renamed from: b, reason: collision with root package name */
        static final String f38430b = "external_url";

        /* renamed from: c, reason: collision with root package name */
        static final String f38431c = "secondary_web_view";

        /* renamed from: d, reason: collision with root package name */
        static final String f38432d = "immersive";

        /* renamed from: e, reason: collision with root package name */
        static final String f38433e = "no activity to handle url";

        /* renamed from: f, reason: collision with root package name */
        static final String f38434f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3240h f38435a;

        /* renamed from: b, reason: collision with root package name */
        private int f38436b;

        /* renamed from: c, reason: collision with root package name */
        private String f38437c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f38438d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f38439e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f38440f = false;

        public e(InterfaceC3240h interfaceC3240h) {
            this.f38435a = interfaceC3240h;
        }

        public e a(int i10) {
            this.f38436b = i10;
            return this;
        }

        public e b(boolean z10) {
            this.f38438d = z10;
            return this;
        }

        public e c(boolean z10) {
            this.f38439e = z10;
            return this;
        }

        public e a(String str) {
            this.f38437c = str;
            return this;
        }

        public e a(boolean z10) {
            this.f38440f = z10;
            return this;
        }

        public Intent a(Context context) {
            Intent intentA = this.f38435a.a(context);
            intentA.putExtra("external_url", this.f38437c);
            intentA.putExtra("secondary_web_view", this.f38438d);
            intentA.putExtra("is_store", this.f38439e);
            intentA.putExtra(C3191e4.h.f36513v, this.f38440f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.f38436b);
            }
            return intentA;
        }
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.f38418b;
        if (vVar != null) {
            vVar.a(false, C3191e4.h.Y);
            if (this.f38421e == null || (viewGroup = (ViewGroup) this.f38417a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f38415k) != null) {
                viewGroup.removeView(this.f38417a);
            }
            if (viewGroup.findViewById(f38416l) != null) {
                viewGroup.removeView(this.f38419c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.f38420d && (vVar = this.f38418b) != null) {
            vVar.c(C3191e4.h.f36489j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f38417a.stopLoading();
        this.f38417a.clearHistory();
        try {
            this.f38417a.loadUrl(str);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            Logger.e(f38414j, "OpenUrlActivity:: loadUrl: " + th2.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f38417a.canGoBack()) {
            this.f38417a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f38414j, "onCreate()");
        try {
            this.f38418b = (v) Q9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f38422f = extras.getString("external_url");
            this.f38420d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(C3191e4.h.f36513v, false);
            this.f38424h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f38425i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f38421e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f38424h && (i10 == 25 || i10 == 24)) {
            this.f38423g.postDelayed(this.f38425i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f38424h && z10) {
            runOnUiThread(this.f38425i);
        }
    }

    private void a() {
        if (this.f38419c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f38419c = progressBar;
            progressBar.setId(f38416l);
        }
        if (findViewById(f38416l) == null) {
            this.f38419c.setLayoutParams(e2.e(-2, -2, 13));
            this.f38419c.setVisibility(4);
            this.f38421e.addView(this.f38419c);
        }
    }

    private void b() {
        if (this.f38417a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f38417a = webView;
            webView.setId(f38415k);
            this.f38417a.getSettings().setJavaScriptEnabled(true);
            this.f38417a.setWebViewClient(new c(this, 0));
            loadUrl(this.f38422f);
        }
        if (findViewById(f38415k) == null) {
            this.f38421e.addView(this.f38417a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.f38418b;
        if (vVar != null) {
            vVar.a(true, C3191e4.h.Y);
        }
    }

    private void c() {
        WebView webView = this.f38417a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }
}
