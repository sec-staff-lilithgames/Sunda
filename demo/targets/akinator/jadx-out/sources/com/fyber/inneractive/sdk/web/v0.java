package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final WebView f26958a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.h f26959b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26960c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f26961d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26962e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26963f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26964g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.v f26965h;

    /* renamed from: i, reason: collision with root package name */
    public t0 f26966i;

    /* renamed from: k, reason: collision with root package name */
    public String f26968k;

    /* renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f26970m;

    /* renamed from: o, reason: collision with root package name */
    public long f26972o;

    /* renamed from: p, reason: collision with root package name */
    public n0 f26973p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f26974q;

    /* renamed from: j, reason: collision with root package name */
    public String f26967j = "invalid_task_id";

    /* renamed from: l, reason: collision with root package name */
    public boolean f26969l = false;

    /* renamed from: n, reason: collision with root package name */
    public long f26971n = 10;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26975r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26976s = false;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicInteger f26977t = new AtomicInteger(0);

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f26978u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f26979v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public boolean f26980w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26981x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26982y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26983z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final m0 E = new m0(this);

    public v0(w0 w0Var) {
        this.f26960c = w0Var.f26985a;
        this.f26961d = w0Var.f26986b;
        this.f26962e = w0Var.f26987c;
        this.f26970m = w0Var.f26988d;
        this.f26963f = w0Var.f26989e;
        this.f26964g = w0Var.f26990f;
        this.f26965h = w0Var.f26991g;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        this.f26959b = hVar;
        hVar.f23985h.add(this);
        this.f26958a = new WebView(com.fyber.inneractive.sdk.util.o.f26796a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f26960c)) {
            return;
        }
        this.f26967j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        this.f26983z = false;
        this.A = true;
        if (this.f26967j.equals(str)) {
            this.f26959b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f26979v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                if (this.f26977t.getAndIncrement() < 2) {
                    this.f26959b.a(new q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.h hVar = this.f26959b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f23993p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f23979b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f26959b;
                    if (hVar2.f23986i || (vVar = this.f26965h) == null) {
                        return;
                    }
                    hVar2.f23986i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(String str) {
        com.fyber.inneractive.sdk.util.r.f26804b.post(new o0(this, str));
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26968k = str;
        WebSettings settings = this.f26958a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.f26958a.setInitialScale(1);
        this.f26958a.setBackgroundColor(-1);
        this.f26958a.setWebViewClient(this.E);
        WebView webView = this.f26958a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        this.f26958a.addJavascriptInterface(new u0(this), "nativeInterface");
        this.f26958a.loadUrl(str);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f26970m;
        if (rVar != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Integer numA = ((com.fyber.inneractive.sdk.config.global.features.q) rVar.a(com.fyber.inneractive.sdk.config.global.features.q.class)).a("load_timeout");
            int i10 = 10;
            int iIntValue = numA != null ? numA.intValue() : 10;
            if (iIntValue < 30 && iIntValue > 2) {
                i10 = iIntValue;
            }
            long millis = timeUnit.toMillis(i10);
            this.f26971n = millis;
            IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
        }
        this.f26972o = System.currentTimeMillis();
        n0 n0Var = new n0(this);
        this.f26973p = n0Var;
        com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(n0Var, this.f26971n);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        this.f26983z = true;
        if (this.f26967j.equals(str)) {
            this.f26959b.m();
            d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i10, double d10) {
        if (this.f26967j.equals(str)) {
            if (i10 == 0) {
                d(String.format("onDownloadProgress(%f);", Double.valueOf(d10)));
            } else {
                if (i10 != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.D) {
            this.f26983z = false;
            if (this.f26967j.equals(str)) {
                this.f26959b.m();
                if (!this.f26979v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) || !this.f26959b.n()) {
                if (this.f26977t.getAndIncrement() < 2) {
                    this.f26959b.a(new p0(this, str2, str3));
                    return;
                }
                this.f26959b.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar = this.f26959b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f23993p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f23979b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f26959b;
                    if (!hVar2.f23986i && (vVar = this.f26965h) != null) {
                        hVar2.f23986i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                this.f26959b.m();
                d("onInstallationFailed();");
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.f26961d;
            if (mVar != null) {
                this.f26965h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }
}
