package r7;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f83874a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f83875b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f83876c = false;

    /* renamed from: e, reason: collision with root package name */
    public static b8.f f83878e;

    /* renamed from: f, reason: collision with root package name */
    public static b8.e f83879f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile b8.h f83880g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile b8.g f83881h;

    /* renamed from: i, reason: collision with root package name */
    public static ThreadLocal f83882i;

    /* renamed from: d, reason: collision with root package name */
    public static a f83877d = a.f83844b;

    /* renamed from: j, reason: collision with root package name */
    public static v7.b f83883j = new v7.c();

    public static void beginSection(String str) {
        if (f83874a) {
            e8.g gVar = (e8.g) f83882i.get();
            if (gVar == null) {
                gVar = new e8.g();
                f83882i.set(gVar);
            }
            gVar.beginSection(str);
        }
    }

    public static float endSection(String str) {
        if (!f83874a) {
            return 0.0f;
        }
        e8.g gVar = (e8.g) f83882i.get();
        if (gVar == null) {
            gVar = new e8.g();
            f83882i.set(gVar);
        }
        return gVar.endSection(str);
    }

    public static a getDefaultAsyncUpdates() {
        return f83877d;
    }

    public static boolean getDisablePathInterpolatorCache() {
        return f83876c;
    }

    public static v7.b getReducedMotionOption() {
        return f83883j;
    }

    public static boolean isTraceEnabled() {
        return f83874a;
    }

    public static b8.g networkCache(Context context) {
        b8.g gVar;
        if (!f83875b) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b8.g gVar2 = f83881h;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (b8.g.class) {
            try {
                gVar = f83881h;
                if (gVar == null) {
                    b8.e e0Var = f83879f;
                    if (e0Var == null) {
                        e0Var = new o6.e0(applicationContext);
                    }
                    gVar = new b8.g(e0Var);
                    f83881h = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static b8.h networkFetcher(Context context) {
        b8.h hVar;
        b8.h hVar2 = f83880g;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (b8.h.class) {
            try {
                hVar = f83880g;
                if (hVar == null) {
                    b8.g gVarNetworkCache = networkCache(context);
                    b8.f bVar = f83878e;
                    if (bVar == null) {
                        bVar = new b8.b();
                    }
                    hVar = new b8.h(gVarNetworkCache, bVar);
                    f83880g = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static void setCacheProvider(b8.e eVar) {
        b8.e eVar2 = f83879f;
        if (eVar2 == null && eVar == null) {
            return;
        }
        if (eVar2 == null || !eVar2.equals(eVar)) {
            f83879f = eVar;
            f83881h = null;
        }
    }

    public static void setDefaultAsyncUpdates(a aVar) {
        f83877d = aVar;
    }

    public static void setDisablePathInterpolatorCache(boolean z10) {
        f83876c = z10;
    }

    public static void setFetcher(b8.f fVar) {
        b8.f fVar2 = f83878e;
        if (fVar2 == null && fVar == null) {
            return;
        }
        if (fVar2 == null || !fVar2.equals(fVar)) {
            f83878e = fVar;
            f83880g = null;
        }
    }

    public static void setNetworkCacheEnabled(boolean z10) {
        f83875b = z10;
    }

    public static void setReducedMotionOption(v7.b bVar) {
        f83883j = bVar;
    }

    public static void setTraceEnabled(boolean z10) {
        if (f83874a == z10) {
            return;
        }
        f83874a = z10;
        if (z10 && f83882i == null) {
            f83882i = new ThreadLocal();
        }
    }
}
