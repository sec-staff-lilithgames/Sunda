package com.applovin.sdk;

import a.b;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b0.e2;
import com.applovin.impl.b8;
import com.applovin.impl.k7;
import com.applovin.impl.r4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f16523a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private String f16524b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f16525c;

    /* renamed from: d, reason: collision with root package name */
    private EventListener f16526d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f16526d = eventListener;
        this.f16524b = str;
        this.f16523a.set(false);
        WebView webView = this.f16525c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f16526d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY))) {
            o.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        k kVarA = AppLovinSdk.getInstance(getApplicationContext()).a();
        b8.a(findViewById(android.R.id.content), kVarA);
        a(kVarA);
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra)) {
            this.f16524b = stringExtra;
        }
        if (StringUtils.isValidString(this.f16524b)) {
            this.f16525c.loadUrl(this.f16524b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        WebView webViewB = k7.b(this, "WebView Activity");
        this.f16525c = webViewB;
        if (webViewB == null) {
            finish();
            return;
        }
        setContentView(webViewB);
        WebSettings settings = this.f16525c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f16525c.setVerticalScrollBarEnabled(true);
        this.f16525c.setHorizontalScrollBarEnabled(true);
        this.f16525c.setScrollBarStyle(33554432);
        this.f16525c.setWebViewClient(new a(kVar));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends r4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f16527a;

        public a(k kVar) {
            this.f16527a = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(k kVar) {
            if (!((Boolean) kVar.a(v4.G5)).booleanValue() || !AppLovinWebViewActivity.this.f16523a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(kVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f16524b)) {
                AppLovinWebViewActivity.this.f16525c.loadUrl(AppLovinWebViewActivity.this.f16524b);
            }
        }

        @Override // com.applovin.impl.r4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f16525c == webView) {
                AppLovinWebViewActivity.this.f16525c.destroy();
                AppLovinWebViewActivity.this.f16525c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final k kVar = this.f16527a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16529b.a(kVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            this.f16527a.O();
            if (o.a()) {
                e2.y("Handling url load: ", str, this.f16527a.O(), "AppLovinWebViewActivity");
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f16526d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str2)) {
                this.f16527a.O();
                if (!o.a()) {
                    return true;
                }
                this.f16527a.O().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String queryParameter = uri.getQueryParameter(str2);
            this.f16527a.O();
            if (o.a()) {
                this.f16527a.O().a("AppLovinWebViewActivity", b.m("Parsed WebView event parameter name: ", str2, " and value: ", queryParameter));
            }
            AppLovinWebViewActivity.this.f16526d.onReceivedEvent(queryParameter);
            return true;
        }

        @Override // com.applovin.impl.r4
        public Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }
}
