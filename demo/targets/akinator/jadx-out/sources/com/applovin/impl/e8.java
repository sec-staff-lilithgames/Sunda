package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e8 {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f13943f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13944a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13945b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f13946c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f13947d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Timer f13948e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends TimerTask {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.e8$a$a, reason: collision with other inner class name */
        public class C0031a implements AppLovinBroadcastManager.Receiver {
            public C0031a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                e8.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!e8.this.f13945b.n0().isApplicationPaused() || e8.this.f13944a) {
                e8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0031a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private e8(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f13948e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException(p0.o2.m(j10, "Cannot create wall clock timer. Invalid timer length: "));
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f13944a = z10;
        this.f13945b = kVar;
        this.f13946c = runnable;
        f13943f.add(this);
        timer.schedule(b(), j10);
    }

    public static e8 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new e8(j10, z10, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f13946c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f13947d) {
            this.f13948e.cancel();
            this.f13946c = null;
            f13943f.remove(this);
        }
    }
}
