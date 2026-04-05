package com.applovin.impl.sdk;

import com.applovin.impl.t3;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n {

    /* renamed from: j, reason: collision with root package name */
    private static final a f15529j = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k f15530a;

    /* renamed from: c, reason: collision with root package name */
    private long f15532c;

    /* renamed from: f, reason: collision with root package name */
    private long f15535f;

    /* renamed from: g, reason: collision with root package name */
    private Object f15536g;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f15531b = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Object f15533d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f15534e = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final Map f15537h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Object f15538i = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f15539a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f15540b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f15539a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return a() + ((((int) (jB ^ (jB >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f15540b;
            aVar.f15540b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f15540b;
        }
    }

    public n(k kVar) {
        this.f15530a = kVar;
    }

    public boolean c() {
        return this.f15531b.get();
    }

    public boolean d() {
        return this.f15534e.get();
    }

    public void a(boolean z10) {
        synchronized (this.f15533d) {
            try {
                this.f15534e.set(z10);
                if (z10) {
                    this.f15535f = System.currentTimeMillis();
                    this.f15530a.O();
                    if (o.a()) {
                        this.f15530a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f15535f);
                    }
                    Long l9 = (Long) this.f15530a.a(v4.H1);
                    if (l9.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new t(5, this, l9), l9.longValue());
                    }
                } else {
                    this.f15535f = 0L;
                    this.f15530a.O();
                    if (o.a()) {
                        this.f15530a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        return this.f15532c;
    }

    public void c(String str) {
        synchronized (this.f15538i) {
            try {
                a aVar = (a) this.f15537h.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f15537h.put(str, aVar);
                }
                aVar.f15539a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        if (!t3.a(obj) && this.f15531b.compareAndSet(true, false)) {
            this.f15536g = null;
            this.f15530a.O();
            if (o.a()) {
                this.f15530a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f15538i) {
            aVar = (a) this.f15537h.get(str);
            if (aVar == null) {
                aVar = f15529j;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l9) {
        if (d() && System.currentTimeMillis() - this.f15535f >= l9.longValue()) {
            this.f15530a.O();
            if (o.a()) {
                this.f15530a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f15534e.set(false);
        }
    }

    public Object a() {
        return this.f15536g;
    }

    public void a(Object obj) {
        if (!t3.a(obj) && this.f15531b.compareAndSet(false, true)) {
            this.f15536g = obj;
            this.f15532c = System.currentTimeMillis();
            this.f15530a.O();
            if (o.a()) {
                this.f15530a.O().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f15532c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l9 = (Long) this.f15530a.a(v4.I1);
            if (l9.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new s(this, 3, l9, obj), l9.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l9, Object obj) {
        if (this.f15531b.get() && System.currentTimeMillis() - this.f15532c >= l9.longValue()) {
            this.f15530a.O();
            if (o.a()) {
                this.f15530a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f15538i) {
            this.f15537h.remove(str);
        }
    }
}
