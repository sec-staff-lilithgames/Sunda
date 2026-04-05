package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Context f12957a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Application f12958b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f12959c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f12960d = "default";

    /* renamed from: e, reason: collision with root package name */
    private static boolean f12961e = false;

    /* renamed from: f, reason: collision with root package name */
    private static com.apm.insight.nativecrash.b f12962f;

    /* renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f12965i;

    /* renamed from: n, reason: collision with root package name */
    private static volatile String f12970n;

    /* renamed from: g, reason: collision with root package name */
    private static ConfigManager f12963g = new ConfigManager();

    /* renamed from: h, reason: collision with root package name */
    private static a f12964h = new a();

    /* renamed from: j, reason: collision with root package name */
    private static g f12966j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile String f12967k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Object f12968l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile int f12969m = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f12971o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f12972p = true;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f12973q = true;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f12974r = false;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f12975s = true;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f12976t = true;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f12977u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f12962f == null) {
            f12962f = g.a(f12957a);
        }
        return f12962f;
    }

    public static a b() {
        return f12964h;
    }

    public static g c() {
        if (f12966j == null) {
            synchronized (e.class) {
                f12966j = new g();
            }
        }
        return f12966j;
    }

    public static void d(boolean z10) {
        f12975s = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f12967k == null) {
            synchronized (f12968l) {
                try {
                    if (f12967k == null) {
                        f12967k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return f12967k;
    }

    public static Context g() {
        return f12957a;
    }

    public static Application h() {
        return f12958b;
    }

    public static ConfigManager i() {
        return f12963g;
    }

    public static long j() {
        return f12959c;
    }

    public static String k() {
        return f12960d;
    }

    public static void l() {
        f12971o = 1;
    }

    public static int m() {
        return f12971o;
    }

    public static boolean n() {
        return f12961e;
    }

    public static void o() {
        f12961e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f12965i;
    }

    public static int q() {
        return f12969m;
    }

    public static String r() {
        return f12970n;
    }

    public static boolean s() {
        return f12972p;
    }

    public static boolean t() {
        return f12973q;
    }

    public static boolean u() {
        return f12974r;
    }

    public static boolean v() {
        return f12975s;
    }

    public static boolean w() {
        return f12977u;
    }

    public static boolean x() {
        return f12976t;
    }

    public static void b(int i10, String str) {
        f12969m = i10;
        f12970n = str;
    }

    public static boolean d() {
        if (!f12963g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z10) {
        f12977u = z10;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f12962f = bVar;
    }

    public static void b(boolean z10) {
        f12973q = z10;
    }

    public static void a(Application application) {
        if (application != null) {
            f12958b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f12958b == null) {
            f12959c = System.currentTimeMillis();
            f12957a = context;
            f12958b = application;
            f12967k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z10) {
        f12974r = z10;
    }

    public static void f(boolean z10) {
        f12976t = z10;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f12962f = new com.apm.insight.nativecrash.b(f12957a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(f12959c);
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    public static void a(String str) {
        f12960d = str;
    }

    public static void a(int i10, String str) {
        if (f12965i == null) {
            synchronized (e.class) {
                try {
                    if (f12965i == null) {
                        f12965i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        f12965i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z10) {
        f12972p = z10;
    }
}
