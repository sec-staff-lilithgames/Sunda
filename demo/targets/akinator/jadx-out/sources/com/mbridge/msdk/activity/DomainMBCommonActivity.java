package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class DomainMBCommonActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    String f39399a = "";

    /* renamed from: b, reason: collision with root package name */
    private final BrowserView.e f39400b = new a();
    protected BrowserView browserView;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f39401c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements BrowserView.e {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, int i10, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public boolean b(WebView webView, String str) {
            p0.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (t0.a.b(str) && t0.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, String str, Bitmap bitmap) {
            com.google.android.gms.internal.play_billing.a.v("onPageStarted  ", str, "MBCommonActivity");
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, String str) {
            com.google.android.gms.internal.play_billing.a.v("onPageFinished  ", str, "MBCommonActivity");
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void c(WebView webView, String str) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            p0.b("MBCommonActivity", th2.getMessage());
        }
        if (c.m().d() == null) {
            c.m().b(getApplicationContext());
        }
        c.m().a(this);
        a();
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f39399a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.f39401c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
        if (b.f41278a.containsKey(this.f39399a)) {
            BrowserView browserView = b.f41278a.get(this.f39399a);
            this.browserView = browserView;
            if (browserView != null) {
                browserView.setListener(this.f39400b);
            }
        } else {
            BrowserView browserView2 = new BrowserView(this, this.f39401c);
            this.browserView = browserView2;
            browserView2.setListener(this.f39400b);
            this.browserView.loadUrl(this.f39399a);
        }
        BrowserView browserView3 = this.browserView;
        if (browserView3 != null) {
            e1.a(browserView3);
            setContentView(this.browserView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        Intent uri;
        String str2;
        try {
        } catch (Throwable th2) {
            p0.b("MBCommonActivity", th2.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri2 = Uri.parse(str);
        if (!uri2.getScheme().equals("http") && !uri2.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
            if (uri2.getScheme().equals("intent") || uri2.getScheme().equals("android-app")) {
                String stringExtra = null;
                if (uri2.getScheme().equals("intent")) {
                    uri = Intent.parseUri(str, 1);
                } else {
                    uri = uri2.getScheme().equals("android-app") ? Intent.parseUri(str, 2) : null;
                }
                if (uri != null) {
                    uri.setComponent(null);
                    uri.setSelector(null);
                }
                if (uri == null) {
                    str2 = "";
                } else {
                    try {
                        str2 = uri.getPackage();
                    } catch (Throwable th3) {
                        p0.b("MBCommonActivity", th3.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    if (uri != null) {
                        uri.setFlags(268435456);
                    }
                    startActivityForResult(uri, 0);
                    finish();
                    return true;
                }
                if (uri != null) {
                    try {
                        stringExtra = uri.getStringExtra("browser_fallback_url");
                    } catch (Throwable th4) {
                        p0.b("MBCommonActivity", th4.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    Uri uri3 = Uri.parse(str);
                    if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                        str = stringExtra;
                    }
                    webView.loadUrl(stringExtra);
                    return false;
                }
                p0.b("MBCommonActivity", th2.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(this, str)) {
                p0.b("MBCommonActivity", "openDeepLink");
                finish();
                return true;
            }
            if (!TextUtils.isEmpty(str)) {
                return !(str.startsWith("http") || str.startsWith(HttpRequest.DEFAULT_SCHEME));
            }
        }
        return false;
    }
}
