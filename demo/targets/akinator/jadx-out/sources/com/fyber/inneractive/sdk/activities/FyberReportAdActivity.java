package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.f1;
import com.fyber.inneractive.sdk.util.o0;
import com.fyber.inneractive.sdk.util.v;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class FyberReportAdActivity extends InneractiveBaseActivity {

    /* renamed from: f, reason: collision with root package name */
    public static com.fyber.inneractive.sdk.flow.h f23021f;

    /* renamed from: b, reason: collision with root package name */
    public WebView f23022b;

    /* renamed from: c, reason: collision with root package name */
    public String f23023c;

    /* renamed from: d, reason: collision with root package name */
    public String f23024d;

    /* renamed from: e, reason: collision with root package name */
    public String f23025e;

    public static Intent createIntent(Context context, String str, String str2, Long l9) {
        Intent intent = new Intent(context, (Class<?>) FyberReportAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString("advertiser_domain", str);
        bundle.putString("dsp_name", str2);
        bundle.putString("dsp_id", l9 != null ? Long.toString(l9.longValue()) : null);
        intent.putExtras(bundle);
        return intent;
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new o0(webView).run();
    }

    public static com.fyber.inneractive.sdk.flow.h getAdReporter() {
        return f23021f;
    }

    public static void start(Context context, com.fyber.inneractive.sdk.flow.h hVar, String str, String str2, Long l9) {
        f23021f = hVar;
        try {
            context.startActivity(createIntent(context, str, str2, l9));
        } catch (Exception e10) {
            IAlog.a("failed starting fyber report ad activity", e10, new Object[0]);
        }
    }

    public final FrameLayout a() {
        WebView webView;
        FrameLayout frameLayout = new FrameLayout(this);
        try {
            webView = new WebView(IAConfigManager.O.f23227v.a());
            webView.setWebViewClient(new a(this));
            webView.setId(R.id.ia_inneractive_webview_report_ad);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(webView);
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(this.f23023c)) {
                map.put("advertiser_domain", this.f23023c);
            }
            if (!TextUtils.isEmpty(this.f23024d)) {
                map.put("dsp_name", this.f23024d);
            }
            if (!TextUtils.isEmpty(this.f23025e)) {
                map.put("dsp_id", this.f23025e);
            }
            webView.loadUrl(f1.a("https://cdn2.inner-active.mobi/client/fyber-i-icon/index.html", map));
        } catch (Exception unused) {
            IAlog.b("failed creating webivew for report ad", new Object[0]);
            finish();
            webView = null;
        }
        this.f23022b = webView;
        frameLayout.addView(webView, -1, -1);
        return frameLayout;
    }

    public String getAdDomain() {
        return this.f23023c;
    }

    public String getAdNetwork() {
        return this.f23024d;
    }

    public String getAdNetworkId() {
        return this.f23025e;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.f23023c = extras.getString("advertiser_domain");
                this.f23024d = extras.getString("dsp_name");
                this.f23025e = extras.getString("dsp_id");
            }
            setContentView(a());
        } catch (Exception e10) {
            IAlog.a("failed creating fyber report ad activity", e10, new Object[0]);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        WebView webView = this.f23022b;
        if (webView != null) {
            webView.removeAllViews();
            v.a(this.f23022b);
            this.f23022b.destroy();
            this.f23022b = null;
        }
        f23021f = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }
}
