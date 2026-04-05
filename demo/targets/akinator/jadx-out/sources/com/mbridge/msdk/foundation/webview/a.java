package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a implements BrowserView.e {

    /* renamed from: o, reason: collision with root package name */
    private static String f41255o = "a";

    /* renamed from: a, reason: collision with root package name */
    private int f41256a;

    /* renamed from: c, reason: collision with root package name */
    private String f41258c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41259d;

    /* renamed from: e, reason: collision with root package name */
    private BaseTrackingListener f41260e;

    /* renamed from: f, reason: collision with root package name */
    private BrowserView f41261f;

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f41262g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.a f41263h;

    /* renamed from: i, reason: collision with root package name */
    private Context f41264i;

    /* renamed from: k, reason: collision with root package name */
    private JumpLoaderResult f41266k;

    /* renamed from: n, reason: collision with root package name */
    private long f41269n;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41257b = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41267l = false;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f41268m = new RunnableC0279a();

    /* renamed from: j, reason: collision with root package name */
    private Handler f41265j = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    public class RunnableC0279a implements Runnable {
        public RunnableC0279a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.b(a.f41255o, "webview js！超时上限：" + a.this.f41256a + "ms");
            if (a.this.f41263h != null && a.this.f41266k != null) {
                a.this.f41266k.setSuccess(false);
                a.this.f41266k.setUrl(a.this.f41258c);
                a.this.f41266k.setType(2);
                a.this.f41266k.setExceptionMsg("linktype 8 time out");
                a.this.f41263h.a(a.this.f41266k, a.this.f41262g, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.f41258c) && !a.this.f41267l) {
                a.this.f41267l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f41264i, a.this.f41258c, a.this.f41262g);
            }
            if (a.this.f41260e != null) {
                a.this.f41260e.onFinishRedirection(a.this.f41262g, a.this.f41258c);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41271a;

        public b(String str) {
            this.f41271a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f41263h != null && a.this.f41266k != null) {
                a.this.f41266k.setSuccess(true);
                a.this.f41266k.setUrl(this.f41271a);
                a.this.f41266k.setType(2);
                a.this.f41263h.a(a.this.f41266k, a.this.f41262g, 1, true);
            }
            if (a.this.f41260e != null) {
                a.this.f41260e.onFinishRedirection(a.this.f41262g, this.f41271a);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41273a;

        public c(String str) {
            this.f41273a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f41260e != null) {
                a.this.f41260e.onFinishRedirection(a.this.f41262g, this.f41273a);
            }
            if (a.this.f41263h == null || a.this.f41266k == null) {
                return;
            }
            a.this.f41266k.setSuccess(true);
            a.this.f41266k.setUrl(this.f41273a);
            a.this.f41266k.setType(2);
            a.this.f41263h.a(a.this.f41266k, a.this.f41262g, 1, true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41276b;

        public d(String str, String str2) {
            this.f41275a = str;
            this.f41276b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f41260e != null) {
                a.this.f41260e.onFinishRedirection(a.this.f41262g, this.f41275a);
            }
            if (a.this.f41263h == null || a.this.f41266k == null) {
                return;
            }
            a.this.f41266k.setSuccess(false);
            a.this.f41266k.setUrl(this.f41275a);
            a.this.f41266k.setType(2);
            a.this.f41266k.setExceptionMsg(this.f41276b);
            a.this.f41263h.a(a.this.f41266k, a.this.f41262g, 1, true);
        }
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f41256a = 10000;
        this.f41266k = null;
        this.f41264i = context;
        this.f41262g = campaignEx;
        this.f41261f = browserView;
        this.f41260e = baseTrackingListener;
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        gVarF = gVarF == null ? h.b().a() : gVarF;
        this.f41263h = aVar;
        this.f41266k = new JumpLoaderResult();
        this.f41256a = (int) gVarF.o0();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2)) {
                            if (this.f41264i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        p0.b(f41255o, th2.getMessage());
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (!uri3.getScheme().equals("http")) {
                                if (!uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                                    str = stringExtra;
                                }
                            }
                            return true;
                        }
                    } catch (Throwable th3) {
                        p0.b(f41255o, th3.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f41264i, str)) {
                    p0.b(f41255o, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th4) {
            p0.b(f41255o, th4.getMessage());
            return true;
        }
    }

    private boolean e(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th2) {
            p0.b(f41255o, th2.getMessage());
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
                    p0.b(f41255o, th3.getMessage());
                }
                if (!TextUtils.isEmpty(str2) && this.f41264i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    uri2.setFlags(268435456);
                    this.f41264i.startActivity(uri2);
                    this.f41267l = true;
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
                    p0.b(f41255o, th4.getMessage());
                }
                p0.b(f41255o, th2.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(this.f41264i, str)) {
                p0.b(f41255o, "openDeepLink");
                this.f41267l = true;
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void c(WebView webView, String str) {
        if (this.f41269n == 0) {
            this.f41269n = System.currentTimeMillis();
            if (!this.f41259d) {
                this.f41259d = true;
                d();
            }
        }
        this.f41258c = str;
        this.f41257b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean b(WebView webView, String str) {
        com.google.android.gms.internal.play_billing.a.v("shouldOverrideUrlLoading1  ", str, f41255o);
        this.f41257b = false;
        if (t0.a.b(str) && t0.a.a(this.f41264i, str, null)) {
            this.f41267l = true;
        }
        boolean zE = e(webView, str);
        if (zE) {
            this.f41269n = 0L;
            this.f41257b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zE;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f41269n == 0) {
            this.f41269n = System.currentTimeMillis();
            if (!this.f41259d) {
                this.f41259d = true;
                d();
            }
            this.f41267l = false;
        }
        this.f41258c = str;
        this.f41257b = true;
    }

    private void c() {
        this.f41265j.removeCallbacks(this.f41268m);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        com.google.android.gms.internal.play_billing.a.v("onPageFinished1  ", str, f41255o);
        if (this.f41257b) {
            this.f41269n = 0L;
            this.f41257b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if ((uri.getScheme().equals("http") || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && !this.f41267l) {
                this.f41267l = true;
                a(this.f41264i, str, this.f41262g);
            }
        }
    }

    private void d() {
        this.f41265j.postDelayed(this.f41268m, this.f41256a);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, int i10, String str, String str2) {
        p0.d(f41255o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!d(webView, str2) || this.f41267l) {
            return;
        }
        this.f41267l = true;
        a(this.f41264i, str2, this.f41262g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f39410e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f41278a.put(str, this.f41261f);
            if (t0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            p0.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            t0.a(context, str, this.f41260e, campaignEx, new ArrayList());
        }
    }
}
