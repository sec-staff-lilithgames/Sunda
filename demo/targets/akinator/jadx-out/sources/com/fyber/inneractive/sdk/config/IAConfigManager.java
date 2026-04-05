package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.y0;
import com.fyber.inneractive.sdk.web.a1;
import com.fyber.inneractive.sdk.web.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class IAConfigManager {
    public static long P;
    public final y0 A;
    public com.fyber.inneractive.sdk.network.v0 B;
    public com.fyber.inneractive.sdk.network.v0 C;
    public g D;
    public final com.fyber.inneractive.sdk.ignite.h E;
    public final com.fyber.inneractive.sdk.topics.b F;
    public final com.fyber.inneractive.sdk.dv.handler.a G;
    public final com.fyber.inneractive.sdk.cache.k H;
    public final com.fyber.inneractive.sdk.network.f I;
    public final HashMap J;
    public com.fyber.inneractive.sdk.measurement.e K;
    public WebView L;
    public final com.fyber.inneractive.sdk.config.global.r M;
    public com.fyber.inneractive.sdk.config.cellular.a N;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f23206a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public HashMap f23207b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public String f23208c;

    /* renamed from: d, reason: collision with root package name */
    public String f23209d;

    /* renamed from: e, reason: collision with root package name */
    public String f23210e;

    /* renamed from: f, reason: collision with root package name */
    public Context f23211f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f23212g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23213h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f23214i;

    /* renamed from: j, reason: collision with root package name */
    public InneractiveUserConfig f23215j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23216k;

    /* renamed from: l, reason: collision with root package name */
    public String f23217l;

    /* renamed from: m, reason: collision with root package name */
    public InneractiveMediationName f23218m;

    /* renamed from: n, reason: collision with root package name */
    public String f23219n;

    /* renamed from: o, reason: collision with root package name */
    public String f23220o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f23221p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23222q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f23223r;

    /* renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.l0 f23224s;

    /* renamed from: t, reason: collision with root package name */
    public String f23225t;

    /* renamed from: u, reason: collision with root package name */
    public s f23226u;

    /* renamed from: v, reason: collision with root package name */
    public i f23227v;

    /* renamed from: w, reason: collision with root package name */
    public t f23228w;

    /* renamed from: x, reason: collision with root package name */
    public final x0 f23229x;

    /* renamed from: y, reason: collision with root package name */
    public s1 f23230y;

    /* renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.a f23231z;
    public static final IAConfigManager O = new IAConfigManager();
    public static final g0 Q = new g0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc);
    }

    public IAConfigManager() throws ClassNotFoundException {
        com.fyber.inneractive.sdk.dv.handler.a eVar;
        new HashSet();
        this.f23213h = false;
        this.f23214i = new k0();
        this.f23216k = false;
        this.f23222q = false;
        this.f23223r = new AtomicBoolean(false);
        this.f23224s = new com.fyber.inneractive.sdk.network.l0();
        this.f23225t = "";
        this.f23229x = new x0();
        this.A = new y0();
        this.E = new com.fyber.inneractive.sdk.ignite.h();
        this.F = new com.fyber.inneractive.sdk.topics.b();
        String[] strArr = {"com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback"};
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                Class.forName(strArr[i10]);
            } catch (ClassNotFoundException unused) {
                eVar = new com.fyber.inneractive.sdk.dv.handler.f();
            }
        }
        eVar = new com.fyber.inneractive.sdk.dv.handler.e();
        this.G = eVar;
        this.H = new com.fyber.inneractive.sdk.cache.k();
        this.I = new com.fyber.inneractive.sdk.network.f();
        this.J = new HashMap();
        this.M = com.fyber.inneractive.sdk.config.global.r.a();
        this.f23212g = new CopyOnWriteArrayList();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        O.f23212g.add(onConfigurationReadyAndValidListener);
    }

    public static void b() {
        s sVar;
        com.fyber.inneractive.sdk.topics.b bVar;
        IAConfigManager iAConfigManager = O;
        iAConfigManager.getClass();
        if (iAConfigManager.F.f26696i.get() || (sVar = iAConfigManager.f23226u) == null || sVar.f23394b == null) {
            return;
        }
        if (iAConfigManager.f23223r.compareAndSet(false, true)) {
            int iA = iAConfigManager.f23226u.f23394b.a("topics_enabled", 0, 0);
            int iA2 = iAConfigManager.f23226u.f23394b.a("e_topics_enabled", 0, 0);
            if (iA == 0 && iA2 == 0) {
                IAlog.a("Topics API feature disabled - topics_enabled & e_topics_enabled flags are 0", new Object[0]);
                return;
            }
            boolean z10 = iA != 0;
            boolean z11 = iA2 != 0;
            try {
                if (!f() || (bVar = iAConfigManager.F) == null) {
                    return;
                }
                bVar.a(z10, z11);
                iAConfigManager.F.c();
            } catch (Throwable th2) {
                IAlog.a("error while trying to init topics ", th2, new Object[0]);
            }
        }
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(1000000) >= 11 && com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_ADSERVICES_TOPICS");
    }

    public static boolean d() {
        g gVar = O.D;
        return gVar != null && gVar.e();
    }

    public static boolean e() {
        IAConfigManager iAConfigManager = O;
        boolean z10 = iAConfigManager.f23210e != null;
        int i10 = k.f23321a;
        boolean zBooleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z10 && System.currentTimeMillis() - P > 3600000) || zBooleanValue) {
            if (zBooleanValue) {
                s sVar = iAConfigManager.f23226u;
                sVar.f23396d = false;
                com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.util.l(sVar.f23397e));
            }
            a();
            b1 b1Var = b1.f26839c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new a1(b1Var));
        }
        return z10;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(1000000) >= 4 && com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_ADSERVICES_TOPICS");
    }

    public static void g() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f26796a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        O.f23212g.remove(onConfigurationReadyAndValidListener);
    }

    public final void a(Exception exc) {
        Iterator it = this.f23212g.iterator();
        while (it.hasNext()) {
            OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener = (OnConfigurationReadyAndValidListener) it.next();
            if (onConfigurationReadyAndValidListener != null) {
                boolean z10 = O.f23210e != null;
                IAlog.e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z10, !z10 ? exc : null);
            }
        }
    }

    public static void a() {
        IAConfigManager iAConfigManager = O;
        com.fyber.inneractive.sdk.network.v0 v0Var = iAConfigManager.B;
        if (v0Var != null) {
            iAConfigManager.f23224s.a(v0Var);
        }
        s sVar = iAConfigManager.f23226u;
        if (sVar.f23396d) {
            return;
        }
        iAConfigManager.f23224s.a(new com.fyber.inneractive.sdk.network.v0(new p(sVar), sVar.f23393a, sVar.f23397e));
    }
}
