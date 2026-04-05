package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class k8 {

    /* renamed from: a, reason: collision with root package name */
    private static String f14252a;

    /* renamed from: d, reason: collision with root package name */
    private static int f14255d;

    /* renamed from: e, reason: collision with root package name */
    private static String f14256e;

    /* renamed from: f, reason: collision with root package name */
    private static String f14257f;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f14253b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f14254c = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f14258g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.D0;
        if (kVar != null && ((Boolean) kVar.a(v4.f15882a4)).booleanValue() && e()) {
            f14252a = (String) y4.a(x4.L, "", com.applovin.impl.sdk.k.o());
        } else {
            f14252a = "";
            y4.b(x4.L, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void a(com.applovin.impl.sdk.k kVar) {
        if (f14254c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new n9(1, kVar));
    }

    public static String b() {
        return f14257f;
    }

    public static String c() {
        return f14256e;
    }

    public static int d() {
        return f14255d;
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f14258g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f14255d = packageInfoC.versionCode;
            f14256e = packageInfoC.versionName;
            f14257f = packageInfoC.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (o0.h()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(v4.f15972l4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (f14253b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f14252a = defaultUserAgent;
                        y4.b(x4.L, f14252a, com.applovin.impl.sdk.k.o());
                    } else {
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        kVar.E().a(c2.N0, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th3);
            }
            kVar.E().a("WebViewDataCollector", "collectUserAgent", th3);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f14253b) {
            zIsValidString = StringUtils.isValidString((String) y4.a(x4.L, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f14253b) {
            str = f14252a;
        }
        return str;
    }
}
