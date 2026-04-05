package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.k7;
import com.applovin.impl.v4;
import com.ironsource.C3191e4;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a, reason: collision with root package name */
    final k f15296a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15297b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f15298c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f15299d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f15300e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f15301f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f15302g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    private Date f15303h;

    /* renamed from: i, reason: collision with root package name */
    private Date f15304i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (k7.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15308a;

        static {
            int[] iArr = new int[e.values().length];
            f15308a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15308a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15308a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum e {
        STARTED(C3191e4.h.f36478d0),
        PAUSED(C3191e4.h.f36480e0),
        RESUMED("resumed");


        /* renamed from: a, reason: collision with root package name */
        private final String f15313a;

        e(String str) {
            this.f15313a = str;
        }

        public String b() {
            return this.f15313a;
        }
    }

    public SessionTracker(k kVar) {
        this.f15296a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f15296a.O();
        if (o.a()) {
            this.f15296a.O().a("SessionTracker", "Application Resumed");
        }
        this.f15302g.set(System.currentTimeMillis());
        boolean zBooleanValue = ((Boolean) this.f15296a.a(v4.f16019r3)).booleanValue();
        long jLongValue = ((Long) this.f15296a.a(v4.f16027s3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f15298c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f15304i == null || System.currentTimeMillis() - this.f15304i.getTime() >= millis) {
            this.f15296a.G().trackEvent("resumed");
            if (zBooleanValue) {
                this.f15304i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f15304i = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f15301f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f15302g.get();
    }

    public e getCurrentApplicationState() {
        return this.f15299d.get() ? e.PAUSED : this.f15301f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = d.f15308a[getCurrentApplicationState().ordinal()];
        if (i10 == 1) {
            jN = k.n();
        } else if (i10 == 2) {
            jN = this.f15301f.get();
        } else {
            if (i10 != 3) {
                return -1L;
            }
            jN = this.f15302g.get();
        }
        return jCurrentTimeMillis - jN;
    }

    public int getLastTrimMemoryLevel() {
        return this.f15300e.get();
    }

    public String getSessionId() {
        return this.f15297b;
    }

    public boolean isApplicationPaused() {
        return this.f15299d.get();
    }

    public void pauseForClick() {
        this.f15298c.set(true);
    }

    public void resumeForClick() {
        this.f15298c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f15299d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f15299d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f15296a.O();
        if (o.a()) {
            this.f15296a.O().a("SessionTracker", "Application Paused");
        }
        this.f15301f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f15298c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f15296a.a(v4.f16019r3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f15296a.a(v4.f16035t3)).longValue());
        if (this.f15303h == null || System.currentTimeMillis() - this.f15303h.getTime() >= millis) {
            this.f15296a.G().trackEvent(C3191e4.h.f36480e0);
            if (zBooleanValue) {
                this.f15303h = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f15303h = new Date();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f15300e.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }
}
